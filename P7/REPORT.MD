|  | Algorithm and Data Structure |
|--|--|
| NIM |  254107020053|
| Nama |  M. Tahtian Fahreza |
| Kelas | TI - 1F |
| Repository | [link] (https://github.com/tianfahreza-prog/PrakASD) |

# Labs #6 SEARCHING

## 6.2 Percobaan 1

di bawah ini adalah tangkapan layar hasilnya.

```
Masukkan Data Mahasiswa ke-1
NIM   : 111
Nama  : adi
Kelas : 2
IPK   : 3.0
Masukkan Data Mahasiswa ke-2
NIM   : 123
Nama  : adu    
Kelas : 2
IPK   : 3.9
Masukkan Data Mahasiswa ke-3
NIM   : 234
Nama  : ada
Kelas : 2
IPK   : 3.5
Masukkan Data Mahasiswa ke-4
NIM   : 333
Nama  : ade
Kelas : 2
IPK   : 3.7
Masukkan Data Mahasiswa ke-5
NIM   : 444
Nama  : ado
Kelas : 2
IPK   : 4.0
Nama: adi
NIM: 111
Kelas: 2
IPK: 3.0
---------------------
Nama: adu
NIM: 123
Kelas: 2
IPK: 3.9
---------------------
Nama: ada
NIM: 234
Kelas: 2
IPK: 3.5
---------------------
Nama: ade
NIM: 333
Kelas: 2
IPK: 3.7
---------------------
Nama: ado
NIM: 444
Kelas: 2
IPK: 4.0
---------------------
-----------------------------------------------------
Pencarian data
-----------------------------------------------------
masukkan ipk mahasiswa yang dicari:
IPK: 4.0
menggunakan sequential searching
data mahasiswa dengan IPK :4.0 ditemukan pada indeks 4
nim      : 444
nama     : ado
kelas    : 2
ipk      : 4.0
```

Pertanyaan: 
1. Jelaskan perbedaan metod tampilDataSearch dan tampilPosisi pada class
MahasiswaBerprestasi!
 - TampilDataSearch untuk menampilkan data yang dicari
 - TampilPosisi untuk menampilkan posisi data yang dicari
2. Jelaskan fungsi break pada kode program di bawah ini!
```
if (listMhs[j].ipk == cari){
posisi=j;
break;

}
```
 - break berfungsi menghentikan program jika isi variabel (cari) sama dengan array (listMhs[j].ipk)
3. Apa fungsi variabel pos atau indeks hasil pencarian dalam program sequential search?
 - Untuk menyimpan alamat data
 - jika data ipk tidak ada didalam list, fungsi pencarian akan me return angka -1.
4. Jika terdapat lebih dari satu data dengan nilai yang sama, hasil pencarian sequential search yang dibuat di atas akan menampilkan data ke berapa? Jelaskan.
 - program akan menampilkan data yang pertama kali ditemukan karena ada perintah break.
5. Berkaitan dengan pertanyaan nomor 2 di atas, apa yang terjadi jika perintah break dihapus dari kode di atas?
 - perintah akan tetap berjalan meski posisi sudah ditemukan.

## 6.3 Percobaan 2
   
di bawah ini adalah tangkapan layar hasilnya.

```
Masukkan Data Mahasiswa ke-1
NIM   : 111
Nama  : adi
Kelas : 2
IPK   : 3.0
Masukkan Data Mahasiswa ke-2
NIM   : 222
Nama  : adu
Kelas : 2
IPK   : 3.2
Masukkan Data Mahasiswa ke-3
NIM   : 333
Nama  : ade
Kelas : 2
IPK   : 3.4
Masukkan Data Mahasiswa ke-4
NIM   : 444
Nama  : adq
Kelas : 2
IPK   : 3.6
Masukkan Data Mahasiswa ke-5
NIM   : 555
Nama  : ado
Kelas : 2
IPK   : 3.8
Nama: adi
NIM: 111
Kelas: 2
IPK: 3.0
---------------------
Nama: adu
NIM: 222
Kelas: 2
IPK: 3.2
---------------------
Nama: ade
NIM: 333
Kelas: 2
IPK: 3.4
---------------------
Nama: adq
NIM: 444
Kelas: 2
IPK: 3.6
---------------------
Nama: ado
NIM: 555
Kelas: 2
IPK: 3.8
---------------------
-----------------------------------------------------
Pencarian data
-----------------------------------------------------
masukkan ipk mahasiswa yang dicari:
IPK: 3.6
-----------------------------------------------------
menggunakan binary search
-----------------------------------------------------
data mahasiswa dengan IPK :3.6 ditemukan pada indeks 3
nim      : 444
nama     : adq
kelas    : 2
ipk      : 3.6
PS C:\Users\Hype G12\OneDrive\Documents\Kuliah\SEM2\prakASD\PrakASD> 
```


Pertanyaan:
1. Tunjukkan pada kode program yang mana proses divide dijalankan!
```
 int findBinarySearch(double cari, int left, int right){
        int mid;
        if (right>=left){
            mid =(left+right)/2;
            if (cari ==listMhs[mid].ipk){
                return (mid);
            }
            else if (listMhs[mid].ipk>cari){
                return findBinarySearch(cari, left, mid-1);
            }
            else{
                return findBinarySearch(cari, mid+1, right);
            }
            
        }
        return -1;
    }
```
2. Tunjukkan pada kode program yang mana proses conquer dijalankan!
 - return mid
3. Apa fungsi left, right, dan mid?
 - left untuk menunjukkan indeks urutan paling awal
 - right untuk menunjukkan indeks paling akhi
 - mid untuk menunjukkan indeks tengah, setelah left + right dibagi 2
4. Jika data IPK yang dimasukkan tidak urut. Apakah program masih dapat berjalan? Mengapa
demikian?
 - tetap berjalan, tapi output nya salah karena sistem divide membagi 2, sisi kanan lebih besar  dan sisi kiri lebih kecil, jika tidak urut data yang dikeluarkan tidak sesuai.
5. Jika IPK yang dimasukkan dari IPK terbesar ke terkecil (misal: 3.8, 3.7, 3.5, 3.4, 3.2) dan elemen yang dicari adalah 3.2. Bagaimana hasil dari binary search? Apakah sesuai? Jika tidak sesuai maka ubahlah kode program binary seach agar hasilnya sesuai
 - ouput tidak sesuai, 
6. Jelaskan bagaimana binary search menentukan bahwa data yang dicari tidak ditemukan di dalam
array.
 - jika kondisi terus menerus tidak cocok dengan nilai tengah, maka nilai kiri akan melewati nilai kanan dan sebaliknya, disitu sistem berhenti.
7. Modifikasi program di atas yang mana jumlah mahasiswa yang diinputkan sesuai dengan masukan
dari keyboard.
```
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MahasiswaBerprestasi19 list = new MahasiswaBerprestasi19();
        int JumMhs;

        System.out.print("Berapa Mahasiswa?: ");
        int mhs = sc.nextInt();
        JumMhs = mhs;
        sc.nextLine();
```
