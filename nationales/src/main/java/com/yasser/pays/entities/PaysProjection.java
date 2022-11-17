package com.yasser.pays.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "nomProd", types = { Pays.class })
public interface PaysProjection {
	public String getNomPays();
}
