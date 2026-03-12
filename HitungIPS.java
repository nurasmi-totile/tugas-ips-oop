/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hitungips;

import java.util.Scanner;

class Matkul {
    String nama;
    int sks;
    String nilai;
}
public class HitungIPS {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Jumlah Matkul:");
        
        int jumlah = input.nextInt();
        input.nextLine();
        
        Matkul data = new Matkul();
        
        int jumlahSks = 0;
        double totalMutu = 0;
        
        for(int i = 1; i <= jumlah; i++){
            System.out.println("\nMatkul ke-" + i);
            System.out.print("Nama matkul :");
            data.nama = input.nextLine();
            
            System.out.print("SKS: ");
            data.sks = input.nextInt();
            input.nextLine();
            
            System.out.print("Nilai huruf: ");
            data.nilai = input.nextLine();
            
            double bobot = 0;
            
            if (data.nilai.equals("A")) bobot = 4.0;
            else if (data.nilai.equals("A-")) bobot = 3.7;
            else if (data.nilai.equals("B+")) bobot = 3.3;
            else if (data.nilai.equals("B")) bobot = 3.0;
            else if (data.nilai.equals("C")) bobot = 2.0;
            else if (data.nilai.equals("D")) bobot = 1.0;
            else bobot = 0;
            
            totalMutu = totalMutu + (bobot * data.sks);
            jumlahSks = jumlahSks + data.sks;
        }
        
        double ips = totalMutu / jumlahSks;
        System.out.println("\nTotal SKS = " + jumlahSks);
        System.out.println("IPS Semester = " + ips);
       
    }
    
}
