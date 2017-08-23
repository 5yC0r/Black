/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.DAO;

import Modelo.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author MARIANA
 */
public class ComprobanteDAO {
    
    
    
    public ComprobanteDAO(){
        
    }
    
    public void registrarDatosComprobante(
            String tipoComprobante,    //Solo un numero para diferenciar cada tipo
            String serie,
            String coorrelativo,
            int igv,
            String fechaEmision,
            int codVenta,
            float subtotalComprobante,
            float totalComprobante
    ) throws SQLException{
        Conexion conexion = new Conexion();
        Connection accesoBD = null;
        PreparedStatement ps = null;
        try {
            String consulta = "INSERT INTO comprobante(tipoComprobante,serie,coorrelativo,igv,fechaEmision,codVenta,subtotalComprobante,totalComprobante)"
                    + "VALUES(?,?,?,?,?,?,?,?)";
            accesoBD = conexion.getConnection();
            ps = accesoBD.prepareStatement(consulta);
            ps.setString(1, tipoComprobante);
            ps.setString(2,serie);
            ps.setString(3, coorrelativo);
            ps.setInt(4, igv);
            ps.setString(5, fechaEmision);
            ps.setInt(6, codVenta);
            ps.setFloat(7, subtotalComprobante);
            ps.setFloat(8, totalComprobante);
            ps.execute();            
        } catch (SQLException e) {
            System.out.println("Error al registrar datos del comprobante: "+e.toString());
        }finally{
            if (ps != null) {
                ps.close();
            }

            if (accesoBD != null) {
                accesoBD.close();
            }
        }
    }
    
    public String obtenerUltimaSerie() throws SQLException{
        Conexion conexion = new Conexion();
        Comprobante comprobante = new Comprobante();
        String codigo = "";
        Connection accesoBD = null;
        PreparedStatement ps = null;
        try {
            String consulta = "Select * from comprobante order by codComprobante DESC LIMIT 1";
            accesoBD = conexion.getConnection();
            ps = accesoBD.prepareStatement(consulta);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                comprobante.setSerie(rs.getString(3));
                
                //operador.setNombreOperador(rs.getString(2));
             }
             codigo = comprobante.getSerie();
             
             System.out.println(codigo);
             
            
        } catch (SQLException e) {
            System.out.println("Error al obtener el codigo de la serie: "+e.toString());
        }finally{
            if (ps != null) {
                ps.close();
            }
            if (accesoBD != null) {
                accesoBD.close();
            }
        }
        //System.out.println(operador.getCodigoOperador());
        //System.out.println(cliente.getFechaRegistroCliente());
       return codigo;
    }
    
    public void obtenerUltimoComprobante(String tipo) throws SQLException{
        Conexion conexion = new Conexion();
        Comprobante comprobante = new Comprobante();
        String corelativo = "";
        String serie = "";
        Connection accesoBD = null;
        PreparedStatement ps = null;
        try {
            String consulta = "Select * from comprobante WHERE tipoComprobante='"+tipo+"' ORDER BY codComprobante DESC LIMIT 1 ";
            accesoBD = conexion.getConnection();
            ps = accesoBD.prepareStatement(consulta);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                comprobante.setSerie(rs.getString(3));
                comprobante.setCoorrelativo(rs.getString(4));
                
                
                //operador.setNombreOperador(rs.getString(2));
             }
             corelativo = comprobante.getCoorrelativo();
             serie = comprobante.getSerie();
             
             
             System.out.println(corelativo);
             System.out.println(serie);
             
             generarCoorelativo(Integer.parseInt(serie),Integer.parseInt(corelativo));
             
            
        } catch (SQLException e) {
            System.out.println("Error al obtener el codigo de la serie: "+e.toString());
        }finally{
            if (ps != null) {
                ps.close();
            }
            if (accesoBD != null) {
                accesoBD.close();
            }
        }
        //System.out.println(operador.getCodigoOperador());
        //System.out.println(cliente.getFechaRegistroCliente());
       //return codigo;
    }
    
    public void generarCoorelativo(int serie, int corelativo) throws SQLException{
        
        // validar cuando se terminenn las series
        -- -----------------------------------------------------
        if(corelativo<99999999)
        {
            // la misma serie al q pertenece ese cooreclativo
            corelativo++;
            //id+1
        }
        else{
            // traigo la serie
            serie++;
            
            // cnvierto en int +1
            
            // muestro serie
            corelativo=1;
            // id=1;
        }
        String cadserie = String.valueOf(serie);
         int tamcs =cadserie.length();
         String cco = String.valueOf(corelativo);
         int tamcc =cco.length();
         if(tamcs == 1){
         cadserie = "00"+serie;
         //pec.jtfSerieComprobante.setText(serie);
         }else{
                if(tamcs == 2){
                   cadserie = "0"+serie;
                   //pec.jtfSerieComprobante.setText(serie);
                }else{
                   //pec.jtfSerieComprobante.setText(serie);
                }
          }
         
         if(tamcc == 1){
           cco = "0000000"+cco;
           }
            else{
             if(tamcc == 2){
                cco = "000000"+cco;
            }
             else{
                 if(tamcc == 3)
                 {cco = "00000"+cco;}
                 else{
                    if(tamcc == 4){cco = "0000"+cco;}
                    else{
                        if(tamcc == 5)
                        {cco = "000"+cco;}
                        else{
                            if(tamcc == 6)
                            {cco = "00"+cco;}
                            else{
                                if(tamcc == 7){cco = "0"+cco;}
          } } }  } }}        
        System.out.println(cadserie+cco);
        //System.out.println(cliente.getFechaRegistroCliente());
       //return /*codigo*/"";
    }
    
    public void generarSiguiente(String numero){
        
        // validar cuando se terminenn las series
        int num = Integer.parseInt(numero);
              
        if(num < 9)
        {
            num++;
        }
        else{
            num = 1;            
        }
        /*String id = String.valueOf(num);
        int longitud = id.length();
        for(int i=0; longitud <5;i++){
            id = "0"+id;
        }*/
        System.out.println(num);
    }
}

