package com.yasser.pays.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.yasser.pays.entities.Langue;
import com.yasser.pays.entities.Pays;

@RepositoryRestResource(path = "rest")
public interface PaysRepository extends JpaRepository<Pays, Long> {
	List<Pays> findByNomPays(String nom);

	List<Pays> findByNomPaysContains(String nom);


	/**/
	  @Query("select p from Pays p where p.langue = ?1") 
	  List<Pays> findByLangue(Langue langue);
	 /**/

	/**/ List<Pays> findByLangueIdLang(Long id); /**/

	List<Pays> findByOrderByNomPaysAsc();

	@Query("select p from Pays p order by p.nomPays DESC")
	List<Pays> trierPaysNomDESC();

}
