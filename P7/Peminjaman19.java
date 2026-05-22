package P7;

public class Peminjaman19 {
    Mahasiswa19 mhs;
    Buku19 buku;
    int lamaPinjam;
    int batasPinjam = 5;
    int terlambat;
    int denda;

    public Peminjaman19(Mahasiswa19 mhs, Buku19 buku, int lamaPinjam) {
        this.mhs = mhs;
        this.buku = buku;
        this.lamaPinjam = lamaPinjam;
        hitungDenda();
    }

    public void hitungDenda() {
        if (lamaPinjam > batasPinjam) {
            terlambat = lamaPinjam - batasPinjam;
            denda = terlambat * 2000;

            if (buku.tahunTerbit <= 2020) {
                denda = denda / 2; // potongan 50%
            }
        } else {
            terlambat = 0;
            denda = 0;
        }
    }

    public void tampilPeminjaman() {
        System.out.println(mhs.nama + " | " + buku.judul + " | Lama: " + lamaPinjam + " | Terlambat: " + terlambat + " | Denda: " + denda);
    }

    public void updateLamaPinjam(int lamaBaru) {
        this.lamaPinjam = lamaBaru;
        hitungDenda(); //hitung ulang
    }
}