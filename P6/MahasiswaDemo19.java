package P6;

import java.util.Scanner; 

public class MahasiswaDemo19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MahasiswaBerprestasi19 list = new MahasiswaBerprestasi19();
        int JumMhs;

        System.out.print("Berapa Mahasiswa?: ");
        int mhs = sc.nextInt();
        JumMhs = mhs;
        sc.nextLine();

        for (int i = 0; i < JumMhs; i++) {
            System.out.println("Masukkan Data Mahasiswa ke-" + (i + 1));
            System.out.print("NIM   : ");
            String nim = sc.nextLine();
            System.out.print("Nama  : ");
            String nama = sc.nextLine();
            System.out.print("Kelas : ");
            String kelas = sc.nextLine();
            System.out.print("IPK   : ");
            double ipk = sc.nextDouble();
            sc.nextLine();

            Mahasiswa19 m = new Mahasiswa19(nim, nama, kelas, ipk);
            list.tambah(m);
        }

        list.tampil();
        //melakukan pencarian data Binary
        System.out.println("-----------------------------------------------------");
        System.out.println("Pencarian data");
        System.out.println("-----------------------------------------------------");
        System.out.println("masukkan ipk mahasiswa yang dicari: ");
        System.out.print("IPK: ");
        double cari = sc.nextDouble();
        System.out.println("-----------------------------------------------------");
        System.out.println("menggunakan binary search");
        System.out.println("-----------------------------------------------------");
        double posisi2 = list.findBinarySearch(cari, 0, JumMhs-1);
        int pss2 = (int)posisi2;
        list.tampilPosisi(cari, pss2);
        list.tampilDataSearch(cari, pss2);

        sc.close();
    }
}