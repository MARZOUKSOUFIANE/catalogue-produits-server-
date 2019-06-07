package com.glsid;

import com.glsid.entities.Produit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import com.glsid.dao.ProduitRespository;

@SpringBootApplication
public class RestApplication implements CommandLineRunner{
	@Autowired
	private ProduitRespository ProduitRespository;
	@Autowired
	private RepositoryRestConfiguration restConfiguration;
	
	public static void main(String[] args) {
		SpringApplication.run(RestApplication.class);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		restConfiguration.exposeIdsFor(Produit.class);
		ProduitRespository.save(new Produit("television",1200,3));
		ProduitRespository.save(new Produit("machine a laver",3500,2));
		ProduitRespository.save(new Produit("refrigirateur",4000,5));
		ProduitRespository.save(new Produit("television",86000,2));
		ProduitRespository.save(new Produit("micro onde",4000,5));
		ProduitRespository.save(new Produit("machine a laver LG",35200,5));
		ProduitRespository.save(new Produit("Voiture",4000,5));
		ProduitRespository.save(new Produit("Camion",120000,8));
		ProduitRespository.save(new Produit("remoque",.4500,5));
		ProduitRespository.save(new Produit("climatiseur",4000,5));
		ProduitRespository.save(new Produit("chauffage",4000,10));
		ProduitRespository.save(new Produit("pick up",20000,5));
		ProduitRespository.save(new Produit("Bus",250000,5));
		ProduitRespository.save(new Produit("imprimante HP",250000,5));
		ProduitRespository.save(new Produit("imprimante dell",250000,5));
		ProduitRespository.save(new Produit("imprimante lazer",250000,5));
		ProduitRespository.save(new Produit("imprimante lexmark",250000,5));
		ProduitRespository.save(new Produit("imprimante compaq",250000,5));
		ProduitRespository.save(new Produit("imprimante coleur",250000,5));
		ProduitRespository.save(new Produit("imprimante blan & noir",250000,5));
		ProduitRespository.save(new Produit("smartphone galaxy s3",250000,5));
		ProduitRespository.save(new Produit("smartphone galaxy s9",250000,5));
		ProduitRespository.save(new Produit("smartphone oppo f11",250000,5));
		ProduitRespository.save(new Produit("smartphone huawei",250000,5));



	}

}
