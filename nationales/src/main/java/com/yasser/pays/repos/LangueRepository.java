package com.yasser.pays.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.yasser.pays.entities.Langue;

@RepositoryRestResource(path= "lang")
@CrossOrigin(origins = "http://localhost:4200/")
public interface LangueRepository extends JpaRepository<Langue, Long> {

}
