package com.example.lab6_spring_prog_ing_2.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Table(name = "users")

public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name",nullable = false)
    private String name;

    @Column (name = "password",nullable = false)
    private String password;

    @Column(name ="email", nullable = false, unique = true)
    private String email;

    @Column(name ="role")
    private String role;

}
