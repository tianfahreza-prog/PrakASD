package P11;

import java.util.Scanner;

public class SingleLinkedList19 {
    NodeMahasiswa19 head;
    NodeMahasiswa19 tail;

    boolean isEmpty() {
        return (head == null);
    }

    public void print() {
        if (!isEmpty()) {
            NodeMahasiswa19 tmp = head;
            System.out.println("Isi Linked List:");
            while (tmp != null) {
                tmp.data.tampilInformasi();
                tmp = tmp.next;
            }
            System.out.println();
        } else {
            System.out.println("Linked list kosong");
            System.out.println();
        }
    }

    public void addFirst(Mahasiswa19 input) {
        NodeMahasiswa19 ndInput = new NodeMahasiswa19(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }

    public void addLast(Mahasiswa19 input) {
        NodeMahasiswa19 ndInput = new NodeMahasiswa19(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    public void insertAfter(String key, Mahasiswa19 input) {
        NodeMahasiswa19 ndInput = new NodeMahasiswa19(input, null);
        NodeMahasiswa19 temp = head;
        do {
            if (temp.data.nama.equalsIgnoreCase(key)) {
                ndInput.next = temp.next;
                temp.next = ndInput;
                if (ndInput.next == null) {
                    tail = ndInput;
                }
                break;
            }
            temp = temp.next;
        } while (temp != null);
    }

    public void insertAt(int index, Mahasiswa19 input) {
        if (index < 0) {
            System.out.println("indeks salah");
        } else if (index == 0) {
            addFirst(input);
        } else {
            NodeMahasiswa19 temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = new NodeMahasiswa19(input, temp.next);
            if (temp.next.next == null) {
                tail = temp.next;
            }
        }
    }

    
    // TambahDariKeyboard (modifikasi pertanyaan 2.1.2 no.3)
    public void addFromKeyboard() {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== Tambah Data Mahasiswa dari Keyboard ===");
        System.out.print("NIM    : "); String nim = sc.nextLine();
        System.out.print("Nama   : "); String nama = sc.nextLine();
        System.out.print("Kelas  : "); String kelas = sc.nextLine();
        System.out.print("IPK    : "); double ipk = Double.parseDouble(sc.nextLine());
        System.out.print("Posisi (F=First / L=Last) : "); String pos = sc.nextLine();

        Mahasiswa19 mhs = new Mahasiswa19(nim, nama, kelas, ipk);
        if (pos.equalsIgnoreCase("F")) {
            addFirst(mhs);
            System.out.println("Data ditambahkan di awal.");
        } else {
            addLast(mhs);
            System.out.println("Data ditambahkan di akhir.");
        }
    }
}
