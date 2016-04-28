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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author CRISTIAN
 */
@Entity
@Table(name = "Trabajos")
@NamedQueries({
    @NamedQuery(name = "Trabajos.findAll", query = "SELECT t FROM Trabajos t"),
    @NamedQuery(name = "consulta_t", query = "SELECT t FROM Trabajos t WHERE t.nombreTrabajo =:nombre")})
public class Trabajos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Codigo_Trabajo")
    private Integer codigoTrabajo;
    @Column(name = "Nombre_Trabajo")
    private String nombreTrabajo;

    public Trabajos() {
    }

    public Trabajos(Integer codigoTrabajo) {
        this.codigoTrabajo = codigoTrabajo;
    }

    public Integer getCodigoTrabajo() {
        return codigoTrabajo;
    }

    public void setCodigoTrabajo(Integer codigoTrabajo) {
        this.codigoTrabajo = codigoTrabajo;
    }

    public String getNombreTrabajo() {
        return nombreTrabajo;
    }

    public void setNombreTrabajo(String nombreTrabajo) {
        this.nombreTrabajo = nombreTrabajo;
    }

}
