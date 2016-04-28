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
@Table(name = "Egresados_Trabajos")
@NamedQuery(name = "Egresados_Trabajos.findAll", query = "SELECT e FROM Egresados_Trabajos e")
public class Egresados_Trabajos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "Id_Egresado")
    private int Id_Egresado;

    @Column(name = "Codigo_Trabajo")
    private int Codigo_Trabajo;

    public Egresados_Trabajos() {
    }

    public int getId_Egresado() {
        return Id_Egresado;
    }

    public void setId_Egresado(int Id_Egresado) {
        this.Id_Egresado = Id_Egresado;
    }

    public int getCodigo_Trabajo() {
        return Codigo_Trabajo;
    }

    public void setCodigo_Trabajo(int Codigo_Trabajo) {
        this.Codigo_Trabajo = Codigo_Trabajo;
    }
    
    
    
}
