package PersiapanUTS.ManajemenInventarisBarang;

public class Barang {
    private String nama;
    private KategoriBarang kategori;
    private StatusStok statusStok;

    public Barang(String nama, KategoriBarang kategori, StatusStok statusStok){
        this.nama = nama;
        this.kategori = kategori;
        this.statusStok = statusStok;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public KategoriBarang getKategori() {
        return kategori;
    }

    public void setKategori(KategoriBarang kategori) {
        this.kategori = kategori;
    }

    public StatusStok getStatusStok() {
        return statusStok;
    }

    public void setStatusStok(StatusStok statusStok) {
        this.statusStok = statusStok;
    }

    @Override
    public String toString() {
        return ("* Barang  : " + nama +"  Kategori : " + kategori + "Ketersediaan : " +statusStok);
    }
}
