/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LATIHAN;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class latihanD {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java CopyFileBinary <file_sumber> <file_tujuan>");
            return;
            
        }
        String sumber = args[0];
        String tujuan = args[1];
        try (FileInputStream in = new FileInputStream(sumber);
             FileOutputStream out = new FileOutputStream(tujuan)) {

            byte[] buffer = new byte[4096]; 
            int bytesRead;
            while ((bytesRead = in.read(buffer)) != -1) {
                out.write(buffer, 0, bytesRead);
            }
            
            System.out.println("File berhasil disalin dari " + sumber + " ke " + tujuan);
        } catch (IOException e) {
            System.err.println("Terjadi kesalahan: " + e.getMessage());
        }
    }
}

