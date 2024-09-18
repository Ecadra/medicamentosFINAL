
package Modelos;


public class MedFinal {
    
    private int idFinal;
    private String descripcion;
    private int cantidad;
    private String unidad;
    private int presentacion;
    private int medicamento;
    
    public MedFinal(int idFinal, String descripcion, int cantidad, String unidad, int presentacion, int medicamento)
    {
        this.idFinal=idFinal;
        this.descripcion=descripcion;
        this.cantidad=cantidad;
        this.unidad=unidad;
        this.presentacion=presentacion;
        this.medicamento=medicamento;
        
    }
    public MedFinal()
    {
        this(0,null,0,null,0,0);
    }

    public void setIdFinal(int idFinal) {
        this.idFinal = idFinal;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    public void setPresentacion(int presentacion) {
        this.presentacion = presentacion;
    }

    public void setMedicamento(int medicamento) {
        this.medicamento = medicamento;
    }

    public int getIdFinal() {
        return idFinal;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public String getUnidad() {
        return unidad;
    }

    public int getPresentacion() {
        return presentacion;
    }

    public int getMedicamento() {
        return medicamento;
    }
    
    
}
