package P14;

public class BinaryTreeArray00 {
    Mahasiswa19[] dataMahasiswa;
    int idxLast;

    public BinaryTreeArray00() {
        this.dataMahasiswa = new Mahasiswa19[100];
        this.idxLast = -1;
    }

    void populateData(Mahasiswa19 dataMhs[], int idxLast) {
        this.dataMahasiswa = dataMhs;
        this.idxLast = idxLast;
    }

    // Tugas 4a Method add() untuk memasukkan data ke dalam binary tree array secara terstruktur
    void add(Mahasiswa19 data) {
        if (idxLast == -1) {

            dataMahasiswa[0] = data;
            idxLast = 0;
            return;
        }

        int currentIdx = 0;
        while (currentIdx < dataMahasiswa.length) {
            if (data.ipk < dataMahasiswa[currentIdx].ipk) {
                int leftChildIdx = 2 * currentIdx + 1;
                if (leftChildIdx >= dataMahasiswa.length) {
                    System.out.println("Array penuh, tidak bisa menambah data!");
                    return;
                }
                if (dataMahasiswa[leftChildIdx] == null) {
                    dataMahasiswa[leftChildIdx] = data;
                    if (leftChildIdx > idxLast) {
                        idxLast = leftChildIdx;
                    }
                    return;
                }
                currentIdx = leftChildIdx;
            } 

            else {
                int rightChildIdx = 2 * currentIdx + 2;
                if (rightChildIdx >= dataMahasiswa.length) {
                    System.out.println("Array penuh, tidak bisa menambah data!");
                    return;
                }
                if (dataMahasiswa[rightChildIdx] == null) {
                    dataMahasiswa[rightChildIdx] = data;
                    if (rightChildIdx > idxLast) {
                        idxLast = rightChildIdx;
                    }
                    return;
                }
                currentIdx = rightChildIdx;
            }
        }
    }

    void traverseInOrder(int idxStart) {
        if (idxStart <= idxLast) {
            if (dataMahasiswa[idxStart] != null) {
                traverseInOrder(2 * idxStart + 1);
                dataMahasiswa[idxStart].tampilInformasi();
                traverseInOrder(2 * idxStart + 2);
            }
        }
    }

    // Tugas 4b Method traversePreOrder() Cetak Root dulu, baru Kiri, lalu Kanan
    void traversePreOrder(int idxStart) {
        if (idxStart <= idxLast) {
            if (dataMahasiswa[idxStart] != null) {
                dataMahasiswa[idxStart].tampilInformasi(); // Root/Current dulu
                traversePreOrder(2 * idxStart + 1);       // Belok Kiri
                traversePreOrder(2 * idxStart + 2);       // Belok Kanan
            }
        }
    }
}