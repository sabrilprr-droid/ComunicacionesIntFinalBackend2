package com.comunicaciones.comunicacionesInternas.Servicios;

import com.comunicaciones.comunicacionesInternas.Modelo.MColaboradormensaje;
import com.comunicaciones.comunicacionesInternas.Repositorio.IColaboradormensaje;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SColaboradormensaje
{
    @Autowired
    IColaboradormensaje iColaboradormensaje;

    public SColaboradormensaje(IColaboradormensaje iColaboradormensaje)
    {
        this.iColaboradormensaje = iColaboradormensaje;
    }

    //Guardar
    public MColaboradormensaje guardar(MColaboradormensaje mColaboradormensaje)throws Exception
    {
        try
        {
            return this.iColaboradormensaje.save(mColaboradormensaje);
        }
        catch (Exception error)
        {
            throw new Exception(error.getMessage());
        }
    }

    //Consulta general
    public List<MColaboradormensaje>consultageneral()throws Exception
    {
        try
        {
            return this.iColaboradormensaje.findAll();
        }
        catch (Exception error)
        {
            throw new Exception(error.getMessage());
        }
    }

    //Consulta individual por codigo
    public MColaboradormensaje consultaindividualid(String idcolaborador)throws Exception
    {
        try
        {
            Optional<MColaboradormensaje>mensajeencontrado=this.iColaboradormensaje.findById(idcolaborador);
            if (mensajeencontrado.isPresent())
            {
                return mensajeencontrado.get();
            }
            else
            {
                throw new Exception("El mensaje no se encuentra en la base de datos. ");
            }
        }
        catch (Exception error)
        {
            throw new Exception(error.getMessage());
        }
    }

    //Eliminar
    public Boolean eliminar(String idcolaborador) throws Exception
    {
        try
        {
            Optional<MColaboradormensaje>mensajeencontrado=this.iColaboradormensaje.findById(idcolaborador);
            if (mensajeencontrado.isPresent())
            {
                this.iColaboradormensaje.deleteById(idcolaborador);
                return true;
            }
            else
            {
                throw new Exception("No se puede eliminar el mensaje, intente nuevamente");
            }
        }
        catch (Exception error)
        {
            throw new Exception(error.getMessage());
        }
    }

    //Anular
    public MColaboradormensaje anular(MColaboradormensaje mColaboradormensaje, String idcolaborador) throws Exception
    {
        try
        {
            Optional<MColaboradormensaje>mensajeencontrado=this.iColaboradormensaje.findById(idcolaborador);
            if (mensajeencontrado.isPresent())
            {
                MColaboradormensaje nuevoregistro = mensajeencontrado.get();
                if (mColaboradormensaje.getActivo().equals("True"))
                {
                    nuevoregistro.setActivo("True");
                }
                else
                {
                    nuevoregistro.setActivo("False");
                }
                return this.iColaboradormensaje.save(nuevoregistro);
            }
            else
            {
                throw new Exception("No se puede anular el mensaje, intente nuevamente");
            }
        }
        catch (Exception error)
        {
            throw new Exception(error.getMessage());
        }
    }
}