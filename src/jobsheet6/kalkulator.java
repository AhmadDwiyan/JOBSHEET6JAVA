/*TAMPILAN KALKULATOR*/
package jobsheet6;
import java.util.Scanner;

public class kalkulator {
   
  public static void main(String[] args){
     
   Scanner input = new Scanner (System.in);
  String ulangi ="y";
 
 
  int pil;
  
 System.out.println("SELAMAT DATANG DI KALKULATOR ");
  System.out.println("MASUKAN PILIHAN  ");
   System.out.println("Plihan 1 : PERKALIAN ");
   System.out.println("Plihan 2 : PEMBAGIAN ");
      System.out.println("Plihan 3 : PENJUMLAHAN ");
   System.out.println("Plihan 4 : PENGURANGAN ");
   System.out.println("MASUKAN PILIHANMU ");
    pil =input.nextInt();
    switch(pil){
        //===================================\\
        
        case 1 :{
            
            int angka1,angka2,hasil;
            
            System.out.println("MASUKAN ANGKAMU");
            angka1 = input.nextInt();
            System.out.println("masukan Angka Mu Lagi");
            angka2 = input.nextInt();
            hasil = angka1*angka2;
            System.out.println("HASILNYA ADALAH "+hasil);
           break;
             
        }
        case 2 :{
             Double pem2,pem1,pembagian;
                int angka1,angka2,hasil;
            System.out.println("MASUKAN ANGKAMU");
            pem1 = input.nextDouble();
            System.out.println("masukan Angka Mu Lagi");
            pem2 = input.nextDouble();
            pembagian = pem1/pem2;
            System.out.println("HASILNYA ADALAH "+pembagian);
           break;
        }
        case  3 : {
            int pem2,pem1,pembagian;
             System.out.println("MASUKAN ANGKAMU");
            pem1 = input.nextInt();
            System.out.println("masukan Angka Mu Lagi");
            pem2 = input.nextInt();
            pembagian = pem1+pem2;
            System.out.println("HASILNYA ADALAH "+pembagian);
            break;
        } 
        case 4 :{
             int pem2,pem1,pembagian;
             System.out.println("MASUKAN ANGKAMU");
            pem1 = input.nextInt();
            System.out.println("masukan Angka Mu Lagi");
            pem2 = input.nextInt();
            pembagian = pem1-pem2;
            System.out.println("HASILNYA ADALAH "+pembagian);
            break;
           
        }
        
        }
        
          

 
}
}
