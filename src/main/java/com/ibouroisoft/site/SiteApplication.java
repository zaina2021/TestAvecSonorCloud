package com.ibouroisoft.site;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import com.ibouroisoft.site.entities.Categorie;
import com.ibouroisoft.site.entities.Produit;

@SpringBootApplication
@ComponentScan(basePackages = {"com.ibouroisoft.site.entities", "com.ibouroisoft.site.repos", "com.ibouroisoft.site.services", "com.ibouroisoft.site.restcontrollers", })
public class SiteApplication implements CommandLineRunner{
	
	@Autowired
	RepositoryRestConfiguration repositoryRestConfiguration;

	public static void main(String[] args) {
		SpringApplication.run(SiteApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		repositoryRestConfiguration.exposeIdsFor(Produit.class, Categorie.class);
		
		
	}

}
