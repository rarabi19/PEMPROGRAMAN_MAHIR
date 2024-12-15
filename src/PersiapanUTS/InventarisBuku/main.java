package PersiapanUTS.InventarisBuku;

import java.time.LocalDate;

public class main {
    public static void main(String[] args) {
    InventarisBuku<Buku> a = new InventarisBuku<>();

        System.out.println("===== PERPUSTAKAAN SEJAHTERA ====== ");
        a.tambahkan(new Buku("1234567","Yudomargono", "Kau Sang Cahaya Malam",LocalDate.of(2020,11,03), "Cahaya Sakti", 50000, KategoriBuku.Fiksi));
        a.tambahkan(new Buku("1234567","Antarsai", "Pahlawan Indonesia",LocalDate.of(2020,11,03), "Cahaya Sakti", 155000, KategoriBuku.NonFiksi));
        a.tambahkan(new Buku("1234567","Bayunan", "Jakarta Negeri Orang Kaya",LocalDate.of(2020,11,03), "Cahaya Sakti", 35000, KategoriBuku.Fiksi));
        a.tambahkan(new Buku("1234567","Sundar Wulan", "Ayah Pergi Tak Pulang",LocalDate.of(2020,11,03), "Cahaya Sakti", 30000, KategoriBuku.Fiksi));
        a.tambahkan(new Buku("1234567","Nugraha", "Perjalanan si Miskin",LocalDate.of(2020,11,03), "Cahaya Sakti", 30000, KategoriBuku.Fiksi));
        a.tambahkan(new Buku("1234567","Anggina lorosati", "Suara Rakyat",LocalDate.of(2020,11,03), "Cahaya Sakti", 35000, KategoriBuku.NonFiksi));
        a.tambahkan(new Buku("1234567","Irhamni", "Teknologi 5.0 ",LocalDate.of(2020,11,03), "Cahaya Sakti", 50000, KategoriBuku.Teknologi));
        a.tambahkan(new Buku("1234567","Lathiva Salsabila", "Anak Muda dan Pembaruannya",LocalDate.of(2020,11,03), "Cahaya Sakti", 65000, KategoriBuku.Teknologi));
        a.tambahkan(new Buku("1234567","Zasta Ananta", "Kisah si Anak Yatim",LocalDate.of(2020,11,03), "Cahaya Sakti", 40000, KategoriBuku.Fiksi));
        a.tambahkan(new Buku("1234567","Mela ningrat", "Sipenangis Handal",LocalDate.of(2020,11,03), "Cahaya Sakti", 35000, KategoriBuku.Fiksi));
        a.tambahkan(new Buku("1234567","Tere liye", "Pembangkit Listrik Tenaga Angin",LocalDate.of(2020,11,03), "Cahaya Sakti", 150000, KategoriBuku.Teknologi));
        
    }
}
