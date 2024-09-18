/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Implementaciones;

import Database.Conecta;
import Interfaces.MetodosReceta;
import Modelos.Receta;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ADM
 */
public class RecetaImplementacion extends Conecta implements MetodosReceta {
    DefaultTableModel modeloDeTabla;

    @Override
    public int registrarReceta(Receta receta) throws Exception {
       int afectadas;
        try{
            this.conectar();
                    PreparedStatement ST = this.conexion.prepareStatement("INSERT INTO "
                            + "receta(id_medico, id_paciente,rec_fecha)"
                            + "VALUES(?, ?, ?)");
           
                    int id_med = recuperarIdMedico(receta.getMed_nombre()); //Transformación de las variables
                    int id_pac = recuperarIdPaciente(receta.getPac_nombre());
            
                    ST.setInt(1,id_med);
                    ST.setInt(2,id_pac);
                    ST.setDate(3, (Date) receta.getRec_fecha());
                    
                    afectadas = ST.executeUpdate();
        }catch(SQLException err){
            throw err;
        }finally{
            this.cerrar();
        }
        return afectadas;

    }

    @Override
    public ArrayList recuperarNombreMedico() throws Exception {
        //Combo box relleno
        String consulta = "";
        ArrayList medicos = new ArrayList();
        
            consulta = "SELECT medico.med_nombre"
                      + " FROM medico" 
                      + " ORDER BY medico.med_nombre ASC";
            
        ResultSet resultados;
        try{
           this.conectar();
           PreparedStatement ST = this.conexion.prepareStatement(consulta);
           resultados = ST.executeQuery();
           while(resultados.next()){
               medicos.add(resultados.getString(1));
           }
        }catch(Exception err){
                throw err;
        }finally{
                this.cerrar();
                resultados = null;
        }
        return medicos;
    }

    @Override
    public int recuperarIdMedico(String med) throws Exception {
        int idMed=0;
        try{
            this.conectar();
            PreparedStatement ST = this.conexion.prepareStatement("SELECT medico.id_medico FROM medico "
                    + "WHERE medico.med_nombre="+"\""+ med + "\"");
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
    public String buscarNombreMedico(int id_med) throws Exception {
       String consulta = "";
       String nombreMedico = ""; //Inicializacion de las variables a nulo 
              
            consulta = "SELECT medico.med_nombre"
                      + " FROM medico " 
                      + " WHERE medico.id_medico = " + id_med  
                      + " LIMIT 1"; //Construcción de la consulta, se obtiene el nombre
            //con base en el ID
        ResultSet resultados;
        try{
           this.conectar();
           PreparedStatement ST = this.conexion.prepareStatement(consulta);
           resultados = ST.executeQuery();
           while(resultados.next()){
               nombreMedico = resultados.getString(1); //Asignación del string
           }
        }catch(Exception err){
                throw err;
        }finally{
                this.cerrar();
                resultados = null;
        }
         return nombreMedico;
    }

    @Override
    public ArrayList recuperarNombrePaciente() throws Exception {
       String consulta = "";
       ArrayList pacientes = new ArrayList();
        
            consulta = "SELECT paciente.pac_nombre"
                      + " FROM paciente" 
                      + " ORDER BY paciente.pac_nombre ASC";
            
        ResultSet resultados;
        try{
           this.conectar();
           PreparedStatement ST = this.conexion.prepareStatement(consulta);
           resultados = ST.executeQuery();
           while(resultados.next()){
               pacientes.add(resultados.getString(1));
           }
        }catch(Exception err){
                throw err;
        }finally{
                this.cerrar();
                resultados = null;
        }
        return pacientes;

    }

    @Override
    public int recuperarIdPaciente(String pac) throws Exception {
     int idPac=0;
        try{
            this.conectar();
            PreparedStatement ST = this.conexion.prepareStatement("SELECT paciente.id_paciente FROM paciente "
                    + "WHERE paciente.pac_nombre="+"\""+ pac + "\"");
            ResultSet rs=ST.executeQuery();
            
            while(rs.next())
            {
                idPac=rs.getInt(1);
            }
            
        }catch(SQLException err)
        {
            throw err;
        }finally{
            this.cerrar();
        }
        
        return idPac;   
    }

    @Override
    public String buscarNombrePaciente(int id_pac) throws Exception {
         //cambiar los id por nombre
        String consulta = "";
        String nombrePaciente = ""; //Inicializacion de las variables a nulo 
              
            consulta = "SELECT paciente.pac_nombre"
                      + " FROM paciente " 
                      + " WHERE paciente.id_paciente = " + id_pac  
                      + " LIMIT 1"; //Construcción de la consulta, se obtiene el nombre
            //con base en el ID
        ResultSet resultados;
        try{
           this.conectar();
           PreparedStatement ST = this.conexion.prepareStatement(consulta);
           resultados = ST.executeQuery();
           while(resultados.next()){
               nombrePaciente = resultados.getString(1); //Asignación del string
           }
        }catch(Exception err){
                throw err;
        }finally{
                this.cerrar();
                resultados = null;
        }
         return nombrePaciente;
    }

    @Override
    public int recuperarUltimaReceta() throws Exception {
             ResultSet resultados;
            int id = -1;
            try{
                this.conectar();
                PreparedStatement ST= this.conexion.prepareStatement("SELECT MAX(id_receta) FROM receta");
                resultados=ST.executeQuery();
                while(resultados.next()){
                    id = resultados.getInt("MAX(id_receta)");
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
    public int eliminarReceta(int id_receta) throws Exception {
      int registrosAfectados=-1;
        try {
            this.conectar();
            PreparedStatement ST = this.conexion.prepareStatement("DELETE FROM receta "
                    + "WHERE receta.id_receta = ?");
            ST.setInt(1,id_receta);
            registrosAfectados = ST.executeUpdate();
	}catch(Exception err){
            throw err;
	}finally {
            this.cerrar();
	}
        return registrosAfectados;
    }

    @Override
    public int modificarReceta(Receta receta) throws Exception {
     int filasAfectadas = -1;
      int id_pac = 0, id_med = 0;
      Date rec_fecha = null;
        try{
            this.conectar();
            PreparedStatement ST = this.conexion.prepareStatement("UPDATE receta SET id_medico = ?, id_paciente = ?,"
                    + "rec_fecha = ?"
                    + "WHERE receta.id_receta = ?");
            
           id_med = recuperarIdMedico(receta.getMed_nombre()); //Transformación de las variables
           id_pac = recuperarIdPaciente(receta.getPac_nombre());
            
            ST.setInt(1,id_med);
            ST.setInt(2,id_pac);
            ST.setDate(3, (Date) receta.getRec_fecha()); ///pendiente
            ST.setInt(4,receta.getId_receta());
            filasAfectadas = ST.executeUpdate();
        }catch(SQLException err){
            throw err;
        }finally{
            this.cerrar();
        }
        return filasAfectadas;
    }
    
    @Override
    public int recuperarIdReceta(String med, String pac) throws Exception {
        int id = -1;
        int id_pac = 0, id_med = 0;
        ResultSet resultado;

        try{
            this.conectar();
            PreparedStatement ST = this.conexion.prepareStatement("SELECT id_receta FROM receta "
            + "WHERE receta.id_medico = ? AND receta.id_paciente = ? ");
            id_med = recuperarIdMedico(med); //Transformación de las variables
            id_pac = recuperarIdPaciente(pac);
            ST.setInt(1,id_med);
            ST.setInt(2,id_pac);
            resultado = ST.executeQuery();
            while(resultado.next()){
                id = resultado.getInt("id_receta");
            }
        }catch(SQLException err){
            throw err;
        }finally{
            this.cerrar();
        }
        
        return id;

    }

    @Override
    public JComboBox obtenerMedico() throws Exception {
        JComboBox combo = new JComboBox();
        try{
            this.conectar();
            PreparedStatement ST = this.conexion.prepareStatement("SELECT DISTINCT med_nombre FROM medico");
            
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
    public JComboBox obtenerPaciente() throws Exception {
        JComboBox combo = new JComboBox();
        try{
            this.conectar();
            PreparedStatement ST = this.conexion.prepareStatement("SELECT DISTINCT pac_nombre FROM paciente");
            
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
    public void RellenarTablaReceta(DefaultTableModel tabla, Receta receta) throws Exception {
      try {
        this.conectar();
        PreparedStatement ST = this.conexion.prepareStatement(
            "SELECT medico.med_nombre, paciente.pac_nombre, receta.rec_fecha " +
            "FROM receta " +
            "JOIN medico ON medico.id_medico = receta.id_medico " +
            "JOIN paciente ON paciente.id_paciente = receta.id_paciente " +
            "ORDER BY receta.id_medico ASC LIMIT 40"
        );

        ResultSet rs = ST.executeQuery();
        tabla.setRowCount(0);  // Limpiar la tabla antes de rellenarla

        // Iterar sobre los resultados y añadir las filas al modelo de la tabla
        while (rs.next()) {
            tabla.addRow(new Object[]{
                rs.getString(1),  // Nombre del médico
                rs.getString(2),  // Nombre del paciente
                rs.getDate(3)     // Fecha como Date (sin conversión a String)
            });
        }
        
    } catch (SQLException err) {
        throw err;  // Manejo de errores
    } finally {
        this.cerrar();  // Cerrar la conexión en el bloque finally
    }
    
    
    }

    @Override
    public void buscar(DefaultTableModel table, Receta receta, int filtro, String busqueda) throws Exception {
    this.conectar();
        
        switch (filtro) {
            case 0 -> {
                try{
                    PreparedStatement ST = this.conexion.prepareStatement("SELECT medico.med_nombre,"
                    + " paciente.pac_nombre, "
                    + " receta.rec_fecha "
                    + " FROM receta "
                    + "JOIN medico ON medico.id_medico = receta.id_medico "
                    + "JOIN paciente ON paciente.id_paciente = receta.id_paciente "
                    + "WHERE medico.med_nombre LIKE '"+busqueda+"%'"
                    + "ORDER BY medico.med_nombre ASC LIMIT 40");
                    ResultSet rs = ST.executeQuery();
                    while(rs.next()){
                        table.addRow(new String[]{rs.getString(1),rs.getString(2),rs.getString(3)});
                    }
                    
                }catch(Exception e){
                    throw e;
                }
            }
            case 1 -> {
                try{
                    PreparedStatement ST = this.conexion.prepareStatement("SELECT medico.med_nombre,"
                    + " paciente.pac_nombre, "
                    + " receta.rec_fecha "
                    + " FROM receta "
                    + "JOIN medico ON medico.id_medico = receta.id_medico "
                    + "JOIN paciente ON paciente.id_paciente = receta.id_paciente "
                    + "WHERE paciente.pac_nombre LIKE '"+busqueda+"%'"
                    + "ORDER BY paciente.pac_nombre ASC LIMIT 40");
                    ResultSet rs = ST.executeQuery();
                    while(rs.next()){
                        table.addRow(new String[]{rs.getString(1),rs.getString(2),rs.getString(3)});
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
