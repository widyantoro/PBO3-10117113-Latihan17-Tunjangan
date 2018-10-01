/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117113.latihan17.tunjangan;

import java.util.Scanner;

/*
 * Nama     : Eka Widyantoro
 * NIM      : 10117113
 * Kelas    : IF-3/PBO-3
 * Desc     : Program Menampilkan Total gaji yang didapatkan dari gaji pokok dan
 *            tunjangan
 */
public class PBO310117113Latihan17Tunjangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int gaji;
        int tunjangan;
        int totalGaji;
        String status;
        
        System.out.println("=============PROGRAM TUNJANGAN==============");
        System.out.print("Berapa Gaji Perbulan anda? ");
        Scanner scanner = new Scanner(System.in);
        gaji = scanner.nextInt();
        
        System.out.print("Apa Status Anda? [Menikah/Belum] ");
        status = scanner.next();
        
        if ("Menikah".equals(status)) {
          tunjangan = gaji * 35/100;
        }
          else {
          tunjangan = 0;
        }
        totalGaji = gaji + tunjangan;
        System.out.println("==========HASIL PERHITUNGAN GAJI===========");
        System.out.println("Gaji Pokok  = Rp. " + gaji);
        System.out.println("Tunjangan   = Rp. " + tunjangan);
        System.out.println("Total Gaji  = Rp. " + totalGaji);
        
        System.out.println("(Developed By : Eka Widyantoro)");
            
        
        
        
    }
    
}
