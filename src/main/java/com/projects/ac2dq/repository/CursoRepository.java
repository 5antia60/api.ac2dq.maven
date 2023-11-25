package com.projects.ac2dq.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projects.ac2dq.modelo.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long> {

	Curso findByNome(String nome);

}