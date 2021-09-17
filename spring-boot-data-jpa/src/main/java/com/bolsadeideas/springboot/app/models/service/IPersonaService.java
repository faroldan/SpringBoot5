package com.bolsadeideas.springboot.app.models.service;

import java.util.List;

import com.bolsadeideas.springboot.app.models.entity.Persona;

public interface IPersonaService {

	public List<Persona> findAll();

	public void save(Persona persona);
	
	public Persona findOne(Long id);
	
	public void delete(Long id);

}
