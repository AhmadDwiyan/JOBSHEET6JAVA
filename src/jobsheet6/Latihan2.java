/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Latihan2 {
    public static void main(String[] args) throws IOException {
        String nama;
        //INI UNTUK INPUTNYA
        InputStreamReader lebokno = new InputStreamReader (System.in);
        //MASUKAN PROGRAM KE 2
        BufferedReader mboh = new BufferedReader(lebokno);
        //COBA DUNKS
        System.out.println("NAMA MU ");
        nama = mboh.readLine();
        //TAMPILKAN NAMANYA
        System.out.println("NAMAMU ADALAH  "+nama);
}

}