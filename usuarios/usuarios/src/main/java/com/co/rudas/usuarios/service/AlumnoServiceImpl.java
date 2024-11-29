package com.co.rudas.usuarios.service;
import com.co.rudas.usuarios.repository.AlumnoRepository;
import com.co.rudas.entityLibrary.models.entity.Alumno;
import com.rudas.libreria.service.CommonServiceImpl;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class AlumnoServiceImpl implements AlumnoService {

    @Autowired
    AlumnoRepository dao;

    @Override
    @Transactional
        public Iterable<Alumno> findAll() {
        return dao.findAll();
    }

    @Override
    @Transactional
    public Optional<Alumno> findById(Long id) {
        return dao.findById(id);
    }

    @Override
    @Transactional
    public Alumno save(Alumno alumno) {
        return dao.save(alumno);
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
        dao.deleteById(id);
    }
}

