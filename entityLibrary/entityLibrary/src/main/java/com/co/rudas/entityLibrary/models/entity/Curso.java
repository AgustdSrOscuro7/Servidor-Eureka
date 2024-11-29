package com.co.rudas.entityLibrary.models.entity;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "cursos")
public class Curso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Column(name = "create_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createAt;
    @PrePersist
    private void prePersist() {
        this.createAt = new Date();
    }
    @OneToMany(fetch = FetchType.LAZY)
    private List<Alumno> listAlumnos;

    public Curso() {
        this.listAlumnos = new ArrayList<>();
    }

    //getters y setters
    public List<Alumno> getListAlumnos() {
        return listAlumnos;
    }
    public void setListAlumnos(List<Alumno> listAlumnos) {
        this.listAlumnos = listAlumnos;
    }
    public void addAlumno(Alumno alumno) {
        this.listAlumnos.add(alumno);
    }
    public void removeAlumno(Alumno alumno) {
        this.listAlumnos.remove(alumno);
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Date getCreateAt() {
        return createAt;
    }
    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }


}