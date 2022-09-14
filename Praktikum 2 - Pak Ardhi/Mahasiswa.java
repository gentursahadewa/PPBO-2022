//M0521023_Gentur Sahadewa
//Latihan 3
//Lengkapi kode berikut

// file Mahasiswa.java
public class Mahasiswa {
    String nim, nama, alamat;
    char jenisKelamin;
    // buatlah constructor untuk menginisiasi nilai dari variabel
    // nim, nama, jenisKelamin, alamat
    
    // constructor class Mahasiswa
    public Mahasiswaa(String nim, String nama, char jenisKelamin, String alamat) {
        this.nim = nim;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.alamat = alamat;
    }

    void printData() {
        System.out.println("Data Mahasiswa:");
        System.out.println("NIM : " + nim);
        System.out.println("Nama : " + nama);
        System.out.println("Jenis Kelamin : " + jenisKelamin);
        System.out.println("Alamat : " + alamat);
    }
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa("M0501001", "Patrick Star", 'L', "Bikini Bottom");
        mhs.printData();
    }
}
