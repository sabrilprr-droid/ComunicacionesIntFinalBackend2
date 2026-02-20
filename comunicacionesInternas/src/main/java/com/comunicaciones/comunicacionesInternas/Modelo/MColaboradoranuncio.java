package com.comunicaciones.comunicacionesInternas.Modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
@Table(name = "colaboradoranuncio")
public class MColaboradoranuncio
{
    @Id
    @Column(length = 20,nullable = false)
    private String consecutivo;

    @Column(nullable = false)
    private String idcolaborador;

    @Column(nullable = false)
    private String codanuncio;

    @Column(length = 15, nullable = false)
    private LocalDate fechalectura;

    @Column(length = 10, nullable = false)
    private String leido;

    //Constructor
    public MColaboradoranuncio(String consecutivo, String idcolaborador, String codanuncio, LocalDate fechalectura, String leido)
    {
        this.consecutivo = consecutivo;
        this.idcolaborador = idcolaborador;
        this.codanuncio = codanuncio;
        this.fechalectura = fechalectura;
        this.leido = leido;
    }

    //Constructor vacio

    public MColaboradoranuncio()
    {
    }

    //Get and Set

    public String getConsecutivo()
    {
        return consecutivo;
    }

    public void setConsecutivo(String consecutivo)
    {
        this.consecutivo = consecutivo;
    }

    public String getIdcolaborador()
    {
        return idcolaborador;
    }

    public void setIdcolaborador(String idcolaborador)
    {
        this.idcolaborador = idcolaborador;
    }

    public String getCodanuncio()
    {
        return codanuncio;
    }

    public void setCodanuncio(String codanuncio)
    {
        this.codanuncio = codanuncio;
    }

    public LocalDate getFechalectura()
    {
        return fechalectura;
    }

    public void setFechalectura(LocalDate fechalectura)
    {
        this.fechalectura = fechalectura;
    }

    public String getLeido()
    {
        return leido;
    }

    public void setLeido(String leido)
    {
        this.leido = leido;
    }
}
