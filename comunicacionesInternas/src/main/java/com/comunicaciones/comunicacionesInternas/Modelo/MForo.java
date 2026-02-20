package com.comunicaciones.comunicacionesInternas.Modelo;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table
public class MForo
{
    @Id
    @Column(length = 20, nullable = false)
    private String idforo;

    @Column(length = 70, nullable = false)
    private String titulo;

    @Column(length = 150,nullable = false)
    private String descripcion;

    @Column(length = 15,nullable = false)
    private LocalDate fechacreacion;

    @Column(length = 10,nullable = false)
    private String activo;

    @Column(nullable = false)
    private String idcolaborador;

    @ManyToOne
    @JoinColumn(name = "pkColaborador",referencedColumnName = "idcolaborador")
    @JsonBackReference
    MColaborador mColaborador;

    //Constructor
    public MForo(String idforo, String titulo, String descripcion, LocalDate fechacreacion, String activo, String idcolaborador)
    {
        this.idforo = idforo;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fechacreacion = fechacreacion;
        this.activo = activo;
        this.idcolaborador = idcolaborador;
    }

    //Constructor vacio
    public MForo()
    {
    }

    //Get and set
    public String getIdforo()
    {
        return idforo;
    }

    public void setIdforo(String idforo)
    {
        this.idforo = idforo;
    }

    public String getTitulo()
    {
        return titulo;
    }

    public void setTitulo(String titulo)
    {
        this.titulo = titulo;
    }

    public String getDescripcion()
    {
        return descripcion;
    }

    public void setDescripcion(String descripcion)
    {
        this.descripcion = descripcion;
    }

    public LocalDate getFechacreacion()
    {
        return fechacreacion;
    }

    public void setFechacreacion(LocalDate fechacreacion)
    {
        this.fechacreacion = fechacreacion;
    }

    public String getActivo()
    {
        return activo;
    }

    public void setActivo(String activo)
    {
        this.activo = activo;
    }

    public String getIdcolaborador()
    {
        return idcolaborador;
    }

    public void setIdcolaborador(String idcolaborador)
    {
        this.idcolaborador = idcolaborador;
    }
}

