/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Implementaciones;

import Database.Conecta;
import Interfaces.MetodosAdministracion;
import Modelos.Administracion;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;
import java.sql.Timestamp;

/**
 *
 * @author ADM
 */
public class AdministracionImplementacion extends Conecta implements MetodosAdministracion {

    @Override
    public int registrarAdministracion(Administracion administracion) throws Exception {
      int afectadas;
        try{
            this.conectar();
                    PreparedStatement ST = this.conexion.prepareStatement("INSERT INTO "
                            + "administracion(id_enfermera,id_contenido,adm_estado,adm_detalles,adm_fecha_hr)"
                            + "VALUES(?, ?, ?,?,?)");
           
                    int id_enf = recuperarIdEnfermera(administracion.getEnf_nombre()); //Transformación de las variables
                    int id_con = recuperarIdContenido(administracion.getDescripcion_dosis());
            
                    ST.setInt(1,id_enf);
                    ST.setInt(2,id_con);
                    ST.setBoolean(3, administracion.isAdm_estado());
                    ST.setString(4,administracion.getAdm_detalles());
                    ST.setTimestamp(5, administracion.getAdm_fecha_hr());
                    
                    afectadas = ST.executeUpdate();
        }catch(SQLException err){
            throw err;
        }finally{
            this.cerrar();
        }
        return afectadas;
    }

    @Override
    public ArrayList recuperarNombreEnfermera() throws Exception {
        //Combo box relleno
        String consulta = "";
        ArrayList enfermeras = new ArrayList();
        
            consulta = "SELECT enfermera.enf_nombre"
                      + " FROM enfermera" 
                      + " ORDER BY enfermera.enf_nombre ASC";
            
        ResultSet resultados;
        try{
           this.conectar();
           PreparedStatement ST = this.conexion.prepareStatement(consulta);
           resultados = ST.executeQuery();
           while(resultados.next()){
               enfermeras.add(resultados.getString(1));
           }
        }catch(Exception err){
                throw err;
        }finally{
                this.cerrar();
                resultados = null;
        }
        return enfermeras;
    }

    @Override
    public int recuperarIdEnfermera(String enf) throws Exception {
        int idEnf=0;
        try{
            this.conectar();
            PreparedStatement ST = this.conexion.prepareStatement("SELECT enfermera.id_enfermera FROM enfermera "
                    + "WHERE enfermera.enf_nombre="+"\""+ enf + "\"");
            ResultSet rs=ST.executeQuery();
            
            while(rs.next())
            {
                idEnf=rs.getInt(1);
            }
            
        }catch(SQLException err)
        {
            throw err;
        }finally{
            this.cerrar();
        }
        
        return idEnf;
    }

    @Override
    public String buscarNombreEnfermera(int enf) throws Exception {
      String consulta = "";
      String nombreEnfermera = ""; //Inicializacion de las variables a nulo 
              
            consulta = "SELECT enfermera.enf_nombre"
                      + " FROM enfermera " 
                      + " WHERE enfermera.id_enfermera = " + enf 
                      + " LIMIT 1"; //Construcción de la consulta, se obtiene el nombre
            //con base en el ID
        ResultSet resultados;
        try{
           this.conectar();
           PreparedStatement ST = this.conexion.prepareStatement(consulta);
           resultados = ST.executeQuery();
           while(resultados.next()){
               nombreEnfermera = resultados.getString(1); //Asignación del string
           }
        }catch(Exception err){
                throw err;
        }finally{
                this.cerrar();
                resultados = null;
        }
         return nombreEnfermera;
    }

    @Override
    public ArrayList recuperarNombreMedicamento() throws Exception {
       String consulta = "";
       ArrayList medicamentos = new ArrayList();
        
            consulta = "SELECT medicamento.mdm_nombre"
                      + " FROM medicamento" 
                      + " ORDER BY medicamento.mdm_nombre ASC";
            
        ResultSet resultados;
        try{
           this.conectar();
           PreparedStatement ST = this.conexion.prepareStatement(consulta);
           resultados = ST.executeQuery();
           while(resultados.next()){
               medicamentos.add(resultados.getString(1));
           }
        }catch(Exception err){
                throw err;
        }finally{
                this.cerrar();
                resultados = null;
        }
        return medicamentos;
    }

    @Override
    public int recuperarIdMedicamento(String id_med) throws Exception {
       int idMed=0;
        try{
            this.conectar();
            PreparedStatement ST = this.conexion.prepareStatement("SELECT medicamento.id_medicamento FROM medicamento "
                    + "WHERE medicamento.mdm_nombre="+"\""+ id_med + "\"");
            ResultSet rs=ST.executeQuery();
            
            while(rs.next())
            {
                idMed=rs.getInt(1);
            }
            
        }catch(SQLException err)
        {
            throw err;
        }finally{
            this.cerrar();
        }
        
        return idMed;
    }

    @Override
    public ArrayList recuperarNombreMedicamentoFinal() throws Exception {
      String consulta = "";
       ArrayList medicamentosfinal = new ArrayList();
        
            consulta = "SELECT medicamento_final.mfi_descripcion"
                      + " FROM medicamento_final" 
                      + " ORDER BY medicamento_final.mfi_descripcion";
        ResultSet resultados;
        try{
           this.conectar();
           PreparedStatement ST = this.conexion.prepareStatement(consulta);
           resultados = ST.executeQuery();
           while(resultados.next()){
               medicamentosfinal.add(resultados.getString(1));
           }
        }catch(Exception err){
                throw err;
        }finally{
                this.cerrar();
                resultados = null;
        }
        return medicamentosfinal;
    }

    @Override
    public int recuperarIdMedicamentoFinal(String id_medf) throws Exception {
              int idMedF=0;
        try{
            this.conectar();
            PreparedStatement ST = this.conexion.prepareStatement("SELECT medicamento_final.id_medfinal FROM medicamento_final "
                    + "WHERE medicamento_final.mfi_descripcion="+"\""+ id_medf + "\"");
            ResultSet rs=ST.executeQuery();
            
            while(rs.next())
            {
                idMedF=rs.getInt(1);
            }
            
        }catch(SQLException err)
        {
            throw err;
        }finally{
            this.cerrar();
        }
        
        return idMedF;
    }

    @Override
    public ArrayList recuperarDosis() throws Exception {
       String consulta = "";
       ArrayList dosis = new ArrayList();
        
            consulta = "SELECT contenido_receta.descripcion_dosis"
                      + " FROM contenido_receta" 
                      + " ORDER BY contenido_receta.descripcion_dosis";
        ResultSet resultados;
        try{
           this.conectar();
           PreparedStatement ST = this.conexion.prepareStatement(consulta);
           resultados = ST.executeQuery();
           while(resultados.next()){
               dosis.add(resultados.getString(1));
           }
        }catch(Exception err){
                throw err;
        }finally{
                this.cerrar();
                resultados = null;
        }
        return dosis;
    }

    @Override
    public int recuperarIdContenido(String con) throws Exception {
       int idCon = 0;
    try {
        this.conectar();
        
        PreparedStatement ST = this.conexion.prepareStatement(
            "SELECT contenido_receta.id_contenido FROM contenido_receta WHERE contenido_receta.descripcion_dosis = ?"
        );
        // Asignar el valor del parámetro
        ST.setString(1, con);
        ResultSet rs = ST.executeQuery();
        
        while (rs.next()) {
            idCon = rs.getInt(1);
        }
        } catch (SQLException err) {
        throw err;
        } finally {
        this.cerrar();
        }

        return idCon;
    }

    @Override
    public int recuperarUltimaAdministracion() throws Exception {
       ResultSet resultados;
            int id = -1;
            try{
                this.conectar();
                PreparedStatement ST= this.conexion.prepareStatement("SELECT MAX(id_administracion) FROM administracion");
                resultados=ST.executeQuery();
                while(resultados.next()){
                    id = resultados.getInt("MAX(id_administracion)");
                }
            }catch(SQLException err){
                throw err;
            }finally{
                this.cerrar();
                resultados = null;
            }
            return id;
    }

    @Override
    public int eliminarAdministracion(int id_adm) throws Exception {
       int registrosAfectados=-1;
        try {
            this.conectar();
            PreparedStatement ST = this.conexion.prepareStatement("DELETE FROM administracion "
                    + "WHERE administracion.id_administracion = ?");
            ST.setInt(1,id_adm);
            registrosAfectados = ST.executeUpdate();
	}catch(Exception err){
            throw err;
	}finally {
            this.cerrar();
	}
        return registrosAfectados;
    }

    @Override
    public int modificarAdministracion(Administracion administracion) throws Exception {
        int filasAfectadas = -1;
    int id_enf = 0, id_con = 0;
    PreparedStatement ST = null;

    try {
        this.conectar();
        ST = this.conexion.prepareStatement("UPDATE administracion SET id_enfermera = ?, id_contenido = ?,"
                + "adm_estado = ?, adm_detalles = ?, adm_fecha_hr = ? "
                + "WHERE administracion.id_administracion = ?");
        
        id_enf = recuperarIdEnfermera(administracion.getEnf_nombre());
        id_con = recuperarIdContenido(administracion.getDescripcion_dosis());

        ST.setInt(1, id_enf);
        ST.setInt(2, id_con);
        ST.setBoolean(3, administracion.isAdm_estado());
        ST.setString(4, administracion.getAdm_detalles());

        // Si getAdm_fecha_hr() devuelve un java.util.Date se convierte Timestamp
        java.util.Date fechaHrDate = administracion.getAdm_fecha_hr(); // Obtén la fecha como Date
        if (fechaHrDate != null) {
            Timestamp fechaHrTimestamp = new Timestamp(fechaHrDate.getTime()); // Convierte Date a Timestamp
            ST.setTimestamp(5, fechaHrTimestamp);
        } else {
            ST.setNull(5, java.sql.Types.TIMESTAMP);
        }

        ST.setInt(6, administracion.getId_administracion());
        filasAfectadas = ST.executeUpdate();
    } catch (SQLException err) {
        System.err.println("Error en modificarAdministracion: " + err.getMessage());
        throw err;
    } finally {
        if (ST != null) {
            ST.close();
        }
        this.cerrar();
    }
    return filasAfectadas;
    }

    @Override
    public int recuperarIdAdministracion(String enf, String con) throws Exception {
       int id = -1;
        int id_con = 0, id_enf = 0;
        ResultSet resultado;

        try{
            this.conectar();
            PreparedStatement ST = this.conexion.prepareStatement("SELECT id_administracion FROM administracion "
            + "WHERE administracion.id_enfermera = ? AND administracion.id_contenido = ? ");
            id_enf = recuperarIdEnfermera(enf); //Transformación de las variables
            id_con = recuperarIdContenido(con);
            ST.setInt(1,id_enf);
            ST.setInt(2,id_con);
            resultado = ST.executeQuery();
            while(resultado.next()){
                id = resultado.getInt("id_administracion");
            }
        }catch(SQLException err){
            throw err;
        }finally{
            this.cerrar();
        }
        
        return id;

    }

    @Override
    public JComboBox obtenerEnfermera() throws Exception {
      JComboBox combo = new JComboBox();
        try{
            this.conectar();
            PreparedStatement ST = this.conexion.prepareStatement("SELECT DISTINCT enf_nombre FROM enfermera");
            
            ResultSet rs = ST.executeQuery();
            
            while(rs.next())
            {
                combo.addItem(rs.getString(1));
            }
        }catch(SQLException err)
        {
            throw err;
        }finally
        {
            this.cerrar();
        }
        return combo;
    }

    @Override
    public JComboBox obtenerNombreMed() throws Exception {
       JComboBox combo = new JComboBox();
        try{
            this.conectar();
            PreparedStatement ST = this.conexion.prepareStatement("SELECT DISTINCT mdm_nombre FROM medicamento");
            
            ResultSet rs = ST.executeQuery();
            
            while(rs.next())
            {
                combo.addItem(rs.getString(1));
            }
        }catch(SQLException err)
        {
            throw err;
        }finally
        {
            this.cerrar();
        }
        return combo;
    }

    @Override
    public JComboBox obtenerNombreFi() throws Exception {
      JComboBox combo = new JComboBox();
        try{
            this.conectar();
            PreparedStatement ST = this.conexion.prepareStatement("SELECT DISTINCT mfi_descripcion FROM medicamento_final");
            
            ResultSet rs = ST.executeQuery();
            
            while(rs.next())
            {
                combo.addItem(rs.getString(1));
            }
        }catch(SQLException err)
        {
            throw err;
        }finally
        {
            this.cerrar();
        }
        return combo;
    }

    @Override
    public JComboBox obtenerDosis() throws Exception {
      JComboBox combo = new JComboBox();
        try{
            this.conectar();
            PreparedStatement ST = this.conexion.prepareStatement("SELECT DISTINCT descripcion_dosis FROM contenido_receta");
            
            ResultSet rs = ST.executeQuery();
            
            while(rs.next())
            {
                combo.addItem(rs.getString(1));
            }
        }catch(SQLException err)
        {
            throw err;
        }finally
        {
            this.cerrar();
        }
        return combo;
    }

    @Override
    public void RellenarTablaAdministracion(DefaultTableModel tabla, Administracion administracion) throws Exception {
     try {
        this.conectar();
        PreparedStatement ST = this.conexion.prepareStatement(
            "SELECT enfermera.enf_nombre, contenido_receta.descripcion_dosis, " +
            "administracion.adm_estado, administracion.adm_detalles, " +
            "administracion.adm_fecha_hr " +
            "FROM administracion " +
            "JOIN enfermera ON enfermera.id_enfermera = administracion.id_enfermera " +
            "JOIN contenido_receta ON contenido_receta.id_contenido = administracion.id_contenido " +
            "ORDER BY administracion.id_administracion ASC LIMIT 40"
        );

        ResultSet rs = ST.executeQuery();
        tabla.setRowCount(0); // Limpiar la tabla antes de llenarla
        while (rs.next()) {
            // Obtener el valor booleano de adm_estado y convertirlo a "Sí" o "No"
            String admEstado = rs.getBoolean("adm_estado") ? "Sí" : "No"; 
            // Obtener el Timestamp
            Timestamp admFechaHr = rs.getTimestamp("adm_fecha_hr");
            // Agregar la fila con todos los valores necesarios
            tabla.addRow(new Object[]{
                rs.getString("enf_nombre"),                // Nombre de la enfermera
                rs.getString("descripcion_dosis"),        // Descripción de la dosis          // Descripción del medicamento final
                admEstado,                                // Estado convertido a "Sí" o "No"
                rs.getString("adm_detalles"),             // Detalles de la administración
                admFechaHr                               // Fecha y hora de la administración
            });
        }
    } catch (SQLException err) {
        throw err;
    } finally {
        this.cerrar(); // Cierra la conexión
    }
    }

    @Override
    public void buscar(DefaultTableModel table, Administracion administracion, int filtro, String busqueda) throws Exception {
    this.conectar();
        
        switch (filtro) {
            case 0 -> {
                try{
                    PreparedStatement ST = this.conexion.prepareStatement("SELECT enfermera.enf_nombre,"
                    + " contenido_receta.descripcion_dosis, "
                    + " administracion.adm_estado, "
                    + " administracion.adm_detalles, "
                    + " administracion.adm_fecha_hr "
                    + " FROM administracion "
                    + "JOIN enfermera ON enfermera.id_enfermera = administracion.id_enfermera "
                    + "JOIN contenido_receta ON contenido_receta.id_contenido = administracion.id_contenido "
                    + "WHERE enfermera.enf_nombre LIKE '"+busqueda+"%'"
                    + "ORDER BY enfermera.enf_nombre ASC LIMIT 40");
                    ResultSet rs = ST.executeQuery();
                    while(rs.next()){
                        table.addRow(new String[]{rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5)});
                    }
                    
                }catch(Exception e){
                    throw e;
                }
            }

                default -> {
            }
        }
        
        this.cerrar();
    }
}
