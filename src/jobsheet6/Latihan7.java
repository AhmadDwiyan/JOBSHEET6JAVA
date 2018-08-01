/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet6;
import java.util.Scanner;
public class Latihan7 {
    public static void main(String[] args){
   Scanner masuk = new Scanner(System.in) ;
   int nilai ;
   System.out.print("MASUKAN NILAI UJIAN : ");
      nilai = masuk.nextInt();
      if (nilai<70)
          System.out.print("SISWA TIDAK LULUS");
      if (nilai>70)
          System.out.print("SISWA LULUS ");
           
    
}
}