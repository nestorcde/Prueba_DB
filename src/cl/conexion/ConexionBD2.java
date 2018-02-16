
package cl.conexion;

import java.sql.*;

public class ConexionBD2 {
    
    
    Connection cn;
    public Connection conexion1() {
    try{
    Class.forName("org.postgresql.Driver");
    cn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/prueba_DB","postgres", "nestor210505");
    
    
}catch(ClassNotFoundException | SQLException e){
System.out.println("Error de SQL");
}
return cn;
}
}