/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author MARIANA
 */
public class fechaVencimiento {

    
    
    int codVencimiento;
    String fechaVencimiento;
    int codProducto;
    
       
    public fechaVencimiento(){
        this.codVencimiento = 0;
        this.fechaVencimiento = "";        
        this.codProducto = 0;
    }
    
    public int getCodProducto() {
        return codProducto;
    }

    public void setCodProducto(int codProducto) {
        this.codProducto = codProducto;
    }

    public int getCodVencimiento() {
        return codVencimiento;
    }

    public void setCodVencimiento(int codVencimiento) {
        this.codVencimiento = codVencimiento;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }
    
}
