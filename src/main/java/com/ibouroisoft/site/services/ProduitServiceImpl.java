package com.ibouroisoft.site.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ibouroisoft.site.entities.Produit;
import com.ibouroisoft.site.repos.ProduitRepository;

@Service
public class ProduitServiceImpl implements ProduitService {


	ProduitRepository produitRepository;
	@Override
	public Produit saveProduit(Produit p) {

		return produitRepository.save(p);
	}
	

	@Override
	public Produit updateProduit(Produit p) {

		return produitRepository.save(p);
	}


	@Override
	public Produit getProduit(Long id) {

		return produitRepository.findById(id).get();
	}

	@Override
	public List<Produit> getAllProduits(){

		return produitRepository.findAll();
	}
	
	@Override
	public void deleteProduit(Produit p) {
		produitRepository.delete(p);
		

	}

	@Override
	public void deleteProduitById(Long id) {
		produitRepository.deleteById(id);

	}


}
