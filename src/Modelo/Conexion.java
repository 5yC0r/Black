
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    
    Connection con;
    String driver = "com.mysql.jdbc.Driver";
    String usuario = "root";
    String pass = "";
    String bd = "basebb";
    String url = "jdbc:mysql://localhost:3306/"+bd;
    
//    String usuario = "nuevospa_apadri";
//    String pass = "l3y0th3835t";
//    String bd = "nuevospa_apadrinamiento";
//    String url = "jdbc:mysql://nuevospasosperu.org:3306/"+bd+"?noAccessToProcedureBodies=true";

    public Conexion() {
        con = null;
        try {
            Class.forName(driver);
            con = (Connection) DriverManager.getConnection(url,usuario,pass);
            if (con != null) {
                System.out.println("Conexion establecida...");
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error al conectar: "+e);
        }
    }
    //Método permite la conexion a la Base de Datos
    
    public Connection getConnection(){
        return con;
    }
    //Método retorna la conexion
    
    
    public void desconectarBD(){
        con = null;
        if(con == null){
            System.out.println("Conexion terminada...");
        }
    }
    
}