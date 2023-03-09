package com.ibouroisoft.site.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor


@Entity
public class Produit {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long idProduit;
	String nomProduit;
	Double prixProduit ; 
	Date dateCreation;
	
	@ManyToOne
	Categorie categorie;
	
	//Constructeur avec paramètres
		public Produit(Long idProduit, String nomProduit, Double prixProduit, Date dateCreation) {
			super();
			this.idProduit = idProduit;
			this.nomProduit = nomProduit;
			this.prixProduit = prixProduit;
			this.dateCreation = dateCreation;
		}



	@Override
	public String toString() {
		return "Produit [idProduit=" + idProduit + ", nomProduit=" + 
				nomProduit + ", prixProduit=" + prixProduit
				+ ", dateCreation=" + dateCreation + "]";
	}

}
