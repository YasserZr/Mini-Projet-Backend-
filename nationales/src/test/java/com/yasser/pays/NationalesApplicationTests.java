package com.yasser.pays;

import java.util.List;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.yasser.pays.entities.Langue;
import com.yasser.pays.entities.Pays;
import com.yasser.pays.repos.PaysRepository;

@SpringBootTest
class NationalesApplicationTests {
	@Autowired
	private PaysRepository paysRepository;

	@Test
	public void testCreatePays() {
		Pays pay = new Pays("Qatar");
		paysRepository.save(pay);
	}

	@Test
	public void testFindPays() {
		Pays p = paysRepository.findById(1L).get();
		System.out.println(p);
	}

	@Test
	public void testDeletePays() {
		paysRepository.deleteById(1L);
		;
	}

	@Test
	public void testListerTousPays()
	{
	List<Pays> pays = paysRepository.findAll();
	for (Pays p : pays)
	{
	System.out.println(p);
	}
	}
	
	@Test
	public void testFindByNomPays()
	{
	List<Pays> pays = paysRepository.findByNomPays("Tunisie");
	for (Pays p : pays)
	{
	System.out.println(p);
	}
	}
	
	@Test
	public void testFindByNomPaysContains ()
	{
	List<Pays> pays= paysRepository.findByNomPaysContains("Tunisie");
	for (Pays p : pays)
	{
	System.out.println(p);
	} 
	}
	
	/**/@Test
	public void testfindByLangue()
	{
	Langue lang = new Langue();
	lang.setIdLang(2L);
	List<Pays> pays = paysRepository.findByLangue(lang);
	for (Pays p : pays)
	{
	System.out.println(p);
	}
	}/**/
	
	/**/@Test
	public void findByLangueIdLang()
	{
	List<Pays> pays = paysRepository.findByLangueIdLang(3L);
	for (Pays p : pays)
	{
	System.out.println(p);
	}
	}
	/**/
	@Test
	public void testfindByOrderByNomPaysAsc()
	{
	List<Pays> pays = paysRepository.findByOrderByNomPaysAsc();
	for (Pays p : pays)
	{
	System.out.println(p);
	}
	}
	
	@Test public void testTrierPaysNomDESC()
	{
	List<Pays> pays = paysRepository.trierPaysNomDESC();
	for (Pays p : pays)
	{
	System.out.println(p);
	}
	}

}
