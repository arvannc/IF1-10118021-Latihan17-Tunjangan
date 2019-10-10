/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118021.latihan17.tunjangan;

import java.util.Scanner;
/**
 *
 * @author Arvan
 * NAMA     : M Arvan Nurcahyana
 * KELAS    : IF-1
 * NIM      : 10118021
 * Deskripsi Program : Tunjangan
 */
public class IF110118021Latihan17Tunjangan {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String status;
        double gaji,total;
        float tunjangan = 0;
        Scanner keyboard = new Scanner(System.in);
    
        System.out.println("Program Tunjangan");
        System.out.print("Berapa Gaji Pokok Anda perbulan? : Rp ");
        gaji = keyboard.nextInt();
        
        System.out.print("Status Anda? (Menikah/Belum) : ");
        Scanner stts = new Scanner(System.in);
        status = stts.nextLine();
        System.out.println();
        
        System.out.println("Hasil perhitungan Gaji Anda");
        System.out.println("Gaji Pokok\t\t : Rp "+gaji);
        if ("menikah".equals(status)) {
            tunjangan = (int) (gaji * 0.35);
        }
        System.out.println("Tunjangan\t\t : Rp " + tunjangan);
        total = gaji + tunjangan;
        System.out.println("Total Gaji\t\t : Rp " + total);
        System.out.println("(Developed by : M. Arvan Nurcahyana)");
    }
}
