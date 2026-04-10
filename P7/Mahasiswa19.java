package P7;

public class Mahasiswa19 {
    String nim;
    String nama;
    String prodi;

    public Mahasiswa19(String nim, String nama, String prodi) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
    }

    public void tampilMahasiswa() {
        System.out.println("NIM: " + nim + " | Nama: " + nama + " | Prodi: " + prodi);
    }
}
