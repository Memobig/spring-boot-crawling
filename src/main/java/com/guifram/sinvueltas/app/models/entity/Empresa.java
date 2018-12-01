package com.guifram.sinvueltas.app.models.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the empresa database table.
 * 
 */
@Entity
@Table(name="empresa")
@NamedQuery(name="Empresa.findAll", query="SELECT e FROM Empresa e")
public class Empresa implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String nombre;

	//bi-directional many-to-one association to Fuente
	@OneToMany(mappedBy="empresa")
	private List<Fuente> fuentes;

	public Empresa() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Fuente> getFuentes() {
		return this.fuentes;
	}

	public void setFuentes(List<Fuente> fuentes) {
		this.fuentes = fuentes;
	}

	public Fuente addFuente(Fuente fuente) {
		getFuentes().add(fuente);
		fuente.setEmpresa(this);

		return fuente;
	}

	public Fuente removeFuente(Fuente fuente) {
		getFuentes().remove(fuente);
		fuente.setEmpresa(null);

		return fuente;
	}

}