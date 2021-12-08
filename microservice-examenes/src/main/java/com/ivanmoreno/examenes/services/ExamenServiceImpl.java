package com.ivanmoreno.examenes.services;

import org.springframework.stereotype.Service;

import com.ivanmoreno.commons.services.CommonServiceImpl;
import com.ivanmoreno.examenes.models.entity.Examen;
import com.ivanmoreno.examenes.models.repository.ExamenRepository;

@Service
public class ExamenServiceImpl extends CommonServiceImpl<Examen, ExamenRepository> implements ExamenService{

	public ExamenServiceImpl(ExamenRepository repository) {
		super(repository);
	}

}
