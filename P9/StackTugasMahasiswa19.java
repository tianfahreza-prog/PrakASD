package P9;

public class StackTugasMahasiswa19 {
    Mahasiswa19[] stack;
    int size;
    int top;

    // Konstruktor berparameter
    public StackTugasMahasiswa19(int size) {
        this.size = size;
        stack = new Mahasiswa19[size];
        top = -1;
    }

    // Cek apakah stack penuh
    public boolean isFull() {
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    // Cek apakah stack kosong
    public boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    // Tambah tugas ke stack (push)
    public void push(Mahasiswa19 mhs) {
        if (!isFull()) {
            top++;
            stack[top] = mhs;
        } else {
            System.out.println("Stack penuh! Tidak bisa menambahkan tugas lagi.");
        }
    }

    // Ambil tugas teratas (pop) - untuk penilaian
    public Mahasiswa19 pop() {
        if (!isEmpty()) {
            Mahasiswa19 m = stack[top];
            top--;
            return m;
        } else {
            System.out.println("Stack kosong! Tidak ada tugas untuk dinilai.");
            return null;
        }
    }

    // Lihat tugas teratas tanpa mengambil (peek)
    public Mahasiswa19 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong! Tidak ada tugas yang dikumpulkan");
            return null;
        }
    }

    // [Pertanyaan 4] Lihat tugas terbawah (yang pertama kali dikumpulkan)
    public Mahasiswa19 peekBottom() {
        if (!isEmpty()) {
            return stack[0];
        } else {
            System.out.println("Stack kosong! Tidak ada tugas yang dikumpulkan");
            return null;
        }
    }

    // [Pertanyaan 5] Hitung berapa banyak tugas yang sudah dikumpulkan
    public int hitungTugas() {
        return top + 1;
    }

    // Tampilkan semua tugas di stack
    public void print() {
        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i].nama + "\t" + stack[i].nim + "\t" + stack[i].kelas);
        }
        System.out.println("");
    }

    // Konversi nilai desimal ke biner menggunakan StackKonversi
    public String konversiDesimalKeBiner(int nilai) {
        StackKonversi19 stackBiner = new StackKonversi19();
        while (nilai > 0) {
            int sisa = nilai % 2;
            stackBiner.push(sisa);
            nilai = nilai / 2;
        }
        String biner = new String();
        while (!stackBiner.isEmpty()) {
            biner += stackBiner.pop();
        }
        return biner;
    }
}
