package P3;

import java.util.Scanner;

public class MahasiswaDemo19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Mahasiswa[] arrayOfMahasiswa = new Mahasiswa[3];
        String dummy;

        for (int i = 0; i < 3; i++) {
            arrayOfMahasiswa[i] = new Mahasiswa();

            System.out.println("Masukkan Data Mahasiswa ke-" + (i + 1));
            System.out.print("NIM : ");
            arrayOfMahasiswa[i].nim = sc.nextLine();

            System.out.print("Nama : ");
            arrayOfMahasiswa[i].nama = sc.nextLine();

            System.out.print("Kelas : ");
            arrayOfMahasiswa[i].kelas = sc.nextLine();

            System.out.print("IPK : ");
            dummy = sc.nextLine();
            arrayOfMahasiswa[i].ipk = Float.parseFloat(dummy);

            System.out.println("----------------------------------------");
        }

        System.out.println("\nDATA MAHASISWA:");
        for (int i = 0; i < 3; i++) {
            arrayOfMahasiswa[i].cetakInfo();
        }

        sc.close();
    }
}
