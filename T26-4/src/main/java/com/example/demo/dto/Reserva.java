package com.example.demo.dto;


import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Reserva {
    @Id
    private String id;

    @ManyToOne
    @JoinColumn(name = "DNI")
    @JsonIgnore
    private Investigador investigador;

    @ManyToOne
    @JoinColumn(name = "numSerie")
    @JsonIgnore
    private Equipo equipo;

    @Column(name = "fechaInicio")
    private String fechaInicio;

    @Column(name = "fechaFin")
    private String fechaFin;

    // Constructores, Getters y Setters

    @Override
    public String toString() {
        return "Reserva{" +
                "id=" + id +
                ", investigador=" + investigador +
                ", equipo=" + equipo +
                ", comienzo=" + fechaInicio +
                ", fin=" + fechaFin +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }
    

	public Investigador getInvestigador() {
		return investigador;
	}

	public void setInvestigador(Investigador investigador) {
		this.investigador = investigador;
	}

	public Equipo getEquipo() {
		return equipo;
	}

	public void setEquipo(Equipo equipo) {
		this.equipo = equipo;
	}

	
    
}