package Interfaces;

import Implementaciones.ComposicionImplementacion;
import Modelos.Composicion;
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;



/**
 *
 * @author ulseg
 */
public class InterfazComposicion extends javax.swing.JFrame {
    
    DefaultTableModel model; //Definición del DTM
    Composicion composicion = new Composicion();
    ComposicionImplementacion compImp = new ComposicionImplementacion();
    
    public InterfazComposicion() throws Exception {
        initComponents();
        
                     
        model=(DefaultTableModel) tblComposicion.getModel(); //Creación del DTM
        CrearTabla();
        initCmbPrin(cmbPrinComp);
        initCmbMed(cmbMedComp);
        this.setLocationRelativeTo(null);
        
    }
    
    public void CrearTabla()
    {
        model.setRowCount(0);   
        
        try{
            compImp.rellenarTabla(model, composicion);
        }catch(Exception err)
        {
            
        }
    }
    
    private void CrearTablaBuscar(String busqueda) throws Exception
    {
        model.setRowCount(0);
        compImp.buscar(model, composicion, cmbAtributoComposicion.getSelectedIndex(), busqueda);
        
    }
    public void mensajeAdvertencia(String mensaje, String titulo){
        JOptionPane.showMessageDialog(null,mensaje,titulo,0);
    }
    public void mensajeInformativo(String mensaje, String titulo){
        JOptionPane.showInternalMessageDialog(null, mensaje, titulo, JOptionPane.INFORMATION_MESSAGE);
    }
    
    public void activarPresentacion(boolean activado){
        pnlComposicionDatos.setEnabled(activado);
        txtCantComp.setEnabled(activado);
        lblCantidadComposicion.setEnabled(activado);
        btnLimpiarComposicion.setEnabled(activado);
        btnRegistroComposicion.setEnabled(activado);
    }
    
    public void limpiarComposicion(){
        ///Se limpia el campo de texto
        txtCantComp.setText("");
        cmbUnidadComp.setSelectedIndex(0);
        cmbMedComp.setSelectedIndex(0);
        cmbPrinComp.setSelectedIndex(0);
    }
    
    
    
    public final void initCmbMed(JComboBox comb) throws Exception{
        MetodosComposicion m = new ComposicionImplementacion();
        JComboBox combo= m.obtenerMedicamento();
        comb.setModel(combo.getModel());
    }
    
    public final void initCmbPrin(JComboBox comb) throws Exception{
        MetodosComposicion m = new ComposicionImplementacion();
        JComboBox combo= m.obtenerPrincipio();
        comb.setModel(combo.getModel());
    }
    
    
    public boolean validarDatos(){
        if(txtCantComp.getText().equals("") || 
                txtCantComp.getText().equals("Cantidad de la composición") || 
                txtCantComp.getText().equals("Ingrese la cantidad de la composición")){
            ///En caso de que no se haya registrado un nombre
            mensajeAdvertencia("La cantidad es inválida.\n"
                    + "Favor de verificar que:\n"
                    + "-> Solo contenga números enteros\n"
                    + "-> No contenga caracteres especiales\n"
                    + "-> Haya registrado correctamente el nombre de la presentación\n","Nombre inválido");
            return false;
        }
        return true;
    }   
    
    /*public int indiceCombos(String palabraIdentificador, JComboBox comboBox ){ //Recibe una palabra
        //Y un tipo de objeto combo box
        int id = -1;
        
        // Iterar sobre los elementos del JComboBox
        
        System.out.println(comboBox.getItemCount());
        for (int i = 0; i < comboBox.getItemCount(); i++) {
            // Comparar el String de la opción con el parámetro palabraIdentificador
           
            if (comboBox.getItemAt(i).equals(palabraIdentificador)) {
                id = i+1; // Si coincide, se guarda el índice
                break;  // Terminar el bucle
            }
        }
        return id; // Devolver el índice encontrado o -1 si no se encontró

    }*/

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        btnNewComposicion = new javax.swing.JButton();
        pnlComposicionDatos = new javax.swing.JPanel();
        lblCantidadComposicion = new javax.swing.JLabel();
        txtCantComp = new javax.swing.JTextField();
        btnRegistroComposicion = new javax.swing.JButton();
        btnEliminarComposicion = new javax.swing.JButton();
        btnActualizarComposicion = new javax.swing.JButton();
        btnLimpiarComposicion = new javax.swing.JButton();
        lblUnidadComposicion = new javax.swing.JLabel();
        cmbUnidadComp = new javax.swing.JComboBox<>();
        lblMedComp = new javax.swing.JLabel();
        lblPrinComp = new javax.swing.JLabel();
        cmbMedComp = new javax.swing.JComboBox<>();
        cmbPrinComp = new javax.swing.JComboBox<>();
        pnlRegistrosComposicion = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblComposicion = new javax.swing.JTable();
        txtBusqueda = new javax.swing.JTextField();
        lblBusqueda = new javax.swing.JLabel();
        cmbAtributoComposicion = new javax.swing.JComboBox<>();
        lblAtributoMedicamento = new javax.swing.JLabel();
        btnDeseleccionComposicion = new javax.swing.JButton();
        btnInicio = new javax.swing.JButton();

        jToolBar1.setRollover(true);

        jScrollPane2.setViewportView(jTextPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        btnNewComposicion.setText("Nueva Composición");
        btnNewComposicion.setActionCommand("Nuevo Principio");
        btnNewComposicion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewComposicionActionPerformed(evt);
            }
        });

        pnlComposicionDatos.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Datos de la composición"));
        pnlComposicionDatos.setToolTipText("");
        pnlComposicionDatos.setEnabled(false);

        lblCantidadComposicion.setText("Cantidad:");
        lblCantidadComposicion.setEnabled(false);

        txtCantComp.setText("Cantidad de la composición");
        txtCantComp.setEnabled(false);
        txtCantComp.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCantCompFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCantCompFocusLost(evt);
            }
        });

        btnRegistroComposicion.setText("Registrar composición");
        btnRegistroComposicion.setEnabled(false);
        btnRegistroComposicion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroComposicionActionPerformed(evt);
            }
        });

        btnEliminarComposicion.setText("Eliminar composición");
        btnEliminarComposicion.setEnabled(false);
        btnEliminarComposicion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarComposicionActionPerformed(evt);
            }
        });

        btnActualizarComposicion.setText("Actualizar composición ");
        btnActualizarComposicion.setEnabled(false);
        btnActualizarComposicion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarComposicionActionPerformed(evt);
            }
        });

        btnLimpiarComposicion.setText("Limpiar campos");
        btnLimpiarComposicion.setEnabled(false);
        btnLimpiarComposicion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarComposicionActionPerformed(evt);
            }
        });

        lblUnidadComposicion.setText("Tipo de unidad:");
        lblUnidadComposicion.setEnabled(false);

        cmbUnidadComp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "mg", "ml" }));

        lblMedComp.setText("Medicamento:");
        lblMedComp.setEnabled(false);

        lblPrinComp.setText("Principio activo:");
        lblPrinComp.setEnabled(false);

        javax.swing.GroupLayout pnlComposicionDatosLayout = new javax.swing.GroupLayout(pnlComposicionDatos);
        pnlComposicionDatos.setLayout(pnlComposicionDatosLayout);
        pnlComposicionDatosLayout.setHorizontalGroup(
            pnlComposicionDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlComposicionDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlComposicionDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlComposicionDatosLayout.createSequentialGroup()
                        .addGroup(pnlComposicionDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblMedComp)
                            .addComponent(lblUnidadComposicion)
                            .addComponent(lblCantidadComposicion)
                            .addComponent(lblPrinComp))
                        .addGroup(pnlComposicionDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlComposicionDatosLayout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(txtCantComp, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlComposicionDatosLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbUnidadComp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlComposicionDatosLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlComposicionDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cmbPrinComp, 0, 239, Short.MAX_VALUE)
                                    .addComponent(cmbMedComp, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 148, Short.MAX_VALUE)
                        .addGroup(pnlComposicionDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnRegistroComposicion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEliminarComposicion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnActualizarComposicion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(pnlComposicionDatosLayout.createSequentialGroup()
                        .addComponent(btnLimpiarComposicion)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlComposicionDatosLayout.setVerticalGroup(
            pnlComposicionDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlComposicionDatosLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(pnlComposicionDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCantidadComposicion)
                    .addComponent(txtCantComp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegistroComposicion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlComposicionDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnEliminarComposicion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlComposicionDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblUnidadComposicion)
                        .addComponent(cmbUnidadComp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(pnlComposicionDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlComposicionDatosLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(btnActualizarComposicion))
                    .addGroup(pnlComposicionDatosLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlComposicionDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblMedComp)
                            .addComponent(cmbMedComp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlComposicionDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPrinComp)
                    .addComponent(cmbPrinComp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(btnLimpiarComposicion)
                .addContainerGap())
        );

        pnlRegistrosComposicion.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Registros existentes:"));

        tblComposicion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Medicamento", "Principio Activo", "Cantidad", "Unidad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblComposicion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblComposicionMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblComposicion);

        txtBusqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBusquedaKeyReleased(evt);
            }
        });

        lblBusqueda.setText("Búsqueda");

        cmbAtributoComposicion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Medicamento", "Principio Activo", "Cantidad Composicion" }));

        lblAtributoMedicamento.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblAtributoMedicamento.setText("Filtrar por:");

        javax.swing.GroupLayout pnlRegistrosComposicionLayout = new javax.swing.GroupLayout(pnlRegistrosComposicion);
        pnlRegistrosComposicion.setLayout(pnlRegistrosComposicionLayout);
        pnlRegistrosComposicionLayout.setHorizontalGroup(
            pnlRegistrosComposicionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlRegistrosComposicionLayout.createSequentialGroup()
                .addGroup(pnlRegistrosComposicionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlRegistrosComposicionLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlRegistrosComposicionLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(lblBusqueda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(lblAtributoMedicamento, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmbAtributoComposicion, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(50, 50, 50))
        );
        pnlRegistrosComposicionLayout.setVerticalGroup(
            pnlRegistrosComposicionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRegistrosComposicionLayout.createSequentialGroup()
                .addGroup(pnlRegistrosComposicionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBusqueda)
                    .addComponent(cmbAtributoComposicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAtributoMedicamento))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnDeseleccionComposicion.setText("Cancelar");
        btnDeseleccionComposicion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeseleccionComposicionActionPerformed(evt);
            }
        });

        btnInicio.setText("Regresar al menú principal");
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pnlComposicionDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addComponent(btnInicio)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDeseleccionComposicion)
                            .addGap(33, 33, 33)
                            .addComponent(btnNewComposicion))
                        .addComponent(pnlRegistrosComposicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 68, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(pnlComposicionDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlRegistrosComposicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNewComposicion)
                    .addComponent(btnDeseleccionComposicion)
                    .addComponent(btnInicio))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlComposicionDatos.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCantCompFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCantCompFocusGained
        if(txtCantComp.getText().equals("Cantidad de la composicióon") || 
                txtCantComp.getText().equals("Ingrese la cantidad de la composición")){
            txtCantComp.setText("");
        }
    }//GEN-LAST:event_txtCantCompFocusGained

    private void txtCantCompFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCantCompFocusLost
        if(txtCantComp.getText().equals("")){
            txtCantComp.setText("Ingrese la cantidad de la composición");
            txtCantComp.setForeground(Color.gray);
        }else{
            txtCantComp.setForeground(Color.black);
        }
    }//GEN-LAST:event_txtCantCompFocusLost

    private void btnRegistroComposicionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroComposicionActionPerformed
        boolean  error= false;
        int cantidad=0;
        if("".equals(txtCantComp.getText())){
            JOptionPane.showMessageDialog(null, "Debe de especificar una cantidad","Error",0);
            error=true;
        }else{
            try{
                if(Integer.parseInt(txtCantComp.getText())<=0 )
                {
                    JOptionPane.showMessageDialog(null, "La cantidad debe de ser mayor a 0","Error",0);
                    error=true;
                    txtCantComp.setText("");
                }else
                {
                    cantidad=Integer.parseInt(txtCantComp.getText());
                }
            }catch(NumberFormatException err){
                txtCantComp.setText("");
                error=true;
                JOptionPane.showMessageDialog(null, "La cantidad debe de ser numérica","Error",0);
            }       
        
        }
        
        if(validarDatos()){//SI LOS DATOS REGISTRADOS SON VALIDOS
                //INICIALIZA UN OBJETO PRESENTACION CON LOS DATOS DE LAS TEXTBOXES
            Composicion composicion = new Composicion();
            composicion.setNombreMedicamento((String) cmbMedComp.getSelectedItem());
            composicion.setNombrePrincipio((String) cmbPrinComp.getSelectedItem());
            composicion.setCompConcentracion(cantidad);
            composicion.setCompUnidades((String) cmbUnidadComp.getSelectedItem());
            
            ///Intenta convertir el grupo en numerico para guardarlo en la base de datos
            try {
                    MetodosComposicion metodosComposicion = new ComposicionImplementacion();
                    metodosComposicion.registrarComposicion(composicion);
                    
                    ///Se llama la funcion para actualizar la lista
            }catch(Exception r) {
            JOptionPane.showMessageDialog(null,"Error al guardar en la base de datos", "Error al guardar: "+r.getMessage(),0);
            }
            mensajeInformativo("Registro realizado con éxito", "Registro exitoso");
        }else{
            mensajeAdvertencia("Registro no realizado","Error de captura de datos");
        }
        limpiarComposicion();
        activarPresentacion(false);
        CrearTabla();
    }//GEN-LAST:event_btnRegistroComposicionActionPerformed

    
    private void btnLimpiarComposicionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarComposicionActionPerformed
        limpiarComposicion();//Llama a la función limpiar
    }//GEN-LAST:event_btnLimpiarComposicionActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        CrearTabla();
    }//GEN-LAST:event_formWindowOpened

    private void btnEliminarComposicionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarComposicionActionPerformed
        MetodosComposicion metodosComposicion = new ComposicionImplementacion();
        int afectadas = -1;
        if(JOptionPane.showConfirmDialog(null, "¿Está seguro que desea eliminar el registro?\n"
                + "Esta acción será irreversible\n"
                + "Verifique que el registro a eliminar es el deseado", 
                "Advertencia de eliminación de datos",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
            try {
                afectadas = metodosComposicion.eliminarComposicion(
                        metodosComposicion.recuperarIdComposicion(
                                (String) cmbMedComp.getSelectedItem(),
                                (String)cmbPrinComp.getSelectedItem()));
          
                limpiarComposicion();
                activarPresentacion(false);
                btnEliminarComposicion.setEnabled(false);
                btnActualizarComposicion.setEnabled(false);
                btnLimpiarComposicion.setEnabled(false);
                btnNewComposicion.setEnabled(true);
            }catch(Exception ex){
                Logger.getLogger(InterfazComposicion.class.getName()).log(Level.SEVERE, null, ex);
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
    }//GEN-LAST:event_btnEliminarComposicionActionPerformed

    private void btnActualizarComposicionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarComposicionActionPerformed
        boolean  error= false;
        int cantidad=0;
        Composicion composicion = new Composicion();
        MetodosComposicion metodosComposicion = new ComposicionImplementacion();
        int afectadas=-1;
        if(JOptionPane.showConfirmDialog(null, "¿Está seguro que desea modificar el registro?\n"
                + "Verifique que el registro a modificar es el deseado", 
                "Advertencia de modificación de datos",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){         
            
            try{
                
               if("".equals(txtCantComp.getText())){
                JOptionPane.showMessageDialog(null, "Debe de especificar una cantidad","Error",0);
                error=true;
            }else{
                try{
                    if(Integer.parseInt(txtCantComp.getText())<=0 )
                    {
                        JOptionPane.showMessageDialog(null, "La cantidad debe de ser mayor a 0","Error",0);
                        error=true;
                        txtCantComp.setText("");
                    }else
                    {
                        cantidad=Integer.parseInt(txtCantComp.getText());
                        composicion.setNombreMedicamento((String)cmbMedComp.getSelectedItem());
                        System.out.println((String)cmbMedComp.getSelectedItem());
                        composicion.setNombrePrincipio((String)cmbPrinComp.getSelectedItem());
                        System.out.println((String)cmbPrinComp.getSelectedItem());
                        composicion.setCompConcentracion(cantidad);
                        composicion.setCompUnidades((String) cmbUnidadComp.getSelectedItem());
                        int id = metodosComposicion.recuperarIdComposicion(
                                (String)(tblComposicion.getValueAt(tblComposicion.getSelectedRow(), 0)),
                                (String)(tblComposicion.getValueAt(tblComposicion.getSelectedRow(), 1))
                                );  
                        //System.out.println("El id es: " + id);   Es una bandera
                        composicion.setIdComposicion(id);
                        afectadas = metodosComposicion.modificarComposicion(composicion); 
                        //System.out.println("Las afectadas fueron: " + afectadas); 


                         ///Limpia los campos de informacion
                         limpiarComposicion();
                         ///Desactiva los campos y regresa al estado inicial de la interfaz
                         activarPresentacion(false);

                         btnEliminarComposicion.setEnabled(false);
                         btnActualizarComposicion.setEnabled(false);
                         btnLimpiarComposicion.setEnabled(false);
                         btnNewComposicion.setEnabled(true); 
                    }
                }catch(NumberFormatException err){
                    txtCantComp.setText("");
                    error=true;
                    JOptionPane.showMessageDialog(null, "La cantidad debe de ser numérica","Error",0);
                }       

            }
               
            }catch(Exception ex){
                Logger.getLogger(InterfazComposicion.class.getName()).log(Level.SEVERE, null, ex);
            }  
        } 
        CrearTabla();
    }//GEN-LAST:event_btnActualizarComposicionActionPerformed

    private void btnDeseleccionComposicionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeseleccionComposicionActionPerformed
        btnNewComposicion.setEnabled(true);
        tblComposicion.clearSelection();
        limpiarComposicion();
        btnEliminarComposicion.setEnabled(false);
        btnActualizarComposicion.setEnabled(false);
        btnRegistroComposicion.setEnabled(false);
    }//GEN-LAST:event_btnDeseleccionComposicionActionPerformed

    private void tblComposicionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblComposicionMouseClicked
        if(!tblComposicion.isEnabled()){

        }else{
            ///Para poder seleccionar algun alumno de la lista y modificarlo o eliminarlo
            activarPresentacion(true);
            //Se activan solo los botones para actualizar y eliminar
            btnRegistroComposicion.setEnabled(false);
            btnActualizarComposicion.setEnabled(true);
            btnEliminarComposicion.setEnabled(true);
            btnLimpiarComposicion.setEnabled(false);
            btnNewComposicion.setEnabled(false);

            
            
           
            cmbMedComp.setSelectedItem(tblComposicion.getValueAt(tblComposicion.getSelectedRow(), 0));
            cmbUnidadComp.setSelectedItem(tblComposicion.getValueAt(tblComposicion.getSelectedRow(),3));
            cmbPrinComp.setSelectedItem(tblComposicion.getValueAt(tblComposicion.getSelectedRow(), 1));
            txtCantComp.setText(tblComposicion.getValueAt(tblComposicion.getSelectedRow(),2).toString());
        }
    }//GEN-LAST:event_tblComposicionMouseClicked

    private void btnNewComposicionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewComposicionActionPerformed
        btnRegistroComposicion.setEnabled(true);
        txtCantComp.setEnabled(true);
        limpiarComposicion();
    }//GEN-LAST:event_btnNewComposicionActionPerformed

    private void txtBusquedaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBusquedaKeyReleased
        try {
            CrearTablaBuscar(txtBusqueda.getText());
        } catch (Exception ex) {
            Logger.getLogger(InterfazComposicion.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_txtBusquedaKeyReleased

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
        //FlatLaf.registerCustomDefaultsSource("propiedades");
        //FlatIntelliJLaf.setup();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new InterfazComposicion().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(InterfazComposicion.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizarComposicion;
    private javax.swing.JButton btnDeseleccionComposicion;
    private javax.swing.JButton btnEliminarComposicion;
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnLimpiarComposicion;
    private javax.swing.JButton btnNewComposicion;
    private javax.swing.JButton btnRegistroComposicion;
    private javax.swing.JComboBox<String> cmbAtributoComposicion;
    private javax.swing.JComboBox<String> cmbMedComp;
    private javax.swing.JComboBox<String> cmbPrinComp;
    private javax.swing.JComboBox<String> cmbUnidadComp;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lblAtributoMedicamento;
    private javax.swing.JLabel lblBusqueda;
    private javax.swing.JLabel lblCantidadComposicion;
    private javax.swing.JLabel lblMedComp;
    private javax.swing.JLabel lblPrinComp;
    private javax.swing.JLabel lblUnidadComposicion;
    private javax.swing.JPanel pnlComposicionDatos;
    private javax.swing.JPanel pnlRegistrosComposicion;
    private javax.swing.JTable tblComposicion;
    private javax.swing.JTextField txtBusqueda;
    private javax.swing.JTextField txtCantComp;
    // End of variables declaration//GEN-END:variables
}
