
package Modelo;

public class Comprobante {

    public int getCodComprobante() {
        return codComprobante;
    }

    public void setCodComprobante(int codComprobante) {
        this.codComprobante = codComprobante;
    }

    public int getCodVenta() {
        return codVenta;
    }

    public void setCodVenta(int codVenta) {
        this.codVenta = codVenta;
    }

    public String getCoorrelativo() {
        return coorrelativo;
    }

    public void setCoorrelativo(String coorrelativo) {
        this.coorrelativo = coorrelativo;
    }

    public String getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(String fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public int getIgv() {
        return igv;
    }

    public void setIgv(int igv) {
        this.igv = igv;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public float getSubtotalComprobante() {
        return subtotalComprobante;
    }

    public void setSubtotalComprobante(float subtotalComprobante) {
        this.subtotalComprobante = subtotalComprobante;
    }

    public String getTipoComprobante() {
        return tipoComprobante;
    }

    public void setTipoComprobante(String tipoComprobante) {
        this.tipoComprobante = tipoComprobante;
    }

    public float getTotalComprobante() {
        return totalComprobante;
    }

    public void setTotalComprobante(float totalComprobante) {
        this.totalComprobante = totalComprobante;
    }

    
    
    int codComprobante;
    String tipoComprobante;    //Solo un numero para diferenciar cada tipo
    String serie;
    String coorrelativo;
    int igv;
    String fechaEmision;
    int codVenta;
    float subtotalComprobante;
    float totalComprobante;
    
        
    
    
    public Comprobante(){
        codComprobante=0;
        tipoComprobante = "";
        serie = "";
        coorrelativo = "";
        igv = 0;
        fechaEmision = "";
        codVenta = 0;
        subtotalComprobante = 0.1f;
        totalComprobante = 0.1f;
    }
}
