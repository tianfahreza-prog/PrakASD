package P3;

public class DataDosen19 {
    
    public void dataSemuaDosen(Dosen19[] arrayOfDosen) {
        System.out.println(" DATA SEMUA DOSEN ");
        int i = 1;
        for (Dosen19 dosen : arrayOfDosen) {
            System.out.println("Data Dosen ke-" + i);
            dosen.cetakInfo();
            i++;
        }
    }

    public void jumlahDosenPerJenisKelamin(Dosen19[] arrayOfDosen) {
        int pria = 0, wanita = 0;
        for (Dosen19 dosen : arrayOfDosen) {
            if (dosen.jenisKelamin) pria++;
            else wanita++;
        }
        System.out.println(" JUMLAH DOSEN PER JENIS KELAMIN ");
        System.out.println("Pria   : " + pria);
        System.out.println("Wanita : " + wanita);
        System.out.println("------------------------------");
    }

    public void rerataUsiaDosenPerJenisKelamin(Dosen19[] arrayOfDosen) {
        int totalPria = 0, totalWanita = 0;
        int jumlahPria = 0, jumlahWanita = 0;
        for (Dosen19 dosen : arrayOfDosen) {
            if (dosen.jenisKelamin) {
                totalPria += dosen.usia;
                jumlahPria++;
            } else {
                totalWanita += dosen.usia;
                jumlahWanita++;
            }
        }
        System.out.println(" RATA-RATA USIA PER JENIS KELAMIN ");
        System.out.println("Pria   : " + (jumlahPria > 0 ? (double) totalPria / jumlahPria : 0));
        System.out.println("Wanita : " + (jumlahWanita > 0 ? (double) totalWanita / jumlahWanita : 0));
        System.out.println("------------------------------");
    }

    public void infoDosenPalingTua(Dosen19[] arrayOfDosen) {
        Dosen19 paling = arrayOfDosen[0];
        for (Dosen19 dosen : arrayOfDosen) {
            if (dosen.usia > paling.usia) paling = dosen;
        }
        System.out.println(" DOSEN PALING TUA ");
        paling.cetakInfo();
    }

    public void infoDosenPalingMuda(Dosen19[] arrayOfDosen) {
        Dosen19 paling = arrayOfDosen[0];
        for (Dosen19 dosen : arrayOfDosen) {
            if (dosen.usia < paling.usia) paling = dosen;
        }
        System.out.println(" DOSEN PALING MUDA ");
        paling.cetakInfo();
    }
}
