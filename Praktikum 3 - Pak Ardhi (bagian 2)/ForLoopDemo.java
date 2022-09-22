// M0521023_Gentur Sahadewa
// file ForLoopDemo.java
public class ForLoopDemo {
    public static void main(String[] args) {
    int arr[] = {5, 1, 4, 2, 3};
    /*for (int i = 1; i < 6; i++) {
    System.out.println("elemen ke-" + i + " = " + arr[i]);
    } */
    /*
    penulisan perulangan (for-loop) pada source code di atas kurang tepat
    karena tidak menampilkan semua elemen pada atribut arr[]. Selain itu, terdapat
    pengaksesan index yang melebihi jumlah index yang ada dan akhirnya menyebabkan
    exception "ArrayIndexOutOfBoundsException". 
    Penulisan kondisi pada for-loop yang tepat adalah for(int i = 0; i < 5; i++)
    Berikut adalah perbaikannya :     */
    for (int i = 0; i < 5; i++) {
        System.out.println("elemen ke-" + (i+1) + " = " + arr[i]);
    }
    }
}
