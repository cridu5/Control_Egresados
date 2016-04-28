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
@Table(name = "Ciudades")
@NamedQueries({
    @NamedQuery(name = "consulta_Nombre_Ciudad", query = "SELECT c FROM Ciudades c WHERE c.nombreCiudad =:nombre_Ciudad"),
    @NamedQuery(name = "consulta_Ciudad", query = "SELECT c FROM Ciudades c WHERE c.codigoDepartamento=:codigo_Departamento"),
    @NamedQuery(name = "consulta_Codigo_Ciudad", query = "SELECT c FROM Ciudades c WHERE c.codigoCiudad =:codigo_Ciudad"),
    @NamedQuery(name = "consulta_Ciudades_Departamento", query = "SELECT c FROM Ciudades c  WHERE c.codigoDepartamento=:codigo_Departamento"),
    @NamedQuery(name = "Ciudades.All", query = "SELECT c FROM Ciudades c")})
public class Ciudades implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Codigo_Ciudad")
    private int codigoCiudad;
    @Column(name = "Nombre_Ciudad")
    private String nombreCiudad;
    @Column(name = "Codigo_Departamento")
    private int codigoDepartamento;

    public Ciudades() {
        super();
    }

    public Ciudades(int codigoCiudad, String nombreCiudad) {
        this.codigoCiudad = codigoCiudad;
        this.nombreCiudad = nombreCiudad;
    }

    public int getCodigoCiudad() {
        return codigoCiudad;
    }

    public void setCodigoCiudad(int codigoCiudad) {
        this.codigoCiudad = codigoCiudad;
    }

    public String getNombreCiudad() {
        return nombreCiudad;
    }

    public void setNombreCiudad(String nombreCiudad) {
        this.nombreCiudad = nombreCiudad;
    }

    public void setCodigoDepartamento(int codigoDepartamento) {
        this.codigoDepartamento = codigoDepartamento;
    }
    
    public int getCodigoDepartamento() {
        return codigoDepartamento;
    }

}
