package com.ativturma.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ativturma.entity.Aluno;
import com.ativturma.repository.AlunoRepository;

@Service
public class AlunoService {
	private final AlunoRepository alunoRepository;

	@Autowired
	public AlunoService(AlunoRepository alunoRepository) {
		this.alunoRepository = alunoRepository;
	}
	public List<Aluno> buscaTodosAluno(){
		return alunoRepository.findAll();
	}
	public Aluno buscaAlunoId(Long id) {
		Optional <Aluno> Aluno = alunoRepository.findById(id);
		return Aluno.orElse(null);
	}
	public Aluno salvaAluno(Aluno Aluno) {
		return alunoRepository.save(Aluno);
	}
	public Aluno alterarAluno(Long id, Aluno alterarA) {
		Optional <Aluno> existeAluno = alunoRepository.findById(id);
		if (existeAluno.isPresent()) {
			return alunoRepository.save(alterarA);
		}
		return null;

	}
	public boolean apagarAluno(Long id) {
		Optional <Aluno> existeAluno= alunoRepository.findById(id);
		if (existeAluno.isPresent()) {
			alunoRepository.deleteById(id);
			return true;
		}
		return false;
	}
}



