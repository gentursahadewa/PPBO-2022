//M0521023_Gentur Sahadewa_Informatika A

import java.util.Scanner;

public class DiskonMiniMarket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Total pembelian : ");
        // tambahkan code untuk menyimpan nominal total pembelian
        long totalPembayaran = sc.nextLong();

        // tambahkan code untuk mengimplementasikan ketentuan diskon yang ditetapkan
        if (totalPembayaran < 50000) {
            totalPembayaran = totalPembayaran * (100 / 100);
        }
        else if (totalPembayaran >= 50000 && totalPembayaran < 75000) {
            totalPembayaran = (long) (totalPembayaran - totalPembayaran * 0.05);
        }
        else if (totalPembayaran >= 75000 && totalPembayaran < 125000) {
            totalPembayaran = (long) (totalPembayaran - totalPembayaran * 0.15);
        }
        else if (totalPembayaran >= 125000) {
            totalPembayaran = (long) (totalPembayaran - totalPembayaran * 0.2);
        }
        else {
            System.out.println("[NOMINAL YANG DIMASUKKAN SALAH]");
        }
        // tambahkan code untuk menampilkan nominal yang harus dibayar
        System.out.println("Total Pembayaran : " + totalPembayaran);
        sc.close();
    }
}
