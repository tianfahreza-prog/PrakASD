package P10;

import java.util.Scanner;

public class MainKRS {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        AntrianKRS antrian = new AntrianKRS(10, 30);
        int pilihan;

        do {
            System.out.println("\n======================================");
            System.out.println("   ANTRIAN KRS - DOSEN PEMBINA (DPA)  ");
            System.out.println("======================================");
            System.out.println("1.  Tambah Mahasiswa ke Antrian");
            System.out.println("2.  Panggil 2 Mahasiswa untuk Proses KRS");
            System.out.println("3.  Tampilkan Semua Antrian");
            System.out.println("4.  Tampilkan 2 Antrian Terdepan");
            System.out.println("5.  Tampilkan Antrian Paling Akhir");
            System.out.println("6.  Cek Antrian Kosong");
            System.out.println("7.  Cek Antrian Penuh");
            System.out.println("8.  Jumlah Mahasiswa dalam Antrian");
            System.out.println("9.  Jumlah Mahasiswa Sudah KRS");
            System.out.println("10. Jumlah Mahasiswa Belum KRS");
            System.out.println("11. Kosongkan Antrian");
            System.out.println("0.  Keluar");
            System.out.println("--------------------------------------");
            System.out.print("Pilih menu: ");

            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("NIM   : ");
                    String nim = sc.nextLine();
                    System.out.print("Nama  : ");
                    String nama = sc.nextLine();
                    System.out.print("Prodi : ");
                    String prodi = sc.nextLine();
                    System.out.print("Kelas : ");
                    String kelas = sc.nextLine();
                    Mahasiswa mhs = new Mahasiswa(nim, nama, prodi, kelas);
                    antrian.tambahAntrian(mhs);
                    break;

                case 2:
                    antrian.panggilDuaMahasiswa();
                    break;

                case 3:
                    antrian.tampilkanSemua();
                    break;

                case 4:
                    antrian.tampilkanDuaTerdepan();
                    break;

                case 5:
                    antrian.tampilkanAkhir();
                    break;

                case 6:
                    if (antrian.isEmpty()) {
                        System.out.println("Antrian KOSONG.");
                    } else {
                        System.out.println("Antrian TIDAK kosong. Jumlah: " + antrian.getJumlahAntrian());
                    }
                    break;

                case 7:
                    if (antrian.isFull()) {
                        System.out.println("Antrian PENUH (10/10).");
                    } else {
                        System.out.println("Antrian BELUM penuh. (" + antrian.getJumlahAntrian() + "/10)");
                    }
                    break;

                case 8:
                    System.out.println("Jumlah mahasiswa dalam antrian: " + antrian.getJumlahAntrian());
                    break;

                case 9:
                    System.out.println("Jumlah mahasiswa yang sudah KRS: " + antrian.getJumlahSudahKRS());
                    break;

                case 10:
                    System.out.println("Jumlah mahasiswa yang belum KRS: " + antrian.getJumlahBelumKRS());
                    break;

                case 11:
                    antrian.kosongkanAntrian();
                    break;

                case 0:
                    System.out.println("Terima kasih. Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Masukkan angka 0-11.");
            }

        } while (pilihan != 0);

        sc.close();
    }
}
