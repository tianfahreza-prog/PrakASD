package P14;

public class Mahasiswa19 {

    String nim, nama, kelas;
    double ipk;

    public Mahasiswa19() {

    }

    public Mahasiswa19(String nim, String nama, String Kelas, double ipk){
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }

    public void tampilInformasi() {
        System.out.println("NIM: " + this.nim + " Nama: " + this.nama + " kelas: " + this.kelas + " IPK: " + this.ipk);
    }
}
