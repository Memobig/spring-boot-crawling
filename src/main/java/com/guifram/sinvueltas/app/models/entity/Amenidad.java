package com.guifram.sinvueltas.app.models.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the amenidad database table.
 * 
 */
@Entity
@Table(name="amenidad")
@NamedQuery(name="Amenidad.findAll", query="SELECT a FROM Amenidad a")
public class Amenidad implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String descripcion;

	//bi-directional many-to-one association to PropiedadesAmenidade
	@OneToMany(mappedBy="amenidad")
	private List<PropiedadesAmenidade> propiedadesAmenidades;

	public Amenidad() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public List<PropiedadesAmenidade> getPropiedadesAmenidades() {
		return this.propiedadesAmenidades;
	}

	public void setPropiedadesAmenidades(List<PropiedadesAmenidade> propiedadesAmenidades) {
		this.propiedadesAmenidades = propiedadesAmenidades;
	}

	public PropiedadesAmenidade addPropiedadesAmenidade(PropiedadesAmenidade propiedadesAmenidade) {
		getPropiedadesAmenidades().add(propiedadesAmenidade);
		propiedadesAmenidade.setAmenidad(this);

		return propiedadesAmenidade;
	}

	public PropiedadesAmenidade removePropiedadesAmenidade(PropiedadesAmenidade propiedadesAmenidade) {
		getPropiedadesAmenidades().remove(propiedadesAmenidade);
		propiedadesAmenidade.setAmenidad(null);

		return propiedadesAmenidade;
	}

}