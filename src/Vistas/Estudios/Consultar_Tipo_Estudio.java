/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas.Estudios;

import entity.Estudios;
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
public class Consultar_Tipo_Estudio extends javax.swing.JInternalFrame {

    /**
     * Creates new form V_Estudios
     */
    private Consultar_Tipo_Estudio estudios_v;
    Estudios estudios;

    public Consultar_Tipo_Estudio() {
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
        lblnombreestudioc = new javax.swing.JLabel();
        txtnombreestudioc = new javax.swing.JTextField();
        btnconsultar = new javax.swing.JButton();
        pnlSecundario = new javax.swing.JPanel();
        pnlBotones = new javax.swing.JPanel();
        btnmodificar = new javax.swing.JButton();
        btnnuevaconsulta = new javax.swing.JButton();
        pnlDatos = new javax.swing.JPanel();
        lblcodigoestudio = new javax.swing.JLabel();
        lblnombreestuido = new javax.swing.JLabel();
        btnaceptar = new javax.swing.JButton();
        btncancelar = new javax.swing.JButton();
        txtnombreestudio = new javax.swing.JTextField();
        txtcodigoestudio = new javax.swing.JTextField();

        setClosable(true);
        setTitle("CONSULTA TIPO ESTUDIO");

        pnlPral.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        lblnombreestudioc.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        lblnombreestudioc.setText("Nombre");

        txtnombreestudioc.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N

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

        lblcodigoestudio.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        lblcodigoestudio.setText("Codigo");

        lblnombreestuido.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        lblnombreestuido.setText("Nombre");

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

        txtnombreestudio.setEditable(false);
        txtnombreestudio.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N

        txtcodigoestudio.setEditable(false);
        txtcodigoestudio.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N

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
                            .addComponent(lblcodigoestudio)
                            .addComponent(lblnombreestuido))
                        .addGap(23, 23, 23)
                        .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtnombreestudio)
                            .addComponent(txtcodigoestudio, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlDatosLayout.setVerticalGroup(
            pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblcodigoestudio)
                    .addComponent(txtcodigoestudio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblnombreestuido)
                    .addComponent(txtnombreestudio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                        .addComponent(lblnombreestudioc)
                        .addGap(18, 18, 18)
                        .addComponent(txtnombreestudioc, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnconsultar)
                        .addGap(0, 0, Short.MAX_VALUE))
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
                    .addComponent(lblnombreestudioc)
                    .addComponent(txtnombreestudioc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        switch (estudios_v.getTitle()) {
            case "MODIFICAR TIPO DE ESTUDIO": {
                EntityManagerFactory emf = Persistence.createEntityManagerFactory("Control_Egresados_JPAPU");
                EntityManager em = emf.createEntityManager();
                EntityTransaction et = em.getTransaction();
                try {
                    estudios.setTipoEstudio(txtnombreestudio.getText());
                    et.begin();
                    em.merge(estudios);
                    et.commit();
                    JOptionPane.showMessageDialog(null, "Los datos se han actualizado correctamente.");
                    txtnombreestudio.setEditable(false);
                    btnaceptar.setEnabled(false);
                    btncancelar.setEnabled(false);
                    btnmodificar.setEnabled(true);
                    btnnuevaconsulta.setEnabled(true);
                    estudios_v.setTitle("CONSULTA TIPO DE ESTUDIO");
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Error: " + e);
                    Logger.getLogger(Consultar_Tipo_Estudio.class.getName()).log(Level.SEVERE, null, e);
                } finally {
                    em.close();
                }
                break;
            }
        }

    }//GEN-LAST:event_btnaceptarActionPerformed

    private void btnconsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnconsultarActionPerformed
        // TODO add your handling code here:
        if (txtnombreestudioc.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Por favor diligenciar el nombre del Tipo de Estudio para realizar la consulta.");
            txtnombreestudioc.requestFocus();
        } else {
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("Control_Egresados_JPAPU");
            EntityManager em = emf.createEntityManager();
            EntityTransaction et = em.getTransaction();
            try {
                TypedQuery<Estudios> consulta_Usuarios = em.createNamedQuery("consulta_e", Estudios.class);
                consulta_Usuarios.setParameter("nombre", txtnombreestudioc.getText());
                List<Estudios> lista = consulta_Usuarios.getResultList();
                if (lista.size() > 0) {
                    estudios = em.find(Estudios.class, lista.get(0).getCodigoEstudio());
                    txtcodigoestudio.setText("" + estudios.getCodigoEstudio());
                    txtnombreestudio.setText(estudios.getTipoEstudio());
                    txtnombreestudioc.setText("");
                    txtnombreestudioc.setEditable(false);
                    btnconsultar.setEnabled(false);
                    btnmodificar.setEnabled(true);
                    btnnuevaconsulta.setEnabled(true);

                } else if (lista.size() == 0) {
                    JOptionPane.showMessageDialog(null, "No existe ningun Tipo de Estudio con el nombre " + txtnombreestudioc.getText() + "\n"
                            + "Para crear uno nuevo dirigase en el Menu Estudios/Nuevo Tipo de Estudio");
                    txtnombreestudioc.setText("");
                    txtnombreestudioc.requestFocus();
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error: " + e);
                Logger.getLogger(Consultar_Tipo_Estudio.class.getName()).log(Level.SEVERE, null, e);
            } finally {
                em.close();
            }
        }
    }//GEN-LAST:event_btnconsultarActionPerformed

    private void btnmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodificarActionPerformed
        // TODO add your handling code here:
        txtnombreestudio.setEditable(true);
        estudios_v.setTitle("MODIFICAR TIPO DE ESTUDIO");
        btnaceptar.setEnabled(true);
        btncancelar.setEnabled(true);
        btnmodificar.setEnabled(false);
        btnnuevaconsulta.setEnabled(false);
        txtnombreestudio.requestFocus();

    }//GEN-LAST:event_btnmodificarActionPerformed

    private void btncancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelarActionPerformed
        // TODO add your handling code here:
        txtnombreestudio.setText(estudios.getTipoEstudio());
        txtnombreestudio.setEditable(false);
        estudios_v.setTitle("CONSULTA TIPO DE ESTUDIO");
        btnaceptar.setEnabled(false);
        btncancelar.setEnabled(false);
        btnmodificar.setEnabled(true);
        btnnuevaconsulta.setEnabled(true);

    }//GEN-LAST:event_btncancelarActionPerformed

    private void btnnuevaconsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnuevaconsultaActionPerformed
        // TODO add your handling code here:
        btnmodificar.setEnabled(false);
        btnnuevaconsulta.setEnabled(false);
        txtcodigoestudio.setText("");
        txtnombreestudio.setText("");
        txtnombreestudioc.setEditable(true);
        btnconsultar.setEnabled(true);
        txtnombreestudioc.requestFocus();
    }//GEN-LAST:event_btnnuevaconsultaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnaceptar;
    private javax.swing.JButton btncancelar;
    private javax.swing.JButton btnconsultar;
    private javax.swing.JButton btnmodificar;
    private javax.swing.JButton btnnuevaconsulta;
    private javax.swing.JLabel lblcodigoestudio;
    private javax.swing.JLabel lblnombreestudioc;
    private javax.swing.JLabel lblnombreestuido;
    private javax.swing.JPanel pnlBotones;
    private javax.swing.JPanel pnlDatos;
    private javax.swing.JPanel pnlPral;
    private javax.swing.JPanel pnlSecundario;
    private javax.swing.JTextField txtcodigoestudio;
    private javax.swing.JTextField txtnombreestudio;
    private javax.swing.JTextField txtnombreestudioc;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the estudios
     */
    public Consultar_Tipo_Estudio getEstudios() {
        return estudios_v;
    }

    /**
     * @param estudios the estudios to set
     */
    public void setEstudios(Consultar_Tipo_Estudio estudios_v) {
        this.estudios_v = estudios_v;
    }
}
