package com.ibouroisoft.site;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ibouroisoft.site.entities.Categorie;
import com.ibouroisoft.site.entities.Produit;
import com.ibouroisoft.site.repos.ProduitRepository;




@SpringBootTest
class SiteApplicationTests {

	@Autowired
	ProduitRepository produitRepository ;

	//Test de création de Produit

	@Test
	void testCreateProduit() {
		Produit prod = new Produit(0L,"PC HP",3000.100,new Date());
		produitRepository.save(prod);
	}

	//Test de consulation de Produit 

	@Test
	public void testFindProduit() {
		Produit p = produitRepository.findById(1L).get();
		System.out.println(p);

	}

	//Test de mise à jour de produit

	@Test
	public void testUpdateProduit() {
		Produit p = produitRepository.findById(1L).get();
		p.setPrixProduit(1000.0);
		produitRepository.save(p);

	}

	//Test pour trouver tous les produits
	@Test
	public void testFindAllProduits() {
		List<Produit> prods = produitRepository.findAll();
		for(Produit p: prods) {
			System.out.println(p);

		}
	}

	@Test
	public void testFindByNomProduit()
	{
		List<Produit> prods = produitRepository.findByNomProduit("PC HP");
		for (Produit p : prods)
		{
			System.out.println(p);
		}
	}

	@Test
	public void testFindByNomProduitContains (){

		List<Produit> prods=produitRepository.findByNomProduitContains("PC HP");
		for (Produit p : prods){
			System.out.println(p);

		}   

	}

	@Test
	public void testFindByNomPrix() {
		List<Produit> prods = produitRepository.findByNomPrix("PC HP", 3000.1);
		for(Produit p : prods ) {
			System.out.println(p);
			System.out.println("************************************************");


		}
	}

	@Test
	public void testFindByCategorie() {

		Categorie cat = new Categorie();
		cat.setIdCat(4L);
		List<Produit> prods = produitRepository.findByCategorie(cat);
		for(Produit p : prods) {
			System.out.println(p);
			System.out.println("##############################################################");

		}

	}
	
	@Test
	public void testFindByCategorieIdCat() {
		List<Produit> prods =  produitRepository.findByCategorieIdCat(4L);
		for(Produit p : prods) {
			System.out.println(p);
			System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");


		}

	}


	/*
	//Test de la suppression de produit 
	@Test
	public void testDeleteProduits(){
		produitRepository.deleteById(4L);

	}
	 */

}
