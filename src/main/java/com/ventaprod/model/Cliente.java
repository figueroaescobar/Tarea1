package com.ventaprod.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "cliente")
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idCliente;
	
	@Size(min = 3, max = 70, message = "Campo Nombre Cliente debe tener minimo 3 caracteres")
	@Column(name = "nombre_cliente", nullable = false, length = 70)
	private String nombreCliente;
	
	@Size(min = 3, max = 70, message = "Campo Dirección Cliente debe tener minimo 3 caracteres")
	@Column(name = "dirCliente", nullable = false, length = 70)
	private String dirCliente;
	
	@Size(min = 5, max = 9, message = "Campo Teléfono Cliente debe tener minimo 5 caracteres")
	@Column(name = "telCliente", nullable = false, length = 9)
	private String telCliente;

	public Integer getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public String getDirCliente() {
		return dirCliente;
	}

	public void setDirCliente(String dirCliente) {
		this.dirCliente = dirCliente;
	}

	public String getTelCliente() {
		return telCliente;
	}

	public void setTelCliente(String telCliente) {
		this.telCliente = telCliente;
	}	
}
