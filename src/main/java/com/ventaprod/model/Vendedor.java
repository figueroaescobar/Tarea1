package com.ventaprod.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "vendedor")
public class Vendedor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idVendedor;
	
	@ManyToOne
	@JoinColumn(name = "id_supervisor", nullable = false, foreignKey = @ForeignKey(name = "FK_vendedor_supervisor"))
	private Supervisor supervisor;
	
	@Size(min = 3, max = 50, message = "Campo Nombre Vendedor debe tener minimo 3 caracteres")
	@Column(name = "nombre_vendedor", nullable = false, length = 50)
	private String nombreVendedor;
	
	@Size(min = 3, max = 50, message = "Campo Dirección Vendedor debe tener minimo 3 caracteres")
	@Column(name = "dirVendedor", nullable = false, length = 50)
	private String dirVendedor;

	public Integer getIdVendedor() {
		return idVendedor;
	}

	public void setIdVendedor(Integer idVendedor) {
		this.idVendedor = idVendedor;
	}

	public Supervisor getSupervisor() {
		return supervisor;
	}

	public void setSupervisor(Supervisor supervisor) {
		this.supervisor = supervisor;
	}

	public String getNombreVendedor() {
		return nombreVendedor;
	}

	public void setNombreVendedor(String nombreVendedor) {
		this.nombreVendedor = nombreVendedor;
	}

	public String getDirVendedor() {
		return dirVendedor;
	}

	public void setDirVendedor(String dirVendedor) {
		this.dirVendedor = dirVendedor;
	}
	
	
	
}
