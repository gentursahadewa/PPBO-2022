// Nama : Gentur Sahadewa
// NIM  : M0521023

import java.util.InputMismatchException;
import java.util.Scanner;

public class PPBO_04_Latihan3 {
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
                Double hasil = Double.valueOf(bil1) / Double.valueOf(bil2);

                //Exception handlng dengan throw
                if (Double.isInfinite(hasil)) {
                    throw new ArithmeticException();
                }
                /*  Karena hasil pembagian di sini menghasilkan nilai infinity, maka digunakan
                    "throw" yang pada kasus ini akan throw ke exception jika nilai variabel "hasil"  
                    adalah infinity.

                    Output :    Ketik bilangan pertama : 5
                                Ketik bilangan kedua : 0
                                Tidak dapat membagi dengan 0 (nol) */

                System.out.println(bil1 + " / " + bil2 + " = " + hasil);
                lanjut = false;
                sc.close();
            } 
            catch (InputMismatchException e) {
                sc.next();
                System.out.println("Input salah, masukkan angka");
            }
            catch (ArithmeticException e) {
                System.out.println("Tidak dapat membagi dengan 0 (nol)");
            }
        }
    }
}
// Pembagian bilangan dengan 0 seharusnya tidak dapat dilakukan. Tambahkan catch statement
// tambahan untuk menangani pembagian dengan 0 pada source code tersebut!