/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexion {
    
    private Connection cnx;

    public Conexion(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            this.cnx = DriverManager.getConnection("jdbc:mysql://localhost:3306/repechaje", "root", "1234");
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public Connection getConnect(){
        return cnx;
    }
    
    public void cerrar() throws SQLException {
        if (cnx != null) {
            cnx.close();
        }
    }
}