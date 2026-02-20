package com.comunicaciones.comunicacionesInternas.Modelo;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "anuncios")
public class MAnuncios
{
    @Id
    @Column(length = 20,nullable = false)
    private String codanuncio;

    @Column(length = 70,nullable = false)
    private String titulo;

    @Column(length = 150,nullable = false)
    private String contenido;

    @Column(length = 15,nullable = false)
    private LocalDate fechapublicacion;

    @Column(length = 10,nullable = false)
    private String activo;

    @Column(nullable = false)
    private String idcolaborador;


    //contructor
    public MAnuncios(String codanuncio, String titulo, String contenido, LocalDate fechapublicacion, String activo, String idcolaborador)
    {
        this.codanuncio = codanuncio;
        this.titulo = titulo;
        this.contenido = contenido;
        this.fechapublicacion = fechapublicacion;
        this.activo = activo;
        this.idcolaborador = idcolaborador;
    }

    //Constructor vacio
    public MAnuncios()
    {
    }

    //Get and Set
    public String getCodanuncio()
    {
        return codanuncio;
    }

    public void setCodanuncio(String codanuncio)
    {
        this.codanuncio = codanuncio;
    }

    public String getTitulo()
    {
        return titulo;
    }

    public void setTitulo(String titulo)
    {
        this.titulo = titulo;
    }

    public String getContenido()
    {
        return contenido;
    }

    public void setContenido(String contenido)
    {
        this.contenido = contenido;
    }

    public LocalDate getFechapublicacion()
    {
        return fechapublicacion;
    }

    public void setFechapublicacion(LocalDate fechapublicacion)
    {
        this.fechapublicacion = fechapublicacion;
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
