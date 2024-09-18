/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaces;
import Implementaciones.EnfermeraImplementacion;
import java.awt.Color;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import Modelos.Enfermera;
/**
 *
 * @author ADM
 */
public class InterfazEnfermera extends javax.swing.JFrame {

    /**
     * Creates new form InterfazEnfermera
     */
    public InterfazEnfermera() {
        initComponents();
        listarRegistrosEnfermera();
        this.setLocationRelativeTo(null);
    }
    
    public void mensajeAdvertencia(String mensaje, String titulo){
        JOptionPane.showMessageDialog(null,mensaje,titulo,0);
    }
    public void mensajeInformativo(String mensaje, String titulo){
        JOptionPane.showInternalMessageDialog(null, mensaje, titulo, JOptionPane.INFORMATION_MESSAGE);
    }
    
     public void activarEnfermera(boolean activado){
        pnlEnfermeraDatos.setEnabled(activado);
        txtNombreEnfermera.setEnabled(activado);
        lblNombreEnfermera.setEnabled(activado);
        txtNumeroCedula.setEnabled(activado);
        lblCedula.setEnabled(activado);
        txtTelefono.setEnabled(activado);
        lblTelefono.setEnabled(activado);
        txtDireccionEnfermera.setEnabled(activado);
        lblDireccion.setEnabled(activado);
        btnBusquedaEnfermera.setEnabled(!activado);
    }
     
        public void limpiarEnfermera(){
        ///Se limpia el campo de texto
        txtNombreEnfermera.setText("");
        txtNumeroCedula.setText("");
        txtTelefono.setText("");
        txtDireccionEnfermera.setText("");
    }
        public void listarRegistrosEnfermera(){ ///Funcion para actualizar la lista acorde a los criterios seleccionados al momento
        MetodosEnfermera metodosEnfermera = new EnfermeraImplementacion();
        try {
            tblEnfermera.setModel(metodosEnfermera.recuperarRegistros
            (cmbOrdenEnfermera.getSelectedIndex(),txtBuscaEnfermera.getText()));
            
        } catch (Exception ex) {
            Logger.getLogger(InterfazEnfermera.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
      
        public boolean validarDatos(){
        // Validación del nombre de la enfermera
        if (txtNombreEnfermera.getText().equals("") || 
                txtNombreEnfermera.getText().equals("Nombre de la enfermera") || 
                txtNombreEnfermera.getText().equals("Ingrese el nombre de la enfermera")) {
            mensajeAdvertencia("El nombre del la enfermera es inválido.\n"
                    + "Favor de verificar que:\n"
                    + "-> No contenga acentos\n"
                    + "-> No contenga caracteres especiales\n"
                    + "-> Haya registrado correctamente el nombre de la enfermera correctamente\n", "Nombre inválido");
            return false;
        }
        // Validación de la cédula
        if (txtNumeroCedula.getText().equals("") || 
                txtNumeroCedula.getText().equals("Número de cédula") || 
                txtNumeroCedula.getText().equals("Ingrese la cédula") ||
                !txtNumeroCedula.getText().matches("\\d{7}")) {
            mensajeAdvertencia("El número de cedula es invalido.\n"
                    + "Favor de verificar que:\n"
                    + "-> No esté vacía\n"
                    + "-> Haya registrado correctamente la cédula\n"
                    + "-> Campo de 7 números ", "Descripción inválida");
            return false;
        }
        //Validacion numero de telefono
        if (txtTelefono.getText().equals("") || 
                txtTelefono.getText().equals("Telefono") || 
                txtTelefono.getText().equals("Ingrese el telefono")) {
            mensajeAdvertencia("El número de telefono es invalido.\n"
                    + "Favor de verificar que:\n"
                    + "-> No esté vacía\n"
                    + "-> Haya registrado correctamente el telefono\n"
                    ," -> Descripción inválida");
            return false;
        }
        //Validación dirección
        if (txtDireccionEnfermera.getText().equals("") || 
                txtDireccionEnfermera.getText().equals("Dirección general") || 
                txtDireccionEnfermera.getText().equals("Ingrese la dirección general")) {
            mensajeAdvertencia("La dirección es invalida.\n"
                    + "Favor de verificar que:\n"
                    + "-> No esté vacía\n"
                    + "-> Haya registrado correctamente la dirección\n", "Descripción inválida");
            return false;
        }
        
        return true;
    }
        
        
        
    
    
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlEnfermeraDatos = new javax.swing.JPanel();
        lblNombreEnfermera = new javax.swing.JLabel();
        lblCedula = new javax.swing.JLabel();
        lblDireccion = new javax.swing.JLabel();
        txtNombreEnfermera = new javax.swing.JTextField();
        txtNumeroCedula = new javax.swing.JTextField();
        txtDireccionEnfermera = new javax.swing.JTextField();
        btnLimpiarEnfermera = new javax.swing.JButton();
        btnRegistroEnfermera = new javax.swing.JButton();
        btnEliminarEnfermera = new javax.swing.JButton();
        btnActualizarEnfermera = new javax.swing.JButton();
        lblTelefono = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        pnl_RegistrosEnfermera = new javax.swing.JPanel();
        lbl_Enfermera = new javax.swing.JLabel();
        txtBuscaEnfermera = new javax.swing.JTextField();
        btnBusquedaEnfermera = new javax.swing.JButton();
        JSCROLL = new javax.swing.JScrollPane();
        tblEnfermera = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        cmbOrdenEnfermera = new javax.swing.JComboBox<>();
        btnDeseleccion = new javax.swing.JButton();
        btnNewEnfermera = new javax.swing.JButton();
        btnInicio = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        pnlEnfermeraDatos.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 51)), "Datos Enfermera"));
        pnlEnfermeraDatos.setEnabled(false);

        lblNombreEnfermera.setText("Enfermera: ");
        lblNombreEnfermera.setEnabled(false);

        lblCedula.setText("Cedula: ");
        lblCedula.setEnabled(false);

        lblDireccion.setText("Dirección: ");
        lblDireccion.setEnabled(false);

        txtNombreEnfermera.setText("Nombre de la enfermera");
        txtNombreEnfermera.setEnabled(false);
        txtNombreEnfermera.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNombreEnfermeraFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNombreEnfermeraFocusLost(evt);
            }
        });

        txtNumeroCedula.setText("Número de cédula");
        txtNumeroCedula.setEnabled(false);
        txtNumeroCedula.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNumeroCedulaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNumeroCedulaFocusLost(evt);
            }
        });

        txtDireccionEnfermera.setText("Dirección general ");
        txtDireccionEnfermera.setEnabled(false);
        txtDireccionEnfermera.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtDireccionEnfermeraFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDireccionEnfermeraFocusLost(evt);
            }
        });

        btnLimpiarEnfermera.setText("Limpiar Campos");
        btnLimpiarEnfermera.setEnabled(false);
        btnLimpiarEnfermera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarEnfermeraActionPerformed(evt);
            }
        });

        btnRegistroEnfermera.setText("Registrar enfermera");
        btnRegistroEnfermera.setEnabled(false);
        btnRegistroEnfermera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroEnfermeraActionPerformed(evt);
            }
        });

        btnEliminarEnfermera.setText("Eliminar Enfermera");
        btnEliminarEnfermera.setEnabled(false);
        btnEliminarEnfermera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarEnfermeraActionPerformed(evt);
            }
        });

        btnActualizarEnfermera.setText("Actualizar Enfermera");
        btnActualizarEnfermera.setEnabled(false);
        btnActualizarEnfermera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarEnfermeraActionPerformed(evt);
            }
        });

        lblTelefono.setText("Telefono:");
        lblTelefono.setEnabled(false);

        txtTelefono.setText("Telefono");
        txtTelefono.setEnabled(false);
        txtTelefono.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtTelefonoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtTelefonoFocusLost(evt);
            }
        });

        javax.swing.GroupLayout pnlEnfermeraDatosLayout = new javax.swing.GroupLayout(pnlEnfermeraDatos);
        pnlEnfermeraDatos.setLayout(pnlEnfermeraDatosLayout);
        pnlEnfermeraDatosLayout.setHorizontalGroup(
            pnlEnfermeraDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEnfermeraDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlEnfermeraDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlEnfermeraDatosLayout.createSequentialGroup()
                        .addGroup(pnlEnfermeraDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNombreEnfermera)
                            .addComponent(lblCedula))
                        .addGroup(pnlEnfermeraDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlEnfermeraDatosLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNombreEnfermera, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlEnfermeraDatosLayout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(txtNumeroCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(pnlEnfermeraDatosLayout.createSequentialGroup()
                        .addGroup(pnlEnfermeraDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDireccion)
                            .addGroup(pnlEnfermeraDatosLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(lblTelefono)))
                        .addGap(18, 18, 18)
                        .addGroup(pnlEnfermeraDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtDireccionEnfermera, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)
                            .addComponent(txtTelefono))))
                .addGap(61, 61, 61)
                .addGroup(pnlEnfermeraDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLimpiarEnfermera)
                    .addComponent(btnEliminarEnfermera)
                    .addComponent(btnRegistroEnfermera)
                    .addComponent(btnActualizarEnfermera))
                .addContainerGap(100, Short.MAX_VALUE))
        );
        pnlEnfermeraDatosLayout.setVerticalGroup(
            pnlEnfermeraDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEnfermeraDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlEnfermeraDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombreEnfermera)
                    .addComponent(txtNombreEnfermera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegistroEnfermera))
                .addGap(18, 18, 18)
                .addGroup(pnlEnfermeraDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCedula)
                    .addComponent(txtNumeroCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminarEnfermera))
                .addGap(18, 18, 18)
                .addGroup(pnlEnfermeraDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTelefono)
                    .addComponent(btnActualizarEnfermera))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(pnlEnfermeraDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDireccion)
                    .addComponent(txtDireccionEnfermera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpiarEnfermera))
                .addGap(20, 20, 20))
        );

        pnl_RegistrosEnfermera.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0)), "Registros existentes:"));

        lbl_Enfermera.setText("Enfermera: ");

        txtBuscaEnfermera.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBuscaEnfermeraKeyPressed(evt);
            }
        });

        btnBusquedaEnfermera.setText("Buscar Enfermera");

        tblEnfermera.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre Enfermera", "Cedula", "No Telefono", "Dirección"
            }
        ));
        tblEnfermera.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tblEnfermeraFocusGained(evt);
            }
        });
        tblEnfermera.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblEnfermeraMouseClicked(evt);
            }
        });
        JSCROLL.setViewportView(tblEnfermera);

        javax.swing.GroupLayout pnl_RegistrosEnfermeraLayout = new javax.swing.GroupLayout(pnl_RegistrosEnfermera);
        pnl_RegistrosEnfermera.setLayout(pnl_RegistrosEnfermeraLayout);
        pnl_RegistrosEnfermeraLayout.setHorizontalGroup(
            pnl_RegistrosEnfermeraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_RegistrosEnfermeraLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(pnl_RegistrosEnfermeraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JSCROLL)
                    .addGroup(pnl_RegistrosEnfermeraLayout.createSequentialGroup()
                        .addComponent(lbl_Enfermera)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBuscaEnfermera, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBusquedaEnfermera)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnl_RegistrosEnfermeraLayout.setVerticalGroup(
            pnl_RegistrosEnfermeraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_RegistrosEnfermeraLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_RegistrosEnfermeraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Enfermera)
                    .addComponent(txtBuscaEnfermera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBusquedaEnfermera))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JSCROLL, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 51))));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 51)), "Filtrar tabla mediante"));

        jLabel6.setText("Tipo de orden:");

        cmbOrdenEnfermera.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ascendente", "Descendente" }));
        cmbOrdenEnfermera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbOrdenEnfermeraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(cmbOrdenEnfermera, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(cmbOrdenEnfermera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(112, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnDeseleccion.setText("Deseleccionar registro");
        btnDeseleccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeseleccionActionPerformed(evt);
            }
        });

        btnNewEnfermera.setText("Agregar nueva enfermera");
        btnNewEnfermera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewEnfermeraActionPerformed(evt);
            }
        });

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(btnDeseleccion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 377, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pnl_RegistrosEnfermera, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnNewEnfermera)
                        .addGap(0, 24, Short.MAX_VALUE)))
                .addGap(19, 19, 19))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pnlEnfermeraDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(btnInicio)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnInicio)
                .addGap(2, 2, 2)
                .addComponent(pnlEnfermeraDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnl_RegistrosEnfermera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDeseleccion)
                    .addComponent(btnNewEnfermera))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreEnfermeraFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombreEnfermeraFocusGained
    if(txtNombreEnfermera.getText().equals("Nombre de la enfermera") || 
                txtNombreEnfermera.getText().equals("Ingrese el nombre de la enfermera")){
            txtNombreEnfermera.setText("");
        }
    }//GEN-LAST:event_txtNombreEnfermeraFocusGained

    private void txtNumeroCedulaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNumeroCedulaFocusGained
       if(txtNumeroCedula.getText().equals("Número de cédula") || 
                txtNumeroCedula.getText().equals("Ingrese la cédula")){
            txtNumeroCedula.setText("");
        }
    }//GEN-LAST:event_txtNumeroCedulaFocusGained

    private void txtTelefonoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTelefonoFocusGained
        if(txtTelefono.getText().equals("Telefono") || 
                txtTelefono.getText().equals("Ingrese el telefono")){
            txtTelefono.setText("");
        }
    }//GEN-LAST:event_txtTelefonoFocusGained

    private void txtDireccionEnfermeraFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDireccionEnfermeraFocusGained
        if(txtDireccionEnfermera.getText().equals("Dirección general") || 
                txtDireccionEnfermera.getText().equals("Ingrese la dirección general")){
            txtDireccionEnfermera.setText("");
        }
    }//GEN-LAST:event_txtDireccionEnfermeraFocusGained

    private void txtNombreEnfermeraFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombreEnfermeraFocusLost
        if(txtNombreEnfermera.getText().equals("")){
            txtNombreEnfermera.setText("Ingrese el nombre de la enfermera");
            txtNombreEnfermera.setForeground(Color.gray);
        }else{
            txtNombreEnfermera.setForeground(Color.black);
        }  
    }//GEN-LAST:event_txtNombreEnfermeraFocusLost

    private void txtNumeroCedulaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNumeroCedulaFocusLost
        if(txtNumeroCedula.getText().equals("")){
            txtNumeroCedula.setText("Ingrese la cédula");
            txtNumeroCedula.setForeground(Color.gray);
        }else{
            txtNumeroCedula.setForeground(Color.black);
        }  
    }//GEN-LAST:event_txtNumeroCedulaFocusLost

    private void txtTelefonoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTelefonoFocusLost
        if(txtTelefono.getText().equals("")){
            txtTelefono.setText("Ingrese el telefono");
            txtTelefono.setForeground(Color.gray);
        }else{
            txtTelefono.setForeground(Color.black);
        } 
    }//GEN-LAST:event_txtTelefonoFocusLost

    private void txtDireccionEnfermeraFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDireccionEnfermeraFocusLost
        if(txtDireccionEnfermera.getText().equals("")){
            txtDireccionEnfermera.setText("Ingrese la dirección general");
            txtDireccionEnfermera.setForeground(Color.gray);
        }else{
            txtDireccionEnfermera.setForeground(Color.black);
        } 
    }//GEN-LAST:event_txtDireccionEnfermeraFocusLost

    private void btnRegistroEnfermeraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroEnfermeraActionPerformed
           if(validarDatos()){//SI LOS DATOS REGISTRADOS SON VALIDOS
                //INICIALIZA UN OBJETO PRESENTACION CON LOS DATOS DE LAS TEXTBOXES
           Enfermera enfermera = new Enfermera();
           enfermera.setEnf_nombre(txtNombreEnfermera.getText());
           enfermera.setEnf_cedula(txtNumeroCedula.getText());
           enfermera.setEnf_tel(txtTelefono.getText());
           enfermera.setEnf_direccion(txtDireccionEnfermera.getText());
            ///Intenta convertir el grupo en numerico para guardarlo en la base de datos
            try {
                    MetodosEnfermera metodosEnfermera = new EnfermeraImplementacion();
                  metodosEnfermera.registrar(enfermera);
                    listarRegistrosEnfermera(); ///Se llama la funcion para actualizar la lista de principio activo
            }catch(Exception r) {
            JOptionPane.showMessageDialog(null,"Error al guardar en la base de datos", "Error al guardar: "+r.getMessage(),0);
            }
            mensajeInformativo("Registro realizado con éxito", "Registro exitoso");
        }else{
            mensajeAdvertencia("Registro no realizado","Error de captura de datos");
        }
        limpiarEnfermera();
        activarEnfermera(false);
    }//GEN-LAST:event_btnRegistroEnfermeraActionPerformed

    private void btnLimpiarEnfermeraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarEnfermeraActionPerformed
     limpiarEnfermera();
    }//GEN-LAST:event_btnLimpiarEnfermeraActionPerformed

    private void cmbOrdenEnfermeraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbOrdenEnfermeraActionPerformed
     listarRegistrosEnfermera();
    }//GEN-LAST:event_cmbOrdenEnfermeraActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
     listarRegistrosEnfermera();
     btnBusquedaEnfermera.setVisible(false);
    }//GEN-LAST:event_formWindowOpened

    private void btnEliminarEnfermeraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarEnfermeraActionPerformed
       MetodosEnfermera metodosEnfermera = new EnfermeraImplementacion();
    int afectadas = -1;

    // Confirmación de eliminación
    if (JOptionPane.showConfirmDialog(null, "¿Está seguro que desea eliminar el registro?\n"
            + "Esta acción será irreversible\n"
            + "Verifique que el registro a eliminar es el deseado",
            "Advertencia de eliminación de datos",
            JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
        try {
            //datos de los campos de texto correspondientes
            String nombre = txtNombreEnfermera.getText();
            String cedula = txtNumeroCedula.getText();
            String telefono = txtTelefono.getText();
            String direccion = txtDireccionEnfermera.getText();

            // Llama al método recuperarId con los parámetros correctos
            int idEnfermera = metodosEnfermera.recuperarId(nombre, cedula, telefono, direccion);

            // Realiza la eliminación si se encontró el ID
            afectadas = metodosEnfermera.eliminarEnfermera(idEnfermera);

            // Actualiza la interfaz
            listarRegistrosEnfermera();
            limpiarEnfermera();
            activarEnfermera(false);
            btnEliminarEnfermera.setEnabled(false);
            btnActualizarEnfermera.setEnabled(false);
            btnLimpiarEnfermera.setEnabled(false);
            btnNewEnfermera.setEnabled(true);
        } catch (Exception ex) {
            Logger.getLogger(InterfazEnfermera.class.getName()).log(Level.SEVERE, null, ex);
        }

        // Mensajes de confirmación o error
        if (afectadas == -1) {
            mensajeAdvertencia("El registro no se ha eliminado debido a un"
                    + " error", "Error de eliminación");
        } else {
            mensajeInformativo("Registro eliminado\n"
                    + "Filas afectadas con la eliminación: " + afectadas, "El registro se ha eliminado");
        }
    }
        
    }//GEN-LAST:event_btnEliminarEnfermeraActionPerformed

    private void btnNewEnfermeraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewEnfermeraActionPerformed
        btnRegistroEnfermera.setEnabled(true);
        txtNombreEnfermera.setEnabled(true);
        txtNumeroCedula.setEnabled(true);
        txtTelefono.setEnabled(true);
        txtDireccionEnfermera.setEnabled(true);
        limpiarEnfermera();
    }//GEN-LAST:event_btnNewEnfermeraActionPerformed

    private void tblEnfermeraFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tblEnfermeraFocusGained
     tblEnfermera.enableInputMethods(false);
    }//GEN-LAST:event_tblEnfermeraFocusGained

    private void btnDeseleccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeseleccionActionPerformed
     btnNewEnfermera.setEnabled(true);
     tblEnfermera.clearSelection();
    }//GEN-LAST:event_btnDeseleccionActionPerformed

    private void txtBuscaEnfermeraKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscaEnfermeraKeyPressed
     listarRegistrosEnfermera();
    }//GEN-LAST:event_txtBuscaEnfermeraKeyPressed

    private void tblEnfermeraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEnfermeraMouseClicked
     if(!tblEnfermera.isEnabled()){

        }else{
            ///Para poder seleccionar algun alumno de la lista y modificarlo o eliminarlo
            int fila = tblEnfermera.getSelectedRow();
            activarEnfermera(true);
            //Se activan solo los botones para actualizar y eliminar
            btnRegistroEnfermera.setEnabled(false);
            btnActualizarEnfermera.setEnabled(true);
            btnEliminarEnfermera.setEnabled(true);
            btnLimpiarEnfermera.setEnabled(false);
            btnNewEnfermera.setEnabled(false);

            //Se recupera la informacion hacia los campos de texto de informacion

            txtNombreEnfermera.setText(tblEnfermera.getValueAt(fila,0).toString());
            txtNumeroCedula.setText(tblEnfermera.getValueAt(fila,1).toString());
            txtTelefono.setText(tblEnfermera.getValueAt(fila,2).toString());
            txtDireccionEnfermera.setText(tblEnfermera.getValueAt(fila,3).toString());
            
        }
    }//GEN-LAST:event_tblEnfermeraMouseClicked

    private void btnActualizarEnfermeraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarEnfermeraActionPerformed
        Enfermera enfermera = new Enfermera();
        MetodosEnfermera metodosEnfermera = new EnfermeraImplementacion();
        int afectadas = -1;

    // Confirmación de actualización
    if (JOptionPane.showConfirmDialog(null, "¿Está seguro que desea modificar el registro?\n"
            + "Verifique que el registro a modificar es el deseado", 
            "Advertencia de modificación de datos",
            JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {         

        try {
            enfermera.setEnf_nombre(txtNombreEnfermera.getText());
            enfermera.setEnf_cedula(txtNumeroCedula.getText());
            enfermera.setEnf_tel(txtTelefono.getText());
            enfermera.setEnf_direccion(txtDireccionEnfermera.getText());

            // Imprimir los valores ingresados para verificación
            System.out.println(txtNombreEnfermera.getText());
            System.out.println(txtNumeroCedula.getText());
            System.out.println(txtTelefono.getText());
            System.out.println(txtDireccionEnfermera.getText());

            // Obtener los valores necesarios desde la tabla para buscar el ID
            String nombre = (String) tblEnfermera.getValueAt(tblEnfermera.getSelectedRow(), 0);
            String cedula = (String) tblEnfermera.getValueAt(tblEnfermera.getSelectedRow(), 1);
            String telefono = (String) tblEnfermera.getValueAt(tblEnfermera.getSelectedRow(), 2);
            String direccion = (String) tblEnfermera.getValueAt(tblEnfermera.getSelectedRow(), 3);

            // Llamar al método recuperarId con los parámetros correctos
            int id = metodosEnfermera.recuperarId(nombre, cedula, telefono, direccion);  
            enfermera.setId_enfermera(id);
            afectadas = metodosEnfermera.modificarEnfermera(enfermera);

            // Actualiza la lista de registros en la interfaz
            listarRegistrosEnfermera();
            // Limpia los campos de la interfaz
            limpiarEnfermera();
            // Desactiva los campos y vuelve al estado inicial de la interfaz
            activarEnfermera(false);

            btnEliminarEnfermera.setEnabled(false);
            btnActualizarEnfermera.setEnabled(false);
            btnLimpiarEnfermera.setEnabled(false);
            btnNewEnfermera.setEnabled(true); 
        } catch (Exception ex) {
            Logger.getLogger(InterfazEnfermera.class.getName()).log(Level.SEVERE, null, ex);
        }  
    } 
    }//GEN-LAST:event_btnActualizarEnfermeraActionPerformed

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
      /* try{
           Home inicio = new Home();
            inicio.setVisible(true);
            // Cerrar la ventana
            dispose();  
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Ocurrió un error",
                    "Error",0);

        }
        */
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
            java.util.logging.Logger.getLogger(InterfazEnfermera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazEnfermera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazEnfermera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazEnfermera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazEnfermera().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane JSCROLL;
    private javax.swing.JButton btnActualizarEnfermera;
    private javax.swing.JButton btnBusquedaEnfermera;
    private javax.swing.JButton btnDeseleccion;
    private javax.swing.JButton btnEliminarEnfermera;
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnLimpiarEnfermera;
    private javax.swing.JButton btnNewEnfermera;
    private javax.swing.JButton btnRegistroEnfermera;
    private javax.swing.JComboBox<String> cmbOrdenEnfermera;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblCedula;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblNombreEnfermera;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JLabel lbl_Enfermera;
    private javax.swing.JPanel pnlEnfermeraDatos;
    private javax.swing.JPanel pnl_RegistrosEnfermera;
    private javax.swing.JTable tblEnfermera;
    private javax.swing.JTextField txtBuscaEnfermera;
    private javax.swing.JTextField txtDireccionEnfermera;
    private javax.swing.JTextField txtNombreEnfermera;
    private javax.swing.JTextField txtNumeroCedula;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
