package P3;

public class Matakuliah19 {
    public String kode;
    public String nama;
    public int sks;
    public int jumlahJam;

    public Matakuliah19 (String kode, String nama, int sks, int jumlahJam) {
    this.kode = kode;
    this. nama = nama;
    this.sks = sks;
    this. jumlahJam = jumlahJam;
    }

    public void tambahData(String kode, String nama, int sks, int jumlahJam) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
        System.out.println("Data berhasil ditambahkan");
        System.out.println("Kode    : " + this.kode);
        System.out.println("Nama    : " + this.nama);
        System.out.println("SKS     : " + this.sks);
        System.out.println("Jam     : " + this.jumlahJam);
    }

}
