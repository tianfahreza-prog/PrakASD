|  | Algorithm and Data Structure |
|--|--|
| NIM |  254107020053|
| Nama |  M. Tahtian Fahreza |
| Kelas | TI - 1F |
| Repository | [link] (https://github.com/tianfahreza-prog/PrakASD) |

# Labs #12 DOUBLE LINKEDLIST

## Percobaan 1

di bawah ini adalah tangkapan layar hasilnya.

```
===== MENU DOUBLE LINKED LIST (ABSEN 19) =====
1. Tambah data di awal
2. Tambah data di akhir
3. Sisipkan data di tengah (setelah NIM)
4. Hapus data di awal
5. Hapus data di akhir
6. Tampilkan semua data
0. Keluar
Pilih menu: 2
Masukkan data akhir:
Masukkan NIM   : 123005
Masukkan Nama  : harry
Masukkan Kelas : 1a
Masukkan IPK   : 3.76

===== MENU DOUBLE LINKED LIST (ABSEN 19) =====
1. Tambah data di awal
2. Tambah data di akhir
3. Sisipkan data di tengah (setelah NIM)
4. Hapus data di awal
5. Hapus data di akhir
6. Tampilkan semua data
0. Keluar
Pilih menu: 3
Masukkan NIM yang dicari: 123005
Masukkan data baru: 
Masukkan NIM   : 123010
Masukkan Nama  : potter
Masukkan Kelas : 1b
Masukkan IPK   : 
3.55
Data berhasil disisipkan setelah NIM 123005

===== MENU DOUBLE LINKED LIST (ABSEN 19) =====
1. Tambah data di awal
2. Tambah data di akhir
3. Sisipkan data di tengah (setelah NIM)
4. Hapus data di awal
5. Hapus data di akhir
6. Tampilkan semua data
0. Keluar
Pilih menu: 6
NIM   : 123005
Nama  : harry
Kelas : 1a
IPK   : 3.76
---------------------
NIM   : 123010
Nama  : potter
Kelas : 1b
IPK   : 3.55
---------------------
```

Pertanyaan: 
1. Jelaskan perbedaan struktur dan mekanisme traversal antara Single Linked List dan
Double Linked List!
 - Setiap node pada Single Linked List hanya memiliki satu buah pointer yaitu next. traversal data bersifat satu arah.
 - node pada Double Linked List memiliki dua buah pointer, yaitu next dan prev. traversal data bersifat dua arah.
2. Perhatikan class Node, di dalamnya terdapat atribut next dan prev. Jelaskan fungsi masing-masing atribut tersebut pada proses traversal dan manipulasi node!
 - Atribut next berfungsi sebagai penunjuk alamat memori dari node berikutnya
 - prev berfungsi sebagai penunjuk alamat memori dari node sebelumnya di dalam list
3. Perhatikan konstruktor pada class DoubleLinkedList. Jelaskan fungsi konstruktor tersebut terhadap kondisi awal linked list!
 - Fungsi konstruktor untuk menginisialisasi keadaan awal dari objek Double LinkedList. di dalam konstruktor atribut pointer head dan tail diatur bernilai null, hal ini menandakan bahwa linkedlist tersebut masih kosong dan belum memiliki node di dalamnya.
4. Perhatikan potongan kode berikut:
```
if (isEmpty()) {
 head = tail = newNode;
}
```
Mengapa head dan tail harus menunjuk node yang sama ketika linked list masih kosong?
 - Ketika linked list berada dalam kondisi kosong, berarti belum ada node sama sekali di dalamnya. ketika sebuah node baru (newNode) dimasukkan untuk pertama kali, maka node tersebut otomatis menjadi node pertama sekaligus node terakhir di dalam list tersebut.
5. Modifikasi method print() agar menampilkan pesan "Linked List masih kosong" ketika tidak terdapat data pada linked list
``` 
 if (isEmpty()) {
            System.out.println("Linked List masih kosong.");
            return;
        }
```
6. Modifikasi kode program dengan menambahkan method printReverse() untuk
menampilkan seluruh data pada Double Linked List secara terbalik, dimulai dari node tail menuju head!
```
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
```


## Percobaan 2
   
di bawah ini adalah tangkapan layar hasilnya.

```
===== MENU DOUBLE LINKED LIST (ABSEN 19) =====
1. Tambah data di awal
2. Tambah data di akhir
3. Sisipkan data di tengah (setelah NIM)
4. Hapus data di awal
5. Hapus data di akhir
6. Tampilkan semua data
0. Keluar
Pilih menu: 2
Masukkan data akhir:
Masukkan NIM   : 123005
Masukkan Nama  : harry
Masukkan Kelas : 1a
Masukkan IPK   : 3.76

===== MENU DOUBLE LINKED LIST (ABSEN 19) =====
1. Tambah data di awal
2. Tambah data di akhir
3. Sisipkan data di tengah (setelah NIM)
4. Hapus data di awal
5. Hapus data di akhir
6. Tampilkan semua data
0. Keluar
Pilih menu: 3
Masukkan NIM yang dicari: 123005
Masukkan data baru: 
Masukkan NIM   : 123010
Masukkan Nama  : potter
Masukkan Kelas : 1b
Masukkan IPK   : 
3.55
Data berhasil disisipkan setelah NIM 123005

===== MENU DOUBLE LINKED LIST (ABSEN 19) =====
1. Tambah data di awal
2. Tambah data di akhir
3. Sisipkan data di tengah (setelah NIM)
4. Hapus data di awal
5. Hapus data di akhir
6. Tampilkan semua data
0. Keluar
Pilih menu: 6
NIM   : 123005
Nama  : harry
Kelas : 1a
IPK   : 3.76
---------------------
NIM   : 123010
Nama  : potter
Kelas : 1b
IPK   : 3.55
---------------------

```

Pertanyaan:
1. Perhatikan potongan kode berikut pada method removeFirst();
```
head = head.next;
head.prev = null;
```
 Jelaskan fungsi masing-masing statement tersebut pada proses penghapusan node!
 - head = head.next; utuk menggeser posisi pointer head agar menunjuk ke node kedua / node seteleha head saat ini.
 - head.prev = null; untuk memutuskan hubungan pointer prev milik node headd yang baru. agar nodepertama yang lama benar benar hilang.
2. Modifikasi method removeFirst() dan removeLast() agar program menampilkan data
yang berhasil dihapus!
```
 public void removeFirst() {
        if (isEmpty()) {
            System.out.println("Linked List kosong.");
            return;
        }
        System.out.println("Data berikut berhasil dihapus:");
        head.data.tampil();
```
## Tugas
1. Tambahkan method add(int index, Mahasiswa data) untuk menambahkan node pada indeks tertentu!
2. Tambahkan method removeAfter() untuk menghapus node setelah node yang memiliki data key tertentu!
3. Tambahkan method remove(int index) untuk menghapus node pada indeks tertentu!
4. Tambahkan method:
 - getFirst()
 - getLast()
 - getIndex()
 untuk menampilkan data pada node pertama, node terakhir, dan node pada indeks tertentu
5. Tambahkan atribut dan method untuk menghitung jumlah data (size) pada Double Linked List.

