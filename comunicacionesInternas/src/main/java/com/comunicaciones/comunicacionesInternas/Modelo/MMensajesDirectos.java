package com.comunicaciones.comunicacionesInternas.Modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "mensajesdirectos")
public class MMensajesDirectos
{
    @Id
    @Column(length = 20, nullable = false)
    private Integer codmensaje;

    @Column(length = 70,nullable = false)
    private String titulomensaje;

    @Column(length = 150, nullable = false)
    private String contenidomensaje;

    @Column(length = 15,nullable = false)
    private String fechacreacion;

    @Column(nullable = false)
    private Integer idcolaborador;

    //Constructor

    public MMensajesDirectos(Integer codmensaje, String titulomensaje, String contenidomensaje, String fechacreacion, Integer idcolaborador)
    {
        this.codmensaje = codmensaje;
        this.titulomensaje = titulomensaje;
        this.contenidomensaje = contenidomensaje;
        this.fechacreacion = fechacreacion;
        this.idcolaborador = idcolaborador;
    }

    //Constructor vacio

    public MMensajesDirectos()
    {
    }

    //Get and set

    public Integer getCodmensaje()
    {
        return codmensaje;
    }

    public void setCodmensaje(Integer codmensaje)
    {
        this.codmensaje = codmensaje;
    }

    public String getTitulomensaje() {
        return titulomensaje;
    }

    public void setTitulomensaje(String titulomensaje)
    {
        this.titulomensaje = titulomensaje;
    }

    public String getContenidomensaje()
    {
        return contenidomensaje;
    }

    public void setContenidomensaje(String contenidomensaje) {
        this.contenidomensaje = contenidomensaje;
    }

    public String getFechacreacion()
    {
        return fechacreacion;
    }

    public void setFechacreacion(String fechacreacion)
    {
        this.fechacreacion = fechacreacion;
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

