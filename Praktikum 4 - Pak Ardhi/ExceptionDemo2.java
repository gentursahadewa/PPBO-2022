//M0521023_Gentur Sahadewa
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo2 {
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

/*

a.  Ketik huruf untuk digunakan sebagai input bilangan pertama kemudian klik ENTER. Jelaskan
    perbedaannya dengan ExceptionDemo1.java!
    Jawab   :   Pada source code ini, pesan default InputMismatchException tidak muncul, namun
                pesan yang muncul adalah

                "Input salah, masukkan angka"

                Hal ini terjadi karena adanya penggunaan Try-catch, di mana jika terdapat kondisi yang
                men-trigger terjadinya exception di scope "try", maka program yang ada di dalam scope catch
                akan berjalan.
                Dalam konteks ini, catch akan menangkap program yang mengalami exception InputMismatch, sebagaimana
                tertulis pada "catch (InputMismatchException e)"

b.  Pembagian bilangan dengan 0 seharusnya tidak dapat dilakukan. Tambahkan code exception
    handling untuk menangani pembagian dengan 0 pada source code tersebut.
    Jawab   :   Karena hasil pembagian di sini menghasilkan nilai infinity, maka digunakan
                "throw" yang pada kasus ini akan throw ke exception jika nilai variabel "hasil"  
                adalah infinity.

                Output :    Ketik bilangan pertama : 5
                            Ketik bilangan kedua : 0
                            Tidak dapat membagi dengan 0 (nol)
 */
