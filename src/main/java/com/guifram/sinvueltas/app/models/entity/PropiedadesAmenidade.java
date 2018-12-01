package com.guifram.sinvueltas.app.models.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the propiedades_amenidades database table.
 * 
 */
@Entity
@Table(name="propiedades_amenidades")
@NamedQuery(name="PropiedadesAmenidade.findAll", query="SELECT p FROM PropiedadesAmenidade p")
public class PropiedadesAmenidade implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	//bi-directional many-to-one association to Amenidad
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_amenidad")
	private Amenidad amenidad;

	//bi-directional many-to-one association to Propiedad
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_propiedad")
	private Propiedad propiedad;

	public PropiedadesAmenidade() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Amenidad getAmenidad() {
		return this.amenidad;
	}

	public void setAmenidad(Amenidad amenidad) {
		this.amenidad = amenidad;
	}

	public Propiedad getPropiedad() {
		return this.propiedad;
	}

	public void setPropiedad(Propiedad propiedad) {
		this.propiedad = propiedad;
	}

}