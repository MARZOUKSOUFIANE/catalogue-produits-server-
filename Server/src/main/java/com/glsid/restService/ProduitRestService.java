package com.glsid.restService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.glsid.dao.ProduitRespository;
import com.glsid.entities.Produit;

@CrossOrigin("*")
@RestController
public class ProduitRestService {
    @Autowired
	private ProduitRespository produitRespository;
	
	@GetMapping(value = "/listProduits")
	public List<Produit> listProduits(){
		return produitRespository.findAll();
	}
	
	@GetMapping(value = "/listProduits/{id}")
	public Produit listProduits(@PathVariable(name = "id") long id){
		return produitRespository.findById(id).get();
	}
	
	@PutMapping(value = "/listProduits/{id}")
	public void update(@PathVariable(name = "id") long id,@RequestBody Produit P){
		P.setCode(id);
		produitRespository.save(P);
	}
	
	@PostMapping(value = "/listProduits")
	public void ajouter(@RequestBody Produit P){
		produitRespository.save(P);
	}
	
	@DeleteMapping(value = "/listProduits/{id}")
	public void delete(@PathVariable(name = "id") long id){
		produitRespository.deleteById(id);
	}
}

