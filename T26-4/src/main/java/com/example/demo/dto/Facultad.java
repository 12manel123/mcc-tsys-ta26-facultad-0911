package com.example.demo.dto;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Facultad {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigo;
	
	private String nombre;
	
	 @OneToMany(mappedBy = "facultad")
	    private List<Investigador> investigadores;

    @OneToMany(mappedBy = "facultad")
    private List<Equipo> equipos;
	
	// Constructores
	public Facultad() {
	}
	
	public Facultad(String nombre) {
	    this.nombre = nombre;
	}
	

	
	@Override
	public String toString() {
	    return "Facultad{" +
		"codigo=" + codigo +
		", nombre='" + nombre + '\'' +
		'}';
	}
	// Getters y Setters

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Investigador> getInvestigadores() {
		return investigadores;
	}

	public void setInvestigadores(List<Investigador> investigadores) {
		this.investigadores = investigadores;
	}

	public List<Equipo> getEquipos() {
		return equipos;
	}

	public void setEquipos(List<Equipo> equipos) {
		this.equipos = equipos;
	}
	
	
}
