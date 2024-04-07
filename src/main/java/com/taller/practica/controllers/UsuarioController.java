package com.taller.practica.controllers;

import com.taller.practica.entities.Usuario;
import com.taller.practica.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    @Autowired
    private UsuarioRepository usuarioRepository;

    @PostMapping
    public ResponseEntity<Void> createUser(@RequestBody Usuario user) {
        usuarioRepository.save(user);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
