package PersiapanUTS.ManajemenAntrianPelanggan;

import java.util.ArrayList;
import java.util.List;

public class AntrianPelanggan <T extends Pelanggan> {
    private List<T> antrian = new ArrayList<>();

    public void tambahAntrian(T pelanggan) {
        antrian.add(pelanggan);
        System.out.println("* ( Pelanggan : " + pelanggan.getNama() + " Berhasil ditambahkan     " + pelanggan.getPrioritas() + " )");
    }
public void tampilkanAntrian(){
    System.out.println();
    System.out.println("===== LIST ANTRIAN PELANGGAN ====");

    System.out.println("ANTRIAN PENDAHULU  : ");
    for (T pelanggan : antrian){
        if(pelanggan.getPrioritas() == PrioritasAntrian.PENDAHULU) {
            System.out.println("* " + pelanggan.getNama());
        }
    }
    System.out.println("ANTRIAN NORMAL     : ");
    for (T pelanggan : antrian) {
        if (pelanggan.getPrioritas() == PrioritasAntrian.NORMAL) {
            System.out.println("* " + pelanggan.getNama());
        }
    }
    System.out.println("ANTRIAN TERAKHIR     : ");
    for (T pelanggan : antrian){
        if(pelanggan.getPrioritas() == PrioritasAntrian.TERAKHIR) {
            System.out.println("* " + pelanggan.getNama());
        }
      }
    }
}
