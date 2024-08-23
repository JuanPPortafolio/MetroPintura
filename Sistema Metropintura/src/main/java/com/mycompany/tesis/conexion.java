
package com.mycompany.tesis;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class conexion {
        private static Connection conn;
    private static final String driver="com.mysql.jdbc.Driver";
    private static final String user="root";
    private static final String pass="";
    private static final String url="jdbc:mysql://localhost:3306/MetroPintura";
    
    public Connection conectar(){
        conn=null;
        try{
            conn=(Connection) DriverManager.getConnection(url,user,pass);
            if (conn!=null){
                
            }
        } catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error " + e.toString());
        }
        return conn;
    }
}
