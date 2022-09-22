// M0521023_Gentur Sahadewa
// file ExceptionDemo1.java
import java.util.Scanner;
public class ExceptionDemo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ketik bilangan pertama : ");
        int bil1 = sc.nextInt();
        System.out.print("Ketik bilangan kedua : ");
        int bil2 = sc.nextInt();
        double hasil = Double.valueOf(bil1) / Double.valueOf(bil2);
        System.out.println(bil1 + " / " + bil2 + " = " + hasil);
        sc.close();
    }
}
/*
a.  Ketik huruf misalnya f untuk input bilangan pertama kemudian tekan ENTER
    -   Apakah program masih dapat dijalankan setelah user memasukkan f sebagai input untuk
        bilangan pertama?
        Jawab   :   Tidak, program terhenti.
    -   Tulis output yang muncul!
        Jawab   :   Exception in thread "main" java.util.InputMismatchException
                        at java.base/java.util.Scanner.throwFor(Scanner.java:939)
                        at java.base/java.util.Scanner.next(Scanner.java:1594)
                        at java.base/java.util.Scanner.nextInt(Scanner.java:2258)
                        at java.base/java.util.Scanner.nextInt(Scanner.java:2212)
                        at ExceptionDemo1.main(ExceptionDemo1.java:8)
    -   Jelaskan maksud dari output tersebut!
        Jawab   :   Output tersebut memberitahukan bahwa terjadi exception berupa
                    kesalahan type data yang diinput (InputMismatchException) pada
                    method main. Hal ini terjadi karena secara default, scanner pada
                    method tersebut hanya menerima type data int sehingga jika dimasukkan
                    karakter dengan type data lain akan terjadi kesalahan.
                    
b.  Pilih salah satu angka sebagai bilangan pertama misal 5, kemudian ketik angka 0 untuk input
    bilangan kedua. Jelaskan output yang muncul!
    -   Tulis output yang muncul!
        Jawab   :   Ketik bilangan pertama : 5
                    Ketik bilangan kedua : 0
                    5 / 0 = Infinity
    -   Jelaskan maksud dari output tersebut!
        Jawab   :   Output tersebut menunjukkan bahwa hasil pembagian 5 dengan 0 menghasilkan
                    "infinity" atau nilai tak hingga. Hal ini terjadi karena variabel yang dioperasikan
                    menggunakan type data double (floating point) yang secara default akan mengeluarkan
                    nilai infinity saat terjadi operasi divide by zero.
                    
                    Lain hal jika variabel yang dioperasikan menggunakan type data integer. Output akan 
                    menunjukkan Exception berupa:
                    
                    Exception in thread "main" java.lang.ArithmeticException: / by zero
                        at ExceptionDemo1.main(ExceptionDemo1.java:11)

                    yang berarti bahwa ada kesalahan aritmatikal, yaitu pemmbagian dengan nilai 0.

*/