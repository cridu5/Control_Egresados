/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author CRISTIAN
 */
@Entity
@Table(name = "Egresados")
@NamedQuery(name = "Egresado.findAll", query = "SELECT e FROM Egresados e")
public class Egresados implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "Id_Egresado")
    private int Id_Egresado;

    @Column(name = "Tipo_Documento")
    private String Tipo_Documento;

    @Column(name = "Primer_Nombre")
    private String Primer_Nombre;

    @Column(name = "Segundo_Nombre")
    private String Segundo_Nombre;

    @Column(name = "Primer_Apellido")
    private String Primer_Apellido;

    @Column(name = "Segundo_Apellido")
    private String Segundo_Apellido;

    @Column(name = "Sexo")
    private char Sexo;

    @Column(name = "Estado_Civil")
    private String Estado_Civil;

    @Column(name = "Tipo_Sanguineo")
    private String Tipo_Sanguineo;

    @Column(name = "Fecha_Nacimiento")
    private String Fecha_Nacimiento;

    @Column(name = "Lugar_Nacimiento_Cod_Ciudad")
    private int Lugar_Nacimiento_Cod_Ciudad;

    @Column(name = "Direccion_Residencia")
    private String Direccion_Residencia;

    @Column(name = "Residencia_Cod_Ciudad")
    private int Residencia_Cod_Ciudad;

    @Column(name = "Telefono")
    private String Telefono;

    @Column(name = "Celular")
    private String Celular;

    @Column(name = "Email")
    private String Email;

    public Egresados() {
    }

    public int getId_Egresado() {
        return this.Id_Egresado;
    }

    public void setId_Egresado(int Id_Egresado) {
        this.Id_Egresado = Id_Egresado;
    }

    public String getTipo_Documento() {
        return this.Tipo_Documento;
    }

    public void setTipo_Documento(String Tipo_Documento) {
        this.Tipo_Documento = Tipo_Documento;
    }

    public String getPrimer_Nombre() {
        return this.Primer_Nombre;
    }

    public void setPrimer_Nombre(String Primer_Nombre) {
        this.Primer_Nombre = Primer_Nombre;
    }

    public String getSegundo_Nombre() {
        return this.Segundo_Nombre;
    }

    public void setSegundo_Nombre(String Segundo_Nombre) {
        this.Segundo_Nombre = Segundo_Nombre;
    }

    public String getPrimer_Apellido() {
        return this.Primer_Apellido;
    }

    public void setPrimer_Apellido(String Primer_Apellido) {
        this.Primer_Apellido = Primer_Apellido;
    }

    public String getSegundo_Apellido() {
        return this.Segundo_Apellido;
    }

    public void setSegundo_Apellido(String Segundo_Apellido) {
        this.Segundo_Apellido = Segundo_Apellido;
    }

    public char getSexo() {
        return this.Sexo;
    }

    public void setSexo(char Sexo) {
        this.Sexo = Sexo;
    }

    public String getEstado_Civil() {
        return this.Estado_Civil;
    }

    public void setEstado_Civil(String Estado_Civil) {
        this.Estado_Civil = Estado_Civil;
    }

    public String getTipo_Sanguineo() {
        return this.Tipo_Sanguineo;
    }

    public void setTipo_Sanguineo(String Tipo_Sanguineo) {
        this.Tipo_Sanguineo = Tipo_Sanguineo;
    }

    public String getFecha_Nacimiento() {
        return this.Fecha_Nacimiento;
    }

    public void setFecha_Nacimiento(String Fecha_Nacimiento) {
        this.Fecha_Nacimiento = Fecha_Nacimiento;
    }

    public int getLugar_Nacimiento_Cod_Ciudad() {
        return this.Lugar_Nacimiento_Cod_Ciudad;
    }

    public void setLugar_Nacimiento_Cod_Ciudad(int Lugar_Nacimiento_Cod_Ciudad) {
        this.Lugar_Nacimiento_Cod_Ciudad = Lugar_Nacimiento_Cod_Ciudad;
    }

    public String getDireccion_Residencia() {
        return this.Direccion_Residencia;
    }

    public void setDireccion_Residencia(String Direccion_Residencia) {
        this.Direccion_Residencia = Direccion_Residencia;
    }

    public int getResidencia_Cod_Ciudad() {
        return this.Residencia_Cod_Ciudad;
    }

    public void setResidencia_Cod_Ciudad(int Residencia_Cod_Ciudad) {
        this.Residencia_Cod_Ciudad = Residencia_Cod_Ciudad;
    }

    public String getTelefono() {
        return this.Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getCelular() {
        return this.Celular;
    }

    public void setCelular(String Celular) {
        this.Celular = Celular;
    }

    public String getEmail() {
        return this.Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

}

