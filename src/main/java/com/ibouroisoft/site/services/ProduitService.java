package com.ibouroisoft.site.services;

import java.util.List;


import com.ibouroisoft.site.entities.Categorie;
import com.ibouroisoft.site.entities.Produit;



public interface ProduitService {
	/*enregistrer l'entité produit p  dans la base de données 
	et retourne ce même produit enregistré 
	 */
	Produit saveProduit(Produit p);

	/*Mise à jour  l'entité produit p dans la base de données 
	 * et retourne ce même produit enregistré 
	 */
	Produit updateProduit(Produit p);

	//Supprimer l'entité produit p dans la base de données 
	void deleteProduit(Produit p);

	/*Supprimer l'entité produit dans la base de données dont son identifiant 
	est id 
	 */
	void deleteProduitById(Long id);

	/*Consulter un produit dont son identifiant  est id 
	 */ 
	Produit getProduit(Long id);

	//Retourner tous les produits 
	List<Produit> getAllProduits();

	//Ajout des méthodes du Repository

	List<Produit> findByNomProduit(String nom);
	List<Produit> findByNomProduitContains(String nom); 
	List<Produit> findByNomPrix(String nom, Double prix);
	List<Produit> findByCategorie(Categorie categorie);
	List<Produit> findByCategorieIdCat(Long id);
	List<Produit> findByOrderByNomProduitAsc();
	List<Produit> trierProduitsNomsPrix ();


}
