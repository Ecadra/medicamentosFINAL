/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaces;

import Implementaciones.ContenidoRecetaImplementacion;
import Modelos.ContRec;
import Modelos.MedFinal;
import java.lang.ProcessHandle.Info;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.YES_NO_OPTION;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author admin
 */
public class InterfazContReceta extends javax.swing.JFrame {
    DefaultTableModel model,modelMed, modelRec;
    ContenidoRecetaImplementacion contImp = new ContenidoRecetaImplementacion();
    ContRec contRec = new ContRec();
    MedFinal medFinal = new MedFinal();
    public InterfazContReceta() {
        initComponents();
        model=(DefaultTableModel)tblContRec.getModel();
        modelMed=(DefaultTableModel)tblMedFinal.getModel();
        modelRec=(DefaultTableModel)tblReceta.getModel();
       CrearTablaContRec();
       CrearTablaMedFinal();
       CrearTablaReceta();
       txtMedIns.setEditable(false);
        txtRecetaIns.setEditable(false);
        txtDosisDel.setEditable(false);
        cmbDescripcionDel.setEnabled(false);
        txtMedDel.setEditable(false);
        txtHorasDel.setEditable(false);
        txtDiasDel.setEditable(false);
        txtRecetaDel.setEditable(false);
    }

    public void CrearTablaContRec() 
    {
       
        model.setRowCount(0);//reinicar las filas de la tabla
        try {        
            contImp.rellenarTablaContRec(model);
        } catch (Exception ex) {
            Logger.getLogger(InterfazContReceta.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public void CrearTablaMedFinal()
    {
        modelMed.setRowCount(0);//reiniciar las filas de la tabla
        try {
            contImp.rellenarTablaMedFinal(modelMed);
        } catch (Exception ex) {
            Logger.getLogger(InterfazContReceta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void CrearTablaReceta(){
        modelRec.setRowCount(0);
        
        try {
            contImp.rellenarTablaRec(modelRec);
        } catch (Exception ex) {
            Logger.getLogger(InterfazContReceta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void CrearTablaBuscarMedFinal(String busqueda) throws Exception
    {
        modelMed.setRowCount(0);
        
  
        contImp.buscarMedFinal(modelMed, cmbBuscarMed.getSelectedIndex(), busqueda);
        
    }
 private void CrearTablaBuscarContRec(String busqueda) throws Exception
    {
        model.setRowCount(0);
        
  
        contImp.buscarContRec(model, cmbBuscarContRec.getSelectedIndex(), busqueda);
        
    }
    @SuppressWarnings("unchecked")
     private void CrearTablaBuscarRec(String busqueda) throws Exception
    {
        modelRec.setRowCount(0);
        
  
        contImp.buscarRec(modelRec, cmbBuscarRec.getSelectedIndex(), busqueda);
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        TabbedPaneReceta = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtDosisIns = new javax.swing.JTextField();
        cmbDescripcionIns = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        txtHorasIns = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtDiasIns = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtMedIns = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtRecetaIns = new javax.swing.JTextField();
        btnInsertar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtDosisAct = new javax.swing.JTextField();
        cmbDescripcionAct = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        txtMedAct = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtHorasAct = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtDiasAct = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtRecetaAct = new javax.swing.JTextField();
        btnActualizar = new javax.swing.JButton();
        btnCancelarAct = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        txtDosisDel = new javax.swing.JTextField();
        cmbDescripcionDel = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        txtMedDel = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtHorasDel = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtDiasDel = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtRecetaDel = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        btnCancelarDel = new javax.swing.JButton();
        PanelBuscarContRec = new javax.swing.JPanel();
        txtBuscarContRec = new javax.swing.JTextField();
        cmbBuscarContRec = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblContRec = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        txtBuscarMed = new javax.swing.JTextField();
        cmbBuscarMed = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblMedFinal = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        txtBuscarRec = new javax.swing.JTextField();
        cmbBuscarRec = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblReceta = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "Indicaciones del médico"));

        jLabel1.setText("Se debe administrar");

        cmbDescripcionIns.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TABLETA(S)", "MILIGRAMO(S)", "MILILITRO(S)", " " }));

        jLabel2.setText("cada");

        jLabel3.setText("horas por");

        txtDiasIns.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDiasInsActionPerformed(evt);
            }
        });

        jLabel4.setText("días. ");

        jLabel5.setText("del medicamento con el identificador");

        txtMedIns.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMedInsActionPerformed(evt);
            }
        });

        jLabel6.setText("Esta indicación pertenece a la receta número");

        txtRecetaIns.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRecetaInsActionPerformed(evt);
            }
        });

        btnInsertar.setText("Insertar");
        btnInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarActionPerformed(evt);
            }
        });

        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtRecetaIns, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDosisIns, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cmbDescripcionIns, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMedIns, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(txtHorasIns, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDiasIns, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(145, 145, 145))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(btnInsertar, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtDosisIns, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbDescripcionIns, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel2)
                    .addComponent(txtHorasIns, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtDiasIns, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtMedIns, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtRecetaIns, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInsertar)
                    .addComponent(jButton2))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        TabbedPaneReceta.addTab("Insertar", jPanel3);

        jLabel7.setText("Se debe administrar");

        txtDosisAct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDosisActActionPerformed(evt);
            }
        });

        cmbDescripcionAct.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TABLETA(S)", "MILIGRAMO(S)", "MILILITRO(S)" }));

        jLabel8.setText("del medicamento con el identificador");

        txtMedAct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMedActActionPerformed(evt);
            }
        });

        jLabel9.setText("cada");

        jLabel10.setText("horas por");

        txtDiasAct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDiasActActionPerformed(evt);
            }
        });

        jLabel11.setText("días. ");

        jLabel12.setText("Esta indicación pertenece a la receta número");

        txtRecetaAct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRecetaActActionPerformed(evt);
            }
        });

        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnCancelarAct.setText("Cancelar");
        btnCancelarAct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtRecetaAct, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(0, 16, Short.MAX_VALUE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDosisAct, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cmbDescripcionAct, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMedAct, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addComponent(txtHorasAct, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDiasAct, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(145, 145, 145))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnCancelarAct, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(66, 66, 66))))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtDosisAct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbDescripcionAct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(txtHorasAct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(txtDiasAct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(txtMedAct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtRecetaAct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnActualizar)
                    .addComponent(btnCancelarAct))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        TabbedPaneReceta.addTab("Actualizar", jPanel4);

        jLabel13.setText("Se debe administrar");

        cmbDescripcionDel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TABLETA(S)", "MILIGRAMO(S)", "MILILITRO(S)" }));

        jLabel14.setText("del medicamento con el identificador");

        txtMedDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMedDelActionPerformed(evt);
            }
        });

        jLabel15.setText("cada");

        jLabel16.setText("horas por");

        txtDiasDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDiasDelActionPerformed(evt);
            }
        });

        jLabel17.setText("días. ");

        jLabel18.setText("Esta indicación pertenece a la receta número");

        txtRecetaDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRecetaDelActionPerformed(evt);
            }
        });

        jButton5.setText("Eliminar");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });

        btnCancelarDel.setText("Cancelar");
        btnCancelarDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarDelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtRecetaDel, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(743, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtDosisDel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmbDescripcionDel, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMedDel, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addComponent(txtHorasDel, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDiasDel, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(145, 145, 145))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnCancelarDel, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(66, 66, 66))))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtDosisDel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbDescripcionDel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15)
                    .addComponent(txtHorasDel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(txtDiasDel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(txtMedDel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(txtRecetaDel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5)
                    .addComponent(btnCancelarDel))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        TabbedPaneReceta.addTab("Eliminar", jPanel5);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TabbedPaneReceta)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TabbedPaneReceta, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        TabbedPaneReceta.getAccessibleContext().setAccessibleName("");

        PanelBuscarContRec.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "Buscar una Indicación"));

        txtBuscarContRec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarContRecActionPerformed(evt);
            }
        });
        txtBuscarContRec.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarContRecKeyReleased(evt);
            }
        });

        cmbBuscarContRec.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Por identicador", "Por número de receta", "Por número de medicamento" }));

        javax.swing.GroupLayout PanelBuscarContRecLayout = new javax.swing.GroupLayout(PanelBuscarContRec);
        PanelBuscarContRec.setLayout(PanelBuscarContRecLayout);
        PanelBuscarContRecLayout.setHorizontalGroup(
            PanelBuscarContRecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBuscarContRecLayout.createSequentialGroup()
                .addGap(171, 171, 171)
                .addComponent(cmbBuscarContRec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtBuscarContRec, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelBuscarContRecLayout.setVerticalGroup(
            PanelBuscarContRecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBuscarContRecLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelBuscarContRecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscarContRec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbBuscarContRec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tblContRec.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tblContRec.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Identificador", "Dosis", "Unidad", "Intervalo(Hrs)", "Días", "Cant. Medicamento", "Tipo", "# de Receta", "# de Medicamento"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblContRec.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblContRecMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblContRec);

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "Buscar Medicamento"));

        txtBuscarMed.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarMedKeyReleased(evt);
            }
        });

        cmbBuscarMed.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Por identificador", "Por presentación", "Por medicamento" }));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(261, 261, 261)
                .addComponent(cmbBuscarMed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtBuscarMed, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscarMed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbBuscarMed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        tblMedFinal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Número de Caja", "Descripción General", "Cantidad", "Unidad de Medicina", "Presentación", "Medicamentos"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblMedFinal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMedFinalMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblMedFinal);

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "Buscar Receta"));

        txtBuscarRec.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarRecKeyReleased(evt);
            }
        });

        cmbBuscarRec.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Número de Receta", "Número de Paciente", "Número de Médico" }));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(cmbBuscarRec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtBuscarRec, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(109, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscarRec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbBuscarRec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        tblReceta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Número Receta", "Fecha", "# Paciente", "# Médico"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblReceta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblRecetaMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblReceta);

        jButton1.setText("Regresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)

                    .addComponent(PanelBuscarContRec, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jButton1))
                    .addComponent(jScrollPane2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelBuscarContRec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3)
                .addGap(7, 7, 7))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDiasInsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiasInsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDiasInsActionPerformed

    private void txtMedInsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMedInsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMedInsActionPerformed

    private void txtRecetaInsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRecetaInsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRecetaInsActionPerformed

    private void txtMedActActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMedActActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMedActActionPerformed

    private void txtDiasActActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiasActActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDiasActActionPerformed

    private void txtRecetaActActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRecetaActActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRecetaActActionPerformed

    private void txtMedDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMedDelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMedDelActionPerformed

    private void txtDiasDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiasDelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDiasDelActionPerformed

    private void txtRecetaDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRecetaDelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRecetaDelActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        int medicina=0, dosis=0,horas=0,dias=0,receta=0;
      
        boolean error=false;

 ////////////////////////////Cantidad de la dosis/////////////////////////77777777       
        if("".equals(txtDosisAct.getText()))
        {
            JOptionPane.showMessageDialog(null, "Debe de especificar la dosis de administración","Error",0);
            error=true; 
        }else{
            try{
               dosis = Integer.parseInt(txtDosisAct.getText());
               if(dosis<=0){
                  JOptionPane.showMessageDialog(null, "La cantidad de las dosis debe de ser mayor a 0","Error",0);
                 error=true;
                 txtDosisAct.setText("");
               }
           }catch(NumberFormatException err){
             JOptionPane.showMessageDialog(null, "La cantidad de las dosis debe de ser un número","Error",0);
             error=true; 
             txtDosisAct.setText("");
           }
       }
/////////////////////////Identificador del medicamento final/////////////////////////
        if("".equals(txtMedAct.getText()))
        {
            JOptionPane.showMessageDialog(null, "Debe de elegir un medicamento de la tabla","Error",0);
             error=true; 
        }else{
            medicina=Integer.parseInt(txtMedAct.getText());
            contRec.setIdMedicamento(medicina);
        }
/////////////////////////Horas////////////////////////////////////////////////////////////////////     
        if("".equals(txtHorasAct.getText()))
        {
            JOptionPane.showMessageDialog(null, "Debe de especificar el intervalo de horas de la administración","Error",0);
             error=true; 
        }else{
            try{
               horas = Integer.parseInt(txtHorasAct.getText());
               if(horas<=0){
                  JOptionPane.showMessageDialog(null, "La cantidad de las horas debe de ser mayor a 0","Error",0);
                 error=true; 
                 txtHorasAct.setText("");
               }

           }catch(NumberFormatException err){
             JOptionPane.showMessageDialog(null, "La cantidad de las dosis debe de ser un número","Error",0);
             error=true; 
             txtHorasAct.setText("");
           }
       }
/////////////////////Dias////////////////////////////////////////////////////////////////////////////////// 
         if("".equals(txtDiasAct.getText()))
        {
            JOptionPane.showMessageDialog(null, "Debe de especificar los días de la administración","Error",0);
             error=true; 
        }else{
            try{
               dias= Integer.parseInt(txtDiasAct.getText());
               if(horas<=0){
                  JOptionPane.showMessageDialog(null, "La cantidad de las días debe de ser mayor a 0","Error",0);
                 error=true; 
                  txtDiasAct.setText("");
               }

           }catch(NumberFormatException err){
             JOptionPane.showMessageDialog(null, "La cantidad de las días debe de ser un número","Error",0);
             error=true; 
              txtDiasAct.setText("");
           }
       }
 ///////////////////////////Receta////////////////////////////////////////////////////////////////////////////
        if("".equals(txtRecetaAct.getText()))
        {
            JOptionPane.showMessageDialog(null, "Debe de elegir una receta de la tabla","Error",0);
             error=true; 
        }else{
            receta=Integer.parseInt(txtRecetaAct.getText());
            contRec.setIdReceta(receta);
        }
  /////////////////////////////////////////////////////////////////////////////////////////////////////////////
        try {
            if(contImp.validarRelacion(contRec)==true)
            { 
             int n=JOptionPane.showConfirmDialog(null, "Ya ha dado de alta el medicamento "+contRec.getIdMedicamento()+ " en la receta número "+contRec.getIdReceta() +"\n ¿Desea continuar? ","Informacion",JOptionPane.YES_NO_OPTION);
             if(n==JOptionPane.NO_OPTION)
             {
                 error=true;
                 
             }
            }
        } catch (Exception ex) {
            Logger.getLogger(InterfazContReceta.class.getName()).log(Level.SEVERE, null, ex);
        }
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
         if(error!=true){
          contRec.setIdContenido((Integer.parseInt(tblContRec.getValueAt(tblContRec.getSelectedRow(),0).toString())));
          contRec.setDosis(dosis);
          contRec.setIntervalo(horas);
          contRec.setDias(dias);
          contRec.setDescripcion((String) cmbDescripcionAct.getSelectedItem());
          
            try {
                contImp.actualizarConRec(contRec);
            } catch (Exception ex) {
                Logger.getLogger(InterfazContReceta.class.getName()).log(Level.SEVERE, null, ex);
            }
            txtDosisDel.setText("");
            txtMedDel.setText("");
            txtHorasDel.setText("");
            txtDiasDel.setText("");
            txtRecetaDel.setText("");
            txtDosisAct.setText("");
            txtMedAct.setText("");
            txtHorasAct.setText("");
            txtDiasAct.setText("");
            txtRecetaAct.setText("");
            CrearTablaContRec();
            
      }
        
        
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarActionPerformed
        int medicina=0, dosis=0,horas=0,dias=0,receta=0;
      
        boolean error=false;

 ////////////////////////////Cantidad de la dosis/////////////////////////77777777       
        if("".equals(txtDosisIns.getText()))
        {
            JOptionPane.showMessageDialog(null, "Debe de especificar la dosis de administración","Error",0);
            error=true; 
        }else{
            try{
               dosis = Integer.parseInt(txtDosisIns.getText());
               if(dosis<=0){
                  JOptionPane.showMessageDialog(null, "La cantidad de las dosis debe de ser mayor a 0","Error",0);
                 error=true;
                 txtDosisIns.setText("");
               }
           }catch(NumberFormatException err){
             JOptionPane.showMessageDialog(null, "La cantidad de las dosis debe de ser un número","Error",0);
             error=true; 
             txtDosisIns.setText("");
           }
       }
/////////////////////////Identificador del medicamento final/////////////////////////
        if("".equals(txtMedIns.getText()))
        {
            JOptionPane.showMessageDialog(null, "Debe de elegir un medicamento de la tabla","Error",0);
             error=true; 
        }else{
            medicina=Integer.parseInt(txtMedIns.getText());
            contRec.setIdMedicamento(medicina);
        }
/////////////////////////Horas////////////////////////////////////////////////////////////////////     
        if("".equals(txtHorasIns.getText()))
        {
            JOptionPane.showMessageDialog(null, "Debe de especificar el intervalo de horas de la administración","Error",0);
             error=true; 
        }else{
            try{
               horas = Integer.parseInt(txtHorasIns.getText());
               if(horas<=0){
                  JOptionPane.showMessageDialog(null, "La cantidad de las horas debe de ser mayor a 0","Error",0);
                 error=true; 
                 txtHorasIns.setText("");
               }

           }catch(NumberFormatException err){
             JOptionPane.showMessageDialog(null, "La cantidad de las dosis debe de ser un número","Error",0);
             error=true; 
             txtHorasIns.setText("");
           }
       }
/////////////////////Dias////////////////////////////////////////////////////////////////////////////////// 
         if("".equals(txtDiasIns.getText()))
        {
            JOptionPane.showMessageDialog(null, "Debe de especificar los días de la administración","Error",0);
             error=true; 
        }else{
            try{
               dias= Integer.parseInt(txtDiasIns.getText());
               if(horas<=0){
                  JOptionPane.showMessageDialog(null, "La cantidad de las días debe de ser mayor a 0","Error",0);
                 error=true; 
                  txtDiasIns.setText("");
               }

           }catch(NumberFormatException err){
             JOptionPane.showMessageDialog(null, "La cantidad de las días debe de ser un número","Error",0);
             error=true; 
              txtDiasIns.setText("");
           }
       }
 ///////////////////////////Receta////////////////////////////////////////////////////////////////////////////
        if("".equals(txtRecetaIns.getText()))
        {
            JOptionPane.showMessageDialog(null, "Debe de elegir una receta de la tabla","Error",0);
             error=true; 
        }else{
            receta=Integer.parseInt(txtRecetaIns.getText());
            contRec.setIdReceta(receta);
        }
  /////////////////////////////////////////////////////////////////////////////////////////////////////////////
        
        try {
            if(contImp.validarRelacion(contRec)==true)
            {
                JOptionPane.showMessageDialog(null, "Ya ha dado de alta el medicamento "+contRec.getIdMedicamento()+ " en la receta número "+contRec.getIdReceta(),"Error",0);
                error=true;
            }
        } catch (Exception ex) {
            Logger.getLogger(InterfazContReceta.class.getName()).log(Level.SEVERE, null, ex);
        }
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////        
      if(error!=true){
          contRec.setDosis(dosis);
          contRec.setIntervalo(horas);
          contRec.setDias(dias);
          contRec.setDescripcion((String) cmbDescripcionIns.getSelectedItem());
          
            try {
                contImp.agregarConRec(contRec);
            } catch (Exception ex) {
                Logger.getLogger(InterfazContReceta.class.getName()).log(Level.SEVERE, null, ex);
            }
            txtDosisIns.setText("");
            txtMedIns.setText("");
            txtHorasIns.setText("");
            txtDiasIns.setText("");
            txtRecetaIns.setText("");
            CrearTablaContRec();
      }
      
 
    }//GEN-LAST:event_btnInsertarActionPerformed

    private void tblRecetaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblRecetaMouseClicked
        txtRecetaIns.setText((String) tblReceta.getValueAt(tblReceta.getSelectedRow(),0));
    }//GEN-LAST:event_tblRecetaMouseClicked

    private void tblMedFinalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMedFinalMouseClicked
        txtMedIns.setText((String) tblMedFinal.getValueAt(tblMedFinal.getSelectedRow(),0));
        txtMedAct.setText((String) tblMedFinal.getValueAt(tblMedFinal.getSelectedRow(),0));
    }//GEN-LAST:event_tblMedFinalMouseClicked

    private void txtDosisActActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDosisActActionPerformed
        
    }//GEN-LAST:event_txtDosisActActionPerformed

    private void tblContRecMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblContRecMouseClicked
        

        txtDosisAct.setText((String) tblContRec.getValueAt(tblContRec.getSelectedRow(), 1));
        cmbDescripcionAct.setSelectedItem((String) tblContRec.getValueAt(tblContRec.getSelectedRow(), 2));
        txtMedAct.setText((String) tblContRec.getValueAt(tblContRec.getSelectedRow(), 8));
        txtHorasAct.setText((String) tblContRec.getValueAt(tblContRec.getSelectedRow(), 3));
        txtDiasAct.setText((String) tblContRec.getValueAt(tblContRec.getSelectedRow(), 4));
        txtRecetaAct.setText((String) tblContRec.getValueAt(tblContRec.getSelectedRow(), 7));
        
        
        txtDosisDel.setText((String) tblContRec.getValueAt(tblContRec.getSelectedRow(), 1));
        cmbDescripcionDel.setSelectedItem((String) tblContRec.getValueAt(tblContRec.getSelectedRow(), 2));
        txtMedDel.setText((String) tblContRec.getValueAt(tblContRec.getSelectedRow(), 8));
        txtHorasDel.setText((String) tblContRec.getValueAt(tblContRec.getSelectedRow(), 3));
        txtDiasDel.setText((String) tblContRec.getValueAt(tblContRec.getSelectedRow(), 4));
        txtRecetaDel.setText((String) tblContRec.getValueAt(tblContRec.getSelectedRow(), 7)); 
        
    }//GEN-LAST:event_tblContRecMouseClicked

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        if("".equals(txtDosisDel.getText())|| "".equals(txtMedDel.getText()) ||"".equals(txtHorasDel.getText()) || "".equals(txtDiasDel.getText()) || "".equals(txtRecetaDel.getText()))
        {
              JOptionPane.showMessageDialog(null, "Debe de seleccionar un resgistro de la tabla Indicadiones para continuar","Error",0);
        }else{
            contRec.setIdContenido((Integer.parseInt(tblContRec.getValueAt(tblContRec.getSelectedRow(),0).toString())));
            System.out.println(contRec.getIdContenido());
            try {
                contImp.eliminarConRec(contRec);
            } catch (Exception ex) {
                Logger.getLogger(InterfazContReceta.class.getName()).log(Level.SEVERE, null, ex);
            }
            txtDosisDel.setText("");
            txtMedDel.setText("");
            txtHorasDel.setText("");
            txtDiasDel.setText("");
            txtRecetaDel.setText("");
            txtDosisAct.setText("");
            txtMedAct.setText("");
            txtHorasAct.setText("");
            txtDiasAct.setText("");
            txtRecetaAct.setText("");
            CrearTablaContRec();
            
        }
    }//GEN-LAST:event_jButton5MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //this.setVisible(false);
        //new Home().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtBuscarMedKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarMedKeyReleased
       
        try {
            CrearTablaBuscarMedFinal(txtBuscarMed.getText());
        } catch (Exception ex) {
            Logger.getLogger(InterfazContReceta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_txtBuscarMedKeyReleased

  private void txtBuscarContRecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarContRecActionPerformed
       
    }//GEN-LAST:event_txtBuscarContRecActionPerformed

    private void txtBuscarContRecKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarContRecKeyReleased
        try {
            CrearTablaBuscarContRec(txtBuscarContRec.getText());
        } catch (Exception ex) {
            Logger.getLogger(InterfazContReceta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_txtBuscarContRecKeyReleased

    private void txtBuscarRecKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarRecKeyReleased
        try {
            CrearTablaBuscarRec(txtBuscarRec.getText());
        } catch (Exception ex) {
            Logger.getLogger(InterfazContReceta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_txtBuscarRecKeyReleased

    private void btnCancelarActActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActActionPerformed
            txtDosisDel.setText("");
            txtMedDel.setText("");
            txtHorasDel.setText("");
            txtDiasDel.setText("");
            txtRecetaDel.setText("");
            txtDosisAct.setText("");
            txtMedAct.setText("");
            txtHorasAct.setText("");
            txtDiasAct.setText("");
            txtRecetaAct.setText("");
            tblContRec.clearSelection();
    }//GEN-LAST:event_btnCancelarActActionPerformed

    private void btnCancelarDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarDelActionPerformed
            txtDosisDel.setText("");
            txtMedDel.setText("");
            txtHorasDel.setText("");
            txtDiasDel.setText("");
            txtRecetaDel.setText("");
            txtDosisAct.setText("");
            txtMedAct.setText("");
            txtHorasAct.setText("");
            txtDiasAct.setText("");
            txtRecetaAct.setText("");
            tblContRec.clearSelection();
    }//GEN-LAST:event_btnCancelarDelActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
            txtDosisIns.setText("");
            txtMedIns.setText("");
            txtHorasIns.setText("");
            txtDiasIns.setText("");
            txtRecetaIns.setText("");
            tblMedFinal.clearSelection();
            tblReceta.clearSelection();
    }//GEN-LAST:event_jButton2ActionPerformed
///////////////////////////////////////////////////////////////////////////
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
            java.util.logging.Logger.getLogger(InterfazContReceta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazContReceta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazContReceta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazContReceta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazContReceta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelBuscarContRec;
    private javax.swing.JTabbedPane TabbedPaneReceta;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnCancelarAct;
    private javax.swing.JButton btnCancelarDel;
    private javax.swing.JButton btnInsertar;
    private javax.swing.JComboBox<String> cmbBuscarContRec;
    private javax.swing.JComboBox<String> cmbBuscarMed;
    private javax.swing.JComboBox<String> cmbBuscarRec;
    private javax.swing.JComboBox<String> cmbDescripcionAct;
    private javax.swing.JComboBox<String> cmbDescripcionDel;
    private javax.swing.JComboBox<String> cmbDescripcionIns;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tblContRec;
    private javax.swing.JTable tblMedFinal;
    private javax.swing.JTable tblReceta;
    private javax.swing.JTextField txtBuscarContRec;
    private javax.swing.JTextField txtBuscarMed;
    private javax.swing.JTextField txtBuscarRec;
    private javax.swing.JTextField txtDiasAct;
    private javax.swing.JTextField txtDiasDel;
    private javax.swing.JTextField txtDiasIns;
    private javax.swing.JTextField txtDosisAct;
    private javax.swing.JTextField txtDosisDel;
    private javax.swing.JTextField txtDosisIns;
    private javax.swing.JTextField txtHorasAct;
    private javax.swing.JTextField txtHorasDel;
    private javax.swing.JTextField txtHorasIns;
    private javax.swing.JTextField txtMedAct;
    private javax.swing.JTextField txtMedDel;
    private javax.swing.JTextField txtMedIns;
    private javax.swing.JTextField txtRecetaAct;
    private javax.swing.JTextField txtRecetaDel;
    private javax.swing.JTextField txtRecetaIns;
    // End of variables declaration//GEN-END:variables
}
