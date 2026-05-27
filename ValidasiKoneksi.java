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
import javax.swing.JOptionPane;

public class ValidasiKoneksi {
 public static void main(String[] args) {
        Connection conn = Koneksi.getKoneksi();
        
        if (conn != null) {
            JOptionPane.showMessageDialog(null, 
                    "Validasi Sukses!\nNetBeans sudah terhubung ke database Laragon.", 
                    "Status Koneksi", 
                    JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, 
                    "Validasi Gagal!\nPastikan Laragon sudah aktif (Start All) dan database 'db_praktikum' sudah dibuat.", 
                    "Status Koneksi", 
                    JOptionPane.ERROR_MESSAGE);
        }
    }   
}
