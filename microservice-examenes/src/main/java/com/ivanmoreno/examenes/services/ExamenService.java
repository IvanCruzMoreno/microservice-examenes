package com.ivanmoreno.examenes.services;

import java.util.List;

import com.ivanmoreno.commons.models.entity.Examen;
import com.ivanmoreno.commons.services.CommonService;

public interface ExamenService extends CommonService<Examen>{

	public List<Examen> findByNombre(String value);
	
}
