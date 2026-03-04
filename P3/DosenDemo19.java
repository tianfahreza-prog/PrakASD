package P3;

import java.util.Scanner;

public class DosenDemo19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String kode, nama, dummy;
        boolean jenisKelamin;
        int usia;

        System.out.print("Masukkan jumlah Dosen : ");
        int jumlah = Integer.parseInt(sc.nextLine());

        Dosen19[] arrayOfDosen = new Dosen19[jumlah];

        for (int i = 0; i < jumlah; i++) {
            System.out.println("Masukkan Data Dosen ke-" + (i + 1));
            System.out.print("Kode           : ");
            kode = sc.nextLine();
            System.out.print("Nama           : ");
            nama = sc.nextLine();
            System.out.print("Jenis Kelamin (Pria/Wanita) : ");
            dummy = sc.nextLine();
            jenisKelamin = dummy.equalsIgnoreCase("Pria");
            System.out.print("Usia           : ");
            usia = Integer.parseInt(sc.nextLine());
            System.out.println("------------------------------");

            arrayOfDosen[i] = new Dosen19(kode, nama, jenisKelamin, usia);
        }

        int i = 1;
        for (Dosen19 dosen : arrayOfDosen) {
            System.out.println("Data Dosen ke-" + i);
            dosen.cetakInfo();
            i++;
        }

        DataDosen19 dataDosen = new DataDosen19();
        dataDosen.dataSemuaDosen(arrayOfDosen);
        dataDosen.jumlahDosenPerJenisKelamin(arrayOfDosen);
        dataDosen.rerataUsiaDosenPerJenisKelamin(arrayOfDosen);
        dataDosen.infoDosenPalingTua(arrayOfDosen);
        dataDosen.infoDosenPalingMuda(arrayOfDosen);
    }
    
}
