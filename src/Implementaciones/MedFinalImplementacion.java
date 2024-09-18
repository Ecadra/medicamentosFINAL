
package Implementaciones;

import Database.Conecta;
import Interfaces.MetodosMedFinal;
import Modelos.MedFinal;
import javax.swing.table.DefaultTableModel;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JComboBox;

public class MedFinalImplementacion extends Conecta implements MetodosMedFinal {

    @Override
    public void agregarFinal(MedFinal medFinal) throws Exception {
        
        try{
            
            this.conectar();
            PreparedStatement ST = this.conexion.prepareStatement("INSERT INTO  medicamento_final(mfi_descripcion, mfi_cantidad, mfi_unidad, id_presentacion, id_medicamento) VALUES (?,?,?,?,?)");
            
            ST.setString(1,medFinal.getDescripcion());
            ST.setInt(2,medFinal.getCantidad());
            ST.setString(3,medFinal.getUnidad());
            ST.setInt(4,medFinal.getPresentacion());
            ST.setInt(5,medFinal.getMedicamento());
            
            ST.executeUpdate();
            
        }catch(SQLException err)
        {
            throw err;
        }finally{
            this.cerrar();
        }
        
    }

    @Override
    public void eliminarFinal(MedFinal medFinal) throws Exception {
        try{
            this.conectar();
            PreparedStatement ST =this.conexion.prepareStatement("DELETE FROM  medicamento_final WHERE medicamento_final.id_medfinal = "+medFinal.getIdFinal());
            
            ST.executeUpdate();
        }catch(SQLException err)
        {
            throw err;
        }finally{
            this.cerrar();;
        }
    }

    @Override
    public void actualizarFinal(MedFinal medFinal) throws Exception {
       try{
           this.conectar();
           PreparedStatement ST = this.conexion.prepareStatement("UPDATE medicamento_final "
                   + "set mfi_descripcion = ?, mfi_cantidad = ?, mfi_unidad = ?, id_presentacion = ?, id_medicamento = ? "
                   + "WHERE id_medfinal = " + medFinal.getIdFinal());
            ST.setString(1,medFinal.getDescripcion());
            ST.setInt(2,medFinal.getCantidad());
            ST.setString(3,medFinal.getUnidad());
            ST.setInt(4,medFinal.getPresentacion());
            ST.setInt(5,medFinal.getMedicamento());
            ST.executeUpdate();
       }catch(SQLException err)
       {
           throw err;
       }finally{
           this.cerrar();
       }
           
       
    }

    @Override
    public void rellenarTabla(DefaultTableModel table) throws Exception {
        try{
            this.conectar();
            PreparedStatement ST = this.conexion.prepareStatement("SELECT id_medfinal, mfi_descripcion, mfi_cantidad, "
                    + "mfi_unidad, pre_nombre, mdm_nombre FROM medicamento_final "
                    + "JOIN medicamento ON medicamento_final.id_medicamento = medicamento.id_medicamento "
                    + "JOIN presentacion ON presentacion.id_presentacion = medicamento_final.id_presentacion "
                    + "ORDER BY medicamento_final.id_medfinal DESC LIMIT 50;");
            
            ResultSet rs = ST.executeQuery();
            
            while(rs.next())
            {
                table.addRow(new String[]{rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5), rs.getString(6)});
            }
            
        }catch(SQLException err)
        {
            throw err;
        }finally
        {
            this.cerrar();
        }
    }

    @Override
    public JComboBox obtenerMedico() throws Exception {
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
    public JComboBox obtenerPresentacion() throws Exception {
        JComboBox combo = new JComboBox();
        try{
            this.conectar();
            PreparedStatement ST = this.conexion.prepareStatement("SELECT pre_nombre FROM presentacion;");
            
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
    public int obtenerIdMed(String Medicamento) throws Exception {
        int idMed=0;
        try{
            this.conectar();
            PreparedStatement ST = this.conexion.prepareStatement("SELECT id_medicamento FROM medicamento "
                    + "WHERE medicamento.mdm_nombre="+"\""+Medicamento + "\"");
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
    public int obtenerIdPresentacion(String Presentacion) throws Exception {
        int idPres=0;
        
        try{
            this.conectar();
            PreparedStatement ST = this.conexion.prepareStatement("SELECT id_Presentacion "
                    + "FROM presentacion "
                    + "WHERE presentacion.pre_nombre="+"\""+Presentacion + "\"");
            ResultSet rs=ST.executeQuery();
            
            while(rs.next())
            {
                idPres=rs.getInt(1);
            }
            
        }catch(SQLException err){
            
            throw err;
        }finally{
            this.cerrar();
        }
        
        return idPres;
    }

    @Override
    public void buscar(DefaultTableModel table, int filtro,String busqueda) throws Exception {
       this.conectar();
       
       switch(filtro)
       {
           case (0) ->{
               try{
                   PreparedStatement ST = this.conexion.prepareStatement("SELECT id_medfinal, mfi_descripcion, mfi_cantidad, "
                    + "mfi_unidad, pre_nombre, mdm_nombre FROM medicamento_final "
                    + "JOIN medicamento ON medicamento_final.id_medicamento = medicamento.id_medicamento "
                    + "JOIN presentacion ON presentacion.id_presentacion = medicamento_final.id_presentacion WHERE  medicamento_final.id_medfinal LIKE '"+busqueda+"%'"
                    + "ORDER BY medicamento_final.id_medfinal DESC LIMIT 50;");
                   
                   ResultSet rs = ST.executeQuery();
                   
                   while(rs.next())
                   {
                       table.addRow(new String[]{rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6)});
                   }
               }catch(SQLException err)
               {
                   throw err;
               }
           }
               case (1) ->{
               try{
                   PreparedStatement ST = this.conexion.prepareStatement("SELECT id_medfinal, mfi_descripcion, mfi_cantidad, "
                    + "mfi_unidad, pre_nombre, mdm_nombre FROM medicamento_final "
                    + "JOIN medicamento ON medicamento_final.id_medicamento = medicamento.id_medicamento "
                    + "JOIN presentacion ON presentacion.id_presentacion = medicamento_final.id_presentacion WHERE  presentacion.pre_nombre LIKE '"+busqueda+"%'"
                    + "ORDER BY medicamento_final.id_medfinal DESC LIMIT 50;");
                   
                   ResultSet rs = ST.executeQuery();
                   
                   while(rs.next())
                   {
                       table.addRow(new String[]{rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6)});
                   }
               }catch(SQLException err)
               {
                   throw err;
               }
           }
               case (2) ->{
               try{
                   PreparedStatement ST = this.conexion.prepareStatement("SELECT id_medfinal, mfi_descripcion, mfi_cantidad, "
                    + "mfi_unidad, pre_nombre, mdm_nombre FROM medicamento_final "
                    + "JOIN medicamento ON medicamento_final.id_medicamento = medicamento.id_medicamento "
                    + "JOIN presentacion ON presentacion.id_presentacion = medicamento_final.id_presentacion WHERE  medicamento.mdm_nombre LIKE '"+busqueda+"%'"
                    + "ORDER BY medicamento_final.id_medfinal DESC LIMIT 50;");
                   
                   ResultSet rs = ST.executeQuery();
                   
                   while(rs.next())
                   {
                       table.addRow(new String[]{rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6)});
                   }
               }catch(SQLException err)
               {
                   throw err;
               }
               
           }
               default->{
                   
               }
       }
    }
}
    
    

