package Rekursif;
import java.util.Scanner;

public class MenuKasir {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pilihan;
        int makanan;
        int minuman;

        do {
            System.out.println("Apakah yang ingin anda Order");
            System.out.println("1. Makanan");
            System.out.println("2. Minuman");
            System.out.println("3. Close");

            System.out.print("Masukkan menu yang anda pilih: ");
            pilihan = scanner.nextInt();  // Get user input for 'pilihan'

            if (pilihan == 1) {
                System.out.println("=== Masukkan Makanan Yang Ingin Anda Order ===");
                System.out.println("1. Nasi Goreng     : 10.000 ");
                System.out.println("2. Ayam Geprek     : 15.000 ");
                System.out.println("3. Soto Ayam       : 12.000 ");
                System.out.println("4. Sate Padang     : 10.000 ");
                System.out.println("5. Tambah Pesanan");
                System.out.println("6. Keluar");

                System.out.print("Masukkan pilihan makanan: ");
                makanan = scanner.nextInt();  // Get user input for 'makanan'

                switch (makanan) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                        System.out.println("Pesanan Anda Sudah Diproses");
                        break;
                    default:
                        System.out.println("Menu Yang Anda Pilih Tidak Tersedia");
                }

            } else if (pilihan == 2) {
                System.out.println("=== Masukkan Minuman Yang Ingin Anda Order ===");
                System.out.println("1. Jus Mangga  : 10.000 ");
                System.out.println("2. Jus Apel    : 10.000 ");
                System.out.println("3. Jus Jeruk   :  5.000 ");
                System.out.println("4. Es Teh      :  4.000 ");
                System.out.println("5. Tambah Pesanan");
                System.out.println("6. Keluar");

                System.out.print("Masukkan pilihan minuman: ");
                minuman = scanner.nextInt();  // Get user input for 'minuman'

                switch (minuman) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                        System.out.println("Pesanan Anda Sudah Diproses");
                        break;
                    default:
                        System.out.println("Menu Yang Anda Pilih Tidak Tersedia");
                }

            } else if (pilihan != 3) {
                System.out.println("=== Harap Masukkan Menu Yang Sesuai ===");
            }

        } while (pilihan != 3); // Loop until user selects "Close"

        System.out.println("Terima kasih telah menggunakan layanan kami.");
        scanner.close();  // Close the scanner to free up resources
    }
}
