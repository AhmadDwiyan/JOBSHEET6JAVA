/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet6;
import java.util.Scanner;
public class latihan1 {
    public static void main(String[] args){
        
    String nama,alamat;
    int usia,absen;
    //MEMBUAT SEBUAH SCANNER
    Scanner masukan = new Scanner (System.in);
    //Sekarang LANJUT KE DEKLARASI
    System.out.println("-=DATA SISWA SMK TELKOM MALANG");
      System.out.print("NAMA : ");
    nama = masukan.next();
    System.out.print("ALAMAT: ");
    alamat = masukan.next();
    System.out.print("USIA: ");
    usia = masukan.nextInt();
    System.out.println("NO ABSEN: ");
   absen = masukan.nextInt();
   //SEKARANG MENAMPILKAN HASIL
   System.out.println("=========DATA MU=========");
   System.out.println("NAMA: "+nama);
   System.out.println("ALAMAT: "+alamat);
   System.out.println("USIA "+usia);
   System.out.println("NO ABSEN "+absen);
    
    
    
}
}

