package P12;

public class DoubleLinkedList19 {
    Node19 head;
    Node19 tail;
    int size;

    public DoubleLinkedList19() {
        head = null;
        tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(Mahasiswa19 data) {
        Node19 newNode = new Node19(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void addLast(Mahasiswa19 data) {
        Node19 newNode = new Node19(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void insertAfter(String keyNim, Mahasiswa19 data) {
        Node19 current = head;
        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Data dengan NIM " + keyNim + " tidak ditemukan.");
            return;
        }

        Node19 newNode = new Node19(data);
        if (current == tail) {
            newNode.prev = current;
            current.next = newNode;
            tail = newNode;
        } else {
            newNode.prev = current;
            newNode.next = current.next;
            current.next.prev = newNode;
            current.next = newNode;
        }
        System.out.println("Data berhasil disisipkan setelah NIM " + keyNim);
    }

    public void add(int index, Mahasiswa19 data) {
        if (index < 0 || index > size) {
            System.out.println("Indeks di luar batas.");
            return;
        }
        if (index == 0) {
            addFirst(data);
        } else if (index == size) {
            addLast(data);
        } else {
            Node19 current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            Node19 newNode = new Node19(data);
            newNode.prev = current.prev;
            newNode.next = current;
            current.prev.next = newNode;
            current.prev = newNode;
            size++;
        }
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong.");
            return;
        }
        Node19 current = head;
        while (current != null) {
            current.data.tampil();
            current = current.next;
        }
    }

    public void printReverse() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong.");
            return;
        }
        System.out.println("=== Menampilkan Data Secara Terbalik (Tail -> Head) ===");
        Node19 current = tail;
        while (current != null) {
            current.data.tampil();
            current = current.prev;
        }
    }

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("Linked List kosong.");
            return;
        }
        System.out.println("Data berikut berhasil dihapus:");
        head.data.tampil();

        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
    }

    public void removeLast() {
        if (isEmpty()) {
            System.out.println("Linked List kosong.");
            return;
        }
        System.out.println("Data berikut berhasil dihapus:");
        tail.data.tampil();

        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
    }

    public void removeAfter(String keyNim) {
        Node19 current = head;
        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }

        if (current == null || current.next == null) {
            System.out.println("Tidak ada node yang bisa dihapus setelah NIM " + keyNim);
            return;
        }

        Node19 target = current.next;
        System.out.println("Data setelah NIM " + keyNim + " berhasil dihapus:");
        target.data.tampil();

        if (target == tail) {
            current.next = null;
            tail = current;
        } else {
            current.next = target.next;
            target.next.prev = current;
        }
        size--;
    }

    public void remove(int index) {
        if (isEmpty() || index < 0 || index >= size) {
            System.out.println("Indeks di luar batas atau list kosong.");
            return;
        }
        if (index == 0) {
            removeFirst();
        } else if (index == size - 1) {
            removeLast();
        } else {
            Node19 current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            System.out.println("Data pada indeks " + index + " berhasil dihapus:");
            current.data.tampil();

            current.prev.next = current.next;
            current.next.prev = current.prev;
            size--;
        }
    }

    public void getFirst() {
        if (isEmpty()) {
            System.out.println("Linked List kosong.");
        } else {
            System.out.println("Data Pertama:");
            head.data.tampil();
        }
    }

    public void getLast() {
        if (isEmpty()) {
            System.out.println("Linked List kosong.");
        } else {
            System.out.println("Data Terakhir:");
            tail.data.tampil();
        }
    }

    public void getIndex(int index) {
        if (isEmpty() || index < 0 || index >= size) {
            System.out.println("Indeks tidak valid atau list kosong.");
            return;
        }
        Node19 current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        System.out.println("Data pada indeks " + index + ":");
        current.data.tampil();
    }

    public int getSize() {
        return this.size;
    }
}