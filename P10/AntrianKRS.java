package P10;

public class AntrianKRS {
    Mahasiswa[] data;
    int front;
    int rear;
    int size;
    int max;
    int jumlahSudahKRS;   
    int maxPerDPA;      

    public AntrianKRS(int max, int maxPerDPA) {
        this.max = max;
        this.maxPerDPA = maxPerDPA;
        data = new Mahasiswa[max];
        front = 0;
        rear = -1;
        size = 0;
        jumlahSudahKRS = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == max;
    }

    public void tambahAntrian(Mahasiswa mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh! Tidak dapat menambah mahasiswa.");
            return;
        }
        rear = (rear + 1) % max;
        data[rear] = mhs;
        size++;
        System.out.println(mhs.nama + " berhasil masuk ke antrian. (Posisi: " + size + ")");
    }

    public void panggilDuaMahasiswa() {
        if (isEmpty()) {
            System.out.println("Antrian kosong, tidak ada mahasiswa yang dipanggil.");
            return;
        }

        System.out.println("Memanggil mahasiswa untuk proses KRS:");
        System.out.println("NIM - NAMA - PRODI - KELAS");

        int dipanggil = 0;
        while (dipanggil < 2 && !isEmpty()) {

            if (jumlahSudahKRS >= maxPerDPA) {
                System.out.println("DPA sudah mencapai batas maksimal " + maxPerDPA + " mahasiswa!");
                return;
            }
            Mahasiswa mhs = data[front];
            size--;
            if (isEmpty()) {
                front = 0;
                rear = -1;
            } else {
                front = (front + 1) % max;
            }
            dipanggil++;
            jumlahSudahKRS++;
            System.out.print(dipanggil + ". ");
            mhs.tampilkanData();
        }

        System.out.println("Total dipanggil: " + dipanggil + " mahasiswa.");
    }

    public void tampilkanSemua() {
        if (isEmpty()) {
            System.out.println("Antrian masih kosong.");
            return;
        }
        System.out.println("Daftar Antrian KRS:");
        System.out.println("NIM - NAMA - PRODI - KELAS");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % max;
            System.out.print((i + 1) + ". ");
            data[index].tampilkanData();
        }
    }

    public void tampilkanDuaTerdepan() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("2 Mahasiswa Terdepan dalam Antrian:");
        System.out.println("NIM - NAMA - PRODI - KELAS");
        int tampil = Math.min(2, size);
        for (int i = 0; i < tampil; i++) {
            int index = (front + i) % max;
            System.out.print((i + 1) + ". ");
            data[index].tampilkanData();
        }
    }

    public void tampilkanAkhir() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("Mahasiswa paling akhir dalam antrian:");
        System.out.println("NIM - NAMA - PRODI - KELAS");
        data[rear].tampilkanData();
    }

    public int getJumlahAntrian() {
        return size;
    }

    public int getJumlahSudahKRS() {
        return jumlahSudahKRS;
    }

    public int getJumlahBelumKRS() {
        return size;
    }

    public void kosongkanAntrian() {
        if (isEmpty()) {
            System.out.println("Antrian sudah kosong.");
            return;
        }
        front = 0;
        rear = -1;
        size = 0;
        System.out.println("Antrian berhasil dikosongkan.");
    }
}
