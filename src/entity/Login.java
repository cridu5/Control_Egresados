/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author CRISTIAN
 */
@Entity
@Table(name = "Login")
@NamedQueries({
    @NamedQuery(name = "Login.findAll", query = "SELECT l FROM Login l"),})
public class Login implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "Usuario")
    private String usuario;
    @Column(name = "Contraseña")
    private String contraseña;
    @Column(name = "Pregunta_Secreta")
    private int pregunta_Secreta;
    @Column(name = "Respuesta")
    private String respuesta;
    @Column(name = "Tipo_Usuario")
    private String tipo_Usuario;

    public Login() {
    }

    public Login(String usuario) {
        this.usuario = usuario;
    }

    public Login(String usuario, String contraseña, int pregunta_Secreta, String respuesta,String tipo_Usuario) {
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.pregunta_Secreta = pregunta_Secreta;
        this.respuesta=respuesta;
        this.tipo_Usuario = tipo_Usuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public int getPregunta_Secreta() {
        return pregunta_Secreta;
    }

    public void setPregunta_Secreta(int pregunta_Secreta) {
        this.pregunta_Secreta = pregunta_Secreta;
    }
    
     public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    public String getTipo_Usuario() {
        return tipo_Usuario;
    }

    public void setTipo_Usuario(String tipo_Usuario) {
        this.tipo_Usuario = tipo_Usuario;
    }

}
