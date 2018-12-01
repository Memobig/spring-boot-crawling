package com.guifram.sinvueltas.app.models.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the propiedad database table.
 * 
 */
@Entity
@Table(name="propiedad")
@NamedQuery(name="Propiedad.findAll", query="SELECT p FROM Propiedad p")
public class Propiedad implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private int banos;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="created_at")
	private Date createdAt;

	private String descripcion;

	private int estacionamientos;

	private int habitaciones;

	private float precio;

	@Column(name="precio_mantto")
	private float precioMantto;

	@Column(name="superficie_cubierta")
	private int superficieCubierta;

	@Column(name="superficie_total")
	private int superficieTotal;

	private String titulo;

	//bi-directional many-to-one association to Fotografia
	@OneToMany(mappedBy="propiedad")
	private List<Fotografia> fotografias;

	//bi-directional many-to-one association to Antiguedad
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_antiguedad")
	private Antiguedad antiguedad;

	//bi-directional many-to-one association to Comision
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_comision")
	private Comision comision;

	//bi-directional many-to-one association to Divisa
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_divisa")
	private Divisa divisa;

	//bi-directional many-to-one association to Fuente
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_fuente")
	private Fuente fuente;

	//bi-directional many-to-one association to Horario
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_horario")
	private Horario horario;

	//bi-directional many-to-one association to Status
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_status")
	private Status status;

	//bi-directional many-to-one association to TipoOperacion
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_tipo_operacion")
	private TipoOperacion tipoOperacion;

	//bi-directional many-to-one association to Ubicacion
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_ubicacion")
	private Ubicacion ubicacion;

	//bi-directional many-to-one association to Verificacion
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_verificacion")
	private Verificacion verificacion;

	//bi-directional many-to-one association to PropiedadesAmenidade
	@OneToMany(mappedBy="propiedad")
	private List<PropiedadesAmenidade> propiedadesAmenidades;

	public Propiedad() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getBanos() {
		return this.banos;
	}

	public void setBanos(int banos) {
		this.banos = banos;
	}

	public Date getCreatedAt() {
		return this.createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getEstacionamientos() {
		return this.estacionamientos;
	}

	public void setEstacionamientos(int estacionamientos) {
		this.estacionamientos = estacionamientos;
	}

	public int getHabitaciones() {
		return this.habitaciones;
	}

	public void setHabitaciones(int habitaciones) {
		this.habitaciones = habitaciones;
	}

	public float getPrecio() {
		return this.precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public float getPrecioMantto() {
		return this.precioMantto;
	}

	public void setPrecioMantto(float precioMantto) {
		this.precioMantto = precioMantto;
	}

	public int getSuperficieCubierta() {
		return this.superficieCubierta;
	}

	public void setSuperficieCubierta(int superficieCubierta) {
		this.superficieCubierta = superficieCubierta;
	}

	public int getSuperficieTotal() {
		return this.superficieTotal;
	}

	public void setSuperficieTotal(int superficieTotal) {
		this.superficieTotal = superficieTotal;
	}

	public String getTitulo() {
		return this.titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public List<Fotografia> getFotografias() {
		return this.fotografias;
	}

	public void setFotografias(List<Fotografia> fotografias) {
		this.fotografias = fotografias;
	}

	public Fotografia addFotografia(Fotografia fotografia) {
		getFotografias().add(fotografia);
		fotografia.setPropiedad(this);

		return fotografia;
	}

	public Fotografia removeFotografia(Fotografia fotografia) {
		getFotografias().remove(fotografia);
		fotografia.setPropiedad(null);

		return fotografia;
	}

	public Antiguedad getAntiguedad() {
		return this.antiguedad;
	}

	public void setAntiguedad(Antiguedad antiguedad) {
		this.antiguedad = antiguedad;
	}

	public Comision getComision() {
		return this.comision;
	}

	public void setComision(Comision comision) {
		this.comision = comision;
	}

	public Divisa getDivisa() {
		return this.divisa;
	}

	public void setDivisa(Divisa divisa) {
		this.divisa = divisa;
	}

	public Fuente getFuente() {
		return this.fuente;
	}

	public void setFuente(Fuente fuente) {
		this.fuente = fuente;
	}

	public Horario getHorario() {
		return this.horario;
	}

	public void setHorario(Horario horario) {
		this.horario = horario;
	}

	public Status getStatus() {
		return this.status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public TipoOperacion getTipoOperacion() {
		return this.tipoOperacion;
	}

	public void setTipoOperacion(TipoOperacion tipoOperacion) {
		this.tipoOperacion = tipoOperacion;
	}

	public Ubicacion getUbicacion() {
		return this.ubicacion;
	}

	public void setUbicacion(Ubicacion ubicacion) {
		this.ubicacion = ubicacion;
	}

	public Verificacion getVerificacion() {
		return this.verificacion;
	}

	public void setVerificacion(Verificacion verificacion) {
		this.verificacion = verificacion;
	}

	public List<PropiedadesAmenidade> getPropiedadesAmenidades() {
		return this.propiedadesAmenidades;
	}

	public void setPropiedadesAmenidades(List<PropiedadesAmenidade> propiedadesAmenidades) {
		this.propiedadesAmenidades = propiedadesAmenidades;
	}

	public PropiedadesAmenidade addPropiedadesAmenidade(PropiedadesAmenidade propiedadesAmenidade) {
		getPropiedadesAmenidades().add(propiedadesAmenidade);
		propiedadesAmenidade.setPropiedad(this);

		return propiedadesAmenidade;
	}

	public PropiedadesAmenidade removePropiedadesAmenidade(PropiedadesAmenidade propiedadesAmenidade) {
		getPropiedadesAmenidades().remove(propiedadesAmenidade);
		propiedadesAmenidade.setPropiedad(null);

		return propiedadesAmenidade;
	}

}