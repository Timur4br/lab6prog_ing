package com.example.lab6_spring_prog_ing_2.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor


@Table(name="buss")
public class Bus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_bus",nullable = false)
    private Long id;

    @Column(name ="price", nullable = false)
    private String price;

    @Column(name ="number_bus", nullable = false)
    private String number_bus;

}
