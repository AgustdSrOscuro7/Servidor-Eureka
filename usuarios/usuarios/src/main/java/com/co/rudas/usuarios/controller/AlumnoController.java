package com.co.rudas.usuarios.controller;
import com.co.rudas.entityLibrary.models.entity.Alumno;
import com.rudas.libreria.controller.CommonController;
import com.co.rudas.usuarios.service.AlumnoService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@RestController
public class AlumnoController extends CommonController <Alumno, AlumnoService> {


    @Value("${config.balanceador.test}")
    private String balanceadorTest;


    @GetMapping("/balanceador-test") public ResponseEntity<?> balanceadorTest() {
        Map<String, Object> response = new HashMap<String, Object>();
        response.put("balanceador", balanceadorTest);
        response.put("alumnos", service.findAll());
        return ResponseEntity.ok().body(response);
    }


    @PostMapping("/{id}")
    public ResponseEntity<?> modify(@RequestBody Alumno alumno, @PathVariable Long id){
        Optional<Alumno> ob = service.findById(id);
        if(ob.isEmpty()){
            return ResponseEntity.noContent().build();
        }
        Alumno alumnoBd = ob.get();
        alumnoBd.setName(alumno.getName());
        alumnoBd.setLastName(alumno.getLastName());
        alumnoBd.setEmail(alumno.getEmail());
        return ResponseEntity.status(HttpStatus.CREATED).body(service.save(alumnoBd));
    }


}
