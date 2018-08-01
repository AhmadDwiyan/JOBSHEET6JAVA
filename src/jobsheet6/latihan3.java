/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet6;

import java.io.Console;
public class latihan3 {
    public static void main(String[] args){
        String nama;
        String alamat;
        int usia ;
        //MEMBUAT OBJEK KONSOL
        Console pakde = System.console();
        //LANJUT LAH MUMPUNG
        System.out.print("NAMAMU" );
        nama = pakde.readLine();
        System.out.println("ALAMAT MU ");
        alamat = pakde.readLine();
        System.out.println ("USIAMU");
        usia = Integer.parseInt(pakde.readLine());
        //INI OUTPUTNYA
        System.out.println("DATA SISWA SMK TELKOM");
        System.out.println("NAMA : " +nama);
        System.out.println("ALAMAT: "+alamat);
        System.out.println ("USIA" +usia);
        
        
        
                
        
}
}
