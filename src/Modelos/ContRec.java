
package Modelos;


public class ContRec {
    private int idContenido;
    private int dosis;
    private String descripcion;
    private int intervalo;
    private int dias;
    private int cantidad;
    private int idReceta;
    private int idMedicamento;

    public ContRec(int idContenido, int dosis, String descripcion, int intervalo, int dias, int cantidad, int idReceta, int idMedicamento) {
        this.idContenido = idContenido;
        this.dosis = dosis;
        this.descripcion = descripcion;
        this.intervalo = intervalo;
        this.dias = dias;
        this.cantidad = cantidad;
        this.idReceta = idReceta;
        this.idMedicamento = idMedicamento;
    }
    public ContRec()
    {
        this(0,0,null,0,0,0,0,0);
    }

    public void setIdContenido(int idContenido) {
        this.idContenido = idContenido;
    }

    public void setDosis(int dosis) {
        this.dosis = dosis;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setIntervalo(int intervalo) {
        this.intervalo = intervalo;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setIdReceta(int idReceta) {
        this.idReceta = idReceta;
    }

    public void setIdMedicamento(int idMedicamento) {
        this.idMedicamento = idMedicamento;
    }

    public int getIdContenido() {
        return idContenido;
    }

    public int getDosis() {
        return dosis;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getIntervalo() {
        return intervalo;
    }

    public int getDias() {
        return dias;
    }

    public int getCantidad() {
        return cantidad;
    }

    public int getIdReceta() {
        return idReceta;
    }

    public int getIdMedicamento() {
        return idMedicamento;
    }

    
    
            
}
