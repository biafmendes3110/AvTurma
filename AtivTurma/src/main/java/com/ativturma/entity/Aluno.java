package com.ativturma.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "aluno")
public class Aluno {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY )
	private Long id;
	
	private String Cidade;
	
	private String email;
	
	private String nome;
	
	private String Ra;
	
	private String Renda;
	
	private String Telefone;
	
	@ManyToOne (fetch = FetchType.LAZY)
	@JoinColumn(name = "id_produto", nullable = false)
	private Turma turma;
}
