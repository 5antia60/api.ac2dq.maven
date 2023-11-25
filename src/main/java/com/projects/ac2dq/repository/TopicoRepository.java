package com.projects.ac2dq.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projects.ac2dq.modelo.Topico;

import java.util.List;


public interface TopicoRepository extends JpaRepository<Topico, Long> {
	List<Topico> findByCursoNome(String nomeCurso);
	

}
