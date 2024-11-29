package com.co.rudas.usuarios.service;
import java.util.Optional;
import com.co.rudas.entityLibrary.models.entity.Alumno;
import com.rudas.libreria.service.CommonService;

public interface AlumnoService extends CommonService<Alumno> {
    Alumno save(Alumno alumno);
    void deleteById(Long id);
}