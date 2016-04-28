/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author CRISTIAN
 */
@Entity
@Table(name = "Egresados_Estudios")
@NamedQuery(name = "Egresados_Estudios.findAll", query = "SELECT e FROM Egresados_Estudios e")
public class Egresados_Estudios implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "Id_Egresado")
    private int Id_Egresado;

    @Column(name = "Codigo_Estudio")
    private int Codigo_Estudio;

    public Egresados_Estudios() {
    }

    public int getId_Egresado() {
        return Id_Egresado;
    }

    public void setId_Egresado(int Id_Egresado) {
        this.Id_Egresado = Id_Egresado;
    }

    public int getCodigo_Estudio() {
        return Codigo_Estudio;
    }

    public void setCodigo_Estudio(int Codigo_Esudio) {
        this.Codigo_Estudio = Codigo_Esudio;
    }

}
