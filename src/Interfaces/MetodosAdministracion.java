/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces;

import Modelos.Administracion;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ADM
 */
public interface MetodosAdministracion {
     
    public int registrarAdministracion(Administracion administracion) throws Exception;
    public ArrayList recuperarNombreEnfermera() throws Exception;
    public int recuperarIdEnfermera(String enf)throws Exception;
    public String buscarNombreEnfermera(int enf) throws Exception;
    public ArrayList recuperarNombreMedicamento () throws Exception;
    public int recuperarIdMedicamento(String id_med) throws Exception;
    public ArrayList recuperarNombreMedicamentoFinal () throws Exception;
    public int recuperarIdMedicamentoFinal(String id_medf) throws Exception;
    public ArrayList recuperarDosis() throws Exception;
    public int recuperarIdContenido(String con) throws Exception; 
    public int recuperarUltimaAdministracion() throws Exception;
    public int eliminarAdministracion(int id_adm) throws Exception;
    public int modificarAdministracion(Administracion administracion) throws Exception;
    public int recuperarIdAdministracion(String enf, String con) throws Exception;
    public JComboBox obtenerEnfermera() throws Exception;
    public JComboBox obtenerNombreMed() throws Exception;
    public JComboBox obtenerNombreFi() throws Exception;
    public JComboBox obtenerDosis() throws Exception;
    public void RellenarTablaAdministracion(DefaultTableModel tabla, Administracion administracion) throws Exception;
    public void buscar(DefaultTableModel table, Administracion administracion, int filtro, String busqueda) throws Exception;
}
