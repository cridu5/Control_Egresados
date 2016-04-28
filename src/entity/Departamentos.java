/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import javax.persistence.*;

/**
 *
 * @author CRISTIAN
 */
@Entity
@Table(name = "Departamentos")
@NamedQueries({
    @NamedQuery(name = "Departamentos.All", query = "SELECT d FROM Departamentos d"),
    @NamedQuery(name = "consulta_Departamentos_Pais", query = "SELECT d FROM Departamentos d  WHERE d.codigoPais=:codigo_Pais"),
    @NamedQuery(name = "consulta_Nombre_Departamento", query = "SELECT d FROM Departamentos d  WHERE d.nombreDepartamento=:nombre_Departamento"),
    @NamedQuery(name = "consulta_Codigo_Departamento", query = "SELECT d FROM Departamentos d  WHERE d.codigoDepartamento=:codigo_Departamento")})
public class Departamentos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "Codigo_Departamento")
    private int codigoDepartamento;
    @Column(name = "Nombre_Departamento")
    private String nombreDepartamento;
    @Column(name = "Codigo_Pais")
    private int codigoPais;

    public Departamentos() {
    }

    public Departamentos(int codigoDepartamento) {
        this.codigoDepartamento = codigoDepartamento;
    }

    public int getCodigoDepartamento() {
        return codigoDepartamento;
    }

    public void setCodigoDepartamento(int codigoDepartamento) {
        this.codigoDepartamento = codigoDepartamento;
    }

    public String getNombreDepartamento() {
        return nombreDepartamento;
    }

    public void setNombreDepartamento(String nombreDepartamento) {
        this.nombreDepartamento = nombreDepartamento;
    }

    public void setCodigoPais(int codigoPais) {
        this.codigoPais = codigoPais;
    }

    public int getCodigoPais() {
        return codigoPais;
    }

}
