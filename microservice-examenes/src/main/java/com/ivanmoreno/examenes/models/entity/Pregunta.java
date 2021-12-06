package com.ivanmoreno.examenes.models.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@AllArgsConstructor
@EqualsAndHashCode(exclude = {"examen"})
@Entity
@Table(name = "preguntas")
public class Pregunta {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String texto;
	
	@JsonIgnoreProperties(value = {"handler", "hibernateLazyInitializer", "preguntas"})
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "examen_id", referencedColumnName = "id")
	private Examen examen;
}
