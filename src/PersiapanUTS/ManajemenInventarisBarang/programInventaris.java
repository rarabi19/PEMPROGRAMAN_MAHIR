package PersiapanUTS.ManajemenInventarisBarang;

public class programInventaris {
    public static void main(String[] args) {
        Gudang<Barang> barang = new Gudang<>();

        System.out.println();
        System.out.println("===== LIST BARANG TOKO SALSABILA ======");
        System.out.println();
        barang.tambahkanBrg(new Barang(" Sofa ",KategoriBarang.FURNITUR, StatusStok.TERSEDIA));
        barang.tambahkanBrg(new Barang(" kursi ",KategoriBarang.FURNITUR, StatusStok.KEHABISAN));
        barang.tambahkanBrg(new Barang(" kipas ",KategoriBarang.ELEKTRONIK, StatusStok.TIDAKTERSEDIA));
        barang.tambahkanBrg(new Barang(" kasur ",KategoriBarang.FURNITUR, StatusStok.TERSEDIA));
        barang.tambahkanBrg(new Barang(" kayu ",KategoriBarang.BAHANBAKU, StatusStok.TERSEDIA));
        barang.tambahkanBrg(new Barang(" Printer ",KategoriBarang.ELEKTRONIK, StatusStok.TERSEDIA));
        barang.tambahkanBrg(new Barang(" Scanner ",KategoriBarang.ELEKTRONIK, StatusStok.TIDAKTERSEDIA));
        barang.tambahkanBrg(new Barang(" Plastik ",KategoriBarang.BAHANBAKU, StatusStok.KEHABISAN));
        barang.tambahkanBrg(new Barang(" Triplek ",KategoriBarang.BAHANBAKU, StatusStok.TERSEDIA));
        barang.tambahkanBrg(new Barang(" Besi ",KategoriBarang.BAHANBAKU, StatusStok.TERSEDIA));
        barang.tambahkanBrg(new Barang(" Vas Bunga ",KategoriBarang.FURNITUR, StatusStok.TIDAKTERSEDIA));
        barang.tambahkanBrg(new Barang(" Spiker ",KategoriBarang.ELEKTRONIK, StatusStok.TERSEDIA));

        barang.tampilkan();
        System.out.println("==== Terimakasih Telah Berkunjung ====");
    }
}
