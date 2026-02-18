package com.comunicaciones.comunicacionesInternas.Modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "anuncios")
public class MAnuncios
{
    @Id
    @Column(length = 20,nullable = false)
    private Integer codanuncio;

    @Column(length = 70,nullable = false)
    private String titulo;

    @Column(length = 150,nullable = false)
    private String contenido;

    @Column(length = 15,nullable = false)
    private String fechapublicación;

    @Column(nullable = false)
    private Integer idcolaborador;

    //contructor

    public MAnuncios(Integer codanuncio, String titulo, String contenido, String fechapublicación, Integer idcolaborador)
    {
        this.codanuncio = codanuncio;
        this.titulo = titulo;
        this.contenido = contenido;
        this.fechapublicación = fechapublicación;
        this.idcolaborador = idcolaborador;
    }

    //Constructor vacio

    public MAnuncios()
    {
    }

    //Get and Set

    public Integer getCodanuncio()
    {
        return codanuncio;
    }

    public void setCodanuncio(Integer codanuncio)
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

    public String getFechapublicación()
    {
        return fechapublicación;
    }

    public void setFechapublicación(String fechapublicación)
    {
        this.fechapublicación = fechapublicación;
    }

    public Integer getIdcolaborador()
    {
        return idcolaborador;
    }

    public void setIdcolaborador(Integer idcolaborador)
    {
        this.idcolaborador = idcolaborador;
    }
}
