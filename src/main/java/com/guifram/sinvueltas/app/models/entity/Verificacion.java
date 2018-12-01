package com.guifram.sinvueltas.app.models.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the verificacion database table.
 * 
 */
@Entity
@Table(name="verificacion")
@NamedQuery(name="Verificacion.findAll", query="SELECT v FROM Verificacion v")
public class Verificacion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String verificacion;

	//bi-directional many-to-one association to Propiedad
	@OneToMany(mappedBy="verificacion")
	private List<Propiedad> propiedads;

	//bi-directional many-to-one association to Usuario
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_usuario")
	private Usuario usuario;

	public Verificacion() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getVerificacion() {
		return this.verificacion;
	}

	public void setVerificacion(String verificacion) {
		this.verificacion = verificacion;
	}

	public List<Propiedad> getPropiedads() {
		return this.propiedads;
	}

	public void setPropiedads(List<Propiedad> propiedads) {
		this.propiedads = propiedads;
	}

	public Propiedad addPropiedad(Propiedad propiedad) {
		getPropiedads().add(propiedad);
		propiedad.setVerificacion(this);

		return propiedad;
	}

	public Propiedad removePropiedad(Propiedad propiedad) {
		getPropiedads().remove(propiedad);
		propiedad.setVerificacion(null);

		return propiedad;
	}

	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}