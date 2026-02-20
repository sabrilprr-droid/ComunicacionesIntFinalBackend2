package com.comunicaciones.comunicacionesInternas.Controlador;

import com.comunicaciones.comunicacionesInternas.Modelo.MForo;
import com.comunicaciones.comunicacionesInternas.Servicios.SForo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/foros")
@CrossOrigin(origins = "*")
public class CForo
{
    @Autowired
    SForo sForo;

    //Endpoint guardado
    @PostMapping
    public ResponseEntity<?> guardar(@RequestBody MForo mForo)throws Exception
    {
        try
        {
            return ResponseEntity
                    .status(HttpStatus.CREATED)
                    .body(this.sForo.guardar(mForo));
        }
        catch (Exception error)
        {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());
        }
    }

    //Endpoint consulta general
    @GetMapping
    public ResponseEntity<?> consultageneral()throws Exception
    {
        try
        {
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(this.sForo.consultageneral());
        }
        catch (Exception error)
        {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());
        }
    }

    //Endpoint consulta individual por codigo
    @GetMapping("/{idcolaborador}")
    public ResponseEntity<?>consultaindividualid(@PathVariable String idforo)throws Exception
    {
        try
        {
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(this.sForo.consultaindividualid(idforo));
        }
        catch (Exception error)
        {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());
        }
    }

    //Endpoint consulta individuao por nombre
    @GetMapping("/burcartitulo/{titulo}")
    public ResponseEntity<?>consultaindividualtitulo(@PathVariable String titulo)throws Exception
    {
        try
        {
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(this.sForo.consultaindividualtitulo(titulo));
        }
        catch (Exception error)
        {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());
        }
    }

    //Endpoint modificar
    @PutMapping("/{idforo}")
    public ResponseEntity<?> modificar(@RequestBody MForo mForo, @PathVariable String idforo) throws Exception
    {
        try
        {
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(this.sForo.modificar(mForo, idforo));
        }
        catch (Exception error)
        {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());
        }
    }

    //Endpoint anular
    @PutMapping("/anular/{idforo}")
    public ResponseEntity<?> anular(@RequestBody MForo mForo, @PathVariable String idforo)throws Exception
    {
        try
        {
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(this.sForo.anular(mForo, idforo));
        }
        catch (Exception error)
        {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());
        }
    }

    //Endpoint eliminar
    @DeleteMapping("/{idforo}")
    public ResponseEntity<?> eliminar(@PathVariable String idforo)throws Exception
    {
        try
        {
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(this.sForo.eliminar(idforo));
        }
        catch (Exception error)
        {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());
        }
    }
}
