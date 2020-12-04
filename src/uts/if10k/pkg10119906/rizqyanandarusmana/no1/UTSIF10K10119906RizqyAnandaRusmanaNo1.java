/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.if10k.pkg10119906.rizqyanandarusmana.no1;

import java.time.Year;
import java.util.Scanner;

/**
 *
 * @author senenngahenen
 * Nama     : Rizqy Ananda Rusmana
 * NIM      : 10119906
 * Kelas    : IF-10K
 * Program  : UTS-no1.
 */
public class UTSIF10K10119906RizqyAnandaRusmanaNo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        int tahunLahir, tahunSekarang, umur;
        String normal = "\u001b[0m";
        String merah = "\u001B[31m";

        tahunSekarang = Year.now().getValue();
        Age user = new Age(tahunSekarang);

        System.out.print("Masukkan Tahun Lahir Anda : ");
        user.setYearBirth(scanner.nextInt());
        tahunLahir = user.getYearBirth();
        umur = user.hitungUmur();

        System.out.println("\n======Hasil Perhitungan Umur======");
        System.out.println("Tahun lahir anda : "+ tahunLahir);
        System.out.println("Hari ini tahun : "+tahunSekarang);
        System.out.printf("Umur kamu sampai hari ini adalah %d tahun%n", umur);
        System.out.println("Tandanya Kamu "+ merah+ user.tandanyaKamu(umur)+ normal);
    }
    
}
