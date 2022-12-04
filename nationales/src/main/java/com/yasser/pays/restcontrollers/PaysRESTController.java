package com.yasser.pays.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.yasser.pays.entities.Pays;
import com.yasser.pays.services.PaysService;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class PaysRESTController {
	@Autowired
	PaysService paysService;

	@RequestMapping(method = RequestMethod.GET)
	public List<Pays> getAllProduits() {
		return paysService.getAllPays();
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Pays getProduitById(@PathVariable("id") Long id) {
		return paysService.getPays(id);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public Pays createProduit(@RequestBody Pays pays) {
	return paysService.savePays(pays);
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public Pays updateProduit(@RequestBody Pays pays) {
	return paysService.updatePays(pays);
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.DELETE)
	public void deletePays(@PathVariable("id") Long id)
	{
	paysService.deletePaysById(id);
	}
	
	/**/@RequestMapping(value="/payslang/{idLang}",method = RequestMethod.GET)
	public List<Pays> getPaysByCatId(@PathVariable("idLang") Long idLang) {
	return paysService.findByLangueIdLang(idLang);
	}/**/
	
	@RequestMapping(value="/paysByName/{nom}",method = RequestMethod.GET)
	public List<Pays> findByNomPaysContains(@PathVariable("nom") String nom) {
		return paysService.findByNomPaysContains(nom);
	}
}
