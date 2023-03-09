package com.ibouroisoft.site.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ibouroisoft.site.entities.Produit;

@Repository
public interface ProduitRepository extends JpaRepository<Produit, Long> {
	List<Produit> findByNomProduit(String nom);
	List<Produit> findByNomProduitContains(String nom); 
	

}
