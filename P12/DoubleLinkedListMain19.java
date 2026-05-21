package P12;

import java.util.Scanner;

public class DoubleLinkedListMain19 {

    public static Mahasiswa19 inputMahasiswa(Scanner scan) {
        System.out.print("Masukkan NIM   : ");
        String nim = scan.nextLine();
        System.out.print("Masukkan Nama  : ");
        String nama = scan.nextLine();
        System.out.print("Masukkan Kelas : ");
        String kelas = scan.nextLine();
        System.out.print("Masukkan IPK   : ");
        double ipk = scan.nextDouble();
        scan.nextLine();
        return new Mahasiswa19(nim, nama, kelas, ipk);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DoubleLinkedList19 list = new DoubleLinkedList19();
        int pilihan;

        do {
            System.out.println("\n===== MENU DOUBLE LINKED LIST (ABSEN 19) =====");
            System.out.println("1. Tambah data di awal");
            System.out.println("2. Tambah data di akhir");
            System.out.println("3. Sisipkan data di tengah (setelah NIM)");
            System.out.println("4. Hapus data di awal");
            System.out.println("5. Hapus data di akhir");
            System.out.println("6. Tampilkan semua data");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scan.nextInt();
            scan.nextLine(); // membersihkan buffer

            switch (pilihan) {
                case 1:
                    System.out.println("Masukkan data awal:");
                    list.addFirst(inputMahasiswa(scan));
                    break;
                case 2:
                    System.out.println("Masukkan data akhir:");
                    list.addLast(inputMahasiswa(scan));
                    break;
                case 3:
                    System.out.print("Masukkan NIM yang dicari: ");
                    String keyNim = scan.nextLine();
                    System.out.println("Masukkan data baru: ");
                    list.insertAfter(keyNim, inputMahasiswa(scan));
                    break;
                case 4:
                    list.removeFirst();
                    break;
                case 5:
                    list.removeLast();
                    break;
                case 6:
                    list.print();
                    break;
                case 0:
                    System.out.println("Program selesai.");
                    break;
                default:
                    System.out.println("Menu tidak valid.");
            }
        } while (pilihan != 0);

        scan.close();
    }
}