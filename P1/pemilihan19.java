package P1;

import java.util.Scanner;

public class pemilihan19 {
    public static void main(String[] args) {
        Scanner tian = new Scanner(System.in);

        System.out.println("Program Menghitng Nilai Akhir");
        System.out.println("=============================");
        System.out.print("Masukkan nilai tugas: ");
        double tugas = tian.nextDouble();
        System.out.print("Masukkan nilai kuis: ");
        double kuis = tian.nextDouble();
        System.out.print("Masukkan nilai UTS: ");
        double uts = tian.nextDouble();
        System.out.print("Masukkan nilai UAS: ");
        double uas = tian.nextDouble();
        System.out.println("============================");

        if (tugas > 100 || kuis > 100 || uts > 100 || uas > 100 || tugas < 0 || kuis < 0 || uts < 0 || uas < 0) {
            System.out.println("========================");
            System.out.println("nilai tidak valid");
            System.out.println("========================");

        }else{
            double nilaiAkhir = (0.2 * tugas) + (0.2 * kuis) + (0.3 * uts) + (0.4 * uas);

            String huruf;
            String status;

            if (nilaiAkhir > 80 && nilaiAkhir <= 100) {
                huruf = "A";
                status = "LULUS";
            } else if (nilaiAkhir > 73) {
                huruf = "B+";
                status = "LULUS";
            } else if (nilaiAkhir > 65) {
                huruf = "B";
                status = "LULUS";
            } else if (nilaiAkhir > 60) {
                huruf = "C+";
                status = "LULUS";
            } else if (nilaiAkhir > 50) {
                huruf = "C";
                status = "LULUS";
            } else if (nilaiAkhir > 39) {
                huruf = "D";
                status = "TIDAK LULUS";
            } else {
                huruf = "E";
                status = "TIDAK LULUS";
            }

            System.out.println("\nNilai Akhir : " + nilaiAkhir);
            System.out.println("Nilai Huruf : " + huruf);
            System.out.println("Keterangan  : " + status);
        }  
    }  
}
