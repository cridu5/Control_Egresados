/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas.Trabajos;

import Vistas.Trabajos.*;
import entity.Estudios;
import entity.Trabajos;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.swing.JOptionPane;

/**
 *
 * @author CRISTIAN
 */
public class Consultar_Tipo_Trabajo extends javax.swing.JInternalFrame {

    /**
     * Creates new form V_Estudios
     */
    private Consultar_Tipo_Trabajo trabajos_v;
    Trabajos trabajos;

    public Consultar_Tipo_Trabajo() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPral = new javax.swing.JPanel();
        lnlnombretrabajoc = new javax.swing.JLabel();
        tctnombretrabajoc = new javax.swing.JTextField();
        btnconsultar = new javax.swing.JButton();
        pnlSecundario = new javax.swing.JPanel();
        pnlBotones = new javax.swing.JPanel();
        btnmodificar = new javax.swing.JButton();
        btnnuevaconsulta = new javax.swing.JButton();
        pnlDatos = new javax.swing.JPanel();
        lblcodigotrabajo = new javax.swing.JLabel();
        lblnombretrabajo = new javax.swing.JLabel();
        btnaceptar = new javax.swing.JButton();
        btncancelar = new javax.swing.JButton();
        txtnombretrabajo = new javax.swing.JTextField();
        txtcodigotrabajo = new javax.swing.JTextField();

        setClosable(true);
        setTitle("CONSULTA TIPO TRABAJO");

        pnlPral.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        lnlnombretrabajoc.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        lnlnombretrabajoc.setText("Nombre");

        tctnombretrabajoc.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N

        btnconsultar.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        btnconsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/consultar 24x24 b y n.png"))); // NOI18N
        btnconsultar.setText("Consultar");
        btnconsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnconsultarActionPerformed(evt);
            }
        });

        pnlSecundario.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        pnlBotones.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        btnmodificar.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        btnmodificar.setText("Modificar");
        btnmodificar.setEnabled(false);
        btnmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmodificarActionPerformed(evt);
            }
        });

        btnnuevaconsulta.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        btnnuevaconsulta.setText("Nueva Consulta");
        btnnuevaconsulta.setEnabled(false);
        btnnuevaconsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnuevaconsultaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlBotonesLayout = new javax.swing.GroupLayout(pnlBotones);
        pnlBotones.setLayout(pnlBotonesLayout);
        pnlBotonesLayout.setHorizontalGroup(
            pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBotonesLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(btnmodificar)
                .addGap(18, 18, 18)
                .addComponent(btnnuevaconsulta)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlBotonesLayout.setVerticalGroup(
            pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBotonesLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnmodificar)
                    .addComponent(btnnuevaconsulta))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pnlDatos.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        lblcodigotrabajo.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        lblcodigotrabajo.setText("Codigo");

        lblnombretrabajo.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        lblnombretrabajo.setText("Nombre");

        btnaceptar.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        btnaceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/aceptar 18x18 b y n.png"))); // NOI18N
        btnaceptar.setText("Aceptar");
        btnaceptar.setEnabled(false);
        btnaceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaceptarActionPerformed(evt);
            }
        });

        btncancelar.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        btncancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/cancelar 18x18 b y n.png"))); // NOI18N
        btncancelar.setText("Cancelar");
        btncancelar.setEnabled(false);
        btncancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelarActionPerformed(evt);
            }
        });

        txtnombretrabajo.setEditable(false);
        txtnombretrabajo.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N

        txtcodigotrabajo.setEditable(false);
        txtcodigotrabajo.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N

        javax.swing.GroupLayout pnlDatosLayout = new javax.swing.GroupLayout(pnlDatos);
        pnlDatos.setLayout(pnlDatosLayout);
        pnlDatosLayout.setHorizontalGroup(
            pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDatosLayout.createSequentialGroup()
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDatosLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(btnaceptar)
                        .addGap(18, 18, 18)
                        .addComponent(btncancelar))
                    .addGroup(pnlDatosLayout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblcodigotrabajo)
                            .addComponent(lblnombretrabajo))
                        .addGap(23, 23, 23)
                        .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtnombretrabajo)
                            .addComponent(txtcodigotrabajo, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlDatosLayout.setVerticalGroup(
            pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblcodigotrabajo)
                    .addComponent(txtcodigotrabajo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblnombretrabajo)
                    .addComponent(txtnombretrabajo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnaceptar)
                    .addComponent(btncancelar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlSecundarioLayout = new javax.swing.GroupLayout(pnlSecundario);
        pnlSecundario.setLayout(pnlSecundarioLayout);
        pnlSecundarioLayout.setHorizontalGroup(
            pnlSecundarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSecundarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlSecundarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlBotones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlSecundarioLayout.setVerticalGroup(
            pnlSecundarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSecundarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlPralLayout = new javax.swing.GroupLayout(pnlPral);
        pnlPral.setLayout(pnlPralLayout);
        pnlPralLayout.setHorizontalGroup(
            pnlPralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPralLayout.createSequentialGroup()
                .addGroup(pnlPralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlPralLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(lnlnombretrabajoc)
                        .addGap(18, 18, 18)
                        .addComponent(tctnombretrabajoc, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnconsultar)
                        .addGap(0, 7, Short.MAX_VALUE))
                    .addGroup(pnlPralLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pnlSecundario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlPralLayout.setVerticalGroup(
            pnlPralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPralLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(pnlPralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lnlnombretrabajoc)
                    .addComponent(tctnombretrabajoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnconsultar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlSecundario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlPral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlPral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnaceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaceptarActionPerformed
        // TODO add your handling code here:
                EntityManagerFactory emf = Persistence.createEntityManagerFactory("Control_Egresados_JPAPU");
                EntityManager em = emf.createEntityManager();
                EntityTransaction et = em.getTransaction();
                try {
                    trabajos.setNombreTrabajo(txtnombretrabajo.getText());
                    et.begin();
                    em.merge(trabajos);
                    et.commit();
                    JOptionPane.showMessageDialog(null, "Los datos se han actualizado correctamente.");
                    txtnombretrabajo.setEditable(false);
                    btnaceptar.setEnabled(false);
                    btncancelar.setEnabled(false);
                    btnmodificar.setEnabled(true);
                    btnnuevaconsulta.setEnabled(true);
                    trabajos_v.setTitle("CONSULTA TIPO DE TRABAJO");
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Error: " + e);
                    Logger.getLogger(Consultar_Tipo_Trabajo.class.getName()).log(Level.SEVERE, null, e);
                } finally {
                    em.close();
                }

    }//GEN-LAST:event_btnaceptarActionPerformed

    private void btnconsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnconsultarActionPerformed
        // TODO add your handling code here:
        if (tctnombretrabajoc.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Por favor diligenciar el nombre del Tipo de Trabajo para realizar la consulta.");
            tctnombretrabajoc.requestFocus();
        } else {
           
                    EntityManagerFactory emf = Persistence.createEntityManagerFactory("Control_Egresados_JPAPU");
                    EntityManager em = emf.createEntityManager();
                    EntityTransaction et = em.getTransaction();
                    try {
                        TypedQuery<Trabajos> consulta_Trabajos = em.createNamedQuery("consulta_t", Trabajos.class);
                        consulta_Trabajos.setParameter("nombre", tctnombretrabajoc.getText());
                        List<Trabajos> lista = consulta_Trabajos.getResultList();
                        if (lista.size() > 0) {
                            trabajos = em.find(Trabajos.class, lista.get(0).getCodigoTrabajo());
                            txtcodigotrabajo.setText("" + trabajos.getCodigoTrabajo());
                            txtnombretrabajo.setText(trabajos.getNombreTrabajo());
                            tctnombretrabajoc.setText("");
                            tctnombretrabajoc.setEditable(false);
                            btnconsultar.setEnabled(false);
                            btnmodificar.setEnabled(true);
                            btnnuevaconsulta.setEnabled(true);

                        } else if (lista.size() == 0) {
                            JOptionPane.showMessageDialog(null, "No existe ningun Tipo de Trabajo con el nombre " + tctnombretrabajoc.getText() + "\n"
                                    + "Para crear uno nuevo dirigase en el Menu Trabajos/Nuevo Tipo de Trabajo");
                            tctnombretrabajoc.setText("");
                            tctnombretrabajoc.requestFocus();
                        }
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Error: " + e);
                        Logger.getLogger(Consultar_Tipo_Trabajo.class.getName()).log(Level.SEVERE, null, e);
                    } finally {
                        em.close();
                    }
                    
        }
    }//GEN-LAST:event_btnconsultarActionPerformed

    private void btnmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodificarActionPerformed
        // TODO add your handling code here:
        txtnombretrabajo.setEditable(true);
        trabajos_v.setTitle("MODIFICAR TIPO DE TRABAJO");
        btnaceptar.setEnabled(true);
        btncancelar.setEnabled(true);
        btnmodificar.setEnabled(false);
        btnnuevaconsulta.setEnabled(false);
        txtnombretrabajo.requestFocus();

    }//GEN-LAST:event_btnmodificarActionPerformed

    private void btncancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelarActionPerformed
        // TODO add your handling code here:
        txtnombretrabajo.setText(trabajos.getNombreTrabajo());
        txtnombretrabajo.setEditable(false);
        trabajos_v.setTitle("CONSULTA TIPO DE TRABAJO");
        btnaceptar.setEnabled(false);
        btncancelar.setEnabled(false);
        btnmodificar.setEnabled(true);
        btnnuevaconsulta.setEnabled(true);

    }//GEN-LAST:event_btncancelarActionPerformed

    private void btnnuevaconsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnuevaconsultaActionPerformed
        // TODO add your handling code here:
        btnmodificar.setEnabled(false);
        btnnuevaconsulta.setEnabled(false);
        txtcodigotrabajo.setText("");
        txtnombretrabajo.setText("");
        tctnombretrabajoc.setEditable(true);
        btnconsultar.setEnabled(true);
        tctnombretrabajoc.requestFocus();
    }//GEN-LAST:event_btnnuevaconsultaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnaceptar;
    private javax.swing.JButton btncancelar;
    private javax.swing.JButton btnconsultar;
    private javax.swing.JButton btnmodificar;
    private javax.swing.JButton btnnuevaconsulta;
    private javax.swing.JLabel lblcodigotrabajo;
    private javax.swing.JLabel lblnombretrabajo;
    private javax.swing.JLabel lnlnombretrabajoc;
    private javax.swing.JPanel pnlBotones;
    private javax.swing.JPanel pnlDatos;
    private javax.swing.JPanel pnlPral;
    private javax.swing.JPanel pnlSecundario;
    private javax.swing.JTextField tctnombretrabajoc;
    private javax.swing.JTextField txtcodigotrabajo;
    private javax.swing.JTextField txtnombretrabajo;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the estudios
     */
    public Consultar_Tipo_Trabajo getTrabajos() {
        return trabajos_v;
    }

    /**
     * @param estudios the estudios to set
     */
    public void setTrabajos(Consultar_Tipo_Trabajo trabajos_v) {
        this.trabajos_v = trabajos_v;
    }
}
