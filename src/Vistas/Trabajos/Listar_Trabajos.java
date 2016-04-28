/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas.Trabajos;

import Vistas.Trabajos.*;
import Vistas.Usuarios.Listar_Usuarios;
import entity.Trabajos;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author CRISTIAN
 */
public class Listar_Trabajos extends javax.swing.JInternalFrame {

    /**
     * Creates new form Listar_Estudios
     */
    DefaultTableModel model;

    public Listar_Trabajos() {
        initComponents();
    }

    public void listar_Trabajos() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Control_Egresados_JPAPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        try {
            String datos[] = new String[2];
            model = (DefaultTableModel) tblinfotrabajos.getModel();
            TypedQuery<Trabajos> consulta_Trabajos = em.createNamedQuery("Trabajos.findAll", Trabajos.class);
            List<Trabajos> lista = consulta_Trabajos.getResultList();
            for (Trabajos a : lista) {
                datos[0] = "" + a.getCodigoTrabajo();
                datos[1] = a.getNombreTrabajo();
                model.addRow(datos);
            }
            tblinfotrabajos.setModel(model);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
            Logger.getLogger(Listar_Usuarios.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            em.close();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupo = new javax.swing.ButtonGroup();
        pnlPral = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblinfotrabajos = new javax.swing.JTable();
        btnactualizar = new javax.swing.JButton();

        setClosable(true);
        setTitle("LISTADO TRABAJOS");

        pnlPral.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        tblinfotrabajos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nombre"
            }
        ));
        jScrollPane1.setViewportView(tblinfotrabajos);

        javax.swing.GroupLayout pnlPralLayout = new javax.swing.GroupLayout(pnlPral);
        pnlPral.setLayout(pnlPralLayout);
        pnlPralLayout.setHorizontalGroup(
            pnlPralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPralLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlPralLayout.setVerticalGroup(
            pnlPralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPralLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnactualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/actualizar 24x24 by n.png"))); // NOI18N
        btnactualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnactualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlPral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnactualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlPral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnactualizar)
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnactualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnactualizarActionPerformed
        // TODO add your handling code here:
        for (int i = 0; i < tblinfotrabajos.getRowCount(); i++) {
            model.removeRow(i);
            i -= 1;
        }
        listar_Trabajos();
    }//GEN-LAST:event_btnactualizarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnactualizar;
    private javax.swing.ButtonGroup grupo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnlPral;
    private javax.swing.JTable tblinfotrabajos;
    // End of variables declaration//GEN-END:variables
}
