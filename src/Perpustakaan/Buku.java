package Perpustakaan;

import java.time.LocalDate;

public class Buku {

    private String ISSN;
    private String pengarang;
    private  String judul;
    private LocalDate terbit;
    private  String penerbit;
    private  int harga;

    public Buku(String ISSN, String pengarang, String judul, LocalDate terbit, String penerbit) {
        this.ISSN = ISSN;
        this.pengarang = pengarang;
        this.judul = judul;
        this.terbit = terbit;
        this.penerbit = penerbit;
        this.harga = harga;
    }
public String getIISN() {
        return ISSN;
    }

    public String getpengarang() {
        return pengarang;
    }

    public String getjudul() {
        return judul;
    }

    public LocalDate getterbit() {
        return terbit;
    }

    public String getPenerbit() {
        return penerbit;
    }

    public int getHarga() {
        return harga;
    }
    @Override
    public String toString() {
        return "*|| ISSN: " + ISSN + ", Pengarang: " + pengarang + ", Judul: " + judul + ", Tahun Terbit: " + terbit +
                ", Penerbit: " + penerbit + ", Harga: " + harga;
    }
}
