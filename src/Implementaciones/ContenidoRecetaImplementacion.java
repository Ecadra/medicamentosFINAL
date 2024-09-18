
package Implementaciones;

import Database.Conecta;
import Interfaces.MetodosContReceta;
import Modelos.ContRec;
import Modelos.MedFinal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

public class ContenidoRecetaImplementacion extends Conecta implements MetodosContReceta{

    @Override
    public void agregarConRec(ContRec contRec) throws Exception {
       try{
           PreparedStatement ST = this.conexion.prepareStatement("INSERT INTO "
                   + "contenido_receta(cont_dosis,descripcion_dosis,cont_interHrs,cont_dias,id_receta,id_medfinal)"
                   + "VALUES(?,?,?,?,?,?)");
           ST.setInt(1,contRec.getDosis());
           ST.setString(2, contRec.getDescripcion());
           ST.setInt(3,contRec.getIntervalo());
           ST.setInt(4, contRec.getDias());
           ST.setInt(5, contRec.getIdReceta());
           ST.setInt(6, contRec.getIdMedicamento());
           
           ST.executeUpdate();
       }catch(SQLException err){
           throw err;
       }finally{
           this.cerrar();
       }
    }

    @Override
    public void eliminarConRec(ContRec contRec) throws Exception {
        try{
            this.conectar();
            PreparedStatement ST = this.conexion.prepareStatement("DELETE FROM contenido_receta WHERE contenido_receta.id_contenido="+contRec.getIdContenido());
            ST.executeUpdate();
        }catch(SQLException err){
            
        }
    }

    @Override
    public void actualizarConRec(ContRec contRec) throws Exception {
       
        try{
            this.conectar();
            PreparedStatement ST = this.conexion.prepareStatement("UPDATE contenido_receta SET "
                    + "cont_dosis = ?,descripcion_dosis= ?, cont_interHrs= ?, cont_dias= ?, id_receta= ?, id_medfinal=? "
                    + "WHERE contenido_receta.id_contenido ="+contRec.getIdContenido());
           ST.setInt(1,contRec.getDosis());
           ST.setString(2, contRec.getDescripcion());
           ST.setInt(3,contRec.getIntervalo());
           ST.setInt(4, contRec.getDias());
           ST.setInt(5, contRec.getIdReceta());
           ST.setInt(6, contRec.getIdMedicamento());
           ST.executeUpdate();
        }catch(SQLException err)
        {
            throw err;
        }
    }

    @Override
    public void rellenarTablaContRec(DefaultTableModel table) throws Exception {
        String tipo=null;
        try{
            this.conectar();
            PreparedStatement ST = this.conexion.prepareStatement("SELECT * FROM contenido_receta ORDER BY contenido_receta.id_contenido DESC LIMIT 50;");
            
            ResultSet rs = ST.executeQuery();
            
            while(rs.next())
            {
                if("tabletas".equals(rs.getString(3))||"tableta".equals(rs.getString(3))||"TABLETA(S)".equals(rs.getString(3)))
                {
                    tipo="CAJA(S)";
                }else{
                    tipo="BOTELLA(S)";
                }
                table.addRow(new String[]{rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5), rs.getString(6),tipo,rs.getString(7), rs.getString(8)});
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
    public void rellenarTablaMedFinal(DefaultTableModel table) throws Exception {
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
    public void buscarMedFinal(DefaultTableModel table,int filtro, String busqueda) throws Exception {
         
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

    @Override
    public void rellenarTablaRec(DefaultTableModel table) throws Exception {
        
        try{
            this.conectar();
            PreparedStatement ST = this.conexion.prepareStatement("SELECT * FROM receta;");
            
            ResultSet rs = ST.executeQuery();
            
            while(rs.next())
            {
                table.addRow(new String[]{rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4)});
            }
        }catch(SQLException err)
        {
            throw err;
        }
    }

    @Override
    public boolean validarRelacion(ContRec conRec) throws Exception {
        boolean bandera = false;
        
        try{
            this.conectar();
            
            PreparedStatement ST = this.conexion.prepareStatement("SELECT id_contenido FROM contenido_receta WHERE contenido_receta.id_receta= "+conRec.getIdReceta()+ " AND contenido_receta.id_medfinal=+"+conRec.getIdMedicamento()+";");
            ResultSet rs=ST.executeQuery();
            
            if(rs.next())
            {
                bandera=true;
            }
        }catch(SQLException err){
            throw err;
        }
        
        return bandera;
    }

    @Override
    public void buscarContRec(DefaultTableModel table,int filtro, String busqueda) throws Exception {
        String tipo=null;
        this.conectar();
       
       switch(filtro)
       {
           case (0) ->{
               try{
                   PreparedStatement ST = this.conexion.prepareStatement("SELECT * FROM contenido_receta "
                           + "WHERE contenido_receta.id_contenido LIKE '"+busqueda+ "%'"
                           + "ORDER BY contenido_receta.id_contenido DESC LIMIT 50;");
                   
                   ResultSet rs = ST.executeQuery();
                   
                   while(rs.next())
                   {
                          if("tabletas".equals(rs.getString(3))||"tableta".equals(rs.getString(3))||"TABLETA(S)".equals(rs.getString(3)))
                         {
                             tipo="CAJA(S)";
                         }else{
                             tipo="BOTELLA(S)";
                         }
                         table.addRow(new String[]{rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5), rs.getString(6),tipo,rs.getString(7), rs.getString(8)});
                   }
               }catch(SQLException err)
               {
                   throw err;
               }
           }
               case (1) ->{
               try{
                   PreparedStatement ST = this.conexion.prepareStatement("SELECT * FROM contenido_receta "
                           + "WHERE contenido_receta.id_receta LIKE '"+busqueda+ "%'"
                           + "ORDER BY contenido_receta.id_contenido DESC LIMIT 50;");
                   
                   ResultSet rs = ST.executeQuery();
                   
                   while(rs.next())
                   {
                         if("tabletas".equals(rs.getString(3))||"tableta".equals(rs.getString(3))||"TABLETA(S)".equals(rs.getString(3)))
                         {
                             tipo="CAJA(S)";
                         }else{
                             tipo="BOTELLA(S)";
                         }
                         table.addRow(new String[]{rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5), rs.getString(6),tipo,rs.getString(7), rs.getString(8)});
                   }
               }catch(SQLException err)
               {
                   throw err;
               }
           }
               case (2) ->{
               try{
                   PreparedStatement ST = this.conexion.prepareStatement("SELECT * FROM contenido_receta "
                           + "WHERE contenido_receta.id_medfinal LIKE '"+busqueda+ "%'"
                           + "ORDER BY contenido_receta.id_contenido DESC LIMIT 50;");
                   
                   ResultSet rs = ST.executeQuery();
                   
                   while(rs.next())
                   {
                         if("tabletas".equals(rs.getString(3))||"tableta".equals(rs.getString(3))||"TABLETA(S)".equals(rs.getString(3)))
                         {
                             tipo="CAJA(S)";
                         }else{
                             tipo="BOTELLA(S)";
                         }
                         table.addRow(new String[]{rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5), rs.getString(6),tipo,rs.getString(7), rs.getString(8)});
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

    @Override
    public void buscarRec(DefaultTableModel table,int filtro, String busqueda) throws Exception {
         this.conectar();
       
       switch(filtro)
       {
           case (0) ->{
               try{
                   PreparedStatement ST = this.conexion.prepareStatement("SELECT * FROM receta WHERE receta.id_receta LIKE '"+busqueda+"%' "
                           + "ORDER BY receta.id_receta;");
                   
                   ResultSet rs = ST.executeQuery();
                   
                   while(rs.next())
                   {
                       table.addRow(new String[]{rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4)});
                   }
               }catch(SQLException err)
               {
                   throw err;
               }
           }
               case (1) ->{
               try{
                   PreparedStatement ST = this.conexion.prepareStatement("SELECT * FROM receta WHERE receta.id_paciente LIKE '"+busqueda+"%' "
                           + "ORDER BY receta.id_receta;");
                   
                   ResultSet rs = ST.executeQuery();
                   
                   while(rs.next())
                   {
                        table.addRow(new String[]{rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4)});
                   }
               }catch(SQLException err)
               {
                   throw err;
               }
           }
               case (2) ->{
               try{
                   PreparedStatement ST = this.conexion.prepareStatement("SELECT * FROM receta WHERE receta.id_medico LIKE '"+busqueda+"%' "
                           + "ORDER BY receta.id_receta;");
                   
                   ResultSet rs = ST.executeQuery();
                   
                   while(rs.next())
                   {
                       table.addRow(new String[]{rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4)});
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
