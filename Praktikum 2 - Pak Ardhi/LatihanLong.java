//M0521023_Gentur Sahadewa
//Latihan 1
// file LatihanLong.java
public class LatihanLong {
    public static void main(String args[]) {
    long p = 2147483648;
    //long p = 2147483648L; (yang benar)
    System.out.println(p);
    }
}

/*
LatihanLong.java:4: error: integer number too large
    long p = 2147483648;
             ^

Pesan error di atas muncul karena format bilangan yang dimasukkan 
dalam variabel dengan tipe data long tidak sesuai. Seharusnya pada bagian
akhir bilangan diberi huruf "L" sebagai penanda bahwa bilangan tersebut
bertipe data long, bukan integer.

Syntax yang benar :
  long p = 2147483648L;  
 */
