/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Implementaciones;
import java.sql.PreparedStatement;
import Database.Conecta;
import Interfaces.MetodosEnfermera;
import Modelos.Enfermera;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ADM
 */
public class EnfermeraImplementacion extends Conecta implements MetodosEnfermera{
     DefaultTableModel modeloDeTabla;
    
     
    @Override
    public void registrar(Enfermera enfermera) throws Exception {
        try {
            this.conectar();
                PreparedStatement ST = this.conexion.prepareStatement("INSERT INTO enfermera(enf_nombre,enf_cedula,enf_tel,enf_direccion) VALUES (?,?,?,?)");
                ST.setString(1,enfermera.getEnf_nombre());
                ST.setString(2,enfermera.getEnf_cedula());
                ST.setString(3,enfermera.getEnf_tel());
                ST.setString(4,enfermera.getEnf_direccion());
                
                ST.executeUpdate();
            }catch(SQLException err){
                    throw err;
            }finally {
                    this.cerrar();
        }	
    }

    @Override
    public int recuperarUltimaEnfermera() throws Exception {
        ResultSet resultados;
            int id = -1;
            try{
                this.conectar();
                PreparedStatement ST= this.conexion.prepareStatement("SELECT MAX(id_enfermera) FROM enfermera");
                resultados=ST.executeQuery();
                while(resultados.next()){
                    id = resultados.getInt("MAX(id_enfermera)");
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
    public DefaultTableModel recuperarRegistros(int criterio, String filtro) throws Exception {
    String consulta = "";
    filtro = "'" + filtro + "%'";
    if (criterio == 0) {
        consulta = "SELECT enfermera.enf_nombre, enfermera.enf_cedula, enfermera.enf_tel, enfermera.enf_direccion " +
                   "FROM enfermera WHERE enfermera.enf_nombre LIKE " + filtro + 
                   " ORDER BY enfermera.enf_nombre ASC LIMIT 40";
    } else if (criterio == 1) {
        consulta = "SELECT enfermera.enf_nombre, enfermera.enf_cedula, enfermera.enf_tel, enfermera.enf_direccion " +
                   "FROM enfermera WHERE enfermera.enf_nombre LIKE " + filtro + 
                   " ORDER BY enfermera.enf_nombre DESC LIMIT 40";
    }        
    this.setTitulos();
    ResultSet resultados;
    try{
           this.conectar();
           PreparedStatement ST = this.conexion.prepareStatement(consulta);
           resultados = ST.executeQuery();
           Object[] fila = new Object[4];
           while(resultados.next()){
               fila[0] = resultados.getString(1);
               fila[1] = resultados.getString(2);
               fila[2] = resultados.getString(3);
               fila[3] = resultados.getString(4);
               modeloDeTabla.addRow(fila);
           }
       }catch(Exception err){
           throw err;
       }finally{
           this.cerrar();
           resultados = null;
       }
       return modeloDeTabla;
}



    @Override
    public DefaultTableModel setTitulos() throws Exception {
        modeloDeTabla = new DefaultTableModel();
        modeloDeTabla.addColumn("Nombre enfermera");
        modeloDeTabla.addColumn("Cedula");
        modeloDeTabla.addColumn("Telefono");
        modeloDeTabla.addColumn("Dirección");
        return modeloDeTabla;
    }

    @Override
    public int eliminarEnfermera(int id_enfermera) throws Exception {
     int registrosAfectados = -1;

    try {
        this.conectar();
        // Corrige la consulta SQL añadiendo un espacio antes de 'WHERE'
        PreparedStatement ST = this.conexion.prepareStatement("DELETE FROM enfermera WHERE id_enfermera = ?");
        ST.setInt(1, id_enfermera); // Asigna el valor del ID al parámetro
        registrosAfectados = ST.executeUpdate();
    } catch (Exception err) {
        throw err;
    } finally {
        this.cerrar(); // Asegúrate de cerrar la conexión correctamente
    }

    return registrosAfectados;
    }

    @Override
    public int modificarEnfermera(Enfermera enfermera) throws Exception {
      int filasAfectadas = -1;
        try{
            this.conectar();
            PreparedStatement ST = this.conexion.prepareStatement("UPDATE enfermera SET enf_nombre = ?,enf_cedula = ?, enf_tel = ?, enf_direccion = ? "
            + "WHERE id_enfermera = ?");
            ST.setString(1,enfermera.getEnf_nombre());
            ST.setString(2,enfermera.getEnf_cedula());
            ST.setString(3, enfermera.getEnf_tel());
            ST.setString(4,enfermera.getEnf_direccion());
            ST.setInt(5,enfermera.getId_enfermera());
            filasAfectadas = ST.executeUpdate();
        }catch(SQLException err){
            throw err;
        }finally{
            this.cerrar();
        }
        return filasAfectadas;
    }

    @Override
    public int recuperarId(String nombre,String cedula, String telefono, String direccion) throws Exception {
       int id = -1;
        ResultSet resultado;

        try{
            this.conectar();
            PreparedStatement ST = this.conexion.prepareStatement("SELECT id_enfermera FROM enfermera WHERE enf_nombre = ? AND enf_cedula = ? AND enf_tel = ? AND enf_direccion = ?");
            ST.setString(1,nombre);
            ST.setString(2,cedula);
            ST.setString(3,telefono);
            ST.setString(4,direccion);
            resultado = ST.executeQuery();
            while(resultado.next()){
                id = resultado.getInt("id_enfermera");
            }
        }catch(SQLException err){
            throw err;
        }finally{
            this.cerrar();
        }
        
        return id;
    }

    @Override
    public Enfermera buscarEnfermera(String parametro) throws Exception {
          Enfermera enfermera = new Enfermera();
    ResultSet resultado = null;
    try {
        this.conectar();
        // Verifica si el parámetro es numérico (cedula) o texto (nombre)
        String query;
        PreparedStatement ST;
        if (parametro.matches("\\d+")) { // Si solo contiene dígitos, es cédula
            query = "SELECT enf_nombre, enf_cedula FROM enfermera WHERE enf_cedula = ?";
            ST = this.conexion.prepareStatement(query);
            ST.setString(1, parametro);
        } else { // De lo contrario, es nombre
            query = "SELECT enf_nombre, enf_cedula FROM enfermera WHERE enf_nombre = ?";
            ST = this.conexion.prepareStatement(query);
            ST.setString(1, parametro);
        }

        resultado = ST.executeQuery();

        // Recorre el ResultSet y captura los valores
        if (resultado.next()) {
            enfermera.setEnf_nombre(resultado.getString("enf_nombre"));
            enfermera.setEnf_cedula(resultado.getString("enf_cedula"));
        }
    } catch (SQLException err) {
        throw err;
    } finally {
        // Asegúrate de cerrar la conexión y liberar recursos
        this.cerrar();
        if (resultado != null) {
            resultado.close();
        }
    }
    return enfermera;
    }
     
}
