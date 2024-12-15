package Perpustakaan;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class perpustakaan {
    private List<Buku> bukutambahan;

    public perpustakaan() {
        bukutambahan = new ArrayList<>();
        tambahkanBuku();
    }

    public void tambahkanBuku() {
        bukutambahan.add(new Buku("12345678", "John Doe", "Pemrograman Python", LocalDate.of(2021, 1, 15), "Tech Press"));
        bukutambahan.add(new Buku("23456789", "Jane Smith", "Data Science untuk Pemula", LocalDate.of(2022, 3, 10), "Data Insight"));
        bukutambahan.add(new Buku("34567890", "Alex Johnson", "Dasar-Dasar Machine Learning", LocalDate.of(2010, 5, 20), "AI Books"));
        bukutambahan.add(new Buku("45678901", "Marcia Garcia", "Statistik Terapan", LocalDate.of(2019, 7, 30), "Stat Press"));
        bukutambahan.add(new Buku("56789012", "Michael Brown", "Keamanan Siber", LocalDate.of(2023, 2, 25), "Cyber Security Press"));
        bukutambahan.add(new Buku("67890123", "Emily Davis", "Blockchain untuk Bisnis", LocalDate.of(2022, 11, 15), "Blockchain Publishing"));
        bukutambahan.add(new Buku("78901234", "David Wilson", "Pengantar Cloud Computing", LocalDate.of(2021, 8, 5), "Cloud Books"));
        bukutambahan.add(new Buku("89012345", "Sarah Miller", "Internet of Things", LocalDate.of(2023, 4, 18), "IoT Press"));
        bukutambahan.add(new Buku("90123456", "Christopher Martinez", "Desain Antarmuka Pengguna", LocalDate.of(2020, 9, 12), "UX Books"));
        bukutambahan.add(new Buku("01234567", "Linda Taylor", "Teknologi 5G", LocalDate.of(2023, 6, 30), "Future Tech Press"));
    }

    public void tampilkanBuku() {
        for (Buku buku : bukutambahan) {
            System.out.println(buku.toString());
        }
    }

    public void urutkanBukuBerdasarkanPengarang() {
        bukutambahan.sort(Comparator.comparing(Buku::getpengarang));
        tampilkanBuku();
    }

    public static void main(String[] args) {
        perpustakaan perpustakaan = new perpustakaan();
        Scanner scanner = new Scanner(System.in);

        int order;
        do {
            System.out.println("=== MASUKKAN PILIHAN ANDA ===");
            System.out.println("1. Tampilkan Buku di ruang penyimpanan");
            System.out.println("2. Urutkan Buku berdasarkan nama Pengarang");
            System.out.println("3. Keluar");
            System.out.print("Masukkan pilihan Anda: ");

           order = scanner.nextInt();

            if (order == 1) {
                System.out.println("====MENAMPILKAN LIST BUKU YANG TERSIMPAN====");
                perpustakaan.tampilkanBuku();
            } else if (order == 2) {
                System.out.println("====MENAMPILKAN BERDASARKAN URUTAN NAMA PENGARANG====");
                perpustakaan.urutkanBukuBerdasarkanPengarang();
            } else if (order == 3) {
                System.out.println("====TERIMAKASIH TELAH BERKUNJUNG====");
            } else {
                System.out.println("Pilihan yang Anda masukkan tidak dapat diproses.");
            }
        } while (order != 3); 

        scanner.close();
    }
}