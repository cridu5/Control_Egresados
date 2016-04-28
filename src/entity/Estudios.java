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
@Table(name = "Estudios")
@NamedQueries({
    @NamedQuery(name = "Estudios.findAll", query = "SELECT e FROM Estudios e"),
    @NamedQuery(name = "consulta_e", query = "SELECT e FROM Estudios e WHERE e.tipoEstudio=:nombre")})
public class Estudios implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Codigo_Estudio")
    private int codigoEstudio;
    @Column(name = "Tipo_Estudio")
    private String tipoEstudio;

    public Estudios() {
    }

    public Estudios(int codigoEstudio) {
        this.codigoEstudio = codigoEstudio;
    }

    public int getCodigoEstudio() {
        return codigoEstudio;
    }

    public void setCodigoEstudio(int codigoEstudio) {
        this.codigoEstudio = codigoEstudio;
    }

    public String getTipoEstudio() {
        return tipoEstudio;
    }

    public void setTipoEstudio(String tipoEstudio) {
        this.tipoEstudio = tipoEstudio;
    }

}
