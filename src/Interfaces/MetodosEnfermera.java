/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces;
import javax.swing.table.DefaultTableModel;
import Modelos.Enfermera;

/**
 *
 * @author ADM
 */
public interface MetodosEnfermera {
    public void registrar(Enfermera enfermera) throws Exception;
    public int recuperarUltimaEnfermera() throws Exception;
    public DefaultTableModel recuperarRegistros(int criterio, String filtro) throws Exception;
    public DefaultTableModel setTitulos() throws Exception;
    public int eliminarEnfermera(int id_enfermera) throws Exception;
    public int modificarEnfermera(Enfermera enfermera) throws Exception;
    public int recuperarId(String nombre, String cedula, String tel, String direccion)throws Exception;
    public Enfermera buscarEnfermera(String enf_nombre) throws Exception;
    
}
