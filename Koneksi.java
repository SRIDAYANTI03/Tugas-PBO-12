/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package login;

/**
 *
 * @author Sri Dayanti
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Koneksi {
    public static Connection getKoneksi() {

        Connection conn = null;

        try {

            String url =
            "jdbc:mysql://localhost:3306/db_praktikum";

            String user = "root";
            String pass = "";

            conn =
            DriverManager.getConnection(url, user, pass);

            System.out.println("Koneksi Berhasil");

        } catch (SQLException e) {

            System.out.println(e.getMessage());

        }

        return conn;
    }
    public static void main(String[] args) {

    getKoneksi();
    }    
}
