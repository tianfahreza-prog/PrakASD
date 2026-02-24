package P2;

public class DosenMain19 {
    public static void main(String[] args) {

        Dosen19 dosen1 = new Dosen19();
        dosen1.idDosen = "D001";
        dosen1.nama = "Pak Budi";
        dosen1.statusAktif = true;
        dosen1.tahunBergabung = 2015;
        dosen1.bidangKeahlian = "Basis Data";

        Dosen19 dosen2 = new Dosen19(
                "D002",
                "Bu Sinta",
                false,
                2018,
                "Pemrograman"
        );

        System.out.println("=== DATA DOSEN 1 ===");
        dosen1.tampilInformasi();
        System.out.println("Masa Kerja: " + dosen1.hitungMasaKerja(2025) + " tahun");

        dosen1.ubahKeahlian("AI");
        dosen1.setStatusAktif(false);

        System.out.println("\n=== DATA DOSEN 2 ===");
        dosen2.tampilInformasi();
        System.out.println("Masa Kerja: " + dosen2.hitungMasaKerja(2025) + " tahun");
    }
}
