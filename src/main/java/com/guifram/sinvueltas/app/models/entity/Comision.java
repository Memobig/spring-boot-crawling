package com.guifram.sinvueltas.app.models.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the comision database table.
 * 
 */
@Entity
@Table(name="comision")
@NamedQuery(name="Comision.findAll", query="SELECT c FROM Comision c")
public class Comision implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@Column(name="comparte_comision")
	private String comparteComision;

	private float porcentaje;

	//bi-directional many-to-one association to Propiedad
	@OneToMany(mappedBy="comision")
	private List<Propiedad> propiedads;

	public Comision() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getComparteComision() {
		return this.comparteComision;
	}

	public void setComparteComision(String comparteComision) {
		this.comparteComision = comparteComision;
	}

	public float getPorcentaje() {
		return this.porcentaje;
	}

	public void setPorcentaje(float porcentaje) {
		this.porcentaje = porcentaje;
	}

	public List<Propiedad> getPropiedads() {
		return this.propiedads;
	}

	public void setPropiedads(List<Propiedad> propiedads) {
		this.propiedads = propiedads;
	}

	public Propiedad addPropiedad(Propiedad propiedad) {
		getPropiedads().add(propiedad);
		propiedad.setComision(this);

		return propiedad;
	}

	public Propiedad removePropiedad(Propiedad propiedad) {
		getPropiedads().remove(propiedad);
		propiedad.setComision(null);

		return propiedad;
	}

}