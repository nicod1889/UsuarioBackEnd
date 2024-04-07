package com.taller.practica.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(nullable = false)
    private String username;
    @Column(nullable = false)
    private String password;
    private String email;
    @Column(nullable = false)
    private Boolean enabled;
}
