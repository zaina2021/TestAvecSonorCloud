package com.ibouroisoft.site.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ibouroisoft.site.entities.Produit;
import com.ibouroisoft.site.services.ProduitService;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class ProduitRESTController {

	@Autowired
	ProduitService produitService;
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Produit> getAllProduits() {
		return produitService.getAllProduits();
	}
	/*
	 * la méthode getProduitById qui 
		retourne un produit en acceptant son id 
	 */

	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public Produit getProduitById(@PathVariable("id") Long id) {
		return produitService.getProduit(id);
	}
	
	/*
	 * Créer le Web service REST permettant de créer un produit
	 */
	@RequestMapping(method = RequestMethod.POST)
	public Produit createProduit(@RequestBody Produit produit) {
	return produitService.saveProduit(produit);
	}
	
	/*
	 * Créer le Web service REST permettant de modifier un produit
	 */
	@RequestMapping(method = RequestMethod.PUT)
	public Produit updateProduit(@RequestBody Produit produit) {
	return produitService.updateProduit(produit);
	}
	
	
}


