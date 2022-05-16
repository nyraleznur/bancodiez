package com.bancodiez.bancodiez.entidad;

import javax.persistence.*;

@Entity
@Table(name="cliente")
public class Cliente {


    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "documento",nullable = false, length = 50)
    private  Long documento;

    @Column(name = "nombre",nullable = false, length = 50)
    private String nombre;
    @Column(name = "apellido", nullable = false, length = 50)
    private  String apellido;
    @Column(name="email", nullable = false, length = 50)
    private  String email;
  // @ManyToOne
    //@JoinColumn(name="documento")
    //private Uusraio usuario;
    public Cliente() {
    }

    public Cliente(Long id, String nombre, String apellido, String email) {
        this.documento = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
    }

    public Cliente(String nombre, String apellido, String email) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
    }

    public Long getId() {
        return documento;
    }

    public void setId(Long id) {
        this.documento = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + documento +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
