//M0521023_Gentur Sahadewa
//Latihan 2
// file LatihanKonstanta.java
public class LatihanKonstanta {
    public static final int KURS_DOLLAR = 15000;
    public static final double PI = 3.14;
    public static final String NAMA = "Squidward";
    public static void main(String args[]) {
        KURS_DOLLAR = 13500; //value sebuah konstanta tidak dapat diperbaharui
        System.out.println(KURS_DOLLAR);
        System.out.println(PI);
        System.out.println(NAMA);
    }
}

/*
Pertanyaan :
1. Apa yang salah dengan source code tersebut?
2. Apa maksud penggunaan keyword static sebelum keyword final pada deklarasi variabel tersebut?

Jawaban :
1.  Kesalahan pada source code tersebut adalah pada main method, value dari
    variabel KURS_DOLLAR coba diubah dari 15000 ke 13500. Padahal, pada saat
    inisiasi sebelumnya, telah ditambahkan keyword "final", di mana value dari
    variabel tersebut telah menjadi konstanta dan tidak dapat diubah valuenya.
2.  Maksud dari keyword static adalah agar atribut/variabel tersebut dapat
    diakses oleh class atau objek tanpa harus melakukan instansiasi terhadap kelas tersebut
 */
