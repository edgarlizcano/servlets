/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

/**
 *
 * @author Edgar
 */

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by Edgar on 16/03/2017.
 */
public class Conexion {
    public static Connection conexion;
    private static final String USER = "root";
    private static final String PASS = "";
    private static final String DB = "servletdb";
  
    public static void conectar(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection("jdbc:mysql://localhost/" + DB, USER, PASS);
            //JOptionPane.showMessageDialog(null, "Se ha iniciado la conexión con el servidor de forma exitosa");
            System.out.println("Conexión Exitosa");
        } catch (ClassNotFoundException ex) {
            System.out.println("No se pudo conectar");
        } catch (SQLException ex) {
            System.out.println("Error de MySQL");
        }
    }
    public static void desconectar() {
        try {
            conexion.close();
            JOptionPane.showMessageDialog(null, "Se ha finalizado la conexión con el servidor");
        } catch (SQLException ex) {
            System.out.println("Error de MySQL");
        }
    }

    public static Connection getConexion() {
        return conexion;
    }
}