package PersiapanUTS.ManajemenInventarisBarang;

import java.util.ArrayList;
import java.util.List;

public class Gudang <T extends Barang> {
    private List<T> brg = new ArrayList<>();

    public void tambahkanBrg(T pembeli){
        brg.add(pembeli);
        System.out.println("* " + pembeli.getNama() + " Kategori  : " + pembeli.getKategori() + " | " + pembeli.getStatusStok() + " |");
    }
    public void tampilkan(){
        System.out.println();
        System.out.println("===== LIST KETERSEDIAAN BARANG ====");

        System.out.println("BARANG TERSEDIA  : ");
        for (T pembeli : brg){
            if(pembeli.getStatusStok() == StatusStok.TERSEDIA) {
                System.out.println("* " + pembeli.getNama());
            }
        }
        System.out.println("BARANG STOK HABIS SEMENTARA  : ");
        for (T pembeli : brg){
            if(pembeli.getStatusStok() == StatusStok.KEHABISAN) {
                System.out.println("* " + pembeli.getNama());
            }
        }
        System.out.println("BARANG BELUM DI STOK   : ");
        for (T pembeli : brg){
            if(pembeli.getStatusStok() == StatusStok.TIDAKTERSEDIA) {
                System.out.println("* " + pembeli.getNama());
            }
        }
    }
}
