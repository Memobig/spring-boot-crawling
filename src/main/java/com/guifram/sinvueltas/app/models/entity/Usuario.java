package com.guifram.sinvueltas.app.models.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the usuario database table.
 * 
 */
@Entity
@Table(name="usuario")
@NamedQuery(name="Usuario.findAll", query="SELECT u FROM Usuario u")
public class Usuario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="created_at")
	private Date createdAt;

	private String email;

	private String password;

	private String username;

	//bi-directional many-to-many association to Authority
	@ManyToMany
	@JoinTable(
		name="usuarios_authorities"
		, joinColumns={
			@JoinColumn(name="usuario_id")
			}
		, inverseJoinColumns={
			@JoinColumn(name="id_authority")
			}
		)
	private List<Authority> authorities;

	//bi-directional many-to-one association to Verificacion
	@OneToMany(mappedBy="usuario")
	private List<Verificacion> verificacions;

	public Usuario() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getCreatedAt() {
		return this.createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public List<Authority> getAuthorities() {
		return this.authorities;
	}

	public void setAuthorities(List<Authority> authorities) {
		this.authorities = authorities;
	}

	public List<Verificacion> getVerificacions() {
		return this.verificacions;
	}

	public void setVerificacions(List<Verificacion> verificacions) {
		this.verificacions = verificacions;
	}

	public Verificacion addVerificacion(Verificacion verificacion) {
		getVerificacions().add(verificacion);
		verificacion.setUsuario(this);

		return verificacion;
	}

	public Verificacion removeVerificacion(Verificacion verificacion) {
		getVerificacions().remove(verificacion);
		verificacion.setUsuario(null);

		return verificacion;
	}

}