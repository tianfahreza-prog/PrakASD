|  | Algorithm and Data Structure |
|--|--|
| NIM |  254107020053|
| Nama |  M. Tahtian Fahreza |
| Kelas | TI - 1F |
| Repository | [link] (https://github.com/tianfahreza-prog/PrakASD) |

# Labs #6 SORTING (BUBBLE, SELECTION, DAN INSERTION SORT)


## Percobaan 1

di bawah ini adalah tangkapan layar hasilnya.

```
Data awal 1
20 10 2 7 12 
Data sudah diurutkan dengan BUBBLE SORT (ASC)
2 7 10 12 20
Data awal 2
30 20 2 8 14
Data sudah diurutkan dengan SELECTION SORT (ASC)
2 8 14 20 30
Data awal 3
40 10 4 9 3
Data sudah diurutkan dengan INSERTION SORT (ASC)
3 4 9 10 40
PS C:\Users\Hype G12\OneDrive\Documents\Kuliah\SEM2\prakASD\PrakASD>
```

Pertanyaan: 
1.  Jelaskan fungsi kode program berikut
```
if (data[j-1]>data[j]){
    temp=data[j];
    data[j]=data[j-1];
    data[j-1]=temp;
}
```
 - kode tersebut berfungsi untuk menukar posisi dua data di dalam array jika posisinya terbalik (data kiri lebih besar dari data kanan) .
2. Tunjukkan kode program yang merupakan algoritma pencarian nilai minimum pada
selection sort!
```
int min = i;
for (int j = i + 1; j < jumData; j++) {
    if (data[j] < data[min]) {
        min = j;
    }
}
```
3. Pada Insertion sort , jelaskan maksud dari kondisi pada perulangan
```
while (i>=0 && data[j]>temp)
``` 
 - program akan terus menggeser angka ke sebelah kanan selama belum mencapai batas ujung kiri array (j >= 0) dan angka yang sedang dicek tersebut nilainya lebih besar dari angka yang ingin disisipkan (temp).
4.  Pada Insertion sort, apakah tujuan dari perintah
```
data[j+1]= data[j];
```
 - untuk menempatkan (menyisipkan) nilai yang sebelumnya disimpan di dalam variabel temp ke posisi barunya yang sudah tepat, setelah proses penggeseran elemen yang lebih besar selesai dilakukan .


## Percobaan 2
   
di bawah ini adalah tangkapan layar hasilnya.

```
Data mahasiswa sebelum sorting: 
Nama: Zidan
NIM: 123
Kelas: 2A
IPK: 3.2
---------------------
Nama: Ayu
NIM: 124
Kelas: 2A
IPK: 3.5
---------------------
Nama: Sofi
NIM: 125
Kelas: 2A
IPK: 3.1
---------------------
Nama: Sita
NIM: 126
Kelas: 2A
IPK: 3.9
---------------------
Nama: Miki
NIM: 127
Kelas: 2A
IPK: 3.7
---------------------
Data Mahasiswa setelah sorting berdasarkan IPK (DESC):
Nama: Sita
NIM: 126
Kelas: 2A
IPK: 3.9
---------------------
Nama: Miki
NIM: 127
Kelas: 2A
IPK: 3.7
---------------------
Nama: Ayu
NIM: 124
Kelas: 2A
IPK: 3.5
---------------------
Nama: Zidan
NIM: 123
Kelas: 2A
IPK: 3.2
---------------------
Nama: Sofi
NIM: 125
Kelas: 2A
IPK: 3.1
---------------------
```


Pertanyaan:
1. Perhatikan perulangan di dalam bubbleSort() di bawah ini:
```
for (int i=0; i<listMhs.length-1; i++) {
    for (int j=1; j<listMhs.length-i; j++) {
```
 a. Mengapa syarat dari perulangan i adalah i<listMhs.length-1?
  - Perulangan i (outer loop) berfungsi untuk menentukan jumlah tahapan dalam Bubble Sort.
 b. Mengapa syarat dari perulangan j adalah j<listMhs.length-i?
  - Perulangan j (inner loop) bertugas melakukan perbandingan dan pertukaran data.
 c. Jika banyak data di dalam listMhs adalah 50, maka berapa kali perulangan i akan berlangsung? Dan ada berapa Tahap bubble sort yang ditempuh?
  - 49 kali (didapat dari 50 - 1).
  - 49 Tahap (karena perulangan i merepresentasikan jumlah tahapan).
2. Modifikasi program di atas di mana data mahasiswa bersifat dinamis (input dari keyboard) yang terdiri dari nim, nama, kelas, dan ipk!
```
package P6;

import java.util.Scanner; 

public class MahasiswaDemo19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MahasiswaBerprestasi19 list = new MahasiswaBerprestasi19();

        for (int i = 0; i < 5; i++) {
            System.out.println("Masukkan Data Mahasiswa ke-" + (i + 1));
            System.out.print("NIM   : ");
            String nim = sc.nextLine();
            System.out.print("Nama  : ");
            String nama = sc.nextLine();
            System.out.print("Kelas : ");
            String kelas = sc.nextLine();
            System.out.print("IPK   : ");
            double ipk = sc.nextDouble();
            sc.nextLine();

            Mahasiswa19 m = new Mahasiswa19(nim, nama, kelas, ipk);
            list.tambah(m);
        }

        System.out.println("Data mahasiswa sebelum sorting: ");
        list.tampil();

        System.out.println("Data Mahasiswa setelah sorting berdasarkan IPK (DESC): ");
        list.bubbleSort();
        list.tampil();
        
        sc.close();
    }
}
```


## 5.3.5 Percobaan 2

```
Masukkan Data Mahasiswa ke-1
NIM   : 123
Nama  : Ali
Kelas : 2B
IPK   : 3.9
Masukkan Data Mahasiswa ke-2
NIM   : 124
Nama  : ila
Kelas : 2B
IPK   : 3.1
Masukkan Data Mahasiswa ke-3
NIM   : 125
Nama  : agus
Kelas : 2B
IPK   : 3.6
Masukkan Data Mahasiswa ke-4
NIM   : 126
Nama  : tika
Kelas : 2B
IPK   : 3.3
Masukkan Data Mahasiswa ke-5
NIM   : 127
Nama  : Udin
Kelas : 2B
IPK   : 3.2
Data mahasiswa sebelum sorting: 
Nama: Ali
NIM: 123
Kelas: 2B
IPK: 3.9
---------------------
Nama: ila
NIM: 124
Kelas: 2B
IPK: 3.1
---------------------
Nama: agus
NIM: 125
Kelas: 2B
IPK: 3.6
---------------------
Nama: tika
NIM: 126
Kelas: 2B
IPK: 3.3
---------------------
Nama: Udin
NIM: 127
Kelas: 2B
IPK: 3.2
---------------------
Data Mahasiswa setelah sorting berdasarkan IPK (DESC):
Nama: Ali
NIM: 123
Kelas: 2B
IPK: 3.9
---------------------
Nama: agus
NIM: 125
Kelas: 2B
IPK: 3.6
---------------------
Nama: tika
NIM: 126
Kelas: 2B
IPK: 3.3
---------------------
Nama: Udin
NIM: 127
Kelas: 2B
IPK: 3.2
---------------------
Nama: ila
NIM: 124
Kelas: 2B
IPK: 3.1
---------------------
Data yang sudah terurut menggunakan SELECTION SORT (ASC)
Nama: ila
NIM: 124
Kelas: 2B
IPK: 3.1
---------------------
Nama: Udin
NIM: 127
Kelas: 2B
IPK: 3.2
---------------------
Nama: tika
NIM: 126
Kelas: 2B
IPK: 3.3
---------------------
Nama: agus
NIM: 125
Kelas: 2B
IPK: 3.6
---------------------
Nama: Ali
NIM: 123
Kelas: 2B
IPK: 3.9
---------------------
PS C:\Users\Hype G12\OneDrive\Documents\Kuliah\SEM2\prakASD\PrakASD> 
```


Pertanyaan:
1. Di dalam method selection sort, terdapat baris program seperti di bawah ini:
```
    int idxMin = i;
    for (int j=i+1; j<listMhs.length; j++){
        if (listMhs[j].ipk<listMhs[idxMin].ipk){
            idxMin = j;
        }
    }
```
Untuk apakah proses tersebut, jelaskan!
 - int idxMin = i;
    program mengasumsikan bahwa data di posisi ke-i (posisi paling kiri dari sisa data yang belum terurut) adalah data dengan nilai IPK paling kecil sementara.
 - for (int j = i + 1; j < listMhs.length; j++)
    Program kemudian mulai mengecek sisa data yang ada di sebelah kanannya satu per satu, mulai dari posisi i + 1 sampai ujung akhir array.
 - if (listMhs[j].ipk < listMhs[idxMin].ipk)
    program membandingkan Apakah IPK mahasiswa yang sedang dicek saat ini (j) lebih kecil dari IPK mahasiswa pemegang rekor terkecil sementara (idxMin)?"
 - idxMin = j;
    Jika ternyata kondisinya benar (ketemu IPK yang lebih kecil), maka rekor letak indeks terkecil yang baru akan diperbarui menjadi posisi j.

## 5.4 Percobaan 2
```
Data yang sudah terurut menggunakan INSERTION SORT (ASC)
Nama: dika
NIM: 222
Kelas: 2c
IPK: 3.0
---------------------
Nama: susi
NIM: 444
Kelas: 2c
IPK: 3.1
---------------------
Nama: yayuk
NIM: 555
Kelas: 2c
IPK: 3.4
---------------------
Nama: ayu
NIM: 111
Kelas: 2c
IPK: 3.7
---------------------
Nama: ila
NIM: 333
Kelas: 2c
IPK: 3.8
---------------------
PS C:\Users\Hype G12\OneDrive\Documents\Kuliah\SEM2\prakASD\PrakASD> 
```


Pertanyaan:
1. Ubahlah fungsi pada InsertionSort sehingga fungsi ini dapat melaksanakan proses sorting
dengan cara descending.
```
void insertionSort(){
        for (int i = 1; i < idx; i++) {
            Mahasiswa19 temp = listMhs[i];
            int j=i;
            while (j > 0 && listMhs[j-1].ipk < temp.ipk) {
                listMhs[j] = listMhs [j-1];
                j--;
            }
            listMhs[j] = temp;
        }
    }
```

## Latihan Praktikum
1. package P6;

import java.util.Scanner;

public class DosenMain19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DataDosen19 list = new DataDosen19();
        int pilihan;

        do {
            System.out.println("\n=== SISTEM DATA DOSEN ===");
            System.out.println("1. Tambah Data Dosen");
            System.out.println("2. Tampil Seluruh Data Dosen");
            System.out.println("3. Sorting Data (Usia Termuda - Tertua / ASC)");
            System.out.println("4. Sorting Data (Usia Tertua - Termuda / DSC)");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu (1-5): ");
            pilihan = sc.nextInt();
            sc.nextLine();

            System.out.println();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan Kode Dosen : ");
                    String kode = sc.nextLine();
                    System.out.print("Masukkan Nama Dosen : ");
                    String nama = sc.nextLine();
                    System.out.print("Jenis Kelamin (L/P) : ");
                    String jkInput = sc.nextLine();
                    boolean jk = jkInput.equalsIgnoreCase("L"); 
                    System.out.print("Masukkan Usia       : ");
                    int usia = sc.nextInt();
                    sc.nextLine();

                    Dosen19 dsnBaru = new Dosen19(kode, nama, jk, usia);
                    list.tambah(dsnBaru);
                    System.out.println(">> Data berhasil ditambahkan!");
                    break;
                
                case 2:
                    System.out.println("=== DAFTAR DOSEN ===");
                    list.tampil();
                    break;
                
                case 3:
                    System.out.println("=== DATA DOSEN (ASC / Termuda ke Tertua) ===");
                    list.SortingASC(); 
                    list.tampil();
                    break;
                
                case 4:
                    System.out.println("=== DATA DOSEN (DSC / Tertua ke Termuda) ===");
                    list.sortingDSC(); 
                    list.tampil();
                    break;

                case 5:
                    System.out.println("Program Selesai. Terima kasih!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid, silakan coba lagi.");
            }
        } while (pilihan != 5);

        sc.close(); 
    }
}