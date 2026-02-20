package com.comunicaciones.comunicacionesInternas.Servicios;

import com.comunicaciones.comunicacionesInternas.Modelo.MComentariosForos;
import com.comunicaciones.comunicacionesInternas.Repositorio.IComentariosForos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.server.DelegatingServerHttpResponse;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SComentariosForos
{
    @Autowired
    IComentariosForos iComentariosForos;

    public SComentariosForos(IComentariosForos iComentariosForos)
    {
        this.iComentariosForos = iComentariosForos;
    }

    //Guardar
    public MComentariosForos guardar(MComentariosForos mComentariosForos)throws Exception
    {
        try
        {
            return this.iComentariosForos.save(mComentariosForos);
        }
        catch (Exception error)
        {
            throw new Exception(error.getMessage());
        }
    }

    //Consulta general
    public List<MComentariosForos>consultageneral()throws Exception
    {
        try
        {
            return this.iComentariosForos.findAll();
        }
        catch (Exception error)
        {
            throw new Exception(error.getMessage());
        }
    }

    //Consulta individual por codigo
    public MComentariosForos consultaindividualid(String idcomentario)throws Exception
    {
        try
        {
            Optional<MComentariosForos>comentarioencontrado=this.iComentariosForos.findById(idcomentario);
            if (comentarioencontrado.isPresent())
            {
                return comentarioencontrado.get();
            }
            else
            {
                throw new Exception("Comentario no encontrado, intente nuevamente");
            }
        }
        catch (Exception error)
        {
            throw new Exception(error.getMessage());
        }
    }

    //Eliminar
    public Boolean eliminar(String idcomentario) throws Exception
    {
        try
        {
            Optional<MComentariosForos>comentarioencontrado = this.iComentariosForos.findById(idcomentario);
            if (comentarioencontrado.isPresent())
            {
                this.iComentariosForos.deleteById(idcomentario);
                return true;
            }
            else
            {
                throw new Exception("No se puede eliminar el comentario, intente nuevamente.");
            }
        }
        catch (Exception error)
        {
            throw new Exception(error.getMessage());
        }
    }

    //Anular
    public MComentariosForos anular(MComentariosForos mComentariosForos, String idcomentario) throws Exception
    {
        try
        {
            Optional<MComentariosForos>comentarioencontrado = this.iComentariosForos.findById(idcomentario);
            if (comentarioencontrado.isPresent())
            {
                MComentariosForos nuevoregistro = comentarioencontrado.get();
                if (mComentariosForos.getActivo().equals("True"))
                {
                    nuevoregistro.setActivo("True");
                }
                else
                {
                    nuevoregistro.setActivo("False");
                }
                return this.iComentariosForos.save(nuevoregistro);
            }
            else
            {
                throw new Exception("No se puede anular el comentario, intente nuevamente.");
            }
        }
        catch (Exception error)
        {
            throw new Exception(error.getMessage());
        }
    }
}