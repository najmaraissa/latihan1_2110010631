/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hitung;

/**
 *
 * @author Nazma
 */
public class MatematikaBeraksi {
    public static void main(String[] args) {
        Matematika najma = new Matematika(3,1);
        
        System.out.println("Hasil Penjumlahan:" + najma.setPenjumlahan());
        System.out.println("Hasil Pengurangan:" + najma.setPengurangan());
        System.out.println("Hasil Perkalian:" + najma.setPerkalian());
        System.out.println("Hasil Pembagian:" + najma.setPembagian());
    }
         
}
