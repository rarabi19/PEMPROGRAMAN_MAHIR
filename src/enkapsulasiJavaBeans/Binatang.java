package enkapsulasiJavaBeans;

public class Binatang {
    private String nama;
    private String jenis;
    private int jumlahKaki;
    private int getJumlahTangan;
    private boolean kawin;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public int getJumlahKaki() {
        return jumlahKaki;
    }

    public void setJumlahKaki(int jumlahKaki) {
        this.jumlahKaki = jumlahKaki;
    }

    public int getJumlahTangan() {
        return getJumlahTangan;
    }

    public void setJumlahTangan(int getJumlahTangan) {
        this.getJumlahTangan = getJumlahTangan;
    }

    public boolean isKawin() {
        return kawin;
    }

    public void setKawin(boolean kawin) {
        this.kawin = kawin;
    }
}
