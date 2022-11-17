package com.yasser.pays.services;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.yasser.pays.entities.Langue;
import com.yasser.pays.entities.Pays;
import com.yasser.pays.repos.PaysRepository;

@Component
public class PaysServiceImpl implements PaysService {

	@Autowired 
	PaysRepository paysRepository;

	@Override
	public Pays savePays(Pays p) {
		return paysRepository.save(p);
	}

	@Override
	public Pays updatePays(Pays p) {
		return paysRepository.save(p);
	}

	@Override
	public void deletePays(Pays p) {
		paysRepository.delete(p);
		
	}

	@Override
	public void deletePaysById(Long id) {
		paysRepository.deleteById(id);
		
	}

	@Override
	public Pays getPays(Long id) {
		return paysRepository.findById(id).get();
	}

	@Override
	public List<Pays> getAllPays() {
		return paysRepository.findAll();
	}

	@Override
	public List<Pays> findByNomPays(String nom) {
		return paysRepository.findByNomPays(nom);
	}

	@Override
	public List<Pays> findByNomPaysContains(String nom) {
		return paysRepository.findByNomPaysContains(nom);
	}

	/**/@Override
	public List<Pays> findByLangue(Langue langue) {
		return paysRepository.findByLangue(langue);
	}/**/

	/**/@Override
	public List<Pays> findByLangueIdLang(Long id) {
		return paysRepository.findByLangueIdLang(id);
	}/**/

	@Override
	public List<Pays> findByOrderByNomPaysAsc() {
		return paysRepository.findByOrderByNomPaysAsc();
	}

	@Override
	public List<Pays> trierPaysNomDESC() {
		return paysRepository.trierPaysNomDESC();
	}
}
