package com.co.rudas.cursoService.controller;
import com.co.rudas.cursoService.service.CursoService;
import com.co.rudas.entityLibrary.models.entity.Curso;
import com.rudas.libreria.controller.CommonController;
import com.co.rudas.entityLibrary.models.entity.Alumno;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CursoController extends CommonController<Curso, CursoService> {

    @PostMapping("/{id}")
    public ResponseEntity<?> modify(@RequestBody Curso curso, @PathVariable Long id){
        Optional<Curso> ob = service.findById(id);
        if(ob.isEmpty()){
            return ResponseEntity.noContent().build();
        }
        Curso cursoBd = ob.get();
        cursoBd.setName(curso.getName());
        cursoBd.setCreateAt(curso.getCreateAt());
        return ResponseEntity.status(HttpStatus.CREATED).body(service.save(cursoBd));

    }

    @PutMapping("/{id}/add-alumno")
    public ResponseEntity<?>addAlumno(@RequestBody List<Alumno> alumnoList, @PathVariable Long id){
        Optional<Curso> ob = service.findById(id);
        if(ob.isEmpty()){
            return ResponseEntity.noContent().build();
        }
        Curso cursoBd = ob.get();
        alumnoList.forEach(a -> {
            cursoBd.addAlumno(a);
        });

        return ResponseEntity.status(HttpStatus.CREATED).body(service.save(cursoBd));
    }

    @PutMapping("/{id}/remove-alumno")
    public ResponseEntity<?> removeAlumno(@RequestBody Alumno alumno, @PathVariable Long id){
        Optional<Curso> ob = service.findById(id);
        if(ob.isEmpty()){
            return ResponseEntity.noContent().build();
        }
        Curso cursoBd = ob.get();
        cursoBd.removeAlumno(alumno);
        return ResponseEntity.status(HttpStatus.CREATED).body(service.save(cursoBd));
    }


}