package com.ivanmoreno.examenes.services;


import org.springframework.stereotype.Service;

import com.ivanmoreno.commons.models.entity.Asignatura;
import com.ivanmoreno.commons.services.CommonServiceImpl;
import com.ivanmoreno.examenes.models.repository.AsignaturaRepository;

@Service
public class AsignaturaServiceImpl extends CommonServiceImpl<Asignatura, AsignaturaRepository> implements AsignaturaService{

	public AsignaturaServiceImpl(AsignaturaRepository repository) {
		super(repository);
	}


}
