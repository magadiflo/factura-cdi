package com.magadiflo.models;

import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.RequestScoped;

@RequestScoped
public class Cliente {

    private String nombre;
    private String email;
    private String apellidos;

    public Cliente() {}

    @PostConstruct
    public void inicializar() {
        this.nombre = "Martín";
        this.email = "magadiflo@gmail.com";
        this.apellidos = "Díaz Flores";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
}
