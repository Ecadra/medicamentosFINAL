

package Interfaces;

import Modelos.MedFinal;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;

public interface MetodosMedFinal {
    public void agregarFinal(MedFinal medFinal)throws Exception;
    public void eliminarFinal(MedFinal medFinal)throws Exception;
    public void actualizarFinal(MedFinal medFinal)throws Exception;
    public void rellenarTabla(DefaultTableModel table)throws Exception;
    public JComboBox obtenerMedico()throws Exception;
    public JComboBox obtenerPresentacion()throws Exception;
    public int obtenerIdMed(String Medicamento)throws Exception;
    public int obtenerIdPresentacion(String Presentacion) throws Exception;
    public void buscar(DefaultTableModel table,int filtro, String busqueda)throws Exception;
}
