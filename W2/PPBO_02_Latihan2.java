// Nama : Gentur Sahadewa
// NIM  : M0521023
public class PPBO_02_Latihan2 {
    public static final int KURS_DOLLAR = 15000;
    public static final double PI = 3.14;
    public static final String NAMA = "Squidward";
    public static void main(String args[]) {
        //KURS_DOLLAR = 13500;
        System.out.println(KURS_DOLLAR);
        System.out.println(PI);
        System.out.println(NAMA);
    }
}
// Apa yang salah dengan source code tersebut?
// Jawaban : 
/*  Kesalahan pada source code tersebut adalah pada main method, value dari
    variabel KURS_DOLLAR coba diubah dari 15000 ke 13500. Padahal, pada saat
    inisiasi sebelumnya, telah ditambahkan keyword "final", di mana value dari
    variabel tersebut telah menjadi konstanta dan tidak dapat diubah valuenya.
 */
// Apa maksud penggunaan keyword static sebelum keyword final pada deklarasi variabel tersebut?
// Jawaban :
/*  Maksud dari keyword static adalah agar atribut/variabel tersebut dapat
    diakses oleh class atau objek tanpa harus melakukan instansiasi terhadap kelas tersebut.
 */
