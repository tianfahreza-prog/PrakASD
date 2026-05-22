package P4;

public class SmartHomeDevice {
    String nama;
    double konsumsiPower;
    double standbyPower;

    double totalEnergiAktual(double rasioefisiensi){
        double totalEnergiAktual;
        totalEnergiAktual = konsumsiPower + standbyPower;

        return totalEnergiAktual;
    }

    double rasioefisiensi(double rasioefisiensi){
        double rasioefisiensi1 = konsumsiPower;
        return rasioefisiensi1;

    }
    
    public void printData(){ 

        System.out.println("nama           : " + nama);
        System.out.println("Konsumsi Power : " + konsumsiPower);
        System.out.println("Standby Power  : " + standbyPower);
        
    }

    public void ratarata(){
        System.out.println(" RATA-RATA ");
    }
}
