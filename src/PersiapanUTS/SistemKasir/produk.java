package PersiapanUTS.SistemKasir;

public class produk {
    private String nama;
    private double harga;
    private kategoriBarang kategori;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public kategoriBarang getKategori() {
        return kategori;
    }

    public void setKategori(kategoriBarang kategori) {
        this.kategori = kategori;
    }

    public produk(String nama, double harga, kategoriBarang kategori){
        this.nama = nama;
        this.harga = harga;
        this.kategori = kategori;

    }
        @Override
        public String toString() {
            return nama + " Rp" + harga + " (" + kategori + ")";
        }

}
