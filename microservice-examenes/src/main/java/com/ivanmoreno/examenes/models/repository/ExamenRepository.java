package com.ivanmoreno.examenes.models.repository;

import org.springframework.data.repository.CrudRepository;

import com.ivanmoreno.examenes.models.entity.Examen;

public interface ExamenRepository extends CrudRepository<Examen, Long>{

}
