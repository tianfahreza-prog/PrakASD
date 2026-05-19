package P11;

public class Mahasiswa19 {
    String nim;
    String nama;
    String kelas;
    double ipk;

    public Mahasiswa19() {}

    public Mahasiswa19(String nm, String name, String kls, double ip) {
        this.nim = nm;
        this.nama = name;
        this.kelas = kls;
        this.ipk = ip;
    }

    public void tampilInformasi() {
        System.out.printf("%-10s %-12s %-5s %.1f%n", nama, nim, kelas, ipk);
    }
}
