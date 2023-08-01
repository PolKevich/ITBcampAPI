package com.PolKevich.ITBcampAPI.model;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "role")
@Data
@ToString
@EqualsAndHashCode
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="title")
    private String name;
}
