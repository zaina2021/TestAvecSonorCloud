package com.ibouroisoft.site;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.ibouroisoft.site.entities", "com.ibouroisoft.site.repos", "com.ibouroisoft.site.services", "com.ibouroisoft.site.restcontrollers", })
public class SiteApplication {

	public static void main(String[] args) {
		SpringApplication.run(SiteApplication.class, args);
	}

}
