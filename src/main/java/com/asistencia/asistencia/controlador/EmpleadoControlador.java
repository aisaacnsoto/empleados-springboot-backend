package com.asistencia.asistencia.controlador;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.asistencia.asistencia.entidad.Empleado;
import com.asistencia.asistencia.servicio.EmpleadoServicio;


@CrossOrigin()
@RestController
@RequestMapping("/empleados")
public class EmpleadoControlador {

    @Autowired
    private EmpleadoServicio servicio;

    // @RequestMapping(value = "", method = RequestMethod.GET)
    // @CrossOrigin()
    @GetMapping
    public Iterable<Empleado> listarEmpleados() {
        return servicio.listarTodosEmpleados();
    }

    @PostMapping
    public void crearEmpleado(@RequestBody Empleado empleado) {
        servicio.crearEmpleado(empleado);
    }
    
    @GetMapping("/{usuarioId}")
    public Optional<Empleado> listarEmpleados(@PathVariable Long usuarioId) {
        return servicio.getEmpleadoPorID(usuarioId);
    }
    
    @PutMapping("/{usuarioId}")
    public Empleado actualizarEmpleado(@PathVariable Long usuarioId, @RequestBody Empleado empleado) {
        empleado.setId(usuarioId);
        return servicio.actualizarEmpleado(empleado);
    }
    
    @DeleteMapping("/{usuarioId}")
    public Empleado eliminarEmpleado(@PathVariable Long usuarioId) {
        Empleado empleado = servicio.getEmpleadoPorID(usuarioId).get();
        servicio.eliminarEmpleado(usuarioId);
        return empleado;
    }

}
