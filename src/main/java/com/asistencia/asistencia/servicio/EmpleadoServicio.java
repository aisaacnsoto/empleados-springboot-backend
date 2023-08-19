package com.asistencia.asistencia.servicio;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asistencia.asistencia.entidad.Empleado;
import com.asistencia.asistencia.repositorio.EmpleadoRepositorio;

@Service
public class EmpleadoServicio {

    @Autowired
    private EmpleadoRepositorio repositorio;
    
    public Iterable<Empleado> listarTodosEmpleados() {
        return repositorio.findAll();
    }

    public Empleado crearEmpleado(Empleado empleado) {
        return repositorio.save(empleado);
    }

    public Optional<Empleado> getEmpleadoPorID(Long id) {
        return repositorio.findById(id);
    }

    public Empleado actualizarEmpleado(Empleado empleado) {
        return repositorio.save(empleado);
    }

    public void eliminarEmpleado(Long id) {
        repositorio.deleteById(id);
    }
}
