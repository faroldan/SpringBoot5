package com.bolsadeideas.springboot.app.models.dao;

import java.util.List;

import com.bolsadeideas.springboot.app.models.entity.Persona;

public interface IPersonaDao {
	
	public List<Persona> findAll();

	public void save(Persona persona);
	
	public Persona findOne(Long id);
	
	public void delete(Long id);

}
