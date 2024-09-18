
package Interfaces;

import Modelos.ContRec;
import Modelos.MedFinal;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;


public interface MetodosContReceta {
    public void agregarConRec(ContRec conRec)throws Exception;
    public void eliminarConRec(ContRec conRec)throws Exception;
    public void actualizarConRec(ContRec conRec)throws Exception;
    public void rellenarTablaContRec(DefaultTableModel table)throws Exception;
    public void rellenarTablaMedFinal(DefaultTableModel table)throws Exception;
    public void rellenarTablaRec(DefaultTableModel table)throws Exception;
    public void buscarMedFinal(DefaultTableModel table,int filtro, String busqueda)throws Exception;
    public void buscarContRec(DefaultTableModel table,int filtro, String busqueda)throws Exception;
    public void buscarRec(DefaultTableModel table,int filtro, String busqueda)throws Exception;
    public boolean validarRelacion(ContRec conRec) throws Exception;
}
