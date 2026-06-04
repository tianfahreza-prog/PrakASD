|  | Algorithm and Data Structure |
|--|--|
| NIM |  254107020053|
| Nama |  M. Tahtian Fahreza |
| Kelas | TI - 1F |
| Repository | [link] (https://github.com/tianfahreza-prog/PrakASD) |

# Labs #14 TREE

## Percobaan 1

di bawah ini adalah tangkapan layar hasilnya.

```
Daftar semua mahasiswa (in order traversal):
NIM: 244160185 Nama: Candra kelas: null IPK: 3.21
NIM: 244160220 Nama: Dewi kelas: null IPK: 3.54
NIM: 244160121 Nama: Ali kelas: null IPK: 3.57
NIM: 244160221 Nama: Badar kelas: null IPK: 3.85

Pencarian data mahasiswa:
Cari mahasiswa dengan ipk: 3.54 -> Ditemukan
Cari mahasiswa dengan ipk: 3.22 -> Tidak ditemukan

Daftar semua mahasiswa setelah penambahan 3 mahasiswa:
InOrder Traversal:
NIM: 244160185 Nama: Candra kelas: null IPK: 3.21
NIM: 244160205 Nama: Ehsan kelas: null IPK: 3.37
NIM: 244160170 Nama: Fizi kelas: null IPK: 3.46
NIM: 244160220 Nama: Dewi kelas: null IPK: 3.54
NIM: 244160121 Nama: Ali kelas: null IPK: 3.57
NIM: 244160131 Nama: Devi kelas: null IPK: 3.72
NIM: 244160221 Nama: Badar kelas: null IPK: 3.85

PreOrder Traversal:
NIM: 244160121 Nama: Ali kelas: null IPK: 3.57
NIM: 244160185 Nama: Candra kelas: null IPK: 3.21
NIM: 244160220 Nama: Dewi kelas: null IPK: 3.54
NIM: 244160205 Nama: Ehsan kelas: null IPK: 3.37
NIM: 244160170 Nama: Fizi kelas: null IPK: 3.46
NIM: 244160221 Nama: Badar kelas: null IPK: 3.85
NIM: 244160131 Nama: Devi kelas: null IPK: 3.72

PostOrder Traversal:
NIM: 244160170 Nama: Fizi kelas: null IPK: 3.46
NIM: 244160205 Nama: Ehsan kelas: null IPK: 3.37
NIM: 244160220 Nama: Dewi kelas: null IPK: 3.54
NIM: 244160185 Nama: Candra kelas: null IPK: 3.21
NIM: 244160131 Nama: Devi kelas: null IPK: 3.72
NIM: 244160221 Nama: Badar kelas: null IPK: 3.85
NIM: 244160121 Nama: Ali kelas: null IPK: 3.57

Penghapusan data mahasiswa dengan IPK 3.57...

Daftar semua mahasiswa setelah penghapusan 1 mahasiswa (in order traversal):
NIM: 244160185 Nama: Candra kelas: null IPK: 3.21
NIM: 244160205 Nama: Ehsan kelas: null IPK: 3.37
NIM: 244160170 Nama: Fizi kelas: null IPK: 3.46
NIM: 244160220 Nama: Dewi kelas: null IPK: 3.54
NIM: 244160121 Nama: Ali kelas: null IPK: 3.57
NIM: 244160131 Nama: Devi kelas: null IPK: 3.72
NIM: 244160221 Nama: Badar kelas: null IPK: 3.85
PS C:\Users\Hype G12\OneDrive\Documents\KULIAH\SEM2\PASD\PrakASD> 
```

Pertanyaan: 
1. Mengapa dalam binary search tree proses pencarian data bisa lebih efektif dilakukan dibanding binary tree biasa?
 - karena setiap cek satu node yang belum ditemukan, bisa langsung mengabaikan setengah sisa yang tidak ada datanya. tidak perlu cek dari awal karena data sudah terurut dari terkecil ke terbesar
 - binary tree biasa datanya tidak terurut, jadi haru cek dari awal agar data ditemukan.
2. Untuk apakah di class Node, kegunaan dari atribut left dan right?
 - left digunakan untuk menunjukkan alamat node anak di sebelah kiri yang datanya lebih kecil.
 - right digunaka untuk menunjukan alamat node anak yang disebelah kanan yang datanya lebih besar.
3. a. Untuk apakah kegunaan dari atribut root di dalam class BinaryTree? terhadap kondisi awal linked list!
 - root sebagai pintu gerbang untuk menelusuri data, agar komputer tau titik awal mulainya.
   b. Ketika objek tree pertama kali dibuat, apakah nilai dari root?
 - null, karena objek tree masih baru dibuat dan kosong.
4. Ketika tree masih kosong, dan akan ditambahkan sebuah node baru, proses apa yang akan terjadi?
 - node baru akan menjadi root, program akan cek fungsi ifEmpty() jika terbukti kosong. alamat node baru langsung dimasukkan ke variabel.
5. Perhatikan method add(), di dalamnya terdapat baris program seperti di bawah ini. Jelaskan
secara detil untuk apa baris program tersebut?
``` 
parent = current;
if (mahasiswa.ipk < current.mahasiswa.ipk) {
    current = current.left;
    if (current null) {
        parent.left = newNode;
        return;
    }

} else {
    current = current.right;
    if (current == null) {
        parent.right = newNode;
        return;
    }
}
```
 - parent = current; - meng-amankan posisi node saat ini sebagai parent, karena sistem mau melangkah kebawah.
 - if (mahasiswa.ipk < current.mahasiswa.ipk) - program cek apakah IPK mahasiswa baru lebih kecil dari ipk node tempat kitaa berdiri
 - current = current.left; - jika iya kita turun ke cabang sebelah kiri
 - if (current == null) - cek apakah kosong
 - parent.left = newNode; return; - jika kosong sambungkan node baru sebagai anak kiri parent lalu return.
 - else - untuk melakukan hal yang sama di anak sebelah kanan.
6. Jelaskan langkah-langkah pada method delete() saat menghapus sebuah node yang memiliki dua
anak. Bagaimana method getSuccessor() membantu dalam proses ini?
 - Program mendeteksi node yang mau dihapus punya 2 anak.
 - getSuccessor(current). Tugas method ini adalah pergi ke cabang kanan sebanyak 1 kali, lalu jalan ke kiri terus-menerus sampai ujung nemu node paling ujung kiri (node terkecil di area kanan). Node inilah yang disebut Successor.
 - getSuccessor() akan memutuskan successor dari posisi lamanya (jika successor punya anak kanan, anak kanannya dititipkan ke parent successor).
 - Successor tersebut diangkat ke atas untuk menggantikan posisi node yang mau dihapus tadi.
 - Anak kiri dari node yang dihapus sekarang otomatis tersambung menjadi anak kirinya si successor baru ini (successor.left = current.left). Struktur BST pun aman dan tetap terurut.


## Percobaan 2
   
di bawah ini adalah tangkapan layar hasilnya.

```
Inorder Traversal Mahasiswa: 
NIM: 244160220 Nama: Dewi kelas: null IPK: 3.35
NIM: 244160185 Nama: Candra kelas: null IPK: 3.41
NIM: 244160131 Nama: Devi kelas: null IPK: 3.48
NIM: 244160121 Nama: Ali kelas: null IPK: 3.57
NIM: 244160205 Nama: Ehsan kelas: null IPK: 3.61
NIM: 244160221 Nama: Badar kelas: null IPK: 3.75
NIM: 244160170 Nama: Fizi kelas: null IPK: 3.86
PS C:\Users\Hype G12\OneDrive\Documents\KULIAH\SEM2\PASD\PrakASD> 

```

Pertanyaan:
1. Apakah kegunaan dari atribut data dan idxLast yang ada di class BinaryTreeArray?
 - dataMahasiswa[] Berfungsi sebagai wadah (kontainer) berbentuk array untuk menyimpan objek-objek mahasiswa. Melalui rumus tertentu, susunan indeks di array ini bisa mewakili struktur pohon bertingkat
 - idxLast Penanda atau pembatas. Isinya angka indeks terakhir di array yang benar-benar ada datanya. Ini agar komputer tidak terlewat membaca elemen array yang kosong (null)
2. Apakah kegunaan dari method populateData()?
 - untuk copy paste data, kita bisa siapkan satu array penuh berisi data mahasiswa di class main, lalu lempar array itu ke method populatedata() agar langsung disalin ke dalam properti internal treeArray
3. Apakah kegunaan dari method traverseInOrder()?
 - untuk menelusuri dan menampilkan semua data mahasiswa yang disimpan di dalam array dengan urutan (kiri-root-kanan) secara rekursif. 
4. Jika suatu node binary tree disimpan dalam array indeks 2, maka di indeks berapakah posisi
left child dan right child masing-masing?
 - Left Child: indeksStart + 1 -> 2 x 2 + 1 = 5
 - Right Child: indeksStart + 2 -> 2 x 2 + 2 = 6
5. Apa kegunaan statement int idxLast = 6 pada praktikum 2 percobaan nomor 4?
 - Statement itu memberi tahu ke objek BinaryTreeArray jika data mahasiswa terakhir yang valid di dalam array terletak pada indeks ke-6, ketika fungsi rekursif tarverseInorder berjalan dia akan cek if (idxStart <= idxLast). begitu indeks melompat ke angka 7, program langsung tahu kalau itu sudah di luar batas pohon dan proses rekurif otomatis berhenti.
6. Mengapa indeks 2*idxStart+1 dan 2*idxStart+2 digunakan dalam pemanggilan
rekursif, dan apa kaitannya dengan struktur pohon biner yang disusun dalam array?
 - Hubungan rumusnya: Jika sebuah node induk ada di posisi indeks n, maka anak kirinya pasti jatuh di indeks 2n+1, dan anak kanannya pasi jatuh di indeks 2n+2.
 - Melakukan pemanggilan rekursif menggunakan rumus tersebut 2*idxStart+1 dan 2*idxStart+2) adalah cara kita melompat ke level bawah pohon di dalam memori array tanpa perlu membuat pointer fisik.

## Tugas
1. Buat method di dalam class BinaryTree00 yang akan menambahkan node dengan cara
rekursif (addRekursif()).
2. Buat method di dalam class BinaryTree00 untuk menampilkan data mahasiswa dengan IPK
paling kecil dan IPK yang paling besar (cariMinIPK() dan cariMaxIPK()) yang ada di dalam
binary search tree
3. Buat method dalam class BinaryTree00 untuk menampilkan data mahasiswa dengan IPK di
atas suatu batas tertentu, misal di atas 3.50 (tampilMahasiswaIPKdiAtas(double ipkBatas))
yang ada di dalam binary search tree
4. Modifikasi class BinaryTreeArray00 di atas, dan tambahkan : 
 - method add(Mahasiswa data) untuk memasukkan data ke dalam binary tree 
 - method traversePreOrder()

```
=====================================
        PENGUJIAN TUGAS BST         
=====================================

Setelah penambahan 'Tian Sukses' via Rekursif (InOrder):
NIM: 244160185 Nama: Candra kelas: null IPK: 3.21
NIM: 244160205 Nama: Ehsan kelas: null IPK: 3.37
NIM: 244160170 Nama: Fizi kelas: null IPK: 3.46
NIM: 244160220 Nama: Dewi kelas: null IPK: 3.54
NIM: 244160121 Nama: Ali kelas: null IPK: 3.57
NIM: 244160131 Nama: Devi kelas: null IPK: 3.72
NIM: 244160221 Nama: Badar kelas: null IPK: 3.85
NIM: 244160999 Nama: Tian Sukses kelas: null IPK: 3.99

=== Mahasiswa IPK Terkecil ===
NIM: 244160185 Nama: Candra kelas: null IPK: 3.21
=== Mahasiswa IPK Terbesar ===
NIM: 244160999 Nama: Tian Sukses kelas: null IPK: 3.99

=== Mahasiswa dengan IPK di atas 3.5 ===
NIM: 244160220 Nama: Dewi kelas: null IPK: 3.54
NIM: 244160121 Nama: Ali kelas: null IPK: 3.57
NIM: 244160131 Nama: Devi kelas: null IPK: 3.72
NIM: 244160221 Nama: Badar kelas: null IPK: 3.85
NIM: 244160999 Nama: Tian Sukses kelas: null IPK: 3.99
PS C:\Users\Hype G12\OneDrive\Documents\KULIAH\SEM2\PASD\PrakASD> 
```
```
=== Inorder Traversal Setelah Add ===
NIM: 244160220 Nama: Dewi kelas: null IPK: 3.35
NIM: 244160185 Nama: Candra kelas: null IPK: 3.41
NIM: 244160121 Nama: Ali kelas: null IPK: 3.57
NIM: 244160221 Nama: Badar kelas: null IPK: 3.75

=== PreOrder Traversal Tugas 4b ===
NIM: 244160121 Nama: Ali kelas: null IPK: 3.57
NIM: 244160185 Nama: Candra kelas: null IPK: 3.41
NIM: 244160220 Nama: Dewi kelas: null IPK: 3.35
NIM: 244160221 Nama: Badar kelas: null IPK: 3.75
PS C:\Users\Hype G12\OneDrive\Documents\KULIAH\SEM2\PASD\PrakASD> 
```