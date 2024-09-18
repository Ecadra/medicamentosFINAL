/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import java.util.Date;

/**
 *
 * @author ADM
 */
public class Receta {
    private int id_receta;
    private Date rec_fecha;
    private int id_paciente;
    private int id_medico;
    private String med_nombre;
    private String pac_nombre;
    private String pac_nss;
            

    public Receta(int id_receta, Date rec_fecha, int id_paciente, int id_medico) {
        this.id_receta = id_receta;
        this.rec_fecha = rec_fecha;
        this.id_paciente = id_paciente;
        this.id_medico = id_medico;
    }

    public Receta(){
        this(0,null,0,0);
    }
    public int getId_receta() {
        return id_receta;
    }

    public void setId_receta(int id_receta) {
        this.id_receta = id_receta;
    }

    public Date getRec_fecha() {
        return rec_fecha;
    }

    public void setRec_fecha(Date rec_fecha) {
        this.rec_fecha = rec_fecha;
    }

    public int getId_paciente() {
        return id_paciente;
    }

    public void setId_paciente(int id_paciente) {
        this.id_paciente = id_paciente;
    }

    public int getId_medico() {
        return id_medico;
    }

    public void setId_medico(int id_medico) {
        this.id_medico = id_medico;
    }

    public String getMed_nombre() {
        return med_nombre;
    }

    public void setMed_nombre(String med_nombre) {
        this.med_nombre = med_nombre;
    }

    public String getPac_nombre() {
        return pac_nombre;
    }

    public void setPac_nombre(String pac_nombre) {
        this.pac_nombre = pac_nombre;
    }

    public String getPac_nss() {
        return pac_nss;
    }

    public void setPac_nss(String pac_nss) {
        this.pac_nss = pac_nss;
    }
    
    
    
}
