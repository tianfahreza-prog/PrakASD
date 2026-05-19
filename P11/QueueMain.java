package P11;

import java.util.Scanner;

public class QueueMain {

    static Scanner sc = new Scanner(System.in);
    static QueueLinkedList antrian = new QueueLinkedList();

    public static void main(String[] args) {
        System.out.println("=== SISTEM ANTRIAN LAYANAN UNIT KEMAHASISWAAN ===");


        boolean running = true;
        while (running) {
            tampilMenu();
            System.out.print("Pilih menu : ");
            String pilihan = sc.nextLine().trim();

            switch (pilihan) {
                case "1":
                    daftarAntrian();
                    break;
                case "2":
                    panggilAntrian();
                    break;
                case "3":
                    antrian.tampilAntrian();
                    break;
                case "4":
                    antrian.tampilTerdepan();
                    antrian.tampilTerakhir();
                    break;
                case "5":
                    System.out.println("Jumlah mahasiswa yang masih mengantri : "
                        + antrian.jumlahAntrian() + " orang.");
                    break;
                case "6":
                    cekStatus();
                    break;
                case "7":
                    konfirmasiKosongkan();
                    break;
                case "0":
                    System.out.println("Terima kasih. Program selesai.");
                    running = false;
                    break;
                default:
                    System.out.println("[!] Pilihan tidak valid. Silakan coba lagi.");
            }
            System.out.println();
        }
        sc.close();
    }

    static void tampilMenu() {
        System.out.println("          === MENU ANTRIAN ===");
        System.out.println("  1. Daftar Antrian (Enqueue)        ");
        System.out.println("  2. Panggil Antrian (Dequeue)       ");
        System.out.println("  3. Tampilkan Semua Antrian         ");
        System.out.println("  4. Tampil Terdepan & Terakhir      ");
        System.out.println("  5. Jumlah Mahasiswa Mengantri      ");
        System.out.println("  6. Cek Status Antrian              ");
        System.out.println("  7. Kosongkan Antrian               ");
        System.out.println("  0. Keluar                          ");

    }

    static void daftarAntrian() {
        if (antrian.isFull()) {
            System.out.println("[!] Antrian penuh! Mahasiswa tidak dapat mendaftar.");
            return;
        }
        System.out.println("--- Pendaftaran Antrian ---");
        System.out.print("NIM   : "); String nim   = sc.nextLine();
        System.out.print("Nama  : "); String nama  = sc.nextLine();
        System.out.print("Kelas : "); String kelas = sc.nextLine();
        System.out.print("IPK   : "); double ipk   = Double.parseDouble(sc.nextLine());

        Mahasiswa19 mhs = new Mahasiswa19(nim, nama, kelas, ipk);
        antrian.enqueue(mhs);
    }

    static void panggilAntrian() {
        if (antrian.isEmpty()) {
            System.out.println("[!] Tidak ada antrian saat ini.");
            return;
        }
        Mahasiswa19 dipanggil = antrian.dequeue();
        if (dipanggil != null) {
            System.out.println("==================================");
            System.out.println("  Memanggil mahasiswa:");
            System.out.printf("  %-10s %-12s %-5s %.1f%n",
                dipanggil.nama, dipanggil.nim, dipanggil.kelas, dipanggil.ipk);
            System.out.println("  Silakan menuju loket pelayanan.");
            System.out.println("==================================");
        }
    }

    static void cekStatus() {
        System.out.println("Status antrian :");
        System.out.println("  Kosong  : " + (antrian.isEmpty() ? "Ya" : "Tidak"));
        System.out.println("  Penuh   : " + (antrian.isFull()  ? "Ya" : "Tidak"));
        System.out.println("  Jumlah  : " + antrian.jumlahAntrian() + " mahasiswa");
    }

    static void konfirmasiKosongkan() {
        System.out.print("Yakin ingin mengosongkan seluruh antrian? (y/n) : ");
        String jawab = sc.nextLine().trim();
        if (jawab.equalsIgnoreCase("y")) {
            antrian.clear();
        } else {
            System.out.println("Dibatalkan.");
        }
    }
}
