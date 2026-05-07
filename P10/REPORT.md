|  | Algorithm and Data Structure |
|--|--|
| NIM |  254107020053|
| Nama |  M. Tahtian Fahreza |
| Kelas | TI - 1F |
| Repository | [link] (https://github.com/tianfahreza-prog/PrakASD) |

# Labs #9 STACK

## Percobaan 1

di bawah ini adalah tangkapan layar hasilnya.

```
Masukkan kapasitas queue: 4
Masukkan operasi yang diinginkan: 
1. Enqueue
2. Dequeue
3. Print
4. peek
5. clear
-----------------------
1
Masukkan data baru: 
15
Masukkan operasi yang diinginkan: 
1. Enqueue
2. Dequeue
3. Print
4. peek
5. clear
-----------------------
1
Masukkan data baru: 
31
Masukkan operasi yang diinginkan: 
1. Enqueue
2. Dequeue
3. Print
4. peek
5. clear
-----------------------

4
Elemen terdepan: 15
Masukkan operasi yang diinginkan: 
1. Enqueue
2. Dequeue
3. Print
4. peek
5. clear
-----------------------
```

Pertanyaan: 
1. Pada konstruktor, mengapa nilai awal atribut front dan rear bernilai -1, sementara atribut size bernilai 0?
 - karena front dan rear adalah variabel untuk menunjukkan posisi index. jika front dan rear dijadikan 0, dan 0 adalah posisi indeks pertama di java. jadi logika nya akan salah.
 - size bernilai 0 karena ini jumlah elemen dari Queue jadi memang 0.
2. Pada method Enqueue, jelaskan maksud dan kegunaan dari potongan kode berikut!
 ```
 if (rear == max - 1) {
    rear = 0;
 ```
 - agar rear yang kosong bisa diisi kembali
3. Pada method Dequeue, jelaskan maksud dan kegunaan dari potongan kode berikut!
 ```
 if (front == max - 1) {
    front = 0;
 ```
 - agar penanda front kembali ke indeks 0
4. Pada method print, mengapa pada proses perulangan variabel i tidak dimulai dari 0 (int i=0), melainkan int i=front?
 - karena front akan bergeser jika ada dequeue
5. Perhatikan kembali method print, jelaskan maksud dari potongan kode berikut!
 ```
 i = (i + 1) % max;
 ```
 - agar jika i sudah mencapai nilai max dia akan kembali ke 0
6. Tunjukkan potongan kode program yang merupakan queue overflow!
 ```
 if (IsFull()) {
            System.out.println("Queue sudah penuh");
 ```
7. Pada saat terjadi queue overflow dan queue underflow, program tersebut tetap dapat berjalan dan hanya menampilkan teks informasi. Lakukan modifikasi program sehingga pada saat terjadi queue overflow dan queue underflow, program dihentikan!
 ```
 if (IsFull()) {
            System.out.println("Queue sudah penuh");
            System.exit(0);
 ```


## Percobaan 2
   
di bawah ini adalah tangkapan layar hasilnya.

```
== Menu Antrian Layanan Akademik ===
1. Tambah Mahasiswa ke Antrian
2. Layani Mahasiswa
3. Lihat Mahasiswa Terdepan
4. Lihat Semua Antrian
5. Jumlah Mahasiswa dalam Antrian
0. Keluar
Pilih menu: 1
NIM : 123
Nama : Aldi
Prodi : TI
Kelas : 1A
Aldi berhasil masuk ke antrian.

=== Menu Antrian Layanan Akademik ===
1. Tambah Mahasiswa ke Antrian
2. Layani Mahasiswa
3. Lihat Mahasiswa Terdepan
4. Lihat Semua Antrian
5. Jumlah Mahasiswa dalam Antrian
0. Keluar
Pilih menu: 1
NIM : 124
Nama : Bobi
Prodi : TI
Kelas : 1A
Bobi berhasil masuk ke antrian.

=== Menu Antrian Layanan Akademik ===
1. Tambah Mahasiswa ke Antrian
2. Layani Mahasiswa
3. Lihat Mahasiswa Terdepan
4. Lihat Semua Antrian
5. Jumlah Mahasiswa dalam Antrian
0. Keluar
Pilih menu: 4
Daftar mahasiswa dalam antrian:
NIM - NAMA - PRODI - KELAS
1. 123 - Aldi - TI - 1A
2. 124 - Bobi - TI - 1A

=== Menu Antrian Layanan Akademik ===
1. Tambah Mahasiswa ke Antrian
2. Layani Mahasiswa
3. Lihat Mahasiswa Terdepan
4. Lihat Semua Antrian
5. Jumlah Mahasiswa dalam Antrian
0. Keluar
Pilih menu: 2
Melayani mahasiswa: 123 - Aldi - TI - 1A

=== Menu Antrian Layanan Akademik ===
1. Tambah Mahasiswa ke Antrian
2. Layani Mahasiswa
3. Lihat Mahasiswa Terdepan
4. Lihat Semua Antrian
5. Jumlah Mahasiswa dalam Antrian
0. Keluar
Pilih menu: 4
Daftar mahasiswa dalam antrian:
NIM - NAMA - PRODI - KELAS
1. 124 - Bobi - TI - 1A

=== Menu Antrian Layanan Akademik ===
1. Tambah Mahasiswa ke Antrian
2. Layani Mahasiswa
3. Lihat Mahasiswa Terdepan
4. Lihat Semua Antrian
5. Jumlah Mahasiswa dalam Antrian
0. Keluar
Pilih menu: 5
Jumlah dalam antrian: 1

=== Menu Antrian Layanan Akademik ===
1. Tambah Mahasiswa ke Antrian
2. Layani Mahasiswa
3. Lihat Mahasiswa Terdepan
4. Lihat Semua Antrian
5. Jumlah Mahasiswa dalam Antrian
0. Keluar
Pilih menu: 0
Terima kasih.

```


Pertanyaan:
1. 
```
=== Menu Antrian Layanan Akademik ===
1. Tambah Mahasiswa ke Antrian
2. Layani Mahasiswa
3. Lihat Mahasiswa Terdepan
4. Lihat Semua Antrian
5. Jumlah Mahasiswa dalam Antrian
6. Cek Antrian Paling Belakang
0. Keluar
Pilih menu: 6
Antrian kosong.

=== Menu Antrian Layanan Akademik ===
1. Tambah Mahasiswa ke Antrian
2. Layani Mahasiswa
3. Lihat Mahasiswa Terdepan
4. Lihat Semua Antrian
5. Jumlah Mahasiswa dalam Antrian
6. Cek Antrian Paling Belakang
0. Keluar
Pilih menu: 
```

## Latihan Praktikum
 
1. 
```
======================================
   ANTRIAN KRS - DOSEN PEMBINA (DPA)  
======================================
1.  Tambah Mahasiswa ke Antrian
2.  Panggil 2 Mahasiswa untuk Proses KRS
3.  Tampilkan Semua Antrian
4.  Tampilkan 2 Antrian Terdepan
5.  Tampilkan Antrian Paling Akhir
6.  Cek Antrian Kosong
7.  Cek Antrian Penuh
8.  Jumlah Mahasiswa dalam Antrian
9.  Jumlah Mahasiswa Sudah KRS
10. Jumlah Mahasiswa Belum KRS
11. Kosongkan Antrian
0.  Keluar
--------------------------------------
Pilih menu: 

```