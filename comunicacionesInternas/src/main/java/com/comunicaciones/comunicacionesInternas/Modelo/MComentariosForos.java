package com.comunicaciones.comunicacionesInternas.Modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
@Table(name = "comentariosforos")
public class MComentariosForos
{
    @Id
    @Column(length = 20,nullable = false)
    private String idcomentario;

    @Column(nullable = false)
    private String idforo;

    @Column(nullable = false)
    private String idcolaborador;

    @Column(length = 250,nullable = false)
    private String contenido;

    @Column(length = 15, nullable = false)
    private LocalDate fechapublicaion;

    @Column(length = 10,nullable = false)
    private String activo;

    //Constructor
    public MComentariosForos(String idcomentario, String idforo, String idcolaborador, String contenido, LocalDate fechapublicaion, String activo)
    {
        this.idcomentario = idcomentario;
        this.idforo = idforo;
        this.idcolaborador = idcolaborador;
        this.contenido = contenido;
        this.fechapublicaion = fechapublicaion;
        this.activo = activo;
    }

    //Constructor vacio
    public MComentariosForos()
    {
    }

    //Get and set


    public String getIdcomentario()
    {
        return idcomentario;
    }

    public void setIdcomntario(String idcomentario)
    {
        this.idcomentario = idcomentario;
    }

    public String getIdforo()
    {
        return idforo;
    }

    public void setIdforo(String idforo)
    {
        this.idforo = idforo;
    }

    public String getIdcolaborador()
    {
        return idcolaborador;
    }

    public void setIdcolaborador(String idcolaborador)
    {
        this.idcolaborador = idcolaborador;
    }

    public String getContenido()
    {
        return contenido;
    }

    public void setContenido(String contenido)
    {
        this.contenido = contenido;
    }

    public LocalDate getFechapublicaion()
    {
        return fechapublicaion;
    }

    public void setFechapublicaion(LocalDate fechapublicaion)
    {
        this.fechapublicaion = fechapublicaion;
    }

    public String getActivo()
    {
        return activo;
    }

    public void setActivo(String activo)
    {
        this.activo = activo;
    }
}
