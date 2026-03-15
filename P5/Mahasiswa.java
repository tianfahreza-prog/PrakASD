package P5;

public class Mahasiswa {
    String nama;
    String nim;
    int tahunMasuk;
    int nilaiUTS;
    int nilaiUAS;
 
    Mahasiswa(String nama, String nim, int tahunMasuk, int nilaiUTS, int nilaiUAS) {
        this.nama       = nama;
        this.nim        = nim;
        this.tahunMasuk = tahunMasuk;
        this.nilaiUTS   = nilaiUTS;
        this.nilaiUAS   = nilaiUAS;
    }

    int maxUTS_DC(Mahasiswa[] arr, int l, int r) {
        
        if (l == r) {
            return arr[l].nilaiUTS;
        }
 
        int mid   = (l + r) / 2;
        int lmax  = maxUTS_DC(arr, l, mid);       
        int rmax  = maxUTS_DC(arr, mid + 1, r);   
 
        return (lmax > rmax) ? lmax : rmax;
    }
 
    int minUTS_DC(Mahasiswa[] arr, int l, int r) {
        
        if (l == r) {
            return arr[l].nilaiUTS;
        }
 
        int mid   = (l + r) / 2;
        int lmin  = minUTS_DC(arr, l, mid);       
        int rmin  = minUTS_DC(arr, mid + 1, r);   
 
     
        return (lmin < rmin) ? lmin : rmin;
    }
 
    double rataUAS_BF(Mahasiswa[] arr) {
        double total = 0;
        for (int i = 0; i < arr.length; i++) {
            total = total + arr[i].nilaiUAS;
        }
        return total / arr.length;
    }
}
