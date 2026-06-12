package CM2;

import java.util.Scanner;

public class SistemAntrian19 {

    private NodeAntrian headAntrian = null;
    private NodeAntrian tailAntrian = null;
    private int counterAntrian = 0;

    private NodePesanan headPesanan = null;
    private NodePesanan tailPesanan = null;
    private int totalPendapatan = 0;

    public void tambahAntrian(String nama, String noHp) {
        counterAntrian++;
        Pembeli pembeliBaru = new Pembeli(nama, noHp);
        NodeAntrian nodeBaru = new NodeAntrian(counterAntrian, pembeliBaru);

        if (headAntrian == null) {
            headAntrian = tailAntrian = nodeBaru;
        } else {
            tailAntrian.next = nodeBaru;
            nodeBaru.prev = tailAntrian;
            tailAntrian = nodeBaru;
        }
        System.out.println("Antrian berhasil ditambahkan dengan nomor: " + counterAntrian);
    }

    public void cetakAntrian() {
        System.out.println("=====================================");
        System.out.println("Daftar Antrian Pembeli");
        System.out.println("=====================================");
        System.out.printf("%-12s %-15s %-15s\n", "No Antrian", "Nama", "No HP");
        
        if (headAntrian == null) {
            System.out.println("*(Antrian kosong)");
            return;
        }

        NodeAntrian current = headAntrian;
        while (current != null) {
            System.out.printf("%-12d %-15s %-15s\n", 
                    current.noAntrian, 
                    current.pembeli.namaPembeli, 
                    current.pembeli.NoHp);
            current = current.next;
        }
    }

    public void hapusAntrianDanPesan(int kode, String namaMakanan, int harga) {
        if (headAntrian == null) {
            System.out.println("Antrian kosong! Tidak ada pembeli yang bisa dilayani.");
            return;
        }

        NodeAntrian diproses = headAntrian;
        
        headAntrian = headAntrian.next;
        if (headAntrian != null) {
            headAntrian.prev = null;
        } else {
            tailAntrian = null;

        Pesanan pesananBaru = new Pesanan(kode, namaMakanan, harga);
        NodePesanan nodePesananBaru = new NodePesanan(pesananBaru);

        if (headPesanan == null) {
            headPesanan = tailPesanan = nodePesananBaru;
        } else {
            tailPesanan.next = nodePesananBaru;
            nodePesananBaru.prev = tailPesanan;
            tailPesanan = nodePesananBaru;
        }

        totalPendapatan += harga;
        System.out.println(diproses.pembeli.namaPembeli + " telah memesan " + namaMakanan);
    }
    }

    public void laporanPesanan() {
        System.out.println("==================================================");
        System.out.println("LAPORAN PESANAN (URUT NAMA PESANAN)");
        System.out.println("==================================================");
        System.out.printf("%-15s %-20s %-10s\n", "Kode Pesanan", "Nama Pesanan", "Harga");

        if (headPesanan == null) {
            System.out.println("*(Belum ada data pesanan)");
            System.out.println("Total Pendapatan: Rp " + totalPendapatan);
            return;
        }

        manualSortPesanan();

        NodePesanan current = headPesanan;
        while (current != null) {
            System.out.printf("%-15d %-20s %-10d\n", 
                    current.pesanan.kodePesanan, 
                    current.pesanan.namaPesanan, 
                    current.pesanan.harga);
            current = current.next;
        }
        System.out.println("--------------------------------------------------");
        System.out.println("Total Pendapatan: Rp " + totalPendapatan);
    }

    private void manualSortPesanan() {
        if (headPesanan == null || headPesanan.next == null) return;

        boolean swapped;
        do {
            swapped = false;
            NodePesanan current = headPesanan;

            while (current.next != null) {
                if (current.pesanan.namaPesanan.compareToIgnoreCase(current.next.pesanan.namaPesanan) > 0) {
                    Pesanan temp = current.pesanan;
                    current.pesanan = current.next.pesanan;
                    current.next.pesanan = temp;
                    swapped = true;
                }
                current = current.next;
            }
        } while (swapped);
    }

    public void inisialisasiDataAwal() {
        tambahAntrian("Ainra", "08224500000");
        tambahAntrian("Danra", "08224511111");
        tambahAntrian("Sanri", "08224522222");
    }

    public static void main(String[] args) {
        SistemAntrian19 resto = new SistemAntrian19();
        Scanner sc = new Scanner(System.in);

        resto.inisialisasiDataAwal();

        int pilihan;
        do {
            System.out.println("\n=====================================");
            System.out.println("SISTEM ANTRIAN ROYAL DELISH");
            System.out.println("=====================================");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Cetak Antrian");
            System.out.println("3. Hapus Antrian dan Pesan");
            System.out.println("4. Laporan Pesanan");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu : ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Nama Pembeli : ");
                    String nama = sc.nextLine();
                    System.out.print("No HP        : ");
                    String noHp = sc.nextLine();
                    resto.tambahAntrian(nama, noHp);
                    break;
                case 2:
                    resto.cetakAntrian();
                    break;
                case 3:
                    System.out.print("Kode Pesanan : ");
                    int kode = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nama Pesanan : ");
                    String menuMakanan = sc.nextLine();
                    System.out.print("Harga        : ");
                    int harga = sc.nextInt();
                    resto.hapusAntrianDanPesan(kode, menuMakanan, harga);
                    break;
                case 4:
                    resto.laporanPesanan();
                    break;
                case 0:
                    System.out.println("Keluar dari program. Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan menu tidak valid!");
            }
        } while (pilihan != 0);

        sc.close();
    }
}