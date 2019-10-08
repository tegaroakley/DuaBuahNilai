/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118066.latihan24.duabuahnilai;
import java.util.Scanner;

/**
 *
 * @author
 * NAMA    : Tegar Lucky'q Oakley
 * KELAS   : IF 2
 * NIM     : 10118066
 */
public class PBO210118066Latihan24DuaBuahNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner (System.in);
        System.out.println("========Program Perbandingan Nilai========");
        String ulang = "Ya";
        while(ulang.equals("Ya")){
        System.out.print("Masukkan Nilai Pertama : ");
        int nilai1 = scanner.nextInt();
        System.out.print("Masukkan Nilai Kedua   : ");
        int nilai2 = scanner.nextInt();
        if (nilai1 > nilai2){
            System.out.println("Hasil : " + nilai1 + " Lebih besar dari " + nilai2);
        }
            if (nilai1 < nilai2){
            System.out.println("Hasil : " + nilai1 + " Lebih kecil dari " + nilai2);
            
        }
        if (nilai1 == nilai2){
            System.out.println("Hasil : " + nilai1 + " Sama dengan " + nilai2);
            
        }
        System.out.println(" ");
        System.out.print("Ulangi Aktifitas ? (Ya/Tidak) : ");
        ulang = scanner.next();
        }
        
    }
        
    
}
