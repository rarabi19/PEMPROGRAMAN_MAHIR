package PersiapanUTS.SistemKasir;


import java.util.Date;

public class MesinKasir {
    public static void main(String[] args) {
        keranjangBelanja<produk> keranjang = new keranjangBelanja<>();

        System.out.println("====== STRUK BELANJA SWALAYAN SALSABILA ======");
        System.out.println("Saller : Haniva");
        Date tanggal = new Date();
        System.out.println(tanggal);
        System.out.println("=======================================" );

        System.out.println();
        keranjang.DaftarBelanjaan(new produk("sabun         ",5000, kategoriBarang.HARIAN), 2);
        keranjang.DaftarBelanjaan(new produk("Shampo        ",15000, kategoriBarang.HARIAN), 1);
        keranjang.DaftarBelanjaan(new produk("Hand & Body   ",35000, kategoriBarang.HARIAN), 1);
        keranjang.DaftarBelanjaan(new produk("Pasta Gigi    ",8000, kategoriBarang.HARIAN), 3);
        keranjang.DaftarBelanjaan(new produk("Sikat Gigi    ",6000, kategoriBarang.HARIAN), 6);
        keranjang.DaftarBelanjaan(new produk("Kaca          ",35000, kategoriBarang.HARIAN), 1);
        keranjang.DaftarBelanjaan(new produk("Keranjang     ",50000, kategoriBarang.HARIAN), 3);
        System.out.println();

        System.out.println("=========  TOTAL BELANJA ANDA  ========");
        System.out.println("Total Harga Belanjaan : Rp " + keranjang.hitungTotalHarga());
        System.out.println();
        System.out.println("=======================================");
        System.out.println("Terimakasih Telah Membeli");
    }
}
