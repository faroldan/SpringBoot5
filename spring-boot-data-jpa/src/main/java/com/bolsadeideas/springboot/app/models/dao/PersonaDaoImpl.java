package com.bolsadeideas.springboot.app.models.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.bolsadeideas.springboot.app.models.entity.Persona;

@Repository
public class PersonaDaoImpl implements IPersonaDao {

	@PersistenceContext
	private EntityManager em;

	@SuppressWarnings("unchecked")
	@Transactional(readOnly = true)
	@Override
	public List<Persona> findAll() {
		// TODO Auto-generated method stub
		return em.createQuery("from Persona").getResultList();
	}

	@Override
	@Transactional(readOnly = true)
	public Persona findOne(Long id) {
		return em.find(Persona.class, id);
	}

	@Override
	@Transactional
	public void save(Persona persona) {
		if (persona.getId() != null && persona.getId() > 0) {
			em.merge(persona);
		} else {
			em.persist(persona);
		}
	}

	@Override
	@Transactional
	public void delete(Long id) {
		em.remove(findOne(id));
	}

}
