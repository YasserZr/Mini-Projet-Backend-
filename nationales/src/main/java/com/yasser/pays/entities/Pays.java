package com.yasser.pays.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Pays {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idPays;
	private String nomPays;
	@ManyToOne
	private Langue langue;

	public Pays() {
			super();
		}

	public Pays(String nomPays) {
			super();
			this.nomPays = nomPays;
		}

	public Long getIdPaye() {
		return idPays;
	}

	public void setIdPaye(Long idPaye) {
		this.idPays = idPaye;
	}

	public String getNomPays() {
		return nomPays;
	}

	public void setNomPays(String nomPays) {
		this.nomPays = nomPays;
	}

	@Override
	public String toString() {
		return "Pays [idPays=" + idPays + ", nomPays=" + nomPays + "]";
	}
	
}
