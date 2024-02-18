package com.eCommerce.springbootbackend.model;

import jakarta.persistence.*;
import lombok.Data;

@Data        // used so that getter setter and constructor no need to generate
@Entity      // used so that Employee class act as JPA entity bec
@Table(name="employees")    // giving it name also if not then jpa initialize name as the class name
public class Employee {
    @Id               // this specifies the primary key of the entity
    @GeneratedValue(strategy = GenerationType.IDENTITY)   // this specifies the generation strategies for the primary key
    private long id;

    @Column(name = "first_name", nullable = false)        // it specifies column details
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email")
    private String email;
}
