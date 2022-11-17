package com.yasser.pays.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Langue {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idLang;
	private String nomLang;
	
	@JsonIgnore
	@OneToMany(mappedBy = "langue")
	private List<Pays> pays;
	public Langue(String nomLang,List<Pays> pays) {
	super();
	this.nomLang = nomLang;
	this.pays = pays;
	}
	public Long getIdLang() {
	return idLang;
	}
	public void setIdLang(Long idLang) {
	this.idLang = idLang;
	}
	public String getNomLang() {
	return nomLang;
	}
	public void setNomLang(String nomLang) {
	this.nomLang = nomLang;
	}
	public List<Pays> getPays() {
	return pays;
	}
	public void setPays(List<Pays> pays) {
	this.pays = pays;
	}

}
