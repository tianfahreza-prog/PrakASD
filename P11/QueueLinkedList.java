package P11;

public class QueueLinkedList {
    private NodeQueue front;
    private NodeQueue rear;
    private int size;
    private final int MAX_SIZE = 10;

    // ── isEmpty ──────────────────────────────────────────────────────────────
    public boolean isEmpty() {
        return (front == null);
    }

    // ── isFull ───────────────────────────────────────────────────────────────
    public boolean isFull() {
        return (size >= MAX_SIZE);
    }

    // ── clear ─────────────────────────────────────────────────────────────────
    public void clear() {
        front = null;
        rear  = null;
        size  = 0;
        System.out.println("Antrian berhasil dikosongkan.");
    }

    // ── enqueue (tambah antrian) ──────────────────────────────────────────────
    public void enqueue(Mahasiswa19 mhs) {
        if (isFull()) {
            System.out.println("[!] Antrian penuh! Tidak dapat menambahkan mahasiswa baru.");
            return;
        }
        NodeQueue newNode = new NodeQueue(mhs, null);
        if (isEmpty()) {
            front = newNode;
            rear  = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
        System.out.println("[+] " + mhs.nama + " berhasil ditambahkan ke antrian. " +
                           "(Nomor antrian: " + size + ")");
    }

    public Mahasiswa19 dequeue() {
        if (isEmpty()) {
            System.out.println("[!] Antrian kosong! Tidak ada mahasiswa yang dapat dipanggil.");
            return null;
        }
        Mahasiswa19 dipanggil = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        size--;
        return dipanggil;
    }

    public void tampilTerdepan() {
        if (isEmpty()) {
            System.out.println("[!] Antrian kosong.");
        } else {
            System.out.println("Antrian terdepan :");
            System.out.printf("  %-10s %-12s %-5s %.1f%n",
                front.data.nama, front.data.nim, front.data.kelas, front.data.ipk);
        }
    }

    public void tampilTerakhir() {
        if (isEmpty()) {
            System.out.println("[!] Antrian kosong.");
        } else {
            System.out.println("Antrian paling akhir :");
            System.out.printf("  %-10s %-12s %-5s %.1f%n",
                rear.data.nama, rear.data.nim, rear.data.kelas, rear.data.ipk);
        }
    }

    public int jumlahAntrian() {
        return size;
    }

    public void tampilAntrian() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("--- Daftar Antrian Saat Ini (" + size + " mahasiswa) ---");
        NodeQueue tmp = front;
        int no = 1;
        while (tmp != null) {
            System.out.printf("  %d. %-10s %-12s %-5s %.1f%n",
                no++, tmp.data.nama, tmp.data.nim, tmp.data.kelas, tmp.data.ipk);
            tmp = tmp.next;
        }
        System.out.println("--------------------------------------------------");
    }
}
