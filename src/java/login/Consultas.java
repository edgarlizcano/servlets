/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Edgar
 */
public class Consultas extends Conexion{
    public static boolean auth(String user, String pass) throws SQLException{
        String Query = "SELECT * FROM usuarios";
            Statement st = conexion.createStatement();
            ResultSet resultSet;
            resultSet = st.executeQuery(Query);

            while (resultSet.next()) {
                if(user.equals(resultSet.getString("usuario")) && pass.equals(resultSet.getString("clave"))){
                    return true;
                }
                System.out.println("Usuario " + resultSet.getString("usuario") + " "
                        + "Pass: " + resultSet.getString("clave"));
            }
        return false;
    }
}
