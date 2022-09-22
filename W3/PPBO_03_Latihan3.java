// Nama : Gentur Sahadewa
// NIM  : M0521023 

public class PPBO_03_Latihan3 {
    public static void main(String[] args) {
        int arr[] = {5, 1, 4, 2, 3};
        /* KODE YANG SALAH
        for (int i = 1; i < 6; i++) {
            System.out.println("elemen ke-" + i + " = " + arr[i]);
        }*/
        //Perbaikan Kode
        for (int i = 0; i < 5; i++) {
            System.out.println("elemen ke-" + (i+1) + " = " + arr[i]);
        }
    }
}

// Berikut ini adalah code untuk menampilkan elemen (anggota) sebuah array yang berupa bilangan
// integer, mulai dari elemen pertama hingga terakhir.

// Eksekusi source code tersebut dan jelaskan apakah penulisan kode perulangan dengan for pada code
// tersebut sudah tepat dan tuliskan perbaikan apabila diperlukan!
/* 
Jawab:  penulisan perulangan (for-loop) pada source code tersebut kurang tepat
        karena tidak menampilkan semua elemen pada atribut arr[]. Selain itu, terdapat
        pengaksesan index yang melebihi jumlah index yang ada dan akhirnya menyebabkan
        exception "ArrayIndexOutOfBoundsException". 
        Penulisan kondisi pada for-loop yang tepat adalah for(int i = 0; i < 5; i++) 
*/ 
            