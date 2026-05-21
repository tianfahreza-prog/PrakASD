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
        scan.nextLine(); // membersihkan buffer sisa enter
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
            System.out.println("4. Tambah data pada indeks tertentu (Tugas 1)");
            System.out.println("5. Hapus data di awal");
            System.out.println("6. Hapus data di akhir");
            System.out.println("7. Hapus data setelah NIM tertentu (Tugas 2)");
            System.out.println("8. Hapus data pada indeks tertentu (Tugas 3)");
            System.out.println("9. Tampilkan data pertama (Tugas 4a)");
            System.out.println("10. Tampilkan data terakhir (Tugas 4b)");
            System.out.println("11. Tampilkan data pada indeks tertentu (Tugas 4c)");
            System.out.println("12. Tampilkan semua data");
            System.out.println("13. Tampilkan data secara terbalik (Pertanyaan 6)");
            System.out.println("14. Tampilkan jumlah data saat ini (Tugas 5)");
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
                    System.out.print("Masukkan indeks posisi penambahan: ");
                    int idxAdd = scan.nextInt();
                    scan.nextLine();
                    System.out.println("Masukkan data baru: ");
                    list.add(idxAdd, inputMahasiswa(scan));
                    break;
                case 5:
                    list.removeFirst();
                    break;
                case 6:
                    list.removeLast();
                    break;
                case 7:
                    System.out.print("Masukkan NIM target: ");
                    String keyRemove = scan.nextLine();
                    list.removeAfter(keyRemove);
                    break;
                case 8:
                    System.out.print("Masukkan indeks yang ingin dihapus: ");
                    int idxRemove = scan.nextInt();
                    scan.nextLine();
                    list.remove(idxRemove);
                    break;
                case 9:
                    list.getFirst();
                    break;
                case 10:
                    list.getLast();
                    break;
                case 11:
                    System.out.print("Masukkan indeks yang ingin dilihat: ");
                    int idxGet = scan.nextInt();
                    scan.nextLine();
                    list.getIndex(idxGet);
                    break;
                case 12:
                    list.print();
                    break;
                case 13:
                    list.printReverse();
                    break;
                case 14:
                    System.out.println("Jumlah data aktif: " + list.getSize());
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