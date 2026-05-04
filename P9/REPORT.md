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
Menu:
1. Mengumpulkan Tugas
2. Menilai Tugas
3. Melihat Tugas Teratas
4. Melihat Daftar Tugas
5. Melihat Tugas Terbawah
6. Hitung Jumlah Tugas
Pilih: 

```

Pertanyaan: 
1. Lakukan perbaikan pada kode program, sehingga keluaran yang dihasilkan sama dengan verifikasi hasil percobaan! Bagian mana yang perlu diperbaiki?
```
// SEBELUM (urutan bawah ke atas):
for (int i = 0; i <= top; i++) 

// SESUDAH (urutan atas ke bawah — sesuai verifikasi):
public void print() {
    for (int i = top; i >= 0; i--) {
        System.out.println(stack[i].nama + "\t" + stack[i].nim + "\t" + stack[i].kelas);
    }
    System.out.println("");
}
```
2. Berapa banyak data tugas mahasiswa yang dapat ditampung di dalam Stack? Tunjukkan potongan
kode programnya!
 - Stack dapat menampung 5 data tugas mahasiswa.
 ```
 StackTugasMahasiswa stack = new StackTugasMahasiswa(5);
 ```
3. Mengapa perlu pengecekan kondisi !isFull() pada method push? Kalau kondisi if-else tersebut
dihapus, apa dampaknya?
 - Pengecekan !isFull() diperlukan untuk mencegah stack overflow, kondisi di mana data ditambahkan melebihi kapasitas array yang sudah dialokasikan.
 - dampaknya jika dihapus:
    - Ketika top sudah mencapai indeks size - 1 (stack penuh), lalu top++ dieksekusi, maka top menjadi size
    - Baris stack[ top ] = mhs akan mencoba mengakses stack[ size ] yang di luar batas array
    - Program akan melempar ArrayIndexOutOfBoundsException dan berhenti secara paksa
4. Modifikasi kode program pada class MahasiswaDemo dan StackTugasMahasiswa sehingga
pengguna juga dapat melihat mahasiswa yang pertama kali mengumpulkan tugas melalui operasi
lihat tugas terbawah!
 - 
 ```
 public Mahasiswa peekBottom() {
    if (!isEmpty()) {
        return stack[0]; // indeks 0 = pertama kali push
    } else {
        System.out.println("Stack kosong! Tidak ada tugas yang dikumpulkan.");
        return null;
    }
}
 ```
 ni, serta tambahkan operasi menunya!
 ```
 case 5:
    Mahasiswa bawah = stack.peekBottom();
    if (bawah != null) {
        System.out.println("Mahasiswa pertama mengumpulkan: " + bawah.nama);
    }
    break;
 ```
 ubah do while
 ```
 while (pilih >= 1 && pilih <= 5);
 ```
5. Tambahkan method untuk dapat menghitung berapa banyak tugas yang sudah dikumpulkan saat
ini, serta tambahkan operasi menunya!
 ```
 public int count() {
    return top + 1; // top = -1 saat kosong, jadi +1 = jumlah elemen
}
 ```
 tambah case 6 di menu
 ```
 System.out.println("6. Hitung Jumlah Tugas");
 ```
 ```
 case 6:
    System.out.println("Jumlah tugas yang sudah dikumpulkan: " + stack.count());
    break;
 ```
 ubah kondisi do while
 ```
 while (pilih >= 1 && pilih <= 6);
 ```
6. Commit dan push kode program ke Github

## Percobaan 2
   
di bawah ini adalah tangkapan layar hasilnya.

```
Menu:
1. Mengumpulkan Tugas
2. Menilai Tugas
3. Melihat Tugas Teratas
4. Melihat Daftar Tugas
5. Melihat Tugas Terbawah
6. Hitung Jumlah Tugas
Pilih: 

```


Pertanyaan:
1. Jelaskan alur kerja dari method konversiDesimalKeBiner!
 - memakai operasi modulus
    - tahap 1 mengisi stack
    ```
    while (nilai > 0) {
        sisa = nilai % 2;   // ambil sisa bagi 2 (0 atau 1)
        stack.push(sisa);   // simpan sisa ke Stack
        nilai = nilai / 2;  // bagi nilai dengan 2
    }
    ```
    - tahap 2 membaca stack
    ```
    while (!stack.isEmpty()) {
        biner += stack.pop(); // pop mengambil dari atas → urutan benar
    }
    ```
2. Pada method konversiDesimalKeBiner, ubah kondisi perulangan menjadi while (kode != 0),
bagaimana hasilnya? Jelaskan alasannya
 - Hasilnya sama persis untuk nilai positif. Kondisi nilai > 0 dan nilai != 0 menghasilkan hasil yang sama selama nilai yang diproses adalah bilangan bulat positif (nilai tugas 0–100).
 - berbeda jika nilai yang dimasukkan adalah nilai negatif
    - while (nilai > 0) - loop tidak dieksekusi sama sekali, biner tetap string kosong ""
    - while (nilai != 0) - loop akan berjalan tanpa henti (infinite loop) karena pembagian integer negatif dengan 2 di Java tidak akan pernah mencapai 0 (sisa bagi bisa negatif, nilai terus berubah tapi tidak menuju 0)

## Latihan Praktikum
 
1. 
```
Menu:
1. Terima Surat Izin
2. Proses Surat Izin
3. Lihat Surat Izin Terakhir
4. Cari Surat
5. Lihat Semua Surat
Pilih: 1
ID Surat: 342384239203
Nama Mahasiswa: Tian
Kelas: 1F
Jenis Izin (S=Sakit / I=Izin): S
Durasi (hari): 2
Surat izin dari Tian berhasil diterima.

Menu:
1. Terima Surat Izin
2. Proses Surat Izin
3. Lihat Surat Izin Terakhir
4. Cari Surat
5. Lihat Semua Surat
Pilih: 3
Surat izin terakhir:
ID Surat  : 342384239203
Nama      : Tian
Kelas     : 1F
Jenis Izin: Sakit
Durasi    : 2 hari
```