package com.yasser.pays.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.yasser.pays.entities.Langue;
import com.yasser.pays.repos.LangueRepository;

@RestController
@RequestMapping("/api/lang")
@CrossOrigin("*")
public class LangueRESTController {
	
	@Autowired
	LangueRepository langueRepository;
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Langue> getAllLangues()
	{
		return langueRepository.findAll();
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public Langue getPaysById(@PathVariable("id") Long id) {
		return langueRepository.findById(id).get();
	}
	
}
