/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet6;

import java.io.*;

public class Latihan8 {
    public static void main(String[] args){
    BufferedReader data = new BufferedReader(new InputStreamReader(System.in)) ;
    String x="";
    int luas=0;
    System.out.println("---Luas Persegi---");
      System.out.println("Masukan Angka");
      try {
          x = data.readLine();
          int angka = Integer.parseInt(x);
          luas = angka*angka;
      } catch (Exception e) {
          
          System.out.println("ERROR");
          
      }
      System.out.println("HASILNYA ADALAh"+luas);
    
}
}