package com.ibouroisoft.site.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
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
	//@RequestMapping(value = "/produits", method = RequestMethod.GET)
	public List<Produit> getAllProduits() {
		return produitService.getAllProduits();
	}
}


