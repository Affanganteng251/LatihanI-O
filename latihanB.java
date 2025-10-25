/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LATIHAN;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author LENOVO
 */
public class latihanB {
    public static void main(String[] args) throws IOException {
        
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader baca = new BufferedReader(isr);

        System.out.println("Masukkan satu baris teks (pisahkan kata dengan spasi):");

        String barisTeks = baca.readLine();

        if (barisTeks != null && !barisTeks.trim().isEmpty()) {
           
            String[] kata = barisTeks.trim().split("\\s+");

            int jumlahKata = kata.length;

           
            System.out.println("Jumlah kata: " + jumlahKata);
        } else {
            
            System.out.println("Jumlah kata: 0");
        }

       
        baca.close();
    }
}
