/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaces;
import Implementaciones.MedFinalImplementacion;
import Modelos.MedFinal;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

public final class InterfazMedFinal extends javax.swing.JFrame {
    DefaultTableModel model;
    MedFinal medfinal = new MedFinal();
    MedFinalImplementacion medImp = new MedFinalImplementacion();
        
    public InterfazMedFinal() throws Exception {
        initComponents();
        model=(DefaultTableModel) tblmedfinal.getModel();
        CrearTabla();
        RellenarCombo1(cmbMedicamentoIns);
        RellenarCombo2(cmbPresentacionIns);
        RellenarCombo1(cmbMedicamentoAct);
        RellenarCombo2(cmbPresentacionAct);
        RellenarCombo1(cmbMedicamentoDel);
        RellenarCombo2(cmbPresentacionDel);
        cmbMedicamentoDel.setEnabled(false);
        cmbPresentacionDel.setEnabled(false);
        cmbUnidadDel.setEnabled(false);
        txtDescripcionDel.setEnabled(false);
        txtCantidadDel.setEditable(false);
        txtCantidadDel.setEnabled(false);
        
    }
    
    public void CrearTabla()
    {
        model.setRowCount(0);   
        
        try{
            medImp.rellenarTabla(model);
        }catch(Exception err)
        {
            
        }
    }
    
    public final void RellenarCombo1(JComboBox comb) throws Exception
    {
        MetodosMedFinal m = new MedFinalImplementacion();
        JComboBox combo= m.obtenerMedico();
        comb.setModel(combo.getModel());
    }
    
    
   
      public final void RellenarCombo2(JComboBox comb) throws Exception
    {
        MetodosMedFinal m = new MedFinalImplementacion();
        JComboBox combo= m.obtenerPresentacion();
        comb.setModel(combo.getModel());
    }
      
    private void CrearTablaBuscar(String busqueda) throws Exception
    {
        model.setRowCount(0);
        medImp.buscar(model,cmbBuscar.getSelectedIndex(), busqueda);
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane4 = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblmedfinal = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        cmbBuscar = new javax.swing.JComboBox<>();
        txtBuscar = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        cmbMedicamentoIns = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        cmbPresentacionIns = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cmbUnidadIns = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDescripcionIns = new javax.swing.JTextArea();
        btnLimpiarIns = new javax.swing.JButton();
        btn_Insertar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        txtCantidadIns = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cmbPresentacionAct = new javax.swing.JComboBox<>();
        cmbMedicamentoAct = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cmbUnidadAct = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtDescripcionAct = new javax.swing.JTextArea();
        btnLimpiarAct = new javax.swing.JButton();
        btnCancelarAct = new javax.swing.JButton();
        btnEditarAct = new javax.swing.JButton();
        txtCantidadAct = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        cmbPresentacionDel = new javax.swing.JComboBox<>();
        cmbMedicamentoDel = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        cmbUnidadDel = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtDescripcionDel = new javax.swing.JTextArea();
        btnCancelarDel = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        txtCantidadDel = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblmedfinal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Número de Caja", "Descripción General", "Cantidad", "Unidad de Medida", "Presentación", "Medicamentos"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblmedfinal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblmedfinalMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tblmedfinalMouseEntered(evt);
            }
        });
        jScrollPane1.setViewportView(tblmedfinal);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Consultar registros"));

        cmbBuscar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Por identificador", "Por presentación", "Por medicamento" }));

        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });

        jLabel16.setText("Buscar por");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(225, 225, 225)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmbBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jTabbedPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Caja de medicamento"));
        jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane1MouseClicked(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Dar de alta un registro"));

        jLabel6.setText("Medicamento");

        jLabel1.setText("Presentación");

        jLabel2.setText("Cantidad medicamento");

        jLabel3.setText("Unidad de Medida");

        cmbUnidadIns.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TABLETAS", "MILIGRAMOS", "MILILITROS" }));

        jLabel4.setText("Descripción general (Recomendaciones)");

        txtDescripcionIns.setColumns(20);
        txtDescripcionIns.setRows(5);
        jScrollPane2.setViewportView(txtDescripcionIns);

        btnLimpiarIns.setText("Limpiar");
        btnLimpiarIns.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLimpiarInsMouseClicked(evt);
            }
        });
        btnLimpiarIns.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarInsActionPerformed(evt);
            }
        });

        btn_Insertar.setText("Insertar");
        btn_Insertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_InsertarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelarMouseClicked(evt);
            }
        });
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cmbMedicamentoIns, 0, 162, Short.MAX_VALUE)
                    .addComponent(cmbPresentacionIns, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(jLabel3))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCantidadIns, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbUnidadIns, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnLimpiarIns))
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_Insertar)
                    .addComponent(btnCancelar))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cmbMedicamentoIns, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)
                        .addComponent(txtCantidadIns, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cmbPresentacionIns, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(cmbUnidadIns, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btn_Insertar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCancelar)
                        .addGap(21, 21, 21))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnLimpiarIns)))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Insertar", jPanel3);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Actualizar un registro"));

        jLabel7.setText("Medicamento");

        jLabel5.setText("Presentación");

        jLabel8.setText("Cantidad medicamento");

        jLabel9.setText("Unidad de Medida");

        cmbUnidadAct.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TABLETAS", "MILIGRAMOS", "MILILITROS" }));

        jLabel10.setText("Descripción general (Recomendaciones)");

        txtDescripcionAct.setColumns(20);
        txtDescripcionAct.setRows(5);
        jScrollPane3.setViewportView(txtDescripcionAct);

        btnLimpiarAct.setText("Vaciar");
        btnLimpiarAct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActActionPerformed(evt);
            }
        });

        btnCancelarAct.setText("Cancelar");
        btnCancelarAct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelarActMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCancelarActMouseEntered(evt);
            }
        });

        btnEditarAct.setText("Actualizar");
        btnEditarAct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEditarActMouseClicked(evt);
            }
        });
        btnEditarAct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cmbMedicamentoAct, 0, 127, Short.MAX_VALUE)
                    .addComponent(cmbPresentacionAct, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cmbUnidadAct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCantidadAct, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 118, Short.MAX_VALUE)
                        .addComponent(btnEditarAct, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(btnLimpiarAct)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCancelarAct, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(32, 32, 32)
                                .addComponent(jLabel5))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cmbMedicamentoAct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8)
                                    .addComponent(txtCantidadAct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(23, 23, 23)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cmbPresentacionAct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9)
                                    .addComponent(cmbUnidadAct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnLimpiarAct)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(jLabel10)
                            .addGap(9, 9, 9)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 25, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnEditarAct)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCancelarAct)
                .addGap(23, 23, 23))
        );

        jTabbedPane1.addTab("Actualizar", jPanel4);

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Eliminar un registro"));

        jLabel11.setText("Medicamento");

        jLabel12.setText("Presentación");

        jLabel13.setText("Cantidad medicamento");

        jLabel14.setText("Unidad de Medida");

        cmbUnidadDel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TABLETA", "MILIGRAMOS", "MILILITROS" }));

        jLabel15.setText("Descripción general (Recomendaciones)");

        txtDescripcionDel.setColumns(20);
        txtDescripcionDel.setRows(5);
        jScrollPane4.setViewportView(txtDescripcionDel);

        btnCancelarDel.setText("Cancelar");
        btnCancelarDel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelarDelMouseClicked(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarMouseClicked(evt);
            }
        });
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cmbMedicamentoDel, 0, 87, Short.MAX_VALUE)
                    .addComponent(cmbPresentacionDel, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(jLabel14))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbUnidadDel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCantidadDel, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE))
                .addGap(115, 115, 115)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelarDel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cmbMedicamentoDel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel13)
                        .addComponent(txtCantidadDel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel11))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(cmbPresentacionDel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(cmbUnidadDel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(btnEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                        .addComponent(btnCancelarDel)
                        .addGap(21, 21, 21))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4)))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Eliminar", jPanel5);

        jButton2.setText("Regresar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTabbedPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2)
                            .addComponent(jScrollPane1)))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.getAccessibleContext().setAccessibleName("Insertar");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_InsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_InsertarActionPerformed
        
        boolean  error= false;
        int cantidad=0;
        int med = 0,pres = 0;
        
        if("".equals(txtCantidadIns.getText()))
        {
            JOptionPane.showMessageDialog(null, "Debe de especificar una cantidad","Error",0);
            error=true;
        }else{
        try{
            if(Integer.parseInt(txtCantidadIns.getText())<=0 )
            {
                JOptionPane.showMessageDialog(null, "La cantidad debe de ser mayor a 0","Error",0);
                error=true;
                txtCantidadIns.setText("");
            }else
            {
                cantidad=Integer.parseInt(txtCantidadIns.getText());
            }
        }catch(NumberFormatException err)
        {
            txtCantidadIns.setText("");
            error=true;
            JOptionPane.showMessageDialog(null, "La cantidad debe de ser numérica","Error",0);
        }
        
      }
       if("".equals(txtDescripcionIns.getText()))
        {
            error=true;
            JOptionPane.showMessageDialog(null, "Obligatoriamente debe de haber una descripción del medicamento","Error",0);
        }
                
        if(cmbPresentacionIns.getSelectedItem()=="Tabletas" && cmbUnidadIns.getSelectedItem()=="MILILITROS")
        {
            JOptionPane.showMessageDialog(null, "La unidad de medida no corresponde con la presentación","Error",0);
            error=true;
        }
        
        if(error != true){
        
            String desc=txtDescripcionIns.getText();
            String unidad=cmbUnidadIns.getSelectedItem().toString();
            try {
               med= medImp.obtenerIdMed((cmbMedicamentoIns.getSelectedItem()).toString());
               pres= medImp.obtenerIdPresentacion((cmbPresentacionIns.getSelectedItem()).toString());
            } catch (Exception ex) {
                Logger.getLogger(InterfazMedFinal.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            medfinal.setDescripcion(desc);
            medfinal.setCantidad(cantidad);
            medfinal.setUnidad(unidad);
            medfinal.setPresentacion(pres);
            medfinal.setMedicamento(med);
            
            try {
                medImp.agregarFinal(medfinal);
            } catch (Exception ex) {
                 JOptionPane.showMessageDialog(null, "Hubo un problema al insertar el medicamento:\n" +ex,"Error",0);
            }
        }
        
        txtCantidadIns.setText("");
        txtDescripcionIns.setText("");
        CrearTabla();
        
        
        
                   
    }//GEN-LAST:event_btn_InsertarActionPerformed

    private void btnEditarActActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditarActActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnLimpiarInsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarInsMouseClicked
       txtDescripcionIns.setText("");
    }//GEN-LAST:event_btnLimpiarInsMouseClicked

    private void btnCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseClicked
       
    }//GEN-LAST:event_btnCancelarMouseClicked

    private void tblmedfinalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblmedfinalMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_tblmedfinalMouseEntered

    private void tblmedfinalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblmedfinalMouseClicked

       ///apartado de actualizar
        String unidad=(String) tblmedfinal.getValueAt(tblmedfinal.getSelectedRow(),3);
        cmbMedicamentoAct.setSelectedItem(tblmedfinal.getValueAt(tblmedfinal.getSelectedRow(), 5));
        cmbPresentacionAct.setSelectedItem(tblmedfinal.getValueAt(tblmedfinal.getSelectedRow(), 4));
        txtCantidadAct.setText((String) tblmedfinal.getValueAt(tblmedfinal.getSelectedRow(), 2));
        cmbUnidadAct.setSelectedItem(unidad.toUpperCase());
        txtDescripcionAct.setText((String) tblmedfinal.getValueAt(tblmedfinal.getSelectedRow(),1));
       ///apartado eliminar

        cmbMedicamentoDel.setSelectedItem(tblmedfinal.getValueAt(tblmedfinal.getSelectedRow(), 5));
        cmbPresentacionDel.setSelectedItem(tblmedfinal.getValueAt(tblmedfinal.getSelectedRow(), 4));
        txtCantidadDel.setText((String) tblmedfinal.getValueAt(tblmedfinal.getSelectedRow(), 2));
        cmbUnidadDel.setSelectedItem(unidad.toUpperCase());
        txtDescripcionDel.setText((String) tblmedfinal.getValueAt(tblmedfinal.getSelectedRow(),1));
       
    }//GEN-LAST:event_tblmedfinalMouseClicked

    private void btnCancelarActMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarActMouseClicked
        txtCantidadAct.setText("");
        txtDescripcionAct.setText("");
        txtCantidadDel.setText("");
        txtDescripcionDel.setText("");
        tblmedfinal.clearSelection();
    }//GEN-LAST:event_btnCancelarActMouseClicked

    private void btnEditarActMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarActMouseClicked
        
        boolean error=false;
        int cantidad=0;
        int med = 0,pres = 0;
        
        if("".equals(txtCantidadAct.getText()))
        {
            JOptionPane.showMessageDialog(null, "Debe de especificar una cantidad","Error",0);
            error=true;
        }else{
        try{
            if(Integer.parseInt(txtCantidadAct.getText())<=0)
            {
                JOptionPane.showMessageDialog(null, "La cantidad debe de ser mayor a 0","Error",0);
                error=true;
                txtCantidadAct.setText("");
            }else
            {
                cantidad=Integer.parseInt(txtCantidadAct.getText());
            }
        }catch(NumberFormatException err)
        {
            txtCantidadAct.setText("");
            error=true;
            JOptionPane.showMessageDialog(null, "La cantidad debe de ser numérica","Error",0);
        }
       }
        
         if("".equals(txtDescripcionAct.getText()))
        {
            error=true;
            JOptionPane.showMessageDialog(null, "Obligatoriamente debe de haber una descripción del medicamento","Error",0);
        }
         
        if(cmbPresentacionIns.getSelectedItem()=="Tabletas" || cmbUnidadIns.getSelectedItem()=="MILILITROS")
        {
            JOptionPane.showMessageDialog(null, "La unidad de medida no corresponde con la presentación","Error",0);
            error=true;
        }
       
        if(error != true){
        
            String desc=txtDescripcionAct.getText();
            String unidad=cmbUnidadAct.getSelectedItem().toString();
            try {
               med= medImp.obtenerIdMed((cmbMedicamentoAct.getSelectedItem()).toString());
               pres= medImp.obtenerIdPresentacion((cmbPresentacionAct.getSelectedItem()).toString());
            } catch (Exception ex) {
                Logger.getLogger(InterfazMedFinal.class.getName()).log(Level.SEVERE, null, ex);
            }
            medfinal.setIdFinal(Integer.parseInt(tblmedfinal.getValueAt(tblmedfinal.getSelectedRow(), 0).toString()));
            medfinal.setDescripcion(desc);
            medfinal.setCantidad(cantidad);
            medfinal.setUnidad(unidad);
            medfinal.setPresentacion(pres);
            medfinal.setMedicamento(med);
            
            try {
                medImp.actualizarFinal(medfinal);
            } catch (Exception ex) {
                 JOptionPane.showMessageDialog(null, "Hubo un problema al actualizar el medicamento:\n" +ex,"Error",0);
            }
        }
        
        txtCantidadAct.setText("");
        txtDescripcionAct.setText("");
        txtCantidadDel.setText("");
        txtDescripcionDel.setText("");
        CrearTabla();
    }//GEN-LAST:event_btnEditarActMouseClicked

    private void jTabbedPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MouseClicked
      
    }//GEN-LAST:event_jTabbedPane1MouseClicked

    private void btnEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseClicked
       if("".equals(txtCantidadDel.getText())|| "".equals(txtDescripcionDel.getText()) )
       {
            JOptionPane.showMessageDialog(null, "Seleccione un registro a elimar","Error",0);
       }else{
        medfinal.setIdFinal(Integer.parseInt(tblmedfinal.getValueAt(tblmedfinal.getSelectedRow(), 0).toString()));
        try {
            medImp.eliminarFinal(medfinal);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Hubo un problema al eliminar el medicamento:\n" +ex,"Error",0);
        }
        txtCantidadAct.setText("");
        txtDescripcionAct.setText("");
        txtCantidadDel.setText("");
        txtDescripcionDel.setText("");
        
        CrearTabla();
       }
    }//GEN-LAST:event_btnEliminarMouseClicked

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased

        try {
            CrearTablaBuscar(txtBuscar.getText());
        } catch (Exception ex) {
            Logger.getLogger(InterfazMedFinal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_txtBuscarKeyReleased

    private void btnCancelarDelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarDelMouseClicked
        txtCantidadAct.setText("");
        txtDescripcionAct.setText("");
        txtCantidadDel.setText("");
        txtDescripcionDel.setText("");
        tblmedfinal.clearSelection();
    }//GEN-LAST:event_btnCancelarDelMouseClicked

    private void btnCancelarActMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarActMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelarActMouseEntered

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.setVisible(false);
        new Home().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnLimpiarInsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarInsActionPerformed
        txtDescripcionIns.setText("");
    }//GEN-LAST:event_btnLimpiarInsActionPerformed

    private void btnLimpiarActActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActActionPerformed
        txtDescripcionAct.setText("");
    }//GEN-LAST:event_btnLimpiarActActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        txtCantidadIns.setText("");
        txtDescripcionIns.setText("");
    }//GEN-LAST:event_btnCancelarActionPerformed

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
            java.util.logging.Logger.getLogger(InterfazMedFinal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazMedFinal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazMedFinal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazMedFinal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                try {
                    new InterfazMedFinal().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(InterfazMedFinal.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCancelarAct;
    private javax.swing.JButton btnCancelarDel;
    private javax.swing.JButton btnEditarAct;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiarAct;
    private javax.swing.JButton btnLimpiarIns;
    private javax.swing.JButton btn_Insertar;
    private javax.swing.JComboBox<String> cmbBuscar;
    private javax.swing.JComboBox<String> cmbMedicamentoAct;
    private javax.swing.JComboBox<String> cmbMedicamentoDel;
    private javax.swing.JComboBox<String> cmbMedicamentoIns;
    private javax.swing.JComboBox<String> cmbPresentacionAct;
    private javax.swing.JComboBox<String> cmbPresentacionDel;
    private javax.swing.JComboBox<String> cmbPresentacionIns;
    private javax.swing.JComboBox<String> cmbUnidadAct;
    private javax.swing.JComboBox<String> cmbUnidadDel;
    private javax.swing.JComboBox<String> cmbUnidadIns;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JTable tblmedfinal;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtCantidadAct;
    private javax.swing.JTextField txtCantidadDel;
    private javax.swing.JTextField txtCantidadIns;
    private javax.swing.JTextArea txtDescripcionAct;
    private javax.swing.JTextArea txtDescripcionDel;
    private javax.swing.JTextArea txtDescripcionIns;
    // End of variables declaration//GEN-END:variables
}
