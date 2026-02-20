package com.comunicaciones.comunicacionesInternas.Servicios;

import com.comunicaciones.comunicacionesInternas.Modelo.MColaboradoranuncio;
import com.comunicaciones.comunicacionesInternas.Repositorio.IColaboradoranuncio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SColaboradoranuncio
{
    @Autowired
    IColaboradoranuncio iColaboradoranuncio;

    public SColaboradoranuncio(IColaboradoranuncio iColaboradoranuncio)
    {
        this.iColaboradoranuncio = iColaboradoranuncio;
    }

    //Guardar
    public MColaboradoranuncio guardar(MColaboradoranuncio mColaboradoranuncio)throws Exception
    {
        try
        {
            return this.iColaboradoranuncio.save(mColaboradoranuncio);
        }
        catch (Exception error)
        {
            throw new Exception(error.getMessage());
        }
    }

    //Consulta general
    public List<MColaboradoranuncio>consultageneral() throws Exception
    {
        try
        {
            return this.iColaboradoranuncio.findAll();
        }
        catch (Exception error)
        {
            throw new Exception(error.getMessage());
        }
    }

    //Consulta individual por codigo
    public MColaboradoranuncio consultaindividualid(String idcolaborador) throws Exception
    {
        try
        {
            Optional<MColaboradoranuncio>colaboradoranuncioencontrado=this.iColaboradoranuncio.findById(idcolaborador);
            if (colaboradoranuncioencontrado.isPresent())
            {
                return colaboradoranuncioencontrado.get();
            }
            else
            {
                throw new Exception("El anuncio publicado por el usuario no esta creado");
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
            Optional<MColaboradoranuncio>anuncioencontrado=this.iColaboradoranuncio.findById(idcolaborador);
            if (anuncioencontrado.isPresent())
            {
                this.iColaboradoranuncio.deleteById(idcolaborador);
                return true;
            }
            else
            {
                throw new Exception("No se puede eliminar el anuncio por que no esta creado.");
            }
        }
        catch (Exception error)
        {
            throw new Exception(error.getMessage());
        }
    }

    //estado
    public MColaboradoranuncio anular(MColaboradoranuncio mColaboradoranuncio, String idcolaborador)throws Exception
    {
        try
        {
            Optional<MColaboradoranuncio>anuncioencontrado = this.iColaboradoranuncio.findById(idcolaborador);
            if (anuncioencontrado.isPresent())
            {
                MColaboradoranuncio nuevoregistro = anuncioencontrado.get();
                if (mColaboradoranuncio.getLeido().equals("Leido"))
                {
                    nuevoregistro.setLeido("Leido");
                }
                else
                {
                    nuevoregistro.setLeido("No leido");
                }
                return this.iColaboradoranuncio.save(nuevoregistro);
            }
            else
            {
                throw new Exception("No se puede cambiar el estado, intente de nuevo");
            }
        }
        catch (Exception error)
        {
            throw new Exception(error.getMessage());
        }
    }
}