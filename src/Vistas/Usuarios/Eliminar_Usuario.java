/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas.Usuarios;

import Clases.Encriptacion;
import entity.Login;
import java.awt.event.KeyEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author CRISTIAN
 */
public class Eliminar_Usuario extends javax.swing.JInternalFrame {

    /**
     * Creates new form Nuevo_Usuarioo
     */
    char car;
    private String tipo;

    public Eliminar_Usuario() {
        initComponents();
        tipo = "";
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
        lblusuario = new javax.swing.JLabel();
        lblpreguntasecreta = new javax.swing.JLabel();
        cmbpreguntasecreta = new javax.swing.JComboBox<>();
        txtusuario = new javax.swing.JTextField();
        txtrespuesta = new javax.swing.JTextField();
        btnaceptar = new javax.swing.JButton();
        btncancelar = new javax.swing.JButton();
        lblrespuesta = new javax.swing.JLabel();
        lbltipousuario = new javax.swing.JLabel();
        cmbtipousuario = new javax.swing.JComboBox<>();
        lblusuarioc = new javax.swing.JLabel();
        txtusuarioc = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        btnconsultar = new javax.swing.JButton();

        setClosable(true);
        setTitle("ELIMINAR USUARIO");

        pnlPral.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        lblusuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblusuario.setText("Usuario");

        lblpreguntasecreta.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblpreguntasecreta.setText("Pregunta Secreta");

        cmbpreguntasecreta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione...", "Nombre primer mascota", "Nombre Abuela", "Lugar de Nacimiento Mamá" }));
        cmbpreguntasecreta.setEnabled(false);

        txtusuario.setEditable(false);
        txtusuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtrespuesta.setEditable(false);
        txtrespuesta.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

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

        lblrespuesta.setFont(new java.awt.Font("Tahoma", 3, 13)); // NOI18N
        lblrespuesta.setText("Respuesta");

        lbltipousuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbltipousuario.setText("Tipo Usuario");

        cmbtipousuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione...", "Usuario", "Administrador" }));
        cmbtipousuario.setEnabled(false);

        lblusuarioc.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblusuarioc.setText("Usuario");

        txtusuarioc.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtusuarioc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtusuariocKeyTyped(evt);
            }
        });

        btnconsultar.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        btnconsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/consultar 24x24 b y n.png"))); // NOI18N
        btnconsultar.setText("Consultar");
        btnconsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnconsultarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlPralLayout = new javax.swing.GroupLayout(pnlPral);
        pnlPral.setLayout(pnlPralLayout);
        pnlPralLayout.setHorizontalGroup(
            pnlPralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPralLayout.createSequentialGroup()
                .addGroup(pnlPralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlPralLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1))
                    .addGroup(pnlPralLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(pnlPralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblusuario)
                            .addComponent(lblpreguntasecreta)
                            .addComponent(lblrespuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbltipousuario))
                        .addGap(21, 21, 21)
                        .addGroup(pnlPralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtrespuesta)
                            .addComponent(cmbpreguntasecreta, 0, 170, Short.MAX_VALUE)
                            .addComponent(txtusuario, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                            .addComponent(cmbtipousuario, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 38, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPralLayout.createSequentialGroup()
                .addGap(0, 18, Short.MAX_VALUE)
                .addGroup(pnlPralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPralLayout.createSequentialGroup()
                        .addComponent(lblusuarioc)
                        .addGap(18, 18, 18)
                        .addComponent(txtusuarioc, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnconsultar)
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPralLayout.createSequentialGroup()
                        .addComponent(btnaceptar)
                        .addGap(18, 18, 18)
                        .addComponent(btncancelar)
                        .addGap(94, 94, 94))))
        );
        pnlPralLayout.setVerticalGroup(
            pnlPralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPralLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(pnlPralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtusuarioc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblusuarioc)
                    .addComponent(btnconsultar))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlPralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblusuario, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtusuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlPralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblpreguntasecreta)
                    .addComponent(cmbpreguntasecreta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlPralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtrespuesta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblrespuesta))
                .addGap(18, 18, 18)
                .addGroup(pnlPralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbltipousuario)
                    .addComponent(cmbtipousuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(pnlPralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnaceptar)
                    .addComponent(btncancelar))
                .addContainerGap(14, Short.MAX_VALUE))
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
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnaceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaceptarActionPerformed
        // TODO add your handling code here:
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Control_Egresados_JPAPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        try {
            int seleccion = JOptionPane.showOptionDialog(
                    null,
                    "¿Esta seguro que quiere eliminar el usuario " + txtusuario.getText() + "?",
                    "Selector de opciones",
                    JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null, // null para icono por defecto.
                    new Object[]{"SI", "NO",}, // null para YES, NO y CANCEL
                    "opcion 1");
            if (seleccion == 0) {
                Login login = em.find(Login.class, txtusuario.getText());
                et.begin();
                em.remove(login);
                et.commit();
                JOptionPane.showMessageDialog(null, "El Usuario " + txtusuario.getText() + " ha sido eliminado con satisfacción.");
                txtusuario.setText("");
                cmbpreguntasecreta.setSelectedIndex(0);
                txtrespuesta.setText("");
                cmbtipousuario.setSelectedIndex(0);
                txtusuarioc.setEditable(true);
                btnaceptar.setEnabled(false);
                btncancelar.setEnabled(false);
                btnconsultar.setEnabled(true);
                txtusuarioc.requestFocus();
            } else if (seleccion == 1) {
                JOptionPane.showMessageDialog(null, "El usuario " + txtusuario.getText() + " no ha sido eliminado.");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
            Logger.getLogger(Eliminar_Usuario.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            em.close();
        }
    }//GEN-LAST:event_btnaceptarActionPerformed

    private void btncancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelarActionPerformed
        // TODO add your handling code here:
        txtusuarioc.setEditable(true);
        btnconsultar.setEnabled(true);
        txtusuario.setText("");
        cmbpreguntasecreta.setSelectedIndex(0);
        txtrespuesta.setText("");
        cmbtipousuario.setSelectedIndex(0);
        btnaceptar.setEnabled(false);
        btncancelar.setEnabled(false);
        txtusuarioc.requestFocus();
    }//GEN-LAST:event_btncancelarActionPerformed

    private void btnconsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnconsultarActionPerformed
        // TODO add your handling code here:
        if (txtusuarioc.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Por favor diligenciar el usuario.");
            txtusuarioc.requestFocus();
        } else {
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("Control_Egresados_JPAPU");
            EntityManager em = emf.createEntityManager();
            EntityTransaction et = em.getTransaction();
            try {
                Login login = em.find(Login.class, txtusuarioc.getText());
                if (login == null) {
                    JOptionPane.showMessageDialog(null, "El usuario " + txtusuarioc.getText() + " no existe en la base de datos.");
                    txtusuarioc.setText("");
                    txtusuarioc.requestFocus();
                } else {
                    txtusuario.setText(txtusuarioc.getText());
                    txtusuarioc.setText("");
                    txtusuarioc.setEditable(false);
                    btnconsultar.setEnabled(false);
                    cmbpreguntasecreta.setSelectedIndex(login.getPregunta_Secreta());
                    txtrespuesta.setText(login.getRespuesta());
                    cmbtipousuario.setSelectedItem(login.getTipo_Usuario());
                    btnaceptar.setEnabled(true);
                    btncancelar.setEnabled(true);
                    btnaceptar.requestFocus();
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error: " + e);
                Logger.getLogger(Eliminar_Usuario.class.getName()).log(Level.SEVERE, null, e);
            } finally {
                em.close();
            }
        }
    }//GEN-LAST:event_btnconsultarActionPerformed

    private void txtusuariocKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtusuariocKeyTyped
        // TODO add your handling code here:
        car = evt.getKeyChar();
        if (car == KeyEvent.VK_ENTER) {
            btnconsultar.doClick();
        }
    }//GEN-LAST:event_txtusuariocKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnaceptar;
    public javax.swing.JButton btncancelar;
    private javax.swing.JButton btnconsultar;
    private javax.swing.JComboBox<String> cmbpreguntasecreta;
    private javax.swing.JComboBox<String> cmbtipousuario;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblpreguntasecreta;
    private javax.swing.JLabel lblrespuesta;
    private javax.swing.JLabel lbltipousuario;
    private javax.swing.JLabel lblusuario;
    private javax.swing.JLabel lblusuarioc;
    private javax.swing.JPanel pnlPral;
    private javax.swing.JTextField txtrespuesta;
    public javax.swing.JTextField txtusuario;
    public javax.swing.JTextField txtusuarioc;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
