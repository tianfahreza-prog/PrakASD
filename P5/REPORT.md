|  | Algorithm and Data Structure |
|--|--|
| NIM |  254107020053|
| Nama |  M. Tahtian Fahreza |
| Kelas | TI - 1F |
| Repository | [link] (https://github.com/tianfahreza-prog/PrakASD) |

# Labs #5 BRUTE FORCE DAN DIVIDE CONQUER


## 5.2 Percobaan 1

di bawah ini adalah tangkapan layar hasilnya.

```
Masukkan nilai: 5
Nilai faktorial 5 menggunakan BF: 120
Nilai faktorial 5 menggunakan DC: 120
PS C:\Users\Hype G12\OneDrive\Documents\Kuliah\SEM2\prakASD\PrakASD>
```

Pertanyaan: 
1. Pada base line Algoritma Divide Conquer untuk melakukan pencarian nilai faktorial, jelaskan
perbedaan bagian kode pada penggunaan if dan else!
 - Bagian if (n == 1) 
    - Base Case
    - Menghentikan rekursi
    - Langsung return nilai
 - Bagian else
    - Recursive case
    - Memecah dan menyelesaikan masalah
2. Apakah memungkinkan perulangan pada method faktorialBF() diubah selain menggunakan
for? Buktikan!
 - Bisa menggunakan perulangan while
3. Jelaskan perbedaan antara fakto *= i; dan int fakto = n * faktorialDC(n-1); !
 - fakto *= i; untuk metode brute force
 - int fakto = n * faktorialDC(n-1); untuk metode devide and conquer
4. Buat Kesimpulan tentang perbedaan cara kerja method faktorialBF() dan faktorialDC()!
 - faktorialBF() bekerja secara langsung dan berurutan — menggunakan perulangan for yang menghitung faktorial dari i=1 hingga i=n dengan satu variabel yang terus diperbarui.
 - faktorialDC() bekerja secara rekursif, memecah masalah besar menjadi masalah yang lebih kecil, menyelesaikan setiap sub-masalah hingga mencapai base case n==1, lalu menggabungkan hasilnya kembali ke atas. lebih boros memori karena setiap pemanggilan fungsi menyimpan state-nya di call stack.


## 5.3 Percobaan 2
   
di bawah ini adalah tangkapan layar hasilnya.

```
masukkan Jumlah elemen: 3
masukkan nilai basis elemen ke-1: 2
Masukkan nilai pangkat elemen ke-1: 3
masukkan nilai basis elemen ke-2: 4
Masukkan nilai pangkat elemen ke-2: 5
masukkan nilai basis elemen ke-3: 6
Masukkan nilai pangkat elemen ke-3: 7
HASIL PANGKAT BRUTEFORCE
2^3: 8
4^5: 1024
6^7: 279936
HASIL PANGKAT DIVIDE AND CONQUER
2^3: 8
4^5: 1024
6^7: 279936
PS C:\Users\Hype G12\OneDrive\Documents\Kuliah\SEM2\prakASD\PrakASD>
```


Pertanyaan:
1. Jelaskan mengenai perbedaan 2 method yang dibuat yaitu pangkatBF() dan pangkatDC()!
 - pangkatBF bekerja linear semakin besar pangkat, semakin banyak iterasi. pangkatDC jauh lebih efisien karena membelah pangkat menjadi setengah-setengah di setiap langkah.
2. Apakah tahap combine sudah termasuk dalam kode tersebut?Tunjukkan!
 - Ya, sudah ada. 
 ```
 int pangkatDC(int a, int n){
    if (n==1) {
        return a;                                    // ← BASE CASE (Conquer)
    } else {
        if (n%2==1) {
            // ↓ DIVIDE           ↓ DIVIDE              ↓ COMBINE (kalikan hasil)
            return (pangkatDC(a, n/2) * pangkatDC(a, n/2) * a);
        //                                              ^^^ tambah *a karena ganjil
        } else {
            // ↓ DIVIDE           ↓ DIVIDE      ↓ COMBINE
            return (pangkatDC(a, n/2) * pangkatDC(a, n/2));
        }
    }
}
```
3. Pada method pangkatBF()terdapat parameter untuk melewatkan nilai yang akan dipangkatkan
dan pangkat berapa, padahal di sisi lain di class Pangkat telah ada atribut nilai dan pangkat,
apakah menurut Anda method tersebut tetap relevan untuk memiliki parameter? Apakah bisa
jika method tersebut dibuat dengan tanpa parameter? Jika bisa, seperti apa method
pangkatBF() yang tanpa parameter?
 - Parameter tetap relevan dalam kondisi sekarang karena method bersifat fleksibel bisa dipakai untuk nilai dan pangkat sembarang, tidak terikat pada atribut objek. Ini berguna juga saat pangkatDC memanggil dirinya sendiri secara rekursif dengan nilai n yang berbeda-beda.
4. Tarik tentang cara kerja method pangkatBF() dan pangkatDC()!
- 
## pangkatBF() 

Contoh: pangkatBF(3, 4) > 3⁴
```
hasil = 1
i=0 > hasil = 1 × 3 = 3
i=1 > hasil = 3 × 3 = 9
i=2 > hasil = 9 × 3 = 27
i=3 > hasil = 27 × 3 = 81 
```

Loop berjalan tepat n kali, mengalikan hasil dengan a di setiap iterasi.

---

## pangkatDC() 

Contoh: pangkatDC(2, 8) > 2 pangkat 8
```
pangkatDC(2, 8)          > n genap > DC(2,4) × DC(2,4)
  pangkatDC(2, 4)        > n genap > DC(2,2) × DC(2,2)
    pangkatDC(2, 2)      > n genap > DC(2,1) × DC(2,1)
      pangkatDC(2, 1)    > return 2  < BASE CASE
    = 2 × 2 = 4
  = 4 × 4 = 16
= 16 × 16 = 256 
```

Contoh dengan pangkat ganjil: pangkatDC(2, 5) > 2 pangkat 5
```
pangkatDC(2, 5)          > n ganjil > DC(2,2) × DC(2,2) × 2
  pangkatDC(2, 2)        > n genap  > DC(2,1) × DC(2,1)
    pangkatDC(2, 1)      > return 2  < BASE CASE
  = 2 × 2 = 4
= 4 × 4 × 2 = 32 
```


## 5.4 Percobaan 3

```
Masukkan jumlah elemen: 5
Masukkan keuntungan ke-1: 10
Masukkan keuntungan ke-2: 20
Masukkan keuntungan ke-3: 30
Masukkan keuntungan ke-4: 40
Masukkan keuntungan ke-5: 50
Total keuntungan menggunakan Brteforce: 150.0
Total keuntungan menggunakan Divide and Conquer: 150.0
PS C:\Users\Hype G12\OneDrive\Documents\Kuliah\SEM2\prakASD\PrakASD> 
```


Pertanyaan:
1. Kenapa dibutuhkan variable mid pada method TotalDC()?
 - Variabel mid dibutuhkan sebagai titik pembagi (pivot) array menjadi dua bagian yang seimbang.
2. Untuk apakah statement di bawah ini dilakukan dalam TotalDC()?
double lsum = totalDC(arr, l, mid);
double rsum = totalDC(arr, mid+1, r);
 - Kedua statement ini merupakan tahap Conquer menyelesaikan submasalah secara rekursif:
    - lsum : menjumlahkan bagian kiri array, dari indeks l sampai mid
    - rsum : menjumlahkan bagian kanan array, dari indeks mid+1 sampai r
3. Kenapa diperlukan penjumlahan hasil lsum dan rsum seperti di bawah ini?
return lsum+rsum;
 - Ini adalah tahap Combine : menggabungkan hasil dari dua submasalah menjadi satu jawaban utuh.
4. Apakah base case dari totalDC()?
 - if (l == r) {
    return arr[l];
}
5. Tarik Kesimpulan tentang cara kerja totalDC()
 - Tahap Divide: setiap kali dipanggil, method menghitung mid = (l+r)/2 lalu memecah array menjadi dua bagian: kiri (l sampai mid) dan kanan (mid+1 sampai r). Pembelahan ini terus terjadi sampai tidak bisa dibagi lagi.

 - Tahap Conquer / Base Case: ketika l == r, artinya bagian array tinggal 1 elemen. Method langsung mengembalikan nilai elemen tersebut tanpa rekursi lebih lanjut. Inilah titik terkecil yang bisa diselesaikan secara langsung.

 - Tahap Combine: hasil dari submasalah kiri (lsum) dan kanan (rsum) dijumlahkan dengan return lsum + rsum, lalu hasilnya "naik" ke pemanggil di atasnya. Proses combine berlanjut hingga ke root, menghasilkan total keseluruhan array.



## Tugas
   
1. ```
Nilai UTS Tertinggi (Divide and Conquer) : 92
Nilai UTS Terendah  (Divide and Conquer) : 76
Rata-rata Nilai UAS (Brute Force)        : 85.375
PS C:\Users\Hype G12\OneDrive\Documents\Kuliah\SEM2\prakASD\PrakASD> 
```
    