package PersiapanUTS.InventarisBuku;

import java.time.LocalDate;

public class Buku {
    private String ISBN;
    private String Pengarang;
    private String Judul;
    private LocalDate tahunTerbit;
    private String Penerbit;
    private double Harga;
    private KategoriBuku Kategori;

    public Buku (String ISBN, String Pengarang, String Judul, LocalDate tahunTerbit, String Penerbit, double Harga ,KategoriBuku kategori){
        this.ISBN = ISBN;
        this.Pengarang = Pengarang;
        this.Judul = Judul;
        this.tahunTerbit = tahunTerbit;
        this.Penerbit = Penerbit;
        this.Harga = Harga;
        this.Kategori = Kategori;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getPengarang() {
        return Pengarang;
    }

    public void setPengarang(String pengarang) {
        Pengarang = pengarang;
    }

    public String getJudul() {
        return Judul;
    }

    public void setJudul(String judul) {
        Judul = judul;
    }

    public LocalDate getTahunTerbit() {
        return tahunTerbit;
    }

    public void setTahunTerbit(LocalDate tahunTerbit) {
        this.tahunTerbit = tahunTerbit;
    }

    public String getPenerbit() {
        return Penerbit;
    }

    public void setPenerbit(String penerbit) {
        Penerbit = penerbit;
    }

    public double getHarga() {
        return Harga;
    }

    public void setHarga(double harga) {
        Harga = harga;
    }

    public KategoriBuku getKategori() {
        return Kategori;
    }

    public void setKategori(KategoriBuku kategori) {
        Kategori = kategori;
    }

    @Override
    public String toString() {
        return "*| ISBN  : " + ISBN + "Pengarang : " + Pengarang + "Judul  : " + Judul + "Tahun Terbit  : " + tahunTerbit
                + "Penerbit  : " + Penerbit + " Harga  :" + Harga + "Kategori : " + Kategori;
    }
}

