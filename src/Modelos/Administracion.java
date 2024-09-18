/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;
import java.sql.Timestamp;
/**
 *
 * @author ADM
 */
public class Administracion {
    private int id_administracion;
    private boolean adm_estado;
    private String adm_detalles;
    private Timestamp adm_fecha_hr;
    private int id_contenido;
    private int id_enfermera;
    private String enf_nombre;
    private String mdm_nombre;
    private String mfi_nombre;
    private String descripcion_dosis;
    
    public Administracion(int id_administracion, boolean adm_estado, String adm_detalles, Timestamp adm_fecha_hr, int id_contenido, int id_enfermera) {
        this.id_administracion = id_administracion;
        this.adm_estado = adm_estado;
        this.adm_detalles = adm_detalles;
        this.adm_fecha_hr = adm_fecha_hr;
        this.id_contenido = id_contenido;
        this.id_enfermera = id_enfermera;
    }
    
        public Administracion() {
        this.id_administracion = 0;
        this.adm_estado = false;
        this.adm_detalles = null;
        this.adm_fecha_hr = new Timestamp(System.currentTimeMillis());
        this.id_contenido = 0;
        this.id_enfermera = 0;
    }

    public int getId_administracion() {
        return id_administracion;
    }

    public void setId_administracion(int id_administracion) {
        this.id_administracion = id_administracion;
    }

    public boolean isAdm_estado() {
        return adm_estado;
    }

    public void setAdm_estado(boolean adm_estado) {
        this.adm_estado = adm_estado;
    }

    public String getAdm_detalles() {
        return adm_detalles;
    }

    public void setAdm_detalles(String adm_detalles) {
        this.adm_detalles = adm_detalles;
    }

    public Timestamp getAdm_fecha_hr() {
        return adm_fecha_hr;
    }

    public void setAdm_fecha_hr(Timestamp adm_fecha_hr) {
        this.adm_fecha_hr = adm_fecha_hr;
    }

    public int getId_contenido() {
        return id_contenido;
    }

    public void setId_contenido(int id_contenido) {
        this.id_contenido = id_contenido;
    }

    public int getId_enfermera() {
        return id_enfermera;
    }

    public void setId_enfermera(int id_enfermera) {
        this.id_enfermera = id_enfermera;
    }

    public String getEnf_nombre() {
        return enf_nombre;
    }

    public void setEnf_nombre(String enf_nombre) {
        this.enf_nombre = enf_nombre;
    }

    public String getDescripcion_dosis() {
        return descripcion_dosis;
    }

    public void setDescripcion_dosis(String descripcion_dosis) {
        this.descripcion_dosis = descripcion_dosis;
    }

    public String getMdm_nombre() {
        return mdm_nombre;
    }

    public void setMdm_nombre(String mdm_nombre) {
        this.mdm_nombre = mdm_nombre;
    }

    public String getMfi_nombre() {
        return mfi_nombre;
    }

    public void setMfi_nombre(String mfi_nombre) {
        this.mfi_nombre = mfi_nombre;
    }
        
}
