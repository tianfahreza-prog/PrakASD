package P1;

import java.util.Scanner;

public class tugas1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char KODE[] = {'A','B','D','E','F','G','H','L','N','T'};

        char[][] huruf = {
            {'B','A','N','T','E','N',' ',' ',' ',' ',' ',' '},
            {'J','A','K','A','R','T','A',' ',' ',' ',' ',' '},
            {'B','A','N','D','U','N','G',' ',' ',' ',' ',' '},
            {'C','I','R','E','B','O','N',' ',' ',' ',' ',' '},
            {'B','O','G','O','R',' ',' ',' ',' ',' ',' ',' '},
            {'P','E','K','A','L','O','N','G','A','N',' ',' '},
            {'S','E','M','A','R','A','N','G',' ',' ',' ',' '},
            {'S','U','R','A','B','A','Y','A',' ',' ',' ',' '},
            {'M','A','L','A','N','G',' ',' ',' ',' ',' ',' '},
            {'T','E','G','A','L',' ',' ',' ',' ',' ',' ',' '}
        };

        System.out.print("Masukkan kode plat nomor: ");
        char kode = Character.toUpperCase(sc.next().charAt(0));

        boolean ketemu = false;

        for (int i = 0; i < KODE.length; i++) {

            if (kode == KODE[i]) {
                ketemu = true;

                for (int j = 0; j < huruf[i].length; j++) {
                    System.out.print(huruf[i][j]);
                }

                System.out.println();
                break;
            }
        }

        if (!ketemu) {
            System.out.println("Kode tidak ditemukan!");
        }
    }  
}
