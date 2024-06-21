package com.example.examen.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.examen.entity.Curso;
import com.example.examen.service.CursoService;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@RequestMapping("/rest/curso")
public class CursoController {

	@Autowired
	private CursoService service;
	
	@GetMapping("/listaTodos")
	@ResponseBody
	public List<Curso> lista(){
		return service.listaCurso();
	}

	@GetMapping("/buscaCursoPorId/{idCurso}")
	@ResponseBody
	public Curso buscaCursoPorId(@PathVariable int idCurso) {
		return service.buscaCursoPorId(idCurso);
	}

	
	@GetMapping("/buscaCursoPorNombre/{nombre}")
	@ResponseBody
	public List<Curso> buscaCursoPorNombre(@PathVariable String nombre) {
		return service.buscaCursoPorNombre(nombre);
	}
	



	
}
