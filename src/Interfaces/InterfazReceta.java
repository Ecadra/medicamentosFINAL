/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaces;

import Implementaciones.RecetaImplementacion;
import Modelos.Receta;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ADM
 */
public class InterfazReceta extends javax.swing.JFrame {
    
    DefaultTableModel model; //Definición del DTM
    Receta receta = new Receta();
    RecetaImplementacion recImp = new RecetaImplementacion();
    java.sql.Date fecha = null;
    
    
    public InterfazReceta() throws Exception {
        initComponents();
        model=(DefaultTableModel) tblReceta.getModel(); 
        CrearTabla();
        initCmbMed(cmbMedRec);
        initCmbPac(cmbPacRec);
        this.setLocationRelativeTo(null);
    }
    
    public void CrearTabla()
    {
        model.setRowCount(0);   
        
        try{
            recImp.RellenarTablaReceta(model,receta);
        }catch(Exception err)
        {
            
        }
    }    
    public void mensajeAdvertencia(String mensaje, String titulo){
        JOptionPane.showMessageDialog(null,mensaje,titulo,0);
    }
    public void mensajeInformativo(String mensaje, String titulo){
        JOptionPane.showInternalMessageDialog(null, mensaje, titulo, JOptionPane.INFORMATION_MESSAGE);
    }
    
    public void activarReceta(boolean activado){
        pnlDatosReceta.setEnabled(activado);
        lbl_Medico.setEnabled(activado);
        lblPaciente.setEnabled(activado);
        lblFecha.setEnabled(activado);
        btnLimpiar.setEnabled(activado);
        btnRegistrar.setEnabled(activado);
    }
    
    public void limpiarReceta(){
        ///Se limpia el campo de texto
        cmbPacRec.setSelectedIndex(0);
        cmbMedRec.setSelectedIndex(0);
        jdate.setDate(null);
    }
    
     public final void initCmbMed(JComboBox comb) throws Exception{
        MetodosReceta m = new RecetaImplementacion();
        JComboBox combo= m.obtenerMedico();
        comb.setModel(combo.getModel());
    }
    
    public final void initCmbPac(JComboBox comb) throws Exception{
        MetodosReceta m = new RecetaImplementacion();
        JComboBox combo= m.obtenerPaciente();
        comb.setModel(combo.getModel());
    }
    
    private void CrearTablaBuscar(String busqueda) throws Exception
    {
        model.setRowCount(0);
        recImp.buscar(model, receta, cmbAtributo.getSelectedIndex(), busqueda);
        
    }
      
    
    
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlDatosReceta = new javax.swing.JPanel();
        lbl_Medico = new javax.swing.JLabel();
        lblPaciente = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        jdate = new com.toedter.calendar.JDateChooser();
        cmbMedRec = new javax.swing.JComboBox<>();
        cmbPacRec = new javax.swing.JComboBox<>();
        btnActualizar = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();
        btn_Eliminar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnNewReceta = new javax.swing.JButton();
        pnlRegistros = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtSrcPac = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblReceta = new javax.swing.JTable();
        cmbAtributo = new javax.swing.JComboBox<>();
        btnInicio = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        pnlDatosReceta.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Datos Receta"));
        pnlDatosReceta.setEnabled(false);

        lbl_Medico.setText("Nombre Médico:");
        lbl_Medico.setEnabled(false);

        lblPaciente.setText("Nombre Paciente:");
        lblPaciente.setEnabled(false);

        lblFecha.setText("Fecha:");
        lblFecha.setEnabled(false);

        btnActualizar.setText("Actualizar");
        btnActualizar.setEnabled(false);
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnRegistrar.setText("Registrar");
        btnRegistrar.setEnabled(false);
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btn_Eliminar.setText("Eliminar");
        btn_Eliminar.setEnabled(false);
        btn_Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EliminarActionPerformed(evt);
            }
        });

        btnLimpiar.setText("Limpiar Campos");
        btnLimpiar.setEnabled(false);
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlDatosRecetaLayout = new javax.swing.GroupLayout(pnlDatosReceta);
        pnlDatosReceta.setLayout(pnlDatosRecetaLayout);
        pnlDatosRecetaLayout.setHorizontalGroup(
            pnlDatosRecetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDatosRecetaLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(pnlDatosRecetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPaciente)
                    .addComponent(lbl_Medico)
                    .addComponent(lblFecha))
                .addGap(18, 18, 18)
                .addGroup(pnlDatosRecetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLimpiar)
                    .addGroup(pnlDatosRecetaLayout.createSequentialGroup()
                        .addGroup(pnlDatosRecetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cmbPacRec, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbMedRec, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jdate, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE))
                        .addGap(93, 93, 93)
                        .addGroup(pnlDatosRecetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnActualizar)
                            .addComponent(btnRegistrar)
                            .addComponent(btn_Eliminar))))
                .addContainerGap(273, Short.MAX_VALUE))
        );
        pnlDatosRecetaLayout.setVerticalGroup(
            pnlDatosRecetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDatosRecetaLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(pnlDatosRecetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDatosRecetaLayout.createSequentialGroup()
                        .addGroup(pnlDatosRecetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_Medico)
                            .addComponent(cmbMedRec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(pnlDatosRecetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPaciente)
                            .addComponent(cmbPacRec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlDatosRecetaLayout.createSequentialGroup()
                        .addComponent(btnRegistrar)
                        .addGap(18, 18, 18)
                        .addComponent(btnActualizar)))
                .addGap(18, 18, 18)
                .addGroup(pnlDatosRecetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDatosRecetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lblFecha)
                        .addComponent(jdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn_Eliminar))
                .addGap(18, 18, 18)
                .addComponent(btnLimpiar)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnNewReceta.setText("Nueva Receta");
        btnNewReceta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewRecetaActionPerformed(evt);
            }
        });

        pnlRegistros.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Registros Receta"));

        jLabel4.setText("Búsqueda");

        txtSrcPac.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSrcPacKeyReleased(evt);
            }
        });

        jLabel5.setText("Atributo:");

        tblReceta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Médico", "Paciente", "Fecha"
            }
        ));
        tblReceta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblRecetaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblReceta);

        cmbAtributo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Medico", "Paciente" }));

        javax.swing.GroupLayout pnlRegistrosLayout = new javax.swing.GroupLayout(pnlRegistros);
        pnlRegistros.setLayout(pnlRegistrosLayout);
        pnlRegistrosLayout.setHorizontalGroup(
            pnlRegistrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRegistrosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSrcPac, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbAtributo, 0, 149, Short.MAX_VALUE)
                .addGap(148, 148, 148))
            .addGroup(pnlRegistrosLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 607, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlRegistrosLayout.setVerticalGroup(
            pnlRegistrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRegistrosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlRegistrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSrcPac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(cmbAtributo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 28, Short.MAX_VALUE))
        );

        btnInicio.setText("Regresar al Menu");
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCancelar)
                .addGap(27, 27, 27)
                .addComponent(btnNewReceta)
                .addGap(53, 53, 53))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlRegistros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlDatosReceta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnInicio)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(btnInicio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlDatosReceta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCancelar)
                    .addComponent(btnNewReceta))
                .addGap(18, 18, 18)
                .addComponent(pnlRegistros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
      Receta receta = new Receta();
        boolean aux = true;
        Date dateE = jdate.getDate();
        if(dateE ==null){
        JOptionPane.showMessageDialog(null,"Es necesario que seleccione un fecha","Error de entrada",JOptionPane.WARNING_MESSAGE);
        aux=false;
        }else{
        long dia= dateE.getTime();
        fecha= new java.sql.Date(dia);
        }

        receta.setMed_nombre((String)cmbMedRec.getSelectedItem());
        receta.setPac_nombre((String) cmbPacRec.getSelectedItem());
        receta.setRec_fecha(fecha); 
        
        try {
        MetodosReceta metodosReceta = new RecetaImplementacion();
        metodosReceta.registrarReceta(receta);
        mensajeInformativo("Registro realizado con éxito", "Registro exitoso");
        }catch (Exception r) {
            JOptionPane.showMessageDialog(null, "Error al guardar en la base de datos: " + r.getMessage(), "Error al guardar", JOptionPane.ERROR_MESSAGE);
            }
        if (!aux) {
        mensajeAdvertencia("Registro no realizado", "Error de captura de datos");
        }   
    limpiarReceta();
    activarReceta(false);
    CrearTabla();
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
    limpiarReceta();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
    CrearTabla();
    }//GEN-LAST:event_formWindowOpened

    private void btn_EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EliminarActionPerformed
    MetodosReceta metodosReceta = new RecetaImplementacion();
        int afectadas = -1;
        if(JOptionPane.showConfirmDialog(null, "¿Está seguro que desea eliminar el registro?\n"
                + "Esta acción será irreversible\n"
                + "Verifique que el registro a eliminar es el deseado", 
                "Advertencia de eliminación de datos",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
            try {
                afectadas = metodosReceta.eliminarReceta(
                        metodosReceta.recuperarIdReceta(
                                (String) cmbMedRec.getSelectedItem(),
                                (String)cmbPacRec.getSelectedItem()));
          
                limpiarReceta();
                activarReceta(false);
                btn_Eliminar.setEnabled(false);
                btnActualizar.setEnabled(false);
                btnLimpiar.setEnabled(false);
                btnNewReceta.setEnabled(true);
            }catch(Exception ex){
                Logger.getLogger(InterfazReceta.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            if(afectadas== -1){
                mensajeAdvertencia("El registro no se ha eliminado debido a un"
                        + " error"  ,"Error de eliminación");
            }else{
                mensajeInformativo("Registro eliminado\n"
                + "Filas afectadas con la eliminacion: " + afectadas,"El registro se ha eliminado");
            }
        } 
        CrearTabla();
    }//GEN-LAST:event_btn_EliminarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
    Receta receta = new Receta();
        MetodosReceta metodosReceta = new RecetaImplementacion();
        boolean aux = true;
        int afectadas=-1;
        if(JOptionPane.showConfirmDialog(null, "¿Está seguro que desea modificar el registro?\n"
                + "Verifique que el registro a modificar es el deseado", 
                "Advertencia de modificación de datos",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){         
             Date dateE = jdate.getDate();
               if(dateE ==null){
                JOptionPane.showMessageDialog(null,"Es necesario que seleccione un fecha","Error de entrada",JOptionPane.WARNING_MESSAGE);
                aux=false;
            }else{
                long dia= dateE.getTime();
                fecha= new java.sql.Date(dia);
            try{
               receta.setMed_nombre((String)cmbMedRec.getSelectedItem());
               System.out.println((String)cmbMedRec.getSelectedItem());
               receta.setPac_nombre((String)cmbPacRec.getSelectedItem());
               System.out.println((String)cmbPacRec.getSelectedItem());
                receta.setRec_fecha(fecha); 
               int id = metodosReceta.recuperarIdReceta(
                       (String)(tblReceta.getValueAt(tblReceta.getSelectedRow(), 0)),
                       (String)(tblReceta.getValueAt(tblReceta.getSelectedRow(), 1))
                       );  
               //System.out.println("El id es: " + id);   Es una bandera
               receta.setId_receta(id);
               afectadas = metodosReceta.modificarReceta(receta);
               //System.out.println("Las afectadas fueron: " + afectadas); 

               
                ///Limpia los campos de informacion
                limpiarReceta();
                ///Desactiva los campos y regresa al estado inicial de la interfaz
                activarReceta(false);
            
                btn_Eliminar.setEnabled(false);
                btnActualizar.setEnabled(false);
                btnLimpiar.setEnabled(false);
                btnNewReceta.setEnabled(true); 
            }catch(Exception ex){
                Logger.getLogger(InterfazReceta.class.getName()).log(Level.SEVERE, null, ex);
            }  
        }
        }
        CrearTabla();
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        btnNewReceta.setEnabled(true);
        tblReceta.clearSelection();
        limpiarReceta();
        btn_Eliminar.setEnabled(false);
        btnActualizar.setEnabled(false);
        btnRegistrar.setEnabled(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void tblRecetaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblRecetaMouseClicked
    if(!tblReceta.isEnabled()){

        }else{
            ///Para poder seleccionar algun alumno de la lista y modificarlo o eliminarlo
            activarReceta(true);
            //Se activan solo los botones para actualizar y eliminar
            btnRegistrar.setEnabled(false);
            btnActualizar.setEnabled(true);
            btn_Eliminar.setEnabled(true);
            btnLimpiar.setEnabled(false);
            btnNewReceta.setEnabled(false);

            
            
           
            cmbMedRec.setSelectedItem(tblReceta.getValueAt(tblReceta.getSelectedRow(), 0));
            cmbPacRec.setSelectedItem(tblReceta.getValueAt(tblReceta.getSelectedRow(),1));
            jdate.setDate((Date)tblReceta.getValueAt(tblReceta.getSelectedRow(),2));
 
        }
    }//GEN-LAST:event_tblRecetaMouseClicked

    private void btnNewRecetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewRecetaActionPerformed
        btnRegistrar.setEnabled(true);
        limpiarReceta();
    }//GEN-LAST:event_btnNewRecetaActionPerformed

    private void txtSrcPacKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSrcPacKeyReleased
    try {
            CrearTablaBuscar(txtSrcPac.getText());
        } catch (Exception ex) {
            Logger.getLogger(InterfazReceta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_txtSrcPacKeyReleased

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
    try{
           Home inicio = new Home();
            inicio.setVisible(true);
            // Cerrar la ventana
            dispose();  
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Ocurrió un error",
                    "Error",0);

        }
    }//GEN-LAST:event_btnInicioActionPerformed

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
            java.util.logging.Logger.getLogger(InterfazReceta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazReceta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazReceta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazReceta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new InterfazReceta().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(InterfazReceta.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnNewReceta;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btn_Eliminar;
    private javax.swing.JComboBox<String> cmbAtributo;
    private javax.swing.JComboBox<String> cmbMedRec;
    private javax.swing.JComboBox<String> cmbPacRec;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JDateChooser jdate;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblPaciente;
    private javax.swing.JLabel lbl_Medico;
    private javax.swing.JPanel pnlDatosReceta;
    private javax.swing.JPanel pnlRegistros;
    private javax.swing.JTable tblReceta;
    private javax.swing.JTextField txtSrcPac;
    // End of variables declaration//GEN-END:variables
}
