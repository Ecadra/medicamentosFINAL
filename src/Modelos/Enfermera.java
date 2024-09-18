/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

/**
 *
 * @author ADM
 */
public class Enfermera {
    private int id_enfermera;
    private String enf_nombre;
    private String enf_cedula;
    private String enf_tel;
    private String enf_direccion;

    public Enfermera(int id_enfermera, String enf_nombre, String enf_cedula, String enf_tel, String enf_direccion) {
        this.id_enfermera = id_enfermera;
        this.enf_nombre = enf_nombre;
        this.enf_cedula = enf_cedula;
        this.enf_tel = enf_tel;
        this.enf_direccion = enf_direccion;
    }
    public Enfermera(){
        this(0,null,null,null,null);
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

    public String getEnf_cedula() {
        return enf_cedula;
    }

    public void setEnf_cedula(String enf_cedula) {
        this.enf_cedula = enf_cedula;
    }

    public String getEnf_tel() {
        return enf_tel;
    }

    public void setEnf_tel(String enf_tel) {
        this.enf_tel = enf_tel;
    }

    public String getEnf_direccion() {
        return enf_direccion;
    }

    public void setEnf_direccion(String enf_direccion) {
        this.enf_direccion = enf_direccion;
    }
    
}
