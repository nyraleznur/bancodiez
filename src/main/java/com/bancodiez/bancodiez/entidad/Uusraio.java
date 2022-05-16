package com.bancodiez.bancodiez.entidad;
import javax.persistence.*;
@Entity
@Table(name="usuario")
public class Uusraio {
    @Id
    // @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "documento",nullable = false, length = 50)
    private  String documento;
    @Column(name = "usuario",nullable = false, length = 50)
    private String usuario;
    @Column(name = "clave", nullable = false, length = 50)
    private  String clave;
    @Column(name="rol", nullable = false, length = 50 )
    private  String rol;
     @ManyToOne
     @JoinColumn(name="documento_us")
     private Cliente cliente;
     public Uusraio() {
    }

    public Uusraio(String id, String usuario, String clave, String rol) {
        this.documento = id;
        this.usuario = usuario;
        this.clave = clave;
        this.rol = rol;
    }

    public String getId() {
        return documento;
    }

    public void setId(String id) {
        this.documento = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
}
