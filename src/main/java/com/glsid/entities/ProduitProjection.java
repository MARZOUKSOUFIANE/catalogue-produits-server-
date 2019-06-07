package com.glsid.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "P1",types = Produit.class)
public interface ProduitProjection {

	public long getCode();
	public String getDesignation();
	public double getPrice();
	public int getQuantite();
}
