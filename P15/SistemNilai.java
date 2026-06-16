package P15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class SistemNilai {
    private static ArrayList<Mahasiswa19> listMahasiswa = new ArrayList<>();
    private static ArrayList<MataKuliah19> listMK = new ArrayList<>();
    private static ArrayList<Nilai19> listNilai = new ArrayList<>();
    // Menggunakan queue untuk penghapusan mahasiswa Tugas No 2
    private static Queue<Mahasiswa19> queueHapusMahasiswa = new LinkedList<>();

    public static void main(String[] args) {
        initData();
        Scanner sc = new Scanner(System.in);
        int menu;

        do {
            System.out.println("=================================================");
            System.out.println("SISTEM PENGOLAHAN DATA NILAI MAHASISWA SEMESTER");
            System.out.println("=================================================");
            System.out.println("1. Input Nilai");
            System.out.println("2. Tampil Nilai");
            System.out.println("3. Mencari Nilai Mahasiswa");
            System.out.println("4. Urut Data Nilai (Urut Nilai Descending)");
            System.out.println("5. Antrekan Hapus Mahasiswa (Queue)");
            System.out.println("6. Eksekusi Hapus Mahasiswa Terdepan");
            System.out.println("7. Keluar");
            System.out.print("Pilih: ");
            menu = sc.nextInt();
            sc.nextLine(); 

            switch (menu) {
                case 1:
                    System.out.print("Masukkan data\nNilai: ");
                    double nilaiInput = sc.nextDouble();
                    sc.nextLine();

                    System.out.println("\nDAFTAR MAHASISWA");
                    System.out.printf("%-10s %-15s %-10s\n", "NIM", "Nama", "Telf");
                    for (Mahasiswa19 m : listMahasiswa) {
                        System.out.printf("%-10s %-15s %-10s\n", m.nim, m.nama, m.telf);
                    }
                    System.out.print("Pilih mahasiswa by nim: ");
                    String chosenNim = sc.nextLine();
                    Mahasiswa19 mhsTerpilih = cariMahasiswaObj(chosenNim);

                    System.out.println("\nDAFTAR MATA KULIAH");
                    System.out.printf("%-10s %-35s %-5s\n", "Kode", "Mata Kuliah", "SKS");
                    for (MataKuliah19 mk : listMK) {
                        System.out.printf("%-10s %-35s %-5d\n", mk.kode, mk.nama, mk.sks);
                    }
                    System.out.print("Pilih MK by kode: ");
                    String chosenKode = sc.nextLine();
                    MataKuliah19 mkTerpilih = cariMKObj(chosenKode);

                    if (mhsTerpilih != null && mkTerpilih != null) {
                        listNilai.add(new Nilai19(mhsTerpilih, mkTerpilih, nilaiInput));
                        System.out.println("Data nilai berhasil ditambahkan!");
                    } else {
                        System.out.println("NIM atau Kode MK tidak valid!");
                    }
                    break;

                case 2:
                    System.out.println("\nDAFTAR NILAI MAHASISWA");
                    System.out.printf("%-10s %-15s %-35s %-5s %-5s\n", "Nim", "Nama", "Mata Kuliah", "SKS", "Nilai");
                    for (Nilai19 n : listNilai) {
                        System.out.printf("%-10s %-15s %-35s %-5d %-5.2f\n", 
                                n.mhs.nim, n.mhs.nama, n.mk.nama, n.mk.sks, n.nilaiAngka);
                    }
                    break;

                case 3:
                    System.out.print("Masukkan data mahasiswa [nim]: ");
                    String searchNim = sc.nextLine();
                    System.out.printf("%-10s %-15s %-35s %-5s %-5s\n", "Nim", "Nama", "Mata Kuliah", "SKS", "Nilai");
                    int totalSKS = 0;
                    for (Nilai19 n : listNilai) {
                        if (n.mhs.nim.equals(searchNim)) {
                            System.out.printf("%-10s %-15s %-35s %-5d %-5.2f\n", 
                                    n.mhs.nim, n.mhs.nama, n.mk.nama, n.mk.sks, n.nilaiAngka);
                            totalSKS += n.mk.sks;
                        }
                    }
                    System.out.println("Total SKS " + totalSKS + " telah diambil.");
                    break;

                case 4:
                    // Mengurutkan data nilai secara Descending berdasarkan Nilai Angka
                    Collections.sort(listNilai, new Comparator<Nilai19>() {
                        @Override
                        public int compare(Nilai19 n1, Nilai19 n2) {
                            return Double.compare(n2.nilaiAngka, n1.nilaiAngka);
                        }
                    });
                    System.out.println("\nDAFTAR NILAI MAHASISWA (TERURUT DESCENDING)");
                    System.out.printf("%-10s %-15s %-35s %-5s\n", "Nim", "Nama", "Mata Kuliah", "Nilai");
                    for (Nilai19 n : listNilai) {
                        System.out.printf("%-10s %-15s %-35s %-5.2f\n", 
                                n.mhs.nim, n.mhs.nama, n.mk.nama, n.nilaiAngka);
                    }
                    break;

                case 5:
                    System.out.print("Masukkan NIM Mahasiswa yang akan dimasukkan ke antrean hapus: ");
                    String nimHapus = sc.nextLine();
                    Mahasiswa19 mhsHapus = cariMahasiswaObj(nimHapus);
                    if (mhsHapus != null) {
                        queueHapusMahasiswa.add(mhsHapus);
                        System.out.println("Mahasiswa " + mhsHapus.nama + " berhasil masuk antrean hapus.");
                    } else {
                        System.out.println("NIM tidak ditemukan!");
                    }
                    break;

                case 6:
                    if (!queueHapusMahasiswa.isEmpty()) {
                        Mahasiswa19  mhsKeluar = queueHapusMahasiswa.poll();
                        listMahasiswa.remove(mhsKeluar);
                        listNilai.removeIf(nilai -> nilai.mhs.nim.equals(mhsKeluar.nim));
                        System.out.println("Mahasiswa " + mhsKeluar.nama + " telah resmi dihapus dari sistem!");
                    } else {
                        System.out.println("Antrean hapus kosong!");
                    }
                    break;

                case 7:
                    System.out.println("Keluar program. Terima kasih!");
                    break;
            }
        } while (menu != 7);
    }

    private static void initData() {
        listMahasiswa.add(new Mahasiswa19("20001", "Thalhah", "021xxx"));
        listMahasiswa.add(new Mahasiswa19("20002", "Zubair", "021xxx"));
        listMahasiswa.add(new Mahasiswa19("20003", "Abdur-Rahman", "021xxx"));
        listMahasiswa.add(new Mahasiswa19("20004", "Sa'ad", "021xxx"));
        listMahasiswa.add(new Mahasiswa19("20005", "Sa'id", "021xxx"));
        listMahasiswa.add(new Mahasiswa19("20006", "Ubaidah", "021xxx"));

        listMK.add(new MataKuliah19("00001", "Internet of Things", 3));
        listMK.add(new MataKuliah19("00002", "Algoritma dan Struktur Data", 2));
        listMK.add(new MataKuliah19("00003", "Algoritma dan Pemrograman", 2));
        listMK.add(new MataKuliah19("00004", "Praktikum Algoritma dan Struktur Data", 3));
        listMK.add(new MataKuliah19("00005", "Praktikum Algoritma dan Pemrograman", 3));
    }

    private static Mahasiswa19 cariMahasiswaObj(String nim) {
        for (Mahasiswa19 m : listMahasiswa) {
            if (m.nim.equals(nim)) return m;
        }
        return null;
    }

    private static MataKuliah19 cariMKObj(String kode) {
        for (MataKuliah19    mk : listMK) {
            if (mk.kode.equals(kode)) return mk;
        }
        return null;
    }
}