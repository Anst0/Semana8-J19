package com.example.demo;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;

@Entity
@Table (name = "curso")
public class Curso {


    @Id
    @GeneratedValue (strategy=GenerationType.AUTO)
    private Integer id;
    private String nombre;
    private Integer credito;


    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }



    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Integer getCredito() {
        return credito;
    }
    public void setCredito(Integer credito) {
        this.credito = credito;
    }

    
}
