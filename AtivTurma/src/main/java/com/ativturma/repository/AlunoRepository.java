package com.ativturma.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ativturma.entity.Aluno;

public interface AlunoRepository  extends JpaRepository <Aluno, Long> {

}
