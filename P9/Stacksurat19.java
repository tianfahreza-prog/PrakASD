package P9;

public class Stacksurat19 {
    Surat19[] stack;
    int size;
    int top;

    public Stacksurat19(int size) {
        this.size = size;
        stack = new Surat19[size];
        top = -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    // Terima surat baru (push)
    public void push(Surat19 surat) {
        if (!isFull()) {
            top++;
            stack[top] = surat;
        } else {
            System.out.println("Stack penuh! Tidak bisa menerima surat lagi.");
        }
    }

    // Proses/validasi surat teratas (pop)
    public Surat19 pop() {
        if (!isEmpty()) {
            Surat19 s = stack[top];
            top--;
            return s;
        } else {
            System.out.println("Stack kosong! Tidak ada surat untuk diproses.");
            return null;
        }
    }

    // Lihat surat terakhir masuk (peek)
    public Surat19 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong! Tidak ada surat.");
            return null;
        }
    }

    // Cari surat berdasarkan nama mahasiswa
    public boolean cariSurat(String nama) {
        for (int i = 0; i <= top; i++) {
            if (stack[i].namaMahasiswa.equalsIgnoreCase(nama)) {
                return true;
            }
        }
        return false;
    }

    // Tampilkan semua surat
    public void print() {
        if (isEmpty()) {
            System.out.println("Tidak ada surat dalam stack.");
            return;
        }
        System.out.println("ID Surat\tNama\t\tKelas\tJenis\tDurasi");
        for (int i = top; i >= 0; i--) {
            String jenis = (stack[i].jenisIzin == 'S') ? "Sakit" : "Izin";
            System.out.println(stack[i].idSurat + "\t\t" + stack[i].namaMahasiswa
                    + "\t\t" + stack[i].kelas + "\t" + jenis + "\t" + stack[i].durasi + " hari");
        }
        System.out.println();
    }
}


