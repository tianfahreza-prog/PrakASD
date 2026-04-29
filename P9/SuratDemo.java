package P9;

import java.util.Scanner;

public class SuratDemo {
    public static void main(String[] args) {
        Stacksurat19 stackSurat = new Stacksurat19(10);
        Scanner scan = new Scanner(System.in);
        int pilih;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat");
            System.out.println("5. Lihat Semua Surat");
            System.out.print("Pilih: ");
            pilih = scan.nextInt();
            scan.nextLine();

            switch (pilih) {
                case 1: // Terima surat
                    System.out.print("ID Surat: ");
                    String id = scan.nextLine();
                    System.out.print("Nama Mahasiswa: ");
                    String nama = scan.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = scan.nextLine();
                    System.out.print("Jenis Izin (S=Sakit / I=Izin): ");
                    char jenis = scan.nextLine().toUpperCase().charAt(0);
                    System.out.print("Durasi (hari): ");
                    int durasi = scan.nextInt();
                    scan.nextLine();

                    Surat19 surat = new Surat19(id, nama, kelas, jenis, durasi);
                    stackSurat.push(surat);
                    System.out.printf("Surat izin dari %s berhasil diterima.\n", nama);
                    break;

                case 2: // Proses surat
                    Surat19 diproses = stackSurat.pop();
                    if (diproses != null) {
                        String jenisStr = (diproses.jenisIzin == 'S') ? "Sakit" : "Izin";
                        System.out.println("Memproses surat dari: " + diproses.namaMahasiswa);
                        System.out.println("Kelas     : " + diproses.kelas);
                        System.out.println("Jenis Izin: " + jenisStr);
                        System.out.println("Durasi    : " + diproses.durasi + " hari");
                        System.out.println("Surat berhasil divalidasi!");
                    }
                    break;

                case 3: // Lihat surat terakhir
                    Surat19 terakhir = stackSurat.peek();
                    if (terakhir != null) {
                        String jenisStr = (terakhir.jenisIzin == 'S') ? "Sakit" : "Izin";
                        System.out.println("Surat izin terakhir:");
                        System.out.println("ID Surat  : " + terakhir.idSurat);
                        System.out.println("Nama      : " + terakhir.namaMahasiswa);
                        System.out.println("Kelas     : " + terakhir.kelas);
                        System.out.println("Jenis Izin: " + jenisStr);
                        System.out.println("Durasi    : " + terakhir.durasi + " hari");
                    }
                    break;

                case 4: // Cari surat berdasarkan nama
                    System.out.print("Masukkan nama mahasiswa yang dicari: ");
                    String cari = scan.nextLine();
                    boolean ketemu = stackSurat.cariSurat(cari);
                    if (ketemu) {
                        System.out.println("Surat izin atas nama \"" + cari + "\" ditemukan dalam stack.");
                    } else {
                        System.out.println("Surat izin atas nama \"" + cari + "\" tidak ditemukan.");
                    }
                    break;

                case 5: // Lihat semua surat
                    stackSurat.print();
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilih >= 1 && pilih <= 5);

        scan.close();
        System.out.println("Program selesai.");
    }
}
