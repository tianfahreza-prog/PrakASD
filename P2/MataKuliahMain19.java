package P2;

public class MataKuliahMain19 {
    public static void main(String[] args) {
        
        MataKuliah19 mk1 = new MataKuliah19();
        mk1.kodeMK = "ASD_A2";
        mk1.nama = "Algoritma dan Struktur Data";
        mk1.sks = 2;
        mk1.jumlahJam = 4;

        System.out.println("    Data Mata Kuliah 1 ");
        mk1.tampilInformasi();

        MataKuliah19 mk2 = new MataKuliah19("BD_01", "Basis Data", 3, 6);
        
        System.out.println("    Data Mata Kuliah 2 ");
        mk2.tampilInformasi();

        System.out.println("--- Menguji Method pada MK 2 ---");
        mk2.ubahSKS(4);
        mk2.tambahJam(2);
        mk2.kurangiJam(3);
        mk2.kurangiJam(10);
        
        System.out.println("\n=== Informasi Akhir Mata Kuliah 2 ===");
        mk2.tampilInformasi();
    }
}
