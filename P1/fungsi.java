package P1;

public class fungsi {
    
    public static int hitungPendapatan(int agl, int kel, int alo, int maw) {
        int hargaAgl = 75000;
        int hargaKel = 50000;
        int hargaAlo = 60000;
        int hargaMaw = 10000;

        return (agl * hargaAgl) +
               (kel * hargaKel) +
               (alo * hargaAlo) +
               (maw * hargaMaw);
    }

    public static String cekStatus(int pendapatan) {
        if (pendapatan > 1500000)
            return "Sangat Baik";
        else
            return "Perlu Evaluasi";
    }

    public static void main(String[] args) {

    
        int[][] stock = {
            {10, 5, 15, 7},  
            {6, 11, 9, 12},   
            {2, 10, 10, 5},   
            {5, 7, 12, 9}    
        };

        for (int i = 0; i < stock.length; i++) {

            int pendapatan = hitungPendapatan(
                stock[i][0],
                stock[i][1],
                stock[i][2],
                stock[i][3]
            );

            System.out.println("RoyalGarden " + (i+1));
            System.out.println("Pendapatan: Rp " + pendapatan);
            System.out.println("Status: " + cekStatus(pendapatan));
            System.out.println("----------------------");
        }
    }
    
}
