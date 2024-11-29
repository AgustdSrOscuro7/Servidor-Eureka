package com.co.rudas.usuarios.repository;
import com.co.rudas.entityLibrary.models.entity.Alumno;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlumnoRepository extends CrudRepository<Alumno, Long> {
}
