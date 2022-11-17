package com.yasser.pays.services;

import java.util.List;

import com.yasser.pays.entities.Langue;
import com.yasser.pays.entities.Pays;

public interface PaysService {
	Pays savePays(Pays p);
	Pays updatePays(Pays p);
	void deletePays(Pays p);
	void deletePaysById(Long id);
	Pays getPays(Long id);
	List<Pays> getAllPays();
	List<Pays> findByNomPays(String nom);
	List<Pays> findByNomPaysContains(String nom);
	/**/List<Pays> findByLangue (Langue langue);
	/**/List<Pays> findByLangueIdLang(Long id);
	List<Pays> findByOrderByNomPaysAsc();
	List<Pays> trierPaysNomDESC();

}
