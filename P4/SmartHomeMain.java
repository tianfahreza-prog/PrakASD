package P4;

import java.util.Scanner;

import P3.Mahasiswa;

public class SmartHomeMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("ada berapa Smart Home Device? : ");//mengelola n
        int jumlah = sc.nextInt();
        sc.nextLine();

        SmartHomeDevice[] arrayOfSmartHomeDevices = new SmartHomeDevice[jumlah];

        for (int i = 0; i < jumlah; i++) {//masukkan data

            arrayOfSmartHomeDevices[i] = new SmartHomeDevice();

            System.out.println("Smart Home Devise ke-" + (i+1));

            System.out.print("Nama : ");
            arrayOfSmartHomeDevices[i].nama = sc.nextLine();
            sc.nextLine();
            System.out.print("Konsumsi Power : ");
            arrayOfSmartHomeDevices[i].konsumsiPower = sc.nextDouble();
            System.out.print("Standby power : ");
            arrayOfSmartHomeDevices[i].standbyPower = sc.nextDouble();
            
        }

        for (int i = 0; i < jumlah; i++) {//tampilkan data
            arrayOfSmartHomeDevices[i].printData();
        }

    }
}
