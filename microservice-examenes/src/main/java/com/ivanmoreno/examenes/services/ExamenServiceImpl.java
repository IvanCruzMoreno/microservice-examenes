package com.ivanmoreno.examenes.services;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ivanmoreno.commons.models.entity.Examen;
import com.ivanmoreno.commons.services.CommonServiceImpl;
import com.ivanmoreno.examenes.models.repository.ExamenRepository;

@Service
public class ExamenServiceImpl extends CommonServiceImpl<Examen, ExamenRepository> implements ExamenService{

	public ExamenServiceImpl(ExamenRepository repository) {
		super(repository);
	}
	
	@Override
	@Transactional(readOnly = true)
	public List<Examen> findByNombre(String value) {
		return this.repository.findByNombre(value);
	}

}
