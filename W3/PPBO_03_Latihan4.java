// Nama : Gentur Sahadewa
// NIM  : M0521023

public class PPBO_03_Latihan4 {
    public static void main(String[] args) {
        int arr[] = {5, 1, 4, 2, 3};
        /* PERULANGAN FOR-LOOP
        for (int i = 0; i < 5; i++) {
            System.out.println("elemen ke-" + (i+1) + " = " + arr[i]);
        }*/
        // PERULANGAN DO WHILE
        int i = 0;
        do {
            System.out.println("elemen ke-" + (i+1) + " = " + arr[i]);
            i++; 
        } while(i < 5);
    }
}

// Melanjutkan source code Latihan3 yang sudah diperbaiki, ubahlah source code dengan 
// mengganti dari perulangan FOR menjadi menggunakan DO ... WHILE