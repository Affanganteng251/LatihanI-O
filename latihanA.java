/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LATIHAN;

import java.util.Scanner;

public class latihanA {
        public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan bilangan pertama: ");
        int bilangan1 = input.nextInt();

        System.out.print("Masukkan bilangan kedua: ");
        int bilangan2 = input.nextInt();
        
        int hasil = bilangan1 + bilangan2;
        
        System.out.println("Jumlahnya adalah: " + hasil);

        input.close();
    }
}
