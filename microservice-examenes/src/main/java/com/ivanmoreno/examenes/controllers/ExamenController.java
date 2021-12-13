package com.ivanmoreno.examenes.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ivanmoreno.commons.controllers.CommonController;
import com.ivanmoreno.commons.models.entity.Examen;
import com.ivanmoreno.examenes.services.AsignaturaService;
import com.ivanmoreno.examenes.services.ExamenService;

@RestController
public class ExamenController extends CommonController<Examen, ExamenService>{

	@Autowired
	private AsignaturaService asignaturaService;
	
	@PutMapping("/{id}")
	public ResponseEntity<?> edit(@RequestBody Examen examen, @PathVariable Long id) {
		
		Optional<Examen> optionalExamen = this.service.findById(id);
		
		if(!optionalExamen.isPresent()) {
			return ResponseEntity.notFound().build();
		}
		
		Examen examenDB = optionalExamen.get();
		examenDB.setNombre(examen.getNombre());
		examenDB.setPreguntas(examen.getPreguntas());
		
		Examen examenSaved = this.service.save(examenDB);
		
		return ResponseEntity.status(HttpStatus.CREATED).body(examenSaved);
	}
	
	@GetMapping("/filtrar/{value}")
	public ResponseEntity<?> filter(@PathVariable String value) {
		return ResponseEntity.ok(this.service.findByNombre(value));
	}
	
	@GetMapping("/asignaturas")
	public ResponseEntity<?> showAllAsignaturas() {
		return ResponseEntity.ok(asignaturaService.findAll());
	}
}
