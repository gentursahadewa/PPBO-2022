// Nama : Gentur Sahadewa
// NIM  : M0521023
public class PPBO_02_Latihan3 {
    String nim, nama, alamat;
    char jenisKelamin;

    public PPBO_02_Latihan3(String nim, String nama, char jenisKelamin, String alamat) {
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
        PPBO_02_Latihan3 mhs = new PPBO_02_Latihan3("M0501001", "Patrick Star", 'L', "Bikini Bottom");
        mhs.printData();
    }
}

// Buatlah constructor untuk menginisiasi nilai dari variabel
// nim, nama, jenisKelamin, alamat