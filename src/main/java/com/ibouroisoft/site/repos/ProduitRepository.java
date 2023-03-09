package com.ibouroisoft.site.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ibouroisoft.site.entities.Produit;

@Repository
public interface ProduitRepository extends JpaRepository<Produit, Long> {

}
