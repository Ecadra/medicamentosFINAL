/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces;
import Modelos.Receta;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ADM
 */
public interface MetodosReceta {
    public int registrarReceta(Receta receta) throws Exception;
    public ArrayList recuperarNombreMedico() throws Exception;
    public int recuperarIdMedico(String med) throws Exception;
    public String buscarNombreMedico(int id_med) throws Exception;
    public ArrayList recuperarNombrePaciente() throws Exception;
    public int recuperarIdPaciente(String pac) throws Exception;
    public String buscarNombrePaciente(int id_pac) throws Exception;
    public int recuperarUltimaReceta() throws Exception;
    public int eliminarReceta(int id_receta) throws Exception;
    public int modificarReceta(Receta receta) throws Exception;
    public int recuperarIdReceta(String med, String pac) throws Exception;
    public JComboBox obtenerMedico() throws Exception;
    public JComboBox obtenerPaciente() throws Exception;
    public void RellenarTablaReceta(DefaultTableModel tabla, Receta receta) throws Exception;
    public void buscar(DefaultTableModel table, Receta receta, int filtro, String busqueda) throws Exception;
   
}
