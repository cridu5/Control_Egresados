/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas.Ingreso;

import Clases.Encriptacion;
import Vistas.Vista_Principal;
import entity.Departamentos;
import entity.Login;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author CRISTIAN
 */
public class Vista_Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    char car;

    public Vista_Login() {
        initComponents();
        this.setLocationRelativeTo(null);
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
        lblicono = new javax.swing.JLabel();
        lblusuario = new javax.swing.JLabel();
        txtusuario = new javax.swing.JTextField();
        pswcontraseña = new javax.swing.JPasswordField();
        lblcontraseña = new javax.swing.JLabel();
        btningresar = new javax.swing.JButton();
        btncancelar = new javax.swing.JButton();
        lblcontraseñaolvidada = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(new ImageIcon(getClass().getResource("/Iconos/icono.png")).getImage());
        setResizable(false);

        pnlPral.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        lblicono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/icono blanco negro.png"))); // NOI18N

        lblusuario.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        lblusuario.setText("Usuario");

        txtusuario.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        pswcontraseña.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        pswcontraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pswcontraseñaKeyTyped(evt);
            }
        });

        lblcontraseña.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        lblcontraseña.setText("Contraseña");

        btningresar.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        btningresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/ingresar 18x18 b y n.png"))); // NOI18N
        btningresar.setText("Ingresar");
        btningresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btningresarActionPerformed(evt);
            }
        });

        btncancelar.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        btncancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/cancelar 18x18 b y n.png"))); // NOI18N
        btncancelar.setText("Cancelar");
        btncancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelarActionPerformed(evt);
            }
        });

        lblcontraseñaolvidada.setText("¿Deseas cambiar tu contraseña o la has olvidado?");
        lblcontraseñaolvidada.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblcontraseñaolvidadaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlPralLayout = new javax.swing.GroupLayout(pnlPral);
        pnlPral.setLayout(pnlPralLayout);
        pnlPralLayout.setHorizontalGroup(
            pnlPralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPralLayout.createSequentialGroup()
                .addGroup(pnlPralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlPralLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblicono))
                    .addGroup(pnlPralLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(btningresar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btncancelar)))
                .addGap(0, 31, Short.MAX_VALUE))
            .addGroup(pnlPralLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(pnlPralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblcontraseñaolvidada)
                    .addGroup(pnlPralLayout.createSequentialGroup()
                        .addGroup(pnlPralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblusuario)
                            .addComponent(lblcontraseña))
                        .addGap(25, 25, 25)
                        .addGroup(pnlPralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pswcontraseña, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                            .addComponent(txtusuario))))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        pnlPralLayout.setVerticalGroup(
            pnlPralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPralLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(lblicono)
                .addGap(14, 14, 14)
                .addGroup(pnlPralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblusuario)
                    .addComponent(txtusuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(pnlPralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblcontraseña)
                    .addComponent(pswcontraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlPralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btncancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btningresar))
                .addGap(18, 18, 18)
                .addComponent(lblcontraseñaolvidada, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addComponent(pnlPral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btningresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btningresarActionPerformed
        // TODO add your handling code here:
        String contraseñadigitada = new String(pswcontraseña.getPassword());
        if (txtusuario.getText().equals("") || contraseñadigitada.equals("")) {
            JOptionPane.showMessageDialog(null, "Por favor diligenciar el usuario y/o contraseña para realizar el ingreso.");
            txtusuario.requestFocus();
        } else {
            String usuario = "", contraseñaactual = "", contraseñaencriptada, usuarioconsultado = "";
            contraseñadigitada = "";
            usuario = txtusuario.getText();
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("Control_Egresados_JPAPU");
            EntityManager em = emf.createEntityManager();
            EntityTransaction et = em.getTransaction();
            try {
                Login login = em.find(Login.class, usuario);
                if (login == null) {
                    JOptionPane.showMessageDialog(null, "El usuario no existe");
                } else {
                    contraseñaactual = login.getContraseña();
                    contraseñadigitada = new String(pswcontraseña.getPassword());
                    Encriptacion encriptar = new Encriptacion();
                    contraseñaencriptada = encriptar.encriptar(contraseñadigitada);
                    if (!contraseñaactual.equals(contraseñaencriptada)) {
                        JOptionPane.showMessageDialog(null, "Contraseña incorrecta");
                        pswcontraseña.setText("");
                        pswcontraseña.requestFocus();
                    } else {
                        Vista_Principal vista_principal = new Vista_Principal();
                        vista_principal.setUsuario(usuario);
                        switch (login.getTipo_Usuario()) {
                            case "Usuario": {
                                vista_principal.mnuUsuarios.setVisible(false);
                                vista_principal.setVisible(true);
                                break;
                            }
                            case "Administrador": {
                                vista_principal.setVisible(true);
                                break;
                            }
                        }
                        this.dispose();
                    }
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error: " + e);
                Logger.getLogger(Vista_Login.class.getName()).log(Level.SEVERE, null, e);
            } finally {
                em.close();
            }
        }
    }//GEN-LAST:event_btningresarActionPerformed

    private void btncancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelarActionPerformed
        // TODO add your handling code here:
        txtusuario.setText("");
        pswcontraseña.setText("");
    }//GEN-LAST:event_btncancelarActionPerformed

    private void lblcontraseñaolvidadaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblcontraseñaolvidadaMouseClicked
        // TODO add your handling code here:
        Consultar_Usuario ob = new Consultar_Usuario(this, rootPaneCheckingEnabled);
        ob.setVisible(true);

    }//GEN-LAST:event_lblcontraseñaolvidadaMouseClicked

    private void pswcontraseñaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pswcontraseñaKeyTyped
        // TODO add your handling code here:
        car = evt.getKeyChar();
        if (car == KeyEvent.VK_ENTER) {
            btningresar.doClick();
        }
    }//GEN-LAST:event_pswcontraseñaKeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Vista_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista_Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btncancelar;
    public javax.swing.JButton btningresar;
    private javax.swing.JLabel lblcontraseña;
    private javax.swing.JLabel lblcontraseñaolvidada;
    private javax.swing.JLabel lblicono;
    private javax.swing.JLabel lblusuario;
    private javax.swing.JPanel pnlPral;
    public javax.swing.JPasswordField pswcontraseña;
    public javax.swing.JTextField txtusuario;
    // End of variables declaration//GEN-END:variables
}
