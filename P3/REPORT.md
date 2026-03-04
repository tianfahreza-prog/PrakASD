|  | Algorithm and Data Structure |
|--|--|
| NIM |  254107020053|
| Nama |  M. Tahtian Fahreza |
| Kelas | TI - 1F |
| Repository | [link] (https://github.com/tianfahreza-prog/PrakASD) |

# Labs #3 Array Of Objects

## 3.2 Percobaan 1

di bawah ini adalah tangkapan layar hasilnya.

```
NIM     : 244107060033
Nama    : AGNES TITANIA KINANTI
Kelas   : SIB-1E
IPK     : 3.75
--------------------------------------
NIM     : 2341720172
Nama    : ACHMAD MAULANA HAMZAH
Kelas   : TI-2A
IPK     : 3.36
--------------------------------------
NIM     : 244107023006
Nama    : DIRHAMAWAN PUTRANTO
Kelas   : TI-2E
IPK     : 3.8
--------------------------------------
PS C:\Users\Hype G12\OneDrive\Documents\Kuliah\SEM2\prakASD\PrakASD> 
```

Pertanyaan: 
1. Berdasarkan uji coba 3.2, apakah class yang akan dibuat array of object harus selalu memiliki
atribut dan sekaligus method? Jelaskan!
 - class tidak harus memiliki atribut dan method sekaligus untuk dibuat array of object.
2. Apa yang dilakukan oleh kode program berikut? Mahasiswa[] arrayOfMahasiswa = new Mahasiswa[3];
 - Membuat array yang mempunyai slot 3 elemen.
3. Apakah class Mahasiswa memiliki konstruktor? Jika tidak, kenapa bisa dilakukan pemanggilan
konstruktur pada baris program berikut?
 arrayOfMahasiswa[0] = new Mahasiswa();
 - Tidak memiliki konstruktor, bisa dilakukan pemanggilan karena di java membuat konstruktor otomatis oleh compiler.
4. Apa yang dilakukan oleh kode program berikut?
        arrayOfMahasiswa[0] = new Mahasiswa();
        arrayOfMahasiswa[0].nim = "244107060033";
        arrayOfMahasiswa[0].nama = "AGNES TITANIA KINANTI";
        arrayOfMahasiswa[0].kelas = "SIB-1E";
        arrayOfMahasiswa[0].ipk = (float) 3.75;
 - arrayOfMahasiswa[0] = new Mahasiswa(); : Membuat object Mahasiswa baru dan menyimpannya di indeks ke-0 dari array.
 - arrayOfMahasiswa[0].nim = "...";
arrayOfMahasiswa[0].nama = "...";
arrayOfMahasiswa[0].kelas = "...";
arrayOfMahasiswa[0].ipk = (float) 3.75;
: mengisi atribut dari object tersebut.

5. Mengapa class Mahasiswa dan MahasiswaDemo dipisahkan pada uji coba 3.2?
 - Struktur data terpisah dari program utama (main).
 - Kode lebih terorganisir.


## 3.3 Percobaan 2
   
di bawah ini adalah tangkapan layar hasilnya.

```
Masukkan Data Mahasiswa ke-1
NIM : 244107060033
Nama : AGNES TITANIA KINANTI
Kelas : SIB-1E
IPK : 3.75
----------------------------------------
Masukkan Data Mahasiswa ke-2
NIM : 2341720172
Nama : ACHMAD MAULANA HAMZAH
Kelas : TI-2A
IPK : 3.36
----------------------------------------
Masukkan Data Mahasiswa ke-3
NIM : 244107023006
Nama : DIRHAMAWAN PUTRANTO
Kelas : TI-2E
IPK : 3.80
----------------------------------------
Data Mahasiswa ke-1
NIM     : 244107060033
Nama    : AGNES TITANIA KINANTI
Kelas   : SIB-1E
IPK     : 3.75
--------------------------------------
Data Mahasiswa ke-2
NIM     : 2341720172
Nama    : ACHMAD MAULANA HAMZAH
Kelas   : TI-2A
IPK     : 3.36
--------------------------------------
Data Mahasiswa ke-3
NIM     : 244107023006
Nama    : DIRHAMAWAN PUTRANTO
Kelas   : TI-2E
IPK     : 3.8
--------------------------------------
```


Pertanyaan:
1. Tambahkan method cetakInfo() pada class Mahasiswa kemudian modifikasi kode program
pada langkah no 3.
 -  ```void cetakInfo() {
        System.out.println("NIM   : " + nim);
        System.out.println("Nama  : " + nama);
        System.out.println("Kelas : " + kelas);
        System.out.println("IPK   : " + ipk);
        System.out.println("------------------------------");
    }```
2. Misalkan Anda punya array baru bertipe array of Mahasiswa dengan nama
myArrayOfMahasiswa. Mengapa kode berikut menyebabkan error? 
Mahasiswa [] myArrayOfMahasiswa = new Mahasiswa [3];
myArrayOfMahasiswa [0].nim = "244107060033";
myArrayOfMahasiswa [0].nama = "AGNES TITANIA KINANTI";
myArrayOfMahasiswa [0] .kelas = "SIB-1E";
myArrayOfMahasiswa[0].ipk = (float) 3.75;
 - Error terjadi karena mengakses atribut dari object yang belum dibuat.


## 3.4 Percobaan 3

```
Masukkan Data Matakuliah ke-1
Kode       : 12345
Nama       : Algoritma & Struktur Data
Sks        : 2
Jumlah Jam : 6
--------------------------------------
Masukkan Data Matakuliah ke-2
Kode       : 54321
Nama       : Sistem Basis Data
Sks        : 2
Jumlah Jam : 4
--------------------------------------
Masukkan Data Matakuliah ke-3
Kode       : 83652
Nama       : Dasar Pemrograman
Sks        : 2
Jumlah Jam : 4
--------------------------------------
Data Mahasiswa ke-1
Kode         : 12345
Nama         : Algoritma & Struktur Data
Sks          : 2
Jumlah Jam   : 6
--------------------------------------
Data Mahasiswa ke-2
Kode         : 54321
Nama         : Sistem Basis Data
Sks          : 2
Jumlah Jam   : 4
--------------------------------------
Data Mahasiswa ke-3
Kode         : 83652
Nama         : Dasar Pemrograman
Sks          : 2
Jumlah Jam   : 4
--------------------------------------
PS C:\Users\Hype G12\OneDrive\Documents\Kuliah\SEM2\prakASD\PrakASD> 
```


Pertanyaan:
1. Apakah suatu class dapat memiliki lebih dari 1 constructor? Jika iya, berikan contohnya
 - Satu class boleh punya lebih dari satu constructor, selama parameter nya berbeda.
 ```
 class Matkul {
    String kode;
    String nama;
    int sks;

    Matkul() {
        System.out.println("Matkul dibuat");
    }

    Matkul(String kode, String nama) {
        this.kode = kode;
        this.nama = nama;
    }

    Matkul(String kode, String nama, int sks) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
    }

    void cetakInfo() {
        System.out.println("Kode : " + kode);
        System.out.println("Nama : " + nama);
        System.out.println("SKS  : " + sks);
        System.out.println("----------------------");
    }
}
```
2. Tambahkan method tambahData() pada class Matakuliah, kemudian gunakan method
tersebut di class MatakuliahDemo untuk menambahkan data Matakuliah
 - ```
 public void tambahData(String kode, String nama, int sks, int jumlahJam) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
        System.out.println("Data berhasil ditambahkan");
        System.out.println("Kode    : " + this.kode);
        System.out.println("Nama    : " + this.nama);
        System.out.println("SKS     : " + this.sks);
        System.out.println("Jam     : " + this.jumlahJam);
    }
    ```
3. Tambahkan method cetakInfo() pada class Matakuliah, kemudian gunakan method
tersebut di class MatakuliahDemo untuk menampilkan data hasil inputan di layar
 - ``` 
 public void cetakInfo() {
        System.out.println("Kode         : " + this.kode);
        System.out.println("Nama         : " + this.nama);
        System.out.println("Sks          : " + this.sks);
        System.out.println("Jumlah Jam   : " + this.jumlahJam);
        System.out.println("--------------------------------------");
    }
    ```
4. Modifikasi kode program pada class MatakuliahDemo agar panjang (jumlah elemen) dari
array of object Matakuliah ditentukan oleh user melalui input dengan Scanner
 - ```
 System.out.print("Masukkan jumlah Matakuliah : ");
        int jumlah = Integer.parseInt(sc.nextLine());
        Matakuliah19[] arrayOfMatakuliah = new Matakuliah19[jumlah];
    ```



## Tugas
   
1. ``` 
    Masukkan jumlah Dosen : 2
    Masukkan Data Dosen ke-1
    Kode           : 7r3j
    Nama           : putri
    Jenis Kelamin (Pria/Wanita) : wanita
    Usia           : 23
    ------------------------------
    Masukkan Data Dosen ke-2
    Kode           : 823h
    Nama           : putra
    Jenis Kelamin (Pria/Wanita) : pria
    Usia           : 25
    ------------------------------
    Data Dosen ke-1
    Kode           : 7r3j
    Nama           : putri
    Jenis Kelamin  : Wanita
    Usia           : 23
    ------------------------------
    Data Dosen ke-2
    Kode           : 823h
    Nama           : putra
    Jenis Kelamin  : Pria
    Usia           : 25
    ------------------------------
```
Class Dosen19 Class ini merepresentasikan entitas Dosen. Menyimpan data satu dosen dengan atribut kode, nama, jenisKelamin (boolean), dan usia. Memiliki constructor untuk inisialisasi data dan method cetakInfo() untuk menampilkan semua atribut ke layar. 

Class DosenDemo19 Class utama yang menjalankan program. Bertugas menerima input dari user menggunakan Scanner, lalu menyimpan data ke dalam array of object Dosen19[]. 


2. ```
------------------------------
 DATA SEMUA DOSEN
Data Dosen ke-1
Kode           : 37f
Nama           : putra
Jenis Kelamin  : Pria
Usia           : 25
------------------------------
Data Dosen ke-2
Kode           : 23r
Nama           : putri
Jenis Kelamin  : Wanita
Usia           : 23
------------------------------
 JUMLAH DOSEN PER JENIS KELAMIN
Pria   : 1
Wanita : 1
------------------------------
 RATA-RATA USIA PER JENIS KELAMIN
Pria   : 25.0
Wanita : 23.0
------------------------------
 DOSEN PALING TUA
Kode           : 37f
Nama           : putra
Jenis Kelamin  : Pria
Usia           : 25
------------------------------
 DOSEN PALING MUDA
Kode           : 23r
Nama           : putri
Jenis Kelamin  : Wanita
Usia           : 23
------------------------------
```
Class DataDosen19 Class utilitas yang berisi kumpulan method untuk mengolah dan menganalisis data dari array of object Dosen19[].