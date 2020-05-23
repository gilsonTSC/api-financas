package com.demo.financas.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.financas.model.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}