package P2;

public class MataKuliah19 {
    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;

    public MataKuliah19() {
    }

    public MataKuliah19(String kodeMK, String nama, int sks, int jumlahJam) {
        this.kodeMK = kodeMK;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    void tampilInformasi() {
        System.out.println("Kode MK    : " + kodeMK);
        System.out.println("Nama MK    : " + nama);
        System.out.println("SKS        : " + sks);
        System.out.println("Jumlah Jam : " + jumlahJam);
        System.out.println("---------------------------");
    }

    void ubahSKS(int sksBaru) {
        this.sks = sksBaru;
        System.out.println("SKS telah diubah menjadi: " + sks);
    }

    void tambahJam(int jam) {
        this.jumlahJam += jam;
        System.out.println("Jam berhasil ditambah. Jumlah jam sekarang: " + jumlahJam);
    }

    void kurangiJam(int jam) {
        if (this.jumlahJam >= jam) {
            this.jumlahJam -= jam;
            System.out.println("Pengurangan berhasil. Jumlah jam sekarang: " + jumlahJam);
        } else {
            System.out.println("Pengurangan tidak dapat dilakukan! Jumlah jam tidak mencukupi.");
        }
    }
}
