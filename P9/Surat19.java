package P9;

public class Surat19 {
    String idSurat;
    String namaMahasiswa;
    String kelas;
    char jenisIzin; // S = sakit, I = izin keperluan lain
    int durasi;

    // Konstruktor default
    public Surat19() {}

    // Konstruktor berparameter
    public Surat19(String idSurat, String namaMahasiswa, String kelas, char jenisIzin, int durasi) {
        this.idSurat = idSurat;
        this.namaMahasiswa = namaMahasiswa;
        this.kelas = kelas;
        this.jenisIzin = jenisIzin;
        this.durasi = durasi;
    }
}


