package P7;

import java.util.Scanner;

public class PeminjamanMain19 {
    
    // Insertion Sort DESC
    public static void urutkanBerdasarkanDenda(Peminjaman19[] arr) {
        for (int i = 1; i < arr.length; i++) {
            Peminjaman19 key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j].denda < key.denda) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    // Binary Search
    public static void urutkanBerdasarkanNIM(Peminjaman19[] arr) {
        for (int i = 1; i < arr.length; i++) {
            Peminjaman19 key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j].mhs.nim.compareTo(key.mhs.nim) > 0) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    //pencarian menggunakan Binary Search
    public static void cariBerdasarkanNIM(Peminjaman19[] arr, String nimCari) {
        urutkanBerdasarkanNIM(arr);

        int left = 0;
        int right = arr.length - 1;
        int cari = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int cmp = arr[mid].mhs.nim.compareTo(nimCari);

            if (cmp == 0) {
                cari = mid;
                break;
            } else if (cmp < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        if (cari != -1) {

            int indexPertama = cari;
            while (indexPertama > 0 && arr[indexPertama - 1].mhs.nim.equals(nimCari)) {
                indexPertama--;
            }
            
            while (indexPertama < arr.length && arr[indexPertama].mhs.nim.equals(nimCari)) {
                arr[indexPertama].tampilPeminjaman();
                indexPertama++;
            }
        } else {
            System.out.println("Data peminjaman dengan NIM " + nimCari + " tidak ditemukan.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Data ahasiswa
        Mahasiswa19[] daftarMhs = {
            new Mahasiswa19("22001", "Andi", "Teknik Informatika"),
            new Mahasiswa19("22002", "Budi", "Teknik Informatika"),
            new Mahasiswa19("22003", "Citra", "Sistem Informasi Bisnis")
        };

        // Data buku
        Buku19[] daftarBuku = {
            new Buku19("B001", "Algoritma", 2020),
            new Buku19("B002", "Basis Data", 2019),
            new Buku19("B003", "Pemrograman", 2021),
            new Buku19("B004", "Fisika", 2024)
        };

        // Data peminjaman
        Peminjaman19[] daftarPeminjaman = {
            new Peminjaman19(daftarMhs[0], daftarBuku[0], 7),
            new Peminjaman19(daftarMhs[1], daftarBuku[1], 3), 
            new Peminjaman19(daftarMhs[2], daftarBuku[2], 10), 
            new Peminjaman19(daftarMhs[2], daftarBuku[3], 6), 
            new Peminjaman19(daftarMhs[0], daftarBuku[1], 4)  
        };

        int menu;
        do {
            System.out.println("\n=== SISTEM PEMINJAMAN RUANG BACA JTI ===");
            System.out.println("1. Tampilkan mahasiswa");
            System.out.println("2. Tampilkan Buku");
            System.out.println("3. Tampilkan Peminjaman");
            System.out.println("4. Urutkan Berdasarkan Denda");
            System.out.println("5. Cari Berdasarkan NIM");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {
                case 1:
                    System.out.println("\nDaftar Mahasiswa:");
                    for (Mahasiswa19 m : daftarMhs) {
                        m.tampilMahasiswa();
                    }
                    break;
                case 2:
                    System.out.println("\nDaftar Buku:");
                    for (Buku19 b : daftarBuku) {
                        b.tampilBuku();
                    }
                    break;
                case 3:
                    System.out.println("\nData Peminjaman:");
                    for (Peminjaman19 p : daftarPeminjaman) {
                        p.tampilPeminjaman();
                    }
                    break;
                case 4:
                    System.out.println("\nSetelah diurutkan (Denda terbesar):");
                    urutkanBerdasarkanDenda(daftarPeminjaman);
                    for (Peminjaman19 p : daftarPeminjaman) {
                        p.tampilPeminjaman();
                    }
                    break;
                case 5:
                    System.out.print("\nMasukkan NIM: ");
                    String cariNim = sc.nextLine();
                    cariBerdasarkanNIM(daftarPeminjaman, cariNim);
                    break;
                case 0:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (menu != 0);

        sc.close();
    }
}