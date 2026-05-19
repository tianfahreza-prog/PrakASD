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
=== PRAKTIKUM 2.1 ===
Linked list kosong

Isi Linked List:
Dirga      21212203     4D    3.6

Isi Linked List:
Dirga      21212203     4D    3.6
Alvaro     22212205     1A    4.0

Isi Linked List:
Dirga      21212203     4D    3.6
Bimon      23212201     2B    3.8
Cintia     22212202     3C    3.5
Alvaro     22212205     1A    4.0

=== Tambah Data Mahasiswa dari Keyboard ===
NIM    : 254107020053
Nama   : Tian
Kelas  : 1F
IPK    : 3.5
Posisi (F=First / L=Last) : f
Data ditambahkan di awal.
Isi Linked List:
Tian       254107020053 1F    3.5
Dirga      21212203     4D    3.6
Bimon      23212201     2B    3.8
Cintia     22212202     3C    3.5
Alvaro     22212205     1A    4.0

PS C:\Users\Hype G12\OneDrive\Documents\Kuliah\SEM2\PASD\PrakASD> 
```

Pertanyaan: 
1. Mengapa hasil compile kode program di baris pertama menghasilkan “Linked List Kosong”?
 - karena sll.print() dipanggil sebelum data apapun ditambahkan. head masih null sehingga isEmpty() return true.
2. Jelaskan kegunaan variable temp secara umum pada setiap method!
 - Variabel temp berfungsi sebagai pointer traversal. ia menyimpan referensi node saat ini selama iterasi tanpa mengubah head atau tail, sehingga posisi awal list tetap terjaga.
3. Lakukan modifikasi agar data dapat ditambahkan dari keyboard!
 - 
 ```
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
 ```

## Percobaan 2
   
di bawah ini adalah tangkapan layar hasilnya.

```
-=== PRAKTIKUM 2.1 ===
Linked list kosong

Isi Linked List:
Dirga      21212203     4D    3.6

Isi Linked List:
Dirga      21212203     4D    3.6
Alvaro     22212205     1A    4.0

Isi Linked List:
Dirga      21212203     4D    3.6
Bimon      23212201     2B    3.8
Cintia     22212202     3C    3.5
Alvaro     22212205     1A    4.0

=== Tambah Data Mahasiswa dari Keyboard ===
NIM    : 254107020053
Nama   : Tian
Kelas  : 1F
IPK    : 3.5
Posisi (F=First / L=Last) : f
Data ditambahkan di awal.
Isi Linked List:
Tian       254107020053 1F    3.5
Dirga      21212203     4D    3.6
Bimon      23212201     2B    3.8
Cintia     22212202     3C    3.5
Alvaro     22212205     1A    4.0

=== PRAKTIKUM 2.2 ===
data index 1 : 
Dirga      21212203     4D    3.6

data mahasiswa an Bimon berada pada index : 2

Isi Linked List:
Dirga      21212203     4D    3.6
Bimon      23212201     2B    3.8
Cintia     22212202     3C    3.5

Isi Linked List:
Bimon      23212201     2B    3.8
Cintia     22212202     3C    3.5

PS C:\Users\Hype G12\OneDrive\Documents\Kuliah\SEM2\PASD\PrakASD> 

```

Pertanyaan:
1. Mengapa digunakan keyword break pada fungsi remove? Jelaskan
 - Keyword break digunakan agar loop berhenti segera setelah node yang cocok ditemukan dan dihapus
2. Jelaskan kegunaan kode dibawah pada method remove
```
temp.next = temp.next.next;
if (temp.next == null) {
tail = temp;
```
 - baris pertama menghubungkan ulang node sebelum ke node sesudah target (melewati/menghapus node target). Baris kedua memperbarui tail jika node yang dihapus ternyata node terakhir.

## Tugas
```
=== SISTEM ANTRIAN LAYANAN UNIT KEMAHASISWAAN ===
          === MENU ANTRIAN ===
  1. Daftar Antrian (Enqueue)        
  2. Panggil Antrian (Dequeue)       
  3. Tampilkan Semua Antrian         
  4. Tampil Terdepan & Terakhir      
  5. Jumlah Mahasiswa Mengantri      
  6. Cek Status Antrian              
  7. Kosongkan Antrian               
  0. Keluar                          
Pilih menu
```