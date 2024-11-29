package com.co.rudas.cursoService.service;
import com.co.rudas.entityLibrary.models.entity.Curso;
import com.co.rudas.cursoService.repository.CursoRepository;
import com.rudas.libreria.service.CommonServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class CursoServiceImpl extends CommonServiceImpl<Curso, CursoRepository> implements CursoService {


}