package com.em.system.models;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
@Getter@Setter
@Entity
public class Employee implements Comparable<Employee>{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(length = 50)
    String firstName;
    @Column(length = 50)
    String lastName;
    @Column(length = 100)
    String email;

    @Override
    public int compareTo(Employee o) {
        if(this.id < o.id) return -1;
        else if(this.id > o.id) return 1;
        else return 0;
    }
}
