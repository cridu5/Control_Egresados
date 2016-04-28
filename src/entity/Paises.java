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
@Table(name = "Paises")
@NamedQueries({
    @NamedQuery(name = "Paises.All", query = "SELECT p FROM Paises p"),
    @NamedQuery(name = "consulta_Codigo_Pais", query = "SELECT p FROM Paises p WHERE p.nombrePais=:nombre_Pais"),
    @NamedQuery(name = "consulta_Nombre_Pais", query = "SELECT p FROM Paises p WHERE p.codigoPais=:codigo_Pais")})
public class Paises implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Codigo_Pais")
    private int codigoPais;
    @Column(name = "Nombre_Pais")
    private String nombrePais;

    public Paises() {
    }

    public Paises(int codigoPais) {
        this.codigoPais = codigoPais;
    }

    public int getCodigoPais() {
        return codigoPais;
    }

    public void setCodigoPais(int codigoPais) {
        this.codigoPais = codigoPais;
    }

    public String getNombrePais() {
        return nombrePais;
    }

    public void setNombrePais(String nombrePais) {
        this.nombrePais = nombrePais;
    }

}
