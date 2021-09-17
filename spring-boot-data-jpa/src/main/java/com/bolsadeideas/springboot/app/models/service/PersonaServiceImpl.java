package com.bolsadeideas.springboot.app.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bolsadeideas.springboot.app.models.dao.IPersonaDao;
import com.bolsadeideas.springboot.app.models.entity.Persona;

@Service // esta basado en el patron de diseño facade -- unico punto de acceso 
public class PersonaServiceImpl implements IPersonaService{

	@Autowired
	private IPersonaDao personaDao;
	@Override
	public List<Persona> findAll() {
		// TODO Auto-generated method stub
		return personaDao.findAll();
	}

	@Override
	public void save(Persona persona) {
		// TODO Auto-generated method stub
		personaDao.save(persona);
	}

	@Override
	public Persona findOne(Long id) {
		// TODO Auto-generated method stub
		return personaDao.findOne(id);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		personaDao.delete(id);
	}

	
}
