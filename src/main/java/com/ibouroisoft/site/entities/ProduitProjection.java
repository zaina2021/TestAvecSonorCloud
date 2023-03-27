package com.ibouroisoft.site.entities;

import org.springframework.data.rest.core.config.Projection;

/*
 * On appelle la Projection de nom "nomProd" et la projection concerne l'entité "Produit"
 */
@Projection(name = "nomProd", types = {Produit.class} )
public interface ProduitProjection {
	
	//get des Attributs quon veut  consulter 
	public String getNomProduit();
	

}
