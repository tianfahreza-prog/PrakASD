|  | Algorithm and Data Structure |
|--|--|
| NIM |  254107020053|
| Nama |  M. Tahtian Fahreza |
| Kelas | TI - 1F |
| Repository | [link] (https://github.com/tianfahreza-prog/PrakASD) |

# Labs #15 Collection Framework

## Percobaan 1

di bawah ini adalah tangkapan layar hasilnya.

```
Elemen 0: 1 total elemen: 4 elemen terakhir: Cireng
Elemen 0: 2 total elemen: 4 elemen terakhir: 4
Elemen 0: Noureen total elemen: 5 elemen terakhir: Al-Qarni
Elemen 0: My kid total elemen: 5 elemen terakhir: Al-Qarni
Names: [My kid, Akhleema, Shannum, Uwais, Al-Qarni]
PS C:\Users\Hype G12\OneDrive\Documents\KULIAH\SEM2\PASD\PrakASD> 
```

Pertanyaan: 
1. Perhatikan baris kode 25-36, mengapa semua jenis data bisa ditampung ke dalam sebuah
Arraylist?
 - Karena arraylist tersebut dideklarasikan secara raw type, secara default java akan menganggap list tersebut menampung objek bertipe object.
2. Modifikasi baris kode 25-36 seingga data yang ditampung hanya satu jenis atau spesifik tipe
tertentu!
 ```
 List<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
 ```
3. Ubah kode pada baris kode 38 menjadi seperti ini
```
LinkedList<String> names = new LinkedList<>();
```
 - 
 ```
 LinkedList<String> names = new LinkedList<>();
 ```
4. Tambahkan juga baris berikut ini, untuk memberikan perbedaan dari tampilan yang sebelumnya
```
names.push ("Mei-mei");
System.out.printf("Elemen 0: %s total elemen: %s elemen terakhir: %s\n",
names.getFirst(), names.size(), names.getLast());
System.out.println("Names: " + names. toString());
```
 - 
 ```
 names.push("Mei-mei");
        
        System.out.printf("Elemen 0: %s total elemen: %s elemen terakhir: %s\n",
                names.getFirst(), names.size(), names.getLast());
        System.out.println("Names: " + names.toString());
 ```
5. Dari penambahan kode tersebut, silakan dijalankan dan apakah yang dapat Anda jelaskan!
 - Method push() memasukkan elemen baru ("mei-mei) ke urutan paling depan.


## Percobaan 2
   
di bawah ini adalah tangkapan layar hasilnya.

```
Banana Orange Watermelon Leci Salak 
[Banana, Orange, Watermelon, Leci, Salak]
Salak Leci Watermelon Orange Banana 
Melon Durian 
Melon Durian 
Melon Durian 
PS C:\Users\Hype G12\OneDrive\Documents\KULIAH\SEM2\PASD\PrakASD> 

```

Pertanyaan:
1. Apakah perbedaan fungsi push() dan add() pada objek fruits?
 - push() adalah method spesifik dari kelas Stack untuk memasukkan elemen ke atas tumpukan
 - add() adalah method untuk menyisipkan elemen ke akhir urutan list.
2. Silakan hilangkan baris 43 dan 44, apakah yang akan terjadi? Mengapa bisa demikian?
 - Perulangan di bawahnya tidak akan menampilkan data apapun. karena pada blok while loop fungsi fruits.pop() telah dipanggil sampai tumpukan benar-benar habis
3. Jelaskan fungsi dari baris 46-49?
 - digunakan untuk melakukan perulangan (transversal) data menggunakan objek Iterator. it.hasNext() berfungsi mengecek apakah ada elemen selanjutnya , dan it.next() mengambil nilai elemen tersebut untuk dicetak ke layar.
4. Silakan ganti baris kode 25, Stack<String> menjadi List<String> dan apakah yang terjadi?
Mengapa bisa demikian?
 - Terjadi error kompilasi. Karena interface List tidak memiliki method push(), empty(), dan pop(). Method-method tersebut merupakan fitur spesifik milik class Stack atau Deque
5. Ganti elemen terakhir dari dari objek fruits menjadi “Strawberry”!
 -  
 ```
 fruits.set(fruits.size() - 1, "Strawberry");
 ```
6. Tambahkan 3 buah seperti “Mango”,”guava”, dan “avocado” kemudian dilakukan sorting!
 -  
 ```
 fruits.add("Mango");
        fruits.add("guava");
        fruits.add("avocado");

        System.out.println("Sebelum Sorting: " + fruits);
        Collections.sort(fruits);
        System.out.println("Setelah Sorting: " + fruits);
 ```

## Praktikum 3

di bawah ini adalah tangkapan layar hasilnya.
```
Mahasiswa{nim=201234, nama=Noureen, notelp=021xx1}
Mahasiswa{nim=201235, nama=Akhleema, notelp=021xx2}
Mahasiswa{nim=201236, nama=Shannum, notelp=021xx3}

Mahasiswa{nim=201234, nama=Noureen, notelp=021xx1}
Mahasiswa{nim=201235, nama=Akhleema Lela, notelp=021xx2}
Mahasiswa{nim=201236, nama=Shannum, notelp=021xx3}
PS C:\Users\Hype G12\OneDrive\Documents\KULIAH\SEM2\PASD\PrakASD> 
```

Pertanyaan:

1. Pada fungsi tambah() yang menggunakan unlimited argument itu menggunakan konsep apa?
Dan kelebihannya apa?
 - Menggunakan konsep Varargs Kelebihannya adalah metode tersebut dapat menerima parameter objek dalam jumlah berapapun
2. Pada fungsi linearSearch() di atas, silakan diganti dengan fungsi binarySearch() dari collection!
 - 
 ```
    int binarySearch(String nim) {
        sortAscending();
        
        Mahasiswa dummy = new Mahasiswa(nim, "", "");
        return Collections.binarySearch(mahasiswas, dummy, new Comparator<Mahasiswa>() {
            @Override
            public int compare(Mahasiswa m1, Mahasiswa m2) {
                return m1.nim.compareTo(m2.nim);
            }
        });
    }
 ```
3. Tambahkan fungsi sorting baik secara ascending ataupun descending pada class tersebut!
 - 
 ```
 public void sortAscending() {
        Collections.sort(mahasiswas, new Comparator<Mahasiswa>() {
            @Override
            public int compare(Mahasiswa m1, Mahasiswa m2) {
                return m1.nim.compareTo(m2.nim);
            }
        });
    }

    public void sortDescending() {
        Collections.sort(mahasiswas, new Comparator<Mahasiswa>() {
            @Override
            public int compare(Mahasiswa m1, Mahasiswa m2) {
                return m2.nim.compareTo(m1.nim);
            }
        });
    }
 ```

## Tugas
```
=================================================
SISTEM PENGOLAHAN DATA NILAI MAHASISWA SEMESTER
=================================================
1. Input Nilai
2. Tampil Nilai
3. Mencari Nilai Mahasiswa
4. Urut Data Nilai (Urut Nilai Descending)
5. Antrekan Hapus Mahasiswa (Queue)
6. Eksekusi Hapus Mahasiswa Terdepan
7. Keluar
Pilih: 
```