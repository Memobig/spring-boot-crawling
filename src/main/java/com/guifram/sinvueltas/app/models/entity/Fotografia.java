package com.guifram.sinvueltas.app.models.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the fotografia database table.
 * 
 */
@Entity
@Table(name="fotografia")
@NamedQuery(name="Fotografia.findAll", query="SELECT f FROM Fotografia f")
public class Fotografia implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String url;

	//bi-directional many-to-one association to Propiedad
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_propiedad")
	private Propiedad propiedad;

	public Fotografia() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Propiedad getPropiedad() {
		return this.propiedad;
	}

	public void setPropiedad(Propiedad propiedad) {
		this.propiedad = propiedad;
	}

}