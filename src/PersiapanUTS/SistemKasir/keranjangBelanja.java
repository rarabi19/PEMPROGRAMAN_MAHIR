package PersiapanUTS.SistemKasir;

import java.util.ArrayList;
import java.util.List;

public class keranjangBelanja <T extends  produk> {
    private List<T> listProduk = new ArrayList<>();
    private List<Integer> jumlahProduk = new ArrayList<>();

    public void DaftarBelanjaan(T produk, int jumlah) {
        listProduk.add(produk);
        jumlahProduk.add(jumlah);
        System.out.println(produk.getNama() + " : " + jumlah + " unit");
    }

    public double hitungTotalHarga() {
        return hitungTotalHargaRekursif(0);
    }

    private double hitungTotalHargaRekursif(int index) {
        if (index >= listProduk.size()) {
            return 0;
        }

        T produk = listProduk.get(index);
        int jumlah = jumlahProduk.get(index);

        return
                (produk.getHarga() * jumlah) + hitungTotalHargaRekursif( index + 1);
    }
}
