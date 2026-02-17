package P1;

import java.util.Scanner;

public class array {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] mk = {
            "Pancasila",
            "Konsep Teknologi Informasi",
            "Critical Thinking dan Problem Solving",
            "Matematika Dasar",
            "Bahasa Inggris",
            "Dasar Pemrograman",
            "Praktikum Dasar Pemrograman",
            "Keselamatan dan Kesehatan Kerja"
        };

        int[] sks = {2, 2, 2, 2, 2, 2, 3, 2};

        double[] nilai = new double[mk.length];
        String[] huruf = new String[mk.length];
        double[] bobot = new double[mk.length];

        System.out.println("Program Menghitung IP Semester");
        System.out.println("===============================");

        for (int i = 0; i < mk.length; i++) {
            System.out.print("masukkan nilai Angka untuk MK " + mk[i] + ": ");
            nilai[i] = input.nextDouble();
        }

        System.out.println("\nhasil Konversi Nilai");
        System.out.println("===============================");
        System.out.printf("%-35s %-8s %-8s %-10s %-5s\n","MK", "Nilai", "Huruf", "Setara", "SKS");

        double totalMutu = 0;
        int totalSKS = 0;

        for (int i = 0; i < mk.length; i++) {

            if (nilai[i] > 80 && nilai[i] <= 100) {
                huruf[i] = "A";
                bobot[i] = 4.0;
            } else if (nilai[i] > 73 && nilai[i] <= 80) {
                huruf[i] = "B+";
                bobot[i] = 3.5;
            } else if (nilai[i] > 65 && nilai[i] <= 73) {
                huruf[i] = "B";
                bobot[i] = 3.0;
            } else if (nilai[i] > 60 && nilai[i] <= 65) {
                huruf[i] = "C+";
                bobot[i] = 2.5;
            } else if (nilai[i] > 50 && nilai[i] <= 60) {
                huruf[i] = "C";
                bobot[i] = 2.0;
            } else if (nilai[i] > 39 && nilai[i] <= 50) {
                huruf[i] = "D";
                bobot[i] = 1.0;
            } else {
                huruf[i] = "E";
                bobot[i] = 0.0;
            }

            double mutu = bobot[i] * sks[i];

            totalMutu += mutu;
            totalSKS += sks[i];

            System.out.printf("%-35s %-8.2f %-8s %-10.2f %-5d\n",
                    mk[i], nilai[i], huruf[i], bobot[i], sks[i]);
        }

        double ip = totalMutu / totalSKS;

        System.out.println("==================================================================================");
        System.out.printf("IP Semester : %.2f\n", ip);

        input.close();
    }
}
