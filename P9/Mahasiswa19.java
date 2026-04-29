package P9;

public class Mahasiswa19 {
    String nim;
    String nama;
    String kelas;
    int nilai;

    // Konstruktor default
    public Mahasiswa19() {}

    // Konstruktor berparameter
    public Mahasiswa19(String nama, String nim, String kelas) {
        this.nama = nama;
        this.nim = nim;
        this.kelas = kelas;
        this.nilai = -1; // belum dinilai
    }

    // Method untuk mengeset nilai tugas
    void tugasDinilai(int nilai) {
        this.nilai = nilai;
    }
}
