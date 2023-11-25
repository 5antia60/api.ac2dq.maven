package com.projects.ac2dq.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projects.ac2dq.modelo.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
	
}
