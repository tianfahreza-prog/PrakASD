package P6;

import java.util.Scanner;

public class DosenMain19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DataDosen19 list = new DataDosen19();
        int pilihan;

        do {
            System.out.println("\n=== SISTEM DATA DOSEN ===");
            System.out.println("1. Tambah Data Dosen");
            System.out.println("2. Tampil Seluruh Data Dosen");
            System.out.println("3. Sorting Data (Usia Termuda - Tertua / ASC)");
            System.out.println("4. Sorting Data (Usia Tertua - Termuda / DSC)");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu (1-5): ");
            pilihan = sc.nextInt();
            sc.nextLine();

            System.out.println();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan Kode Dosen : ");
                    String kode = sc.nextLine();
                    System.out.print("Masukkan Nama Dosen : ");
                    String nama = sc.nextLine();
                    System.out.print("Jenis Kelamin (L/P) : ");
                    String jkInput = sc.nextLine();
                    boolean jk = jkInput.equalsIgnoreCase("L"); 
                    System.out.print("Masukkan Usia       : ");
                    int usia = sc.nextInt();
                    sc.nextLine();

                    Dosen19 dsnBaru = new Dosen19(kode, nama, jk, usia);
                    list.tambah(dsnBaru);
                    System.out.println(">> Data berhasil ditambahkan!");
                    break;
                
                case 2:
                    System.out.println("=== DAFTAR DOSEN ===");
                    list.tampil();
                    break;
                
                case 3:
                    System.out.println("=== DATA DOSEN (ASC / Termuda ke Tertua) ===");
                    list.SortingASC(); 
                    list.tampil();
                    break;
                
                case 4:
                    System.out.println("=== DATA DOSEN (DSC / Tertua ke Termuda) ===");
                    list.sortingDSC(); 
                    list.tampil();
                    break;

                case 5:
                    System.out.println("Program Selesai. Terima kasih!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid, silakan coba lagi.");
            }
        } while (pilihan != 5);

        sc.close(); 
    }
}