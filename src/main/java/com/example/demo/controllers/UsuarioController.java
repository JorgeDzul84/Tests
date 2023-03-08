package com.example.demo.controllers;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.UsuarioModel;

@Repository
public interface UsuarioController extends CrudRepository<UsuarioModel, Long> {
    
}
