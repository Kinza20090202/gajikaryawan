package siswa.siswa;

import java.util.Scanner;

public class gajikaryawan {

    public static void main(String[] args) {
        double jamKerja, gaji, tarifPerjam, pajak;

        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Masukkan jam Kerja: ");
            jamKerja = input.nextDouble();
            System.out.println("Masukkan tarif perjam: ");
            tarifPerjam = input.nextDouble();
            System.out.println("Masukkan pajak: ");
            pajak = input.nextDouble();
        }
        gaji=jamKerja*tarifPerjam;
        pajak=(pajak/100)*gaji;
        gaji=gaji-pajak;
        System.out.println("gaji :"+gaji);
        
    }
    
}
