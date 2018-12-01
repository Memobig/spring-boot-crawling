package com.guifram.sinvueltas.app.models.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the horario database table.
 * 
 */
@Entity
@Table(name="horario")
@NamedQuery(name="Horario.findAll", query="SELECT h FROM Horario h")
public class Horario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String disponibilidad;

	//bi-directional many-to-one association to Propiedad
	@OneToMany(mappedBy="horario")
	private List<Propiedad> propiedads;

	public Horario() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDisponibilidad() {
		return this.disponibilidad;
	}

	public void setDisponibilidad(String disponibilidad) {
		this.disponibilidad = disponibilidad;
	}

	public List<Propiedad> getPropiedads() {
		return this.propiedads;
	}

	public void setPropiedads(List<Propiedad> propiedads) {
		this.propiedads = propiedads;
	}

	public Propiedad addPropiedad(Propiedad propiedad) {
		getPropiedads().add(propiedad);
		propiedad.setHorario(this);

		return propiedad;
	}

	public Propiedad removePropiedad(Propiedad propiedad) {
		getPropiedads().remove(propiedad);
		propiedad.setHorario(null);

		return propiedad;
	}

}