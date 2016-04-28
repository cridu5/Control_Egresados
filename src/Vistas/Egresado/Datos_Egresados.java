/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas.Egresado;

import entity.Ciudades;
import entity.Departamentos;
import entity.Egresados;
import entity.Paises;
import java.awt.event.ItemEvent;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
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
public class Datos_Egresados extends javax.swing.JInternalFrame {

    /**
     * Creates new form Datos_Egresados
     */
    char car;
    String cadena;

    public Datos_Egresados() {
        initComponents();
    }

    public void cargar_Paises_Nacimiento() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Control_Egresados_JPAPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        TypedQuery<Paises> consultaPaises = em.createNamedQuery("Paises.All", Paises.class);
        List<Paises> lista = consultaPaises.getResultList();
        for (Paises a : lista) {
            cmbpaisesnacimiento.addItem(a.getNombrePais());
        }
    }

    public void cargar_Departamentos_Nacimiento() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Control_Egresados_JPAPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        int codigo_Pais = 0;
        TypedQuery<Paises> consultaCodPais = em.createNamedQuery("consulta_Codigo_Pais", Paises.class);
        consultaCodPais.setParameter("nombre_Pais", cmbpaisesnacimiento.getSelectedItem().toString());
        List<Paises> lista = consultaCodPais.getResultList();
        for (Paises a : lista) {
            codigo_Pais = a.getCodigoPais();
        }

        TypedQuery<Departamentos> consultaDepartamentos = em.createNamedQuery("consulta_Departamentos_Pais", Departamentos.class);
        consultaDepartamentos.setParameter("codigo_Pais", codigo_Pais);
        List<Departamentos> lista_departamentos = consultaDepartamentos.getResultList();
        for (Departamentos a : lista_departamentos) {
            cmbdepartamentosnacimiento.addItem(a.getNombreDepartamento());
        }
    }

    public void cargar_Ciudades_Nacimiento() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Control_Egresados_JPAPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        int codigo_Departamento = 0;
        TypedQuery<Departamentos> consultaCodDepartamento = em.createNamedQuery("consulta_Nombre_Departamento", Departamentos.class);
        consultaCodDepartamento.setParameter("nombre_Departamento", cmbdepartamentosnacimiento.getSelectedItem().toString());
        List<Departamentos> lista = consultaCodDepartamento.getResultList();
        for (Departamentos a : lista) {
            codigo_Departamento = a.getCodigoDepartamento();
        }

        TypedQuery<Ciudades> consultaCiudades = em.createNamedQuery("consulta_Ciudades_Departamento", Ciudades.class);
        consultaCiudades.setParameter("codigo_Departamento", codigo_Departamento);
        List<Ciudades> lista_Ciudades = consultaCiudades.getResultList();
        for (Ciudades a : lista_Ciudades) {
            cmbciudadesnacimiento.addItem(a.getNombreCiudad());
        }
    }

    public void cargar_Paises_Ubicacion() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Control_Egresados_JPAPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        TypedQuery<Paises> consultaPaises = em.createNamedQuery("Paises.All", Paises.class);
        List<Paises> lista = consultaPaises.getResultList();
        for (Paises a : lista) {
            cmbpaisesubicacion.addItem(a.getNombrePais());
        }
    }

    public void cargar_Departamentos_Ubicacion() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Control_Egresados_JPAPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        int codigo_Pais = 0;
        TypedQuery<Paises> consultaCodPais = em.createNamedQuery("consulta_Codigo_Pais", Paises.class);
        consultaCodPais.setParameter("nombre_Pais", cmbpaisesubicacion.getSelectedItem().toString());
        List<Paises> lista = consultaCodPais.getResultList();
        for (Paises a : lista) {
            codigo_Pais = a.getCodigoPais();
        }

        TypedQuery<Departamentos> consultaDepartamentos = em.createNamedQuery("consulta_Departamentos_Pais", Departamentos.class);
        consultaDepartamentos.setParameter("codigo_Pais", codigo_Pais);
        List<Departamentos> lista_departamentos = consultaDepartamentos.getResultList();
        for (Departamentos a : lista_departamentos) {
            cmbdepartamentosubicacion.addItem(a.getNombreDepartamento());
        }
    }

    public void cargar_Ciudades_Ubicacion() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Control_Egresados_JPAPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        int codigo_Departamento = 0;
        TypedQuery<Departamentos> consultaCodDepartamento = em.createNamedQuery("consulta_Nombre_Departamento", Departamentos.class);
        consultaCodDepartamento.setParameter("nombre_Departamento", cmbdepartamentosubicacion.getSelectedItem().toString());
        List<Departamentos> lista = consultaCodDepartamento.getResultList();
        for (Departamentos a : lista) {
            codigo_Departamento = a.getCodigoDepartamento();
        }

        TypedQuery<Ciudades> consultaCiudades = em.createNamedQuery("consulta_Ciudades_Departamento", Ciudades.class);
        consultaCiudades.setParameter("codigo_Departamento", codigo_Departamento);
        List<Ciudades> lista_Ciudades = consultaCiudades.getResultList();
        for (Ciudades a : lista_Ciudades) {
            cmbciudadesubicacion.addItem(a.getNombreCiudad());
        }
    }

    public void habilitar_Campos() {
        txtidegresado.setEditable(true);
        cmbtipodocumento.setEnabled(true);
        txtprimernombre.setEditable(true);
        txtsegundonombre.setEditable(true);
        txtprimerapellido.setEditable(true);
        txtsegundoapellido.setEditable(true);
        cmbestadocivil.setEnabled(true);
        cmbsexo.setEnabled(true);
        cmbtiposanguineo.setEnabled(true);
        jdcfechanacimiento.setEnabled(true);
        cmbpaisesnacimiento.setEnabled(true);
        cmbdepartamentosnacimiento.setEnabled(true);
        cmbciudadesnacimiento.setEnabled(true);
        txtdireccionresidencia.setEditable(true);
        cmbpaisesubicacion.setEnabled(true);
        cmbdepartamentosubicacion.setEnabled(true);
        cmbciudadesubicacion.setEnabled(true);
        txttelefonoegresado.setEditable(true);
        txtcelular.setEditable(true);
        txtemail.setEditable(true);
    }

    public void deshabilitar_Campos() {
        txtidegresado.setEditable(false);
        cmbtipodocumento.setEnabled(false);
        txtprimernombre.setEditable(false);
        txtsegundonombre.setEditable(false);
        txtprimerapellido.setEditable(false);
        txtsegundoapellido.setEditable(false);
        cmbestadocivil.setEnabled(false);
        cmbsexo.setEnabled(false);
        cmbtiposanguineo.setEnabled(false);
        jdcfechanacimiento.setEnabled(false);
        cmbpaisesnacimiento.setEnabled(false);
        cmbdepartamentosnacimiento.setEnabled(false);
        cmbciudadesnacimiento.setEnabled(false);
        txtdireccionresidencia.setEditable(false);
        cmbpaisesubicacion.setEnabled(false);
        cmbdepartamentosubicacion.setEnabled(false);
        cmbciudadesubicacion.setEnabled(false);
        txttelefonoegresado.setEditable(false);
        txtcelular.setEditable(false);
        txtemail.setEditable(false);
    }

    public void limpiar_Espacios() {
        txtidegresado.setText("");
        cmbtipodocumento.setSelectedIndex(0);
        txtprimernombre.setText("");
        txtsegundonombre.setText("");
        txtprimerapellido.setText("");
        txtsegundoapellido.setText("");
        cmbestadocivil.setSelectedIndex(0);
        cmbsexo.setSelectedIndex(0);
        cmbtiposanguineo.setSelectedIndex(0);
        jdcfechanacimiento.setDate(null);
        cmbpaisesnacimiento.setSelectedIndex(0);
        cmbdepartamentosnacimiento.setSelectedIndex(0);
        cmbciudadesnacimiento.setSelectedIndex(0);
        txtdireccionresidencia.setText("");
        cmbpaisesubicacion.setSelectedIndex(0);
        cmbdepartamentosubicacion.setSelectedIndex(0);
        cmbciudadesubicacion.setSelectedIndex(0);
        txttelefonoegresado.setText("");
        txtcelular.setText("");
        txtemail.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btngestudio = new javax.swing.ButtonGroup();
        btngtrabajo = new javax.swing.ButtonGroup();
        pnlPral = new javax.swing.JPanel();
        pnlConsulta = new javax.swing.JPanel();
        lblidegresadoc = new javax.swing.JLabel();
        txtidegresadoc = new javax.swing.JTextField();
        btnconsultar = new javax.swing.JButton();
        pnlSecundario = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        pnlDatos = new javax.swing.JPanel();
        lblidegresado = new javax.swing.JLabel();
        lblcorreoegresado = new javax.swing.JLabel();
        lblprimernombre = new javax.swing.JLabel();
        lbltelefonoegresado = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();
        lblprimerapellido = new javax.swing.JLabel();
        txttelefonoegresado = new javax.swing.JTextField();
        txtprimernombre = new javax.swing.JTextField();
        txtprimerapellido = new javax.swing.JTextField();
        txtidegresado = new javax.swing.JTextField();
        lbldatospersonales = new javax.swing.JLabel();
        lbltipodocumento = new javax.swing.JLabel();
        cmbtipodocumento = new javax.swing.JComboBox();
        lblsegundonombre = new javax.swing.JLabel();
        txtsegundonombre = new javax.swing.JTextField();
        lblsegundoapellido = new javax.swing.JLabel();
        txtsegundoapellido = new javax.swing.JTextField();
        lblestadocivil = new javax.swing.JLabel();
        lblsexo = new javax.swing.JLabel();
        lbltiposanguineo = new javax.swing.JLabel();
        cmbestadocivil = new javax.swing.JComboBox();
        cmbsexo = new javax.swing.JComboBox();
        cmbtiposanguineo = new javax.swing.JComboBox();
        lblnacimiento = new javax.swing.JLabel();
        lblfechanacimiento = new javax.swing.JLabel();
        jdcfechanacimiento = new com.toedter.calendar.JDateChooser();
        lblpaisnacimiento = new javax.swing.JLabel();
        cmbpaisesnacimiento = new javax.swing.JComboBox();
        lbldepartamentonacimiento = new javax.swing.JLabel();
        cmbdepartamentosnacimiento = new javax.swing.JComboBox();
        lblciudadnacimiento = new javax.swing.JLabel();
        cmbciudadesnacimiento = new javax.swing.JComboBox();
        lbldatosubicacion = new javax.swing.JLabel();
        lbldireccionresidencia = new javax.swing.JLabel();
        txtdireccionresidencia = new javax.swing.JTextField();
        lblpaisubicacion = new javax.swing.JLabel();
        cmbpaisesubicacion = new javax.swing.JComboBox();
        lbldepartamentoubicacion = new javax.swing.JLabel();
        cmbdepartamentosubicacion = new javax.swing.JComboBox();
        lblciudadubicacion = new javax.swing.JLabel();
        cmbciudadesubicacion = new javax.swing.JComboBox();
        lblcelular = new javax.swing.JLabel();
        txtcelular = new javax.swing.JTextField();
        pnlBotones = new javax.swing.JPanel();
        btnmodificar = new javax.swing.JButton();
        btnnuevaconsulta = new javax.swing.JButton();
        btngenerardatosnuevos = new javax.swing.JButton();
        pnlAceptar = new javax.swing.JPanel();
        btnaceptar = new javax.swing.JButton();
        btncancelar = new javax.swing.JButton();
        lblmensaje = new javax.swing.JLabel();

        setClosable(true);
        setTitle("EGRESADO");

        pnlPral.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        pnlConsulta.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        lblidegresadoc.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        lblidegresadoc.setText("ID");

        txtidegresadoc.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txtidegresadoc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtidegresadocKeyTyped(evt);
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

        javax.swing.GroupLayout pnlConsultaLayout = new javax.swing.GroupLayout(pnlConsulta);
        pnlConsulta.setLayout(pnlConsultaLayout);
        pnlConsultaLayout.setHorizontalGroup(
            pnlConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlConsultaLayout.createSequentialGroup()
                .addGap(201, 201, 201)
                .addComponent(lblidegresadoc)
                .addGap(18, 18, 18)
                .addComponent(txtidegresadoc, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnconsultar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlConsultaLayout.setVerticalGroup(
            pnlConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlConsultaLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(pnlConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblidegresadoc)
                    .addComponent(txtidegresadoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnconsultar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlSecundario.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        lblidegresado.setText("ID");

        lblcorreoegresado.setText("Correo");

        lblprimernombre.setText("Primer Nombre");

        lbltelefonoegresado.setText("Telefono");

        txtemail.setEditable(false);

        lblprimerapellido.setText("Primer Apellido");

        txttelefonoegresado.setEditable(false);
        txttelefonoegresado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txttelefonoegresadoKeyTyped(evt);
            }
        });

        txtprimernombre.setEditable(false);
        txtprimernombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtprimernombreKeyReleased(evt);
            }
        });

        txtprimerapellido.setEditable(false);
        txtprimerapellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtprimerapellidoKeyReleased(evt);
            }
        });

        txtidegresado.setEditable(false);

        lbldatospersonales.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbldatospersonales.setText("Datos Personales");

        lbltipodocumento.setText("Tipo Documento");

        cmbtipodocumento.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione...", "CEDULA", "TARJETA IDENTIDAD", "PASAPORTE" }));
        cmbtipodocumento.setEnabled(false);

        lblsegundonombre.setText("Segundo Nombre");

        txtsegundonombre.setEditable(false);
        txtsegundonombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtsegundonombreKeyReleased(evt);
            }
        });

        lblsegundoapellido.setText("Segundo Apellido");

        txtsegundoapellido.setEditable(false);
        txtsegundoapellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtsegundoapellidoKeyReleased(evt);
            }
        });

        lblestadocivil.setText("Estado Civil");

        lblsexo.setText("Sexo");

        lbltiposanguineo.setText("Tipo Sanguineo");

        cmbestadocivil.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione...", "CASADO", "SOLTERO" }));
        cmbestadocivil.setEnabled(false);

        cmbsexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione...", "M", "H" }));
        cmbsexo.setEnabled(false);

        cmbtiposanguineo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione...", "O-", "O+" }));
        cmbtiposanguineo.setEnabled(false);

        lblnacimiento.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblnacimiento.setText("Nacimiento");

        lblfechanacimiento.setText("Fecha Nacimiento");

        jdcfechanacimiento.setEnabled(false);

        lblpaisnacimiento.setText("Pais");

        cmbpaisesnacimiento.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione..." }));
        cmbpaisesnacimiento.setEnabled(false);
        cmbpaisesnacimiento.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbpaisesnacimientoItemStateChanged(evt);
            }
        });

        lbldepartamentonacimiento.setText("Departamento");

        cmbdepartamentosnacimiento.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione..." }));
        cmbdepartamentosnacimiento.setEnabled(false);
        cmbdepartamentosnacimiento.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbdepartamentosnacimientoItemStateChanged(evt);
            }
        });

        lblciudadnacimiento.setText("Ciudad");

        cmbciudadesnacimiento.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione..." }));
        cmbciudadesnacimiento.setEnabled(false);

        lbldatosubicacion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbldatosubicacion.setText("Datos Ubicación");

        lbldireccionresidencia.setText("Direccion Residencia");

        txtdireccionresidencia.setEditable(false);
        txtdireccionresidencia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtdireccionresidenciaKeyReleased(evt);
            }
        });

        lblpaisubicacion.setText("Pais");

        cmbpaisesubicacion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione..." }));
        cmbpaisesubicacion.setEnabled(false);
        cmbpaisesubicacion.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbpaisesubicacionItemStateChanged(evt);
            }
        });

        lbldepartamentoubicacion.setText("Departamento");

        cmbdepartamentosubicacion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione..." }));
        cmbdepartamentosubicacion.setEnabled(false);
        cmbdepartamentosubicacion.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbdepartamentosubicacionItemStateChanged(evt);
            }
        });

        lblciudadubicacion.setText("Ciudad");

        cmbciudadesubicacion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione..." }));
        cmbciudadesubicacion.setEnabled(false);

        lblcelular.setText("Celular");

        txtcelular.setEditable(false);
        txtcelular.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcelularKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout pnlDatosLayout = new javax.swing.GroupLayout(pnlDatos);
        pnlDatos.setLayout(pnlDatosLayout);
        pnlDatosLayout.setHorizontalGroup(
            pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDatosLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblidegresado)
                    .addComponent(lbldireccionresidencia)
                    .addComponent(lbldepartamentoubicacion)
                    .addComponent(lbltelefonoegresado)
                    .addGroup(pnlDatosLayout.createSequentialGroup()
                        .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblprimernombre)
                            .addComponent(lblprimerapellido)
                            .addComponent(lblestadocivil))
                        .addGap(21, 21, 21)
                        .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlDatosLayout.createSequentialGroup()
                                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cmbdepartamentosnacimiento, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jdcfechanacimiento, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(pnlDatosLayout.createSequentialGroup()
                                        .addGap(14, 14, 14)
                                        .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(cmbdepartamentosubicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtemail, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                                            .addComponent(txttelefonoegresado)
                                            .addComponent(txtdireccionresidencia, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlDatosLayout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(pnlDatosLayout.createSequentialGroup()
                                                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(lblpaisubicacion)
                                                    .addComponent(lblcelular))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(txtcelular, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(pnlDatosLayout.createSequentialGroup()
                                                .addComponent(lblciudadubicacion)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(cmbciudadesubicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(cmbpaisesubicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(pnlDatosLayout.createSequentialGroup()
                                            .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(lblciudadnacimiento)
                                                .addComponent(lblpaisnacimiento))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(cmbpaisesnacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(cmbciudadesnacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                            .addGroup(pnlDatosLayout.createSequentialGroup()
                                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtprimerapellido, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtprimernombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtidegresado, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(pnlDatosLayout.createSequentialGroup()
                                        .addComponent(cmbestadocivil, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblsexo)
                                        .addGap(13, 13, 13)))
                                .addGap(18, 18, 18)
                                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlDatosLayout.createSequentialGroup()
                                        .addComponent(cmbsexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(14, 14, 14)
                                        .addComponent(lbltiposanguineo)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cmbtiposanguineo, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(pnlDatosLayout.createSequentialGroup()
                                        .addComponent(lbltipodocumento)
                                        .addGap(25, 25, 25)
                                        .addComponent(cmbtipodocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(pnlDatosLayout.createSequentialGroup()
                                        .addComponent(lblsegundonombre)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtsegundonombre, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(pnlDatosLayout.createSequentialGroup()
                                        .addComponent(lblsegundoapellido)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtsegundoapellido, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addComponent(lbldatospersonales)
                    .addComponent(lblfechanacimiento)
                    .addComponent(lbldepartamentonacimiento)
                    .addComponent(lblcorreoegresado)
                    .addComponent(lbldatosubicacion)
                    .addComponent(lblnacimiento))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        pnlDatosLayout.setVerticalGroup(
            pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDatosLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(lbldatospersonales)
                .addGap(18, 18, 18)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblidegresado)
                    .addComponent(txtidegresado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbltipodocumento)
                    .addComponent(cmbtipodocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblprimernombre)
                    .addComponent(txtprimernombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblsegundonombre)
                    .addComponent(txtsegundonombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblprimerapellido)
                    .addComponent(txtprimerapellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblsegundoapellido)
                    .addComponent(txtsegundoapellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblestadocivil)
                    .addComponent(lblsexo)
                    .addComponent(lbltiposanguineo)
                    .addComponent(cmbestadocivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbtiposanguineo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbsexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addComponent(lblnacimiento)
                .addGap(18, 18, 18)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblfechanacimiento)
                    .addComponent(jdcfechanacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cmbpaisesnacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblpaisnacimiento)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbldepartamentonacimiento)
                    .addComponent(cmbdepartamentosnacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblciudadnacimiento)
                    .addComponent(cmbciudadesnacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addComponent(lbldatosubicacion)
                .addGap(18, 18, 18)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbldireccionresidencia)
                    .addComponent(txtdireccionresidencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblpaisubicacion)
                    .addComponent(cmbpaisesubicacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbldepartamentoubicacion)
                    .addComponent(cmbdepartamentosubicacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblciudadubicacion)
                    .addComponent(cmbciudadesubicacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbltelefonoegresado)
                    .addComponent(txttelefonoegresado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblcelular)
                    .addComponent(txtcelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblcorreoegresado)
                    .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        jScrollPane1.setViewportView(pnlDatos);

        pnlBotones.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        btnmodificar.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        btnmodificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/modificar 18x18 b y n.png"))); // NOI18N
        btnmodificar.setText("Modificar");
        btnmodificar.setEnabled(false);
        btnmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmodificarActionPerformed(evt);
            }
        });

        btnnuevaconsulta.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        btnnuevaconsulta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/nuevo 18x18x.png"))); // NOI18N
        btnnuevaconsulta.setText("Nueva Consulta");
        btnnuevaconsulta.setEnabled(false);
        btnnuevaconsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnuevaconsultaActionPerformed(evt);
            }
        });

        btngenerardatosnuevos.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        btngenerardatosnuevos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/nuevo 18x18 b y n.png"))); // NOI18N
        btngenerardatosnuevos.setText("Generar Datos Nuevos");
        btngenerardatosnuevos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btngenerardatosnuevosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlBotonesLayout = new javax.swing.GroupLayout(pnlBotones);
        pnlBotones.setLayout(pnlBotonesLayout);
        pnlBotonesLayout.setHorizontalGroup(
            pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBotonesLayout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addComponent(btngenerardatosnuevos)
                .addGap(18, 18, 18)
                .addComponent(btnmodificar)
                .addGap(18, 18, 18)
                .addComponent(btnnuevaconsulta)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlBotonesLayout.setVerticalGroup(
            pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBotonesLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnmodificar)
                    .addComponent(btnnuevaconsulta)
                    .addComponent(btngenerardatosnuevos))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pnlAceptar.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

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

        lblmensaje.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblmensaje.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblmensaje.setText("Consulta");

        javax.swing.GroupLayout pnlAceptarLayout = new javax.swing.GroupLayout(pnlAceptar);
        pnlAceptar.setLayout(pnlAceptarLayout);
        pnlAceptarLayout.setHorizontalGroup(
            pnlAceptarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAceptarLayout.createSequentialGroup()
                .addGap(235, 235, 235)
                .addGroup(pnlAceptarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblmensaje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlAceptarLayout.createSequentialGroup()
                        .addComponent(btnaceptar)
                        .addGap(18, 18, 18)
                        .addComponent(btncancelar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlAceptarLayout.setVerticalGroup(
            pnlAceptarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAceptarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblmensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlAceptarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnaceptar)
                    .addComponent(btncancelar))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlSecundarioLayout = new javax.swing.GroupLayout(pnlSecundario);
        pnlSecundario.setLayout(pnlSecundarioLayout);
        pnlSecundarioLayout.setHorizontalGroup(
            pnlSecundarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSecundarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlSecundarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pnlAceptar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlBotones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        pnlSecundarioLayout.setVerticalGroup(
            pnlSecundarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSecundarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlPralLayout = new javax.swing.GroupLayout(pnlPral);
        pnlPral.setLayout(pnlPralLayout);
        pnlPralLayout.setHorizontalGroup(
            pnlPralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPralLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlPralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlPralLayout.createSequentialGroup()
                        .addComponent(pnlSecundario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlPralLayout.setVerticalGroup(
            pnlPralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPralLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlSecundario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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

    private void btnmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodificarActionPerformed
        // TODO add your handling code here:
        habilitar_Campos();
        txtidegresado.setEditable(false);
        btnmodificar.setEnabled(false);
        btnnuevaconsulta.setEnabled(false);
        btnaceptar.setEnabled(true);
        btncancelar.setEnabled(true);
        lblmensaje.setText("Modificar Registro");
        cmbtipodocumento.requestFocus();
    }//GEN-LAST:event_btnmodificarActionPerformed

    private void btnaceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaceptarActionPerformed
        // TODO add your handling code here:
        switch (lblmensaje.getText()) {
            case "Nuevo Registro": {
                if (txtidegresado.getText().equals("") || txtsegundonombre.getText().equals("")
                        || txtsegundoapellido.getText().equals("")
                        || cmbestadocivil.getSelectedItem().toString().equals("Seleccione...")
                        || cmbsexo.getSelectedItem().toString().equals("Seleccione...")
                        || cmbtiposanguineo.getSelectedItem().toString().equals("Seleccione...")
                        || jdcfechanacimiento.getDate() == (null)
                        || cmbpaisesnacimiento.getSelectedItem().toString().equals("Seleccione...")
                        || cmbdepartamentosnacimiento.getSelectedItem().toString().equals("Seleccione...")
                        || cmbciudadesnacimiento.getSelectedItem().toString().equals("Seleccione...")
                        || txtdireccionresidencia.getText().equals("")
                        || cmbpaisesubicacion.getSelectedItem().toString().equals("Seleccione...")
                        || cmbdepartamentosubicacion.getSelectedItem().toString().equals("Seleccione...")
                        || cmbciudadesubicacion.getSelectedItem().toString().equals("Seleccione...")
                        || txttelefonoegresado.getText().equals("")
                        || txtcelular.getText().equals("")
                        || txtemail.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Por favor diligenciar todos los datos.");
                } else {
                    EntityManagerFactory emf = Persistence.createEntityManagerFactory("Control_Egresados_JPAPU");
                    EntityManager em = emf.createEntityManager();
                    EntityTransaction et = em.getTransaction();
                    try {
                        Egresados egresados = new Egresados();
                        egresados.setId_Egresado(Integer.parseInt(txtidegresado.getText()));
                        egresados.setTipo_Documento(cmbtipodocumento.getSelectedItem().toString());
                        egresados.setPrimer_Nombre(txtprimernombre.getText());
                        egresados.setSegundo_Nombre(txtsegundonombre.getText());
                        egresados.setPrimer_Apellido(txtprimerapellido.getText());
                        egresados.setSegundo_Apellido(txtsegundoapellido.getText());
                        egresados.setSexo(cmbsexo.getSelectedItem().toString().charAt(0));
                        egresados.setEstado_Civil(cmbestadocivil.getSelectedItem().toString());
                        egresados.setTipo_Sanguineo(cmbtiposanguineo.getSelectedItem().toString());

                        String formato = "", fecha_nacimiento = "";
                        Date fecha;
                        SimpleDateFormat dateformat;
                        formato = "dd/MM/yyyy";
                        fecha = jdcfechanacimiento.getDate();
                        dateformat = new SimpleDateFormat(formato);
                        fecha_nacimiento = dateformat.format(fecha);
                        egresados.setFecha_Nacimiento(fecha_nacimiento);

                        TypedQuery<Ciudades> consultaCodCiudad = em.createNamedQuery("consulta_Nombre_Ciudad", Ciudades.class);
                        consultaCodCiudad.setParameter("nombre_Ciudad", cmbciudadesnacimiento.getSelectedItem().toString());
                        List<Ciudades> lista = consultaCodCiudad.getResultList();
                        for (Ciudades a : lista) {
                            egresados.setLugar_Nacimiento_Cod_Ciudad(a.getCodigoCiudad());
                        }

                        egresados.setDireccion_Residencia(txtdireccionresidencia.getText());

                        consultaCodCiudad.setParameter("nombre_Ciudad", cmbciudadesubicacion.getSelectedItem().toString());
                        lista = consultaCodCiudad.getResultList();
                        for (Ciudades a : lista) {
                            egresados.setResidencia_Cod_Ciudad(a.getCodigoCiudad());
                        }

                        egresados.setTelefono(txttelefonoegresado.getText());
                        egresados.setCelular(txtcelular.getText());
                        egresados.setEmail(txtemail.getText());

                        et.begin();
                        em.persist(egresados);
                        et.commit();

                        deshabilitar_Campos();
                        btnmodificar.setEnabled(true);
                        btnnuevaconsulta.setEnabled(true);
                        btnaceptar.setEnabled(false);
                        btncancelar.setEnabled(false);
                        lblmensaje.setText("Consulta");
                        JOptionPane.showMessageDialog(null, "Los datos se han agregado satisfactoriamente.");

                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Error: " + e);
                        Logger.getLogger(Datos_Egresados.class.getName()).log(Level.SEVERE, null, e);
                    } finally {
                        em.close();
                    }
                }
                break;
            }
            case "Modificar Registro": {
                if (txtidegresado.getText().equals("") || txtsegundonombre.getText().equals("")
                        || txtsegundoapellido.getText().equals("")
                        || cmbestadocivil.getSelectedItem().toString().equals("Seleccione...")
                        || cmbsexo.getSelectedItem().toString().equals("Seleccione...")
                        || cmbtiposanguineo.getSelectedItem().toString().equals("Seleccione...")
                        || jdcfechanacimiento.getDate() == (null)
                        || cmbpaisesnacimiento.getSelectedItem().toString().equals("Seleccione...")
                        || cmbdepartamentosnacimiento.getSelectedItem().toString().equals("Seleccione...")
                        || cmbciudadesnacimiento.getSelectedItem().toString().equals("Seleccione...")
                        || txtdireccionresidencia.getText().equals("")
                        || cmbpaisesubicacion.getSelectedItem().toString().equals("Seleccione...")
                        || cmbdepartamentosubicacion.getSelectedItem().toString().equals("Seleccione...")
                        || cmbciudadesubicacion.getSelectedItem().toString().equals("Seleccione...")
                        || txttelefonoegresado.getText().equals("")
                        || txtcelular.getText().equals("")
                        || txtemail.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Por favor diligenciar todos los datos.");
                } else {
                    EntityManagerFactory emf = Persistence.createEntityManagerFactory("Control_Egresados_JPAPU");
                    EntityManager em = emf.createEntityManager();
                    EntityTransaction et = em.getTransaction();
                    try {
                        int id_egresado = 0;
                        id_egresado = Integer.parseInt(txtidegresado.getText());
                        Egresados egresados = em.find(Egresados.class, id_egresado);
                        egresados.setTipo_Documento(cmbtipodocumento.getSelectedItem().toString());
                        egresados.setPrimer_Nombre(txtprimernombre.getText());
                        egresados.setSegundo_Nombre(txtsegundonombre.getText());
                        egresados.setPrimer_Apellido(txtprimerapellido.getText());
                        egresados.setSegundo_Apellido(txtsegundoapellido.getText());
                        egresados.setSexo(cmbsexo.getSelectedItem().toString().charAt(0));
                        egresados.setEstado_Civil(cmbestadocivil.getSelectedItem().toString());
                        egresados.setTipo_Sanguineo(cmbtiposanguineo.getSelectedItem().toString());

                        String formato = "", fecha_nacimiento = "";
                        Date fecha;
                        SimpleDateFormat dateformat;
                        formato = "dd/MM/yyyy";
                        fecha = jdcfechanacimiento.getDate();
                        dateformat = new SimpleDateFormat(formato);
                        fecha_nacimiento = dateformat.format(fecha);
                        egresados.setFecha_Nacimiento(fecha_nacimiento);

                        TypedQuery<Ciudades> consultaCodCiudad = em.createNamedQuery("consulta_Nombre_Ciudad", Ciudades.class);
                        consultaCodCiudad.setParameter("nombre_Ciudad", cmbciudadesnacimiento.getSelectedItem().toString());
                        List<Ciudades> lista = consultaCodCiudad.getResultList();
                        for (Ciudades a : lista) {
                            egresados.setLugar_Nacimiento_Cod_Ciudad(a.getCodigoCiudad());
                        }

                        egresados.setDireccion_Residencia(txtdireccionresidencia.getText());

                        consultaCodCiudad.setParameter("nombre_Ciudad", cmbciudadesubicacion.getSelectedItem().toString());
                        lista = consultaCodCiudad.getResultList();
                        for (Ciudades a : lista) {
                            egresados.setResidencia_Cod_Ciudad(a.getCodigoCiudad());
                        }

                        egresados.setTelefono(txttelefonoegresado.getText());
                        egresados.setCelular(txtcelular.getText());
                        egresados.setEmail(txtemail.getText());

                        et.begin();
                        em.merge(egresados);
                        et.commit();

                        JOptionPane.showMessageDialog(null, "Los datos han sido actualizados correctamente.");
                        deshabilitar_Campos();
                        btnaceptar.setEnabled(false);
                        btncancelar.setEnabled(false);
                        lblmensaje.setText("Consulta");
                        btnmodificar.setEnabled(true);
                        btnnuevaconsulta.setEnabled(true);
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Error: " + e);
                        Logger.getLogger(Datos_Egresados.class.getName()).log(Level.SEVERE, null, e);
                    } finally {
                        em.close();
                    }

                }
            }
        }
    }//GEN-LAST:event_btnaceptarActionPerformed

    private void btnconsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnconsultarActionPerformed
        // TODO add your handling code here:
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Control_Egresados_JPAPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        if (txtidegresadoc.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Por favor diligenciar el Id del egresado para realizar la consulta");
            txtidegresadoc.requestFocus();
        } else {
            try {
                int id_egresado = Integer.parseInt(txtidegresadoc.getText());
                Egresados egresados = em.find(Egresados.class, id_egresado);
                if (egresados == null) {
                    int seleccion = JOptionPane.showOptionDialog(
                            null,
                            "No hay ningun egresado con el ID " + id_egresado + "\n"
                            + "¿Desea crear un nuevo registro con el Id " + id_egresado + "?",
                            "Selector de opciones",
                            JOptionPane.YES_NO_CANCEL_OPTION,
                            JOptionPane.QUESTION_MESSAGE,
                            null, // null para icono por defecto.
                            new Object[]{"SI", "NO",}, // null para YES, NO y CANCEL
                            "opcion 1");
                    if (seleccion == 0) {
                        btngenerardatosnuevos.doClick();
                    } else if (seleccion == 1) {
                        txtidegresadoc.setText("");
                        txtidegresadoc.requestFocus();
                    }
                } else {

                    txtidegresado.setText(Integer.toString(egresados.getId_Egresado()));
                    cmbtipodocumento.setSelectedItem(egresados.getTipo_Documento());
                    txtprimernombre.setText(egresados.getPrimer_Nombre());
                    txtsegundonombre.setText(egresados.getSegundo_Nombre());
                    txtprimerapellido.setText(egresados.getPrimer_Apellido());
                    txtsegundoapellido.setText(egresados.getSegundo_Apellido());
                    cmbestadocivil.setSelectedItem(egresados.getEstado_Civil());
                    cmbsexo.setSelectedItem(String.valueOf(egresados.getSexo()));
                    cmbtiposanguineo.setSelectedItem(egresados.getTipo_Sanguineo());
                    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
                    Date fecha = null;
                    try {
                        fecha = formato.parse(egresados.getFecha_Nacimiento());
                    } catch (ParseException ex) {
                        Logger.getLogger(Datos_Egresados.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    jdcfechanacimiento.setDate(fecha);

                    int codigo_Ciudad = 0, codigo_Departamento = 0, codigo_Pais = 0;
                    String nombre_Ciudad = "", nombre_Departamento = "", nombre_Pais = "";

                    TypedQuery<Ciudades> consultaCodDepartamento = em.createNamedQuery("consulta_Codigo_Ciudad", Ciudades.class);
                    consultaCodDepartamento.setParameter("codigo_Ciudad", egresados.getLugar_Nacimiento_Cod_Ciudad());
                    List<Ciudades> lista_Ciudades = consultaCodDepartamento.getResultList();
                    for (Ciudades a : lista_Ciudades) {
                        nombre_Ciudad = a.getNombreCiudad();
                        codigo_Departamento = a.getCodigoDepartamento();
                    }

                    TypedQuery<Departamentos> consultaCodPais = em.createNamedQuery("consulta_Codigo_Departamento", Departamentos.class);
                    consultaCodPais.setParameter("codigo_Departamento", codigo_Departamento);
                    List<Departamentos> lista_Departamentos = consultaCodPais.getResultList();
                    for (Departamentos a : lista_Departamentos) {
                        nombre_Departamento = a.getNombreDepartamento();
                        codigo_Pais = a.getCodigoPais();
                    }

                    TypedQuery<Paises> consultaNombrePais = em.createNamedQuery("consulta_Nombre_Pais", Paises.class);
                    consultaNombrePais.setParameter("codigo_Pais", codigo_Pais);
                    List<Paises> lista_Paises = consultaNombrePais.getResultList();
                    for (Paises a : lista_Paises) {
                        nombre_Pais = a.getNombrePais();
                    }

                    cargar_Paises_Nacimiento();
                    cmbpaisesnacimiento.setSelectedItem(nombre_Pais);
                    cargar_Departamentos_Nacimiento();
                    cmbdepartamentosnacimiento.setSelectedItem(nombre_Departamento);
                    cargar_Ciudades_Nacimiento();
                    cmbciudadesnacimiento.setSelectedItem(nombre_Ciudad);

                    consultaCodDepartamento.setParameter("codigo_Ciudad", egresados.getResidencia_Cod_Ciudad());
                    lista_Ciudades = consultaCodDepartamento.getResultList();
                    for (Ciudades a : lista_Ciudades) {
                        nombre_Ciudad = a.getNombreCiudad();
                        codigo_Departamento = a.getCodigoDepartamento();
                    }

                    consultaCodPais.setParameter("codigo_Departamento", codigo_Departamento);
                    lista_Departamentos = consultaCodPais.getResultList();
                    for (Departamentos a : lista_Departamentos) {
                        nombre_Departamento = a.getNombreDepartamento();
                        codigo_Pais = a.getCodigoPais();
                    }

                    consultaNombrePais.setParameter("codigo_Pais", codigo_Pais);
                    lista_Paises = consultaNombrePais.getResultList();
                    for (Paises a : lista_Paises) {
                        nombre_Pais = a.getNombrePais();
                    }

                    txtdireccionresidencia.setText(egresados.getDireccion_Residencia());

                    cargar_Paises_Ubicacion();
                    cmbpaisesubicacion.setSelectedItem(nombre_Pais);
                    cargar_Departamentos_Ubicacion();
                    cmbdepartamentosubicacion.setSelectedItem(nombre_Departamento);
                    cargar_Ciudades_Ubicacion();
                    cmbciudadesubicacion.setSelectedItem(nombre_Ciudad);

                    txttelefonoegresado.setText(egresados.getTelefono());
                    txtcelular.setText(egresados.getCelular());
                    txtemail.setText(egresados.getEmail());
                    txtidegresadoc.setText("");
                    txtidegresadoc.setEditable(false);
                    btnconsultar.setEnabled(false);
                    btnmodificar.setEnabled(true);
                    btnnuevaconsulta.setEnabled(true);
                    txtidegresado.requestFocus();
                    btngenerardatosnuevos.setEnabled(false);
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error: " + e);
                Logger.getLogger(Datos_Egresados.class.getName()).log(Level.SEVERE, null, e);
            } finally {
                em.close();
            }
        }

    }//GEN-LAST:event_btnconsultarActionPerformed

    private void cmbpaisesnacimientoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbpaisesnacimientoItemStateChanged
        // TODO add your handling code here:
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            if (this.cmbpaisesnacimiento.getSelectedIndex() == 0) {
                cmbdepartamentosnacimiento.removeAllItems();
                cmbdepartamentosnacimiento.addItem("Seleccione...");
                cmbciudadesnacimiento.removeAllItems();
                cmbciudadesnacimiento.addItem("Seleccione...");
            }
            if (this.cmbpaisesnacimiento.getSelectedIndex() > 0) {
                cmbdepartamentosnacimiento.removeAllItems();
                cmbdepartamentosnacimiento.addItem("Seleccione...");
                cargar_Departamentos_Nacimiento();
            }
        }

    }//GEN-LAST:event_cmbpaisesnacimientoItemStateChanged

    private void cmbdepartamentosnacimientoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbdepartamentosnacimientoItemStateChanged
        // TODO add your handling code here:
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            if (this.cmbdepartamentosnacimiento.getSelectedIndex() == 0) {
                cmbciudadesnacimiento.removeAllItems();
                cmbciudadesnacimiento.addItem("Seleccione...");
            }
            if (this.cmbdepartamentosnacimiento.getSelectedIndex() > 0) {
                cmbciudadesnacimiento.removeAllItems();
                cmbciudadesnacimiento.addItem("Seleccione...");
                cargar_Ciudades_Nacimiento();
            }
        }

    }//GEN-LAST:event_cmbdepartamentosnacimientoItemStateChanged

    private void btngenerardatosnuevosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btngenerardatosnuevosActionPerformed
        // TODO add your handling code here:

        if (txtidegresadoc.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Por favor diligencia el Id para realizar el nuevo registro.");
            txtidegresadoc.requestFocus();
        } else {
            int id_egresado = 0;
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("Control_Egresados_JPAPU");
            EntityManager em = emf.createEntityManager();
            EntityTransaction et = em.getTransaction();
            id_egresado = Integer.parseInt(txtidegresadoc.getText());
            Egresados egresados = em.find(Egresados.class, id_egresado);
            if (egresados == null) {
                habilitar_Campos();
                txtidegresado.setText(txtidegresadoc.getText());
                txtidegresado.setEditable(false);
                txtidegresadoc.setEditable(false);
                txtidegresadoc.setText("");
                btnconsultar.setEnabled(false);
                btnaceptar.setEnabled(true);
                btncancelar.setEnabled(true);
                btngenerardatosnuevos.setEnabled(false);
                lblmensaje.setText("Nuevo Registro");
                cmbtipodocumento.requestFocus();

                cargar_Paises_Nacimiento();
                cargar_Paises_Ubicacion();
            } else {
                int seleccion = JOptionPane.showOptionDialog(
                        null,
                        "En la base de datos ya hay una Egresado con el Id " + id_egresado + "\n"
                        + "¿Desea realizar la consulta con el Id " + id_egresado + "?",
                        "Selector de opciones",
                        JOptionPane.YES_NO_CANCEL_OPTION,
                        JOptionPane.QUESTION_MESSAGE,
                        null, // null para icono por defecto.
                        new Object[]{"SI", "NO",}, // null para YES, NO y CANCEL
                        "opcion 1");
                if (seleccion == 0) {
                    btnconsultar.doClick();
                } else if (seleccion == 1) {
                    txtidegresadoc.setText("");
                    txtidegresadoc.requestFocus();
                }
            }
        }
    }//GEN-LAST:event_btngenerardatosnuevosActionPerformed

    private void cmbpaisesubicacionItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbpaisesubicacionItemStateChanged
        // TODO add your handling code here:
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            if (this.cmbpaisesubicacion.getSelectedIndex() == 0) {
                cmbdepartamentosubicacion.removeAllItems();
                cmbdepartamentosubicacion.addItem("Seleccione...");
                cmbciudadesubicacion.removeAllItems();
                cmbciudadesubicacion.addItem("Seleccione...");
            }
            if (this.cmbpaisesubicacion.getSelectedIndex() > 0) {
                cmbdepartamentosubicacion.removeAllItems();
                cmbdepartamentosubicacion.addItem("Seleccione...");
                cargar_Departamentos_Ubicacion();
            }
        }
    }//GEN-LAST:event_cmbpaisesubicacionItemStateChanged

    private void cmbdepartamentosubicacionItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbdepartamentosubicacionItemStateChanged
        // TODO add your handling code here:
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            if (this.cmbdepartamentosubicacion.getSelectedIndex() == 0) {
                cmbciudadesubicacion.removeAllItems();
                cmbciudadesubicacion.addItem("Seleccione...");
            }
            if (this.cmbdepartamentosubicacion.getSelectedIndex() > 0) {
                cmbciudadesubicacion.removeAllItems();
                cmbciudadesubicacion.addItem("Seleccione...");
                cargar_Ciudades_Ubicacion();
            }
        }
    }//GEN-LAST:event_cmbdepartamentosubicacionItemStateChanged

    private void btnnuevaconsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnuevaconsultaActionPerformed
        // TODO add your handling code here:
        limpiar_Espacios();
        deshabilitar_Campos();
        txtidegresadoc.setEditable(true);
        txtidegresadoc.requestFocus();
        btnconsultar.setEnabled(true);
        btngenerardatosnuevos.setEnabled(true);
        btnmodificar.setEnabled(false);
        btnnuevaconsulta.setEnabled(false);
        lblmensaje.setText("Consulta");
    }//GEN-LAST:event_btnnuevaconsultaActionPerformed

    private void btncancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelarActionPerformed
        // TODO add your handling code here:
        switch (lblmensaje.getText()) {
            case "Nuevo Registro": {
                deshabilitar_Campos();
                limpiar_Espacios();
                txtidegresadoc.setEditable(true);
                btnconsultar.setEnabled(true);
                btnaceptar.setEnabled(false);
                btncancelar.setEnabled(false);
                lblmensaje.setText("Consulta");
                txtidegresadoc.requestFocus();
                break;
            }
            case "Modificar Registro": {
                deshabilitar_Campos();
                int id_egresado = Integer.parseInt(txtidegresado.getText());
                EntityManagerFactory emf = Persistence.createEntityManagerFactory("Control_Egresados_JPAPU");
                EntityManager em = emf.createEntityManager();
                EntityTransaction et = em.getTransaction();
                try {
                    Egresados egresados = em.find(Egresados.class, id_egresado);
                    txtidegresado.setText(Integer.toString(egresados.getId_Egresado()));
                    cmbtipodocumento.setSelectedItem(egresados.getTipo_Documento());
                    txtprimernombre.setText(egresados.getPrimer_Nombre());
                    txtsegundonombre.setText(egresados.getSegundo_Nombre());
                    txtprimerapellido.setText(egresados.getPrimer_Apellido());
                    txtsegundoapellido.setText(egresados.getSegundo_Apellido());
                    cmbestadocivil.setSelectedItem(egresados.getEstado_Civil());
                    cmbsexo.setSelectedItem(egresados.getSexo());
                    cmbtiposanguineo.setSelectedItem(egresados.getTipo_Sanguineo());
                    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
                    Date fecha = null;
                    try {
                        fecha = formato.parse(egresados.getFecha_Nacimiento());
                    } catch (ParseException ex) {
                        Logger.getLogger(Datos_Egresados.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    jdcfechanacimiento.setDate(fecha);

                    int codigo_Ciudad = 0, codigo_Departamento = 0, codigo_Pais = 0;
                    String nombre_Ciudad = "", nombre_Departamento = "", nombre_Pais = "";

                    TypedQuery<Ciudades> consultaCodDepartamento = em.createNamedQuery("consulta_Codigo_Ciudad", Ciudades.class);
                    consultaCodDepartamento.setParameter("codigo_Ciudad", egresados.getLugar_Nacimiento_Cod_Ciudad());
                    List<Ciudades> lista_Ciudades = consultaCodDepartamento.getResultList();
                    for (Ciudades a : lista_Ciudades) {
                        nombre_Ciudad = a.getNombreCiudad();
                        codigo_Departamento = a.getCodigoDepartamento();
                    }

                    TypedQuery<Departamentos> consultaCodPais = em.createNamedQuery("consulta_Codigo_Departamento", Departamentos.class);
                    consultaCodPais.setParameter("codigo_Departamento", codigo_Departamento);
                    List<Departamentos> lista_Departamentos = consultaCodPais.getResultList();
                    for (Departamentos a : lista_Departamentos) {
                        nombre_Departamento = a.getNombreDepartamento();
                        codigo_Pais = a.getCodigoPais();
                    }

                    TypedQuery<Paises> consultaNombrePais = em.createNamedQuery("consulta_Nombre_Pais", Paises.class);
                    consultaNombrePais.setParameter("codigo_Pais", codigo_Pais);
                    List<Paises> lista_Paises = consultaNombrePais.getResultList();
                    for (Paises a : lista_Paises) {
                        nombre_Pais = a.getNombrePais();
                    }

                    cargar_Paises_Nacimiento();
                    cmbpaisesnacimiento.setSelectedItem(nombre_Pais);
                    cargar_Departamentos_Nacimiento();
                    cmbdepartamentosnacimiento.setSelectedItem(nombre_Departamento);
                    cargar_Ciudades_Nacimiento();
                    cmbciudadesnacimiento.setSelectedItem(nombre_Ciudad);

                    consultaCodDepartamento.setParameter("codigo_Ciudad", egresados.getResidencia_Cod_Ciudad());
                    lista_Ciudades = consultaCodDepartamento.getResultList();
                    for (Ciudades a : lista_Ciudades) {
                        nombre_Ciudad = a.getNombreCiudad();
                        codigo_Departamento = a.getCodigoDepartamento();
                    }

                    consultaCodPais.setParameter("codigo_Departamento", codigo_Departamento);
                    lista_Departamentos = consultaCodPais.getResultList();
                    for (Departamentos a : lista_Departamentos) {
                        nombre_Departamento = a.getNombreDepartamento();
                        codigo_Pais = a.getCodigoPais();
                    }

                    consultaNombrePais.setParameter("codigo_Pais", codigo_Pais);
                    lista_Paises = consultaNombrePais.getResultList();
                    for (Paises a : lista_Paises) {
                        nombre_Pais = a.getNombrePais();
                    }

                    txtdireccionresidencia.setText(egresados.getDireccion_Residencia());

                    cargar_Paises_Ubicacion();
                    cmbpaisesubicacion.setSelectedItem(nombre_Pais);
                    cargar_Departamentos_Ubicacion();
                    cmbdepartamentosubicacion.setSelectedItem(nombre_Departamento);
                    cargar_Ciudades_Ubicacion();
                    cmbciudadesubicacion.setSelectedItem(nombre_Ciudad);

                    txttelefonoegresado.setText(egresados.getTelefono());
                    txtcelular.setText(egresados.getCelular());
                    txtemail.setText(egresados.getEmail());

                    btnaceptar.setEnabled(false);
                    btncancelar.setEnabled(false);
                    lblmensaje.setText("Consulta");
                    btnmodificar.setEnabled(true);
                    btnnuevaconsulta.setEnabled(true);
                    btnmodificar.requestFocus();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Error: " + e);
                    Logger.getLogger(Datos_Egresados.class.getName()).log(Level.SEVERE, null, e);
                } finally {
                    em.close();
                }

                break;
            }
        }
    }//GEN-LAST:event_btncancelarActionPerformed

    private void txtidegresadocKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtidegresadocKeyTyped
        // TODO add your handling code here:
        car = evt.getKeyChar();
        if (car == KeyEvent.VK_ENTER) {
            btnconsultar.doClick();
        }
        if (((car < '0') || (car > '9'))) {
            evt.consume();
        }
    }//GEN-LAST:event_txtidegresadocKeyTyped

    private void txtprimernombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtprimernombreKeyReleased
        // TODO add your handling code here:
        cadena = (txtprimernombre.getText()).toUpperCase();
        txtprimernombre.setText(cadena);
    }//GEN-LAST:event_txtprimernombreKeyReleased

    private void txtsegundonombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsegundonombreKeyReleased
        // TODO add your handling code here:
        cadena = (txtsegundonombre.getText()).toUpperCase();
        txtsegundonombre.setText(cadena);
    }//GEN-LAST:event_txtsegundonombreKeyReleased

    private void txtprimerapellidoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtprimerapellidoKeyReleased
        // TODO add your handling code here:
        cadena = (txtprimerapellido.getText()).toUpperCase();
        txtprimerapellido.setText(cadena);
    }//GEN-LAST:event_txtprimerapellidoKeyReleased

    private void txtsegundoapellidoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsegundoapellidoKeyReleased
        // TODO add your handling code here:
        cadena = (txtsegundoapellido.getText()).toUpperCase();
        txtsegundoapellido.setText(cadena);
    }//GEN-LAST:event_txtsegundoapellidoKeyReleased

    private void txtdireccionresidenciaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdireccionresidenciaKeyReleased
        // TODO add your handling code here:
        cadena = (txtdireccionresidencia.getText()).toUpperCase();
        txtdireccionresidencia.setText(cadena);
    }//GEN-LAST:event_txtdireccionresidenciaKeyReleased

    private void txtcelularKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcelularKeyTyped
        // TODO add your handling code here:
        if (((car < '0') || (car > '9'))) {
            evt.consume();
        }
    }//GEN-LAST:event_txtcelularKeyTyped

    private void txttelefonoegresadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttelefonoegresadoKeyTyped
        // TODO add your handling code here:
        if (((car < '0') || (car > '9'))) {
            evt.consume();
        }
    }//GEN-LAST:event_txttelefonoegresadoKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnaceptar;
    public javax.swing.JButton btncancelar;
    public javax.swing.JButton btnconsultar;
    public javax.swing.JButton btngenerardatosnuevos;
    private javax.swing.ButtonGroup btngestudio;
    private javax.swing.ButtonGroup btngtrabajo;
    public javax.swing.JButton btnmodificar;
    public javax.swing.JButton btnnuevaconsulta;
    public javax.swing.JComboBox cmbciudadesnacimiento;
    public javax.swing.JComboBox cmbciudadesubicacion;
    public javax.swing.JComboBox cmbdepartamentosnacimiento;
    public javax.swing.JComboBox cmbdepartamentosubicacion;
    public javax.swing.JComboBox cmbestadocivil;
    public javax.swing.JComboBox cmbpaisesnacimiento;
    public javax.swing.JComboBox cmbpaisesubicacion;
    public javax.swing.JComboBox cmbsexo;
    public javax.swing.JComboBox cmbtipodocumento;
    public javax.swing.JComboBox cmbtiposanguineo;
    private javax.swing.JScrollPane jScrollPane1;
    public com.toedter.calendar.JDateChooser jdcfechanacimiento;
    private javax.swing.JLabel lblcelular;
    private javax.swing.JLabel lblciudadnacimiento;
    private javax.swing.JLabel lblciudadubicacion;
    private javax.swing.JLabel lblcorreoegresado;
    private javax.swing.JLabel lbldatospersonales;
    private javax.swing.JLabel lbldatosubicacion;
    private javax.swing.JLabel lbldepartamentonacimiento;
    private javax.swing.JLabel lbldepartamentoubicacion;
    private javax.swing.JLabel lbldireccionresidencia;
    private javax.swing.JLabel lblestadocivil;
    private javax.swing.JLabel lblfechanacimiento;
    private javax.swing.JLabel lblidegresado;
    private javax.swing.JLabel lblidegresadoc;
    public javax.swing.JLabel lblmensaje;
    private javax.swing.JLabel lblnacimiento;
    private javax.swing.JLabel lblpaisnacimiento;
    private javax.swing.JLabel lblpaisubicacion;
    private javax.swing.JLabel lblprimerapellido;
    private javax.swing.JLabel lblprimernombre;
    private javax.swing.JLabel lblsegundoapellido;
    private javax.swing.JLabel lblsegundonombre;
    private javax.swing.JLabel lblsexo;
    private javax.swing.JLabel lbltelefonoegresado;
    private javax.swing.JLabel lbltipodocumento;
    private javax.swing.JLabel lbltiposanguineo;
    private javax.swing.JPanel pnlAceptar;
    private javax.swing.JPanel pnlBotones;
    private javax.swing.JPanel pnlConsulta;
    private javax.swing.JPanel pnlDatos;
    private javax.swing.JPanel pnlPral;
    private javax.swing.JPanel pnlSecundario;
    public javax.swing.JTextField txtcelular;
    public javax.swing.JTextField txtdireccionresidencia;
    public javax.swing.JTextField txtemail;
    public javax.swing.JTextField txtidegresado;
    public javax.swing.JTextField txtidegresadoc;
    public javax.swing.JTextField txtprimerapellido;
    public javax.swing.JTextField txtprimernombre;
    public javax.swing.JTextField txtsegundoapellido;
    public javax.swing.JTextField txtsegundonombre;
    public javax.swing.JTextField txttelefonoegresado;
    // End of variables declaration//GEN-END:variables
}
