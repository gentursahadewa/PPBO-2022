// Nama : Gentur Sahadewa
// NIM  : M0521023

import java.util.InputMismatchException;
import java.util.Scanner;

public class PPBO_04_Latihan2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int bil1, bil2;
        boolean lanjut = true;
        while (lanjut) {
            try {
                System.out.print("Ketik bilangan pertama : ");
                bil1 = sc.nextInt();
                System.out.print("Ketik bilangan kedua : ");
                bil2 = sc.nextInt();
                double hasil = Double.valueOf(bil1) / Double.valueOf(bil2);

                System.out.println(bil1 + " / " + bil2 + " = " + hasil);
                lanjut = false;
            } catch (InputMismatchException e) {
                sc.next();
                System.out.println("Input salah, masukkan angka");
            }
        }

        sc.close();
    }
}

// Ketik huruf untuk digunakan sebagai input bilangan pertama kemudian klik ENTER. 
// Jelaskan perbedaannya dengan source code sebelumnya (Latihan1)!
/* Jawab   :    Pada source code ini, pesan default InputMismatchException tidak muncul, namun
                pesan yang muncul adalah

                "Input salah, masukkan angka"

                Hal ini terjadi karena adanya penggunaan Try-catch, di mana jika terdapat kondisi yang
                men-trigger terjadinya exception di scope "try", maka program yang ada di dalam scope catch
                akan berjalan.
                Dalam konteks ini, catch akan menangkap program yang mengalami exception InputMismatch, sebagaimana
                tertulis pada "catch (InputMismatchException e)"
 */