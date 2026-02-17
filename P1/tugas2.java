package P1;

import java.util.Scanner;

public class tugas2 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Masukkan jumlah jadwal: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[][] jadwal = new String[n][4];

        inputJadwal(jadwal);
        tampilSemua(jadwal);
        tampilBerdasarkanHari(jadwal);
        tampilBerdasarkanMatkul(jadwal);

    }

    static void inputJadwal(String[][] jadwal) {
        for (int i = 0; i < jadwal.length; i++) {
            System.out.println("Data ke-" + (i + 1));

            System.out.print("Nama Mata Kuliah: ");
            jadwal[i][0] = sc.nextLine();

            System.out.print("Ruang: ");
            jadwal[i][1] = sc.nextLine();

            System.out.print("Hari: ");
            jadwal[i][2] = sc.nextLine();

            System.out.print("Jam: ");
            jadwal[i][3] = sc.nextLine();

            System.out.println();
        }
    }

    static void tampilSemua(String[][] jadwal) {
        System.out.println("\n=== SEMUA JADWAL ===");
        System.out.println("Matkul\truang\thari\tjam");

        for (int i = 0; i < jadwal.length; i++) {
            for (int j = 0; j < jadwal[i].length; j++) {
                System.out.print(jadwal[i][j] + "\t");
            }
            System.out.println();
        }
    }

    static void tampilBerdasarkanHari(String[][] jadwal) {
        System.out.print("\nMasukkan hari yang dicari: ");
        String cariHari = sc.nextLine();

        System.out.println("Jadwal hari " + cariHari + ":");
        for (int i = 0; i < jadwal.length; i++) {
            if (jadwal[i][2].equalsIgnoreCase(cariHari)) {
                System.out.println(jadwal[i][0] + " | " +
                                   jadwal[i][1] + " | " +
                                   jadwal[i][2] + " | " +
                                   jadwal[i][3]);
            }
        }
    }

    static void tampilBerdasarkanMatkul(String[][] jadwal) {
        System.out.print("\nMasukkan nama mata kuliah yang dicari: ");
        String cariMK = sc.nextLine();

        boolean ditemukan = false;

        System.out.println("Hasil pencarian mata kuliah \"" + cariMK + "\":");
        for (int i = 0; i < jadwal.length; i++) {
            if (jadwal[i][0].equalsIgnoreCase(cariMK)) {
                System.out.println(jadwal[i][0] + " | " +
                                jadwal[i][1] + " | " +
                                jadwal[i][2] + " | " +
                                jadwal[i][3]);
                ditemukan = true;
            }
        }

        if (!ditemukan) {
            System.out.println("Data tidak ditemukan.");
        }
    }


}
