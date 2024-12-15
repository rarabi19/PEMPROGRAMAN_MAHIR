package PersiapanUTS.ManajemenAntrianPelanggan;

public class Pelanggan {
    private String nama;
    private PrioritasAntrian prioritas;

    public Pelanggan(String nama, PrioritasAntrian prioritas){
        this.nama = nama;
        this.prioritas = prioritas;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public PrioritasAntrian getPrioritas() {
        return prioritas;
    }

    public void setPrioritas(PrioritasAntrian prioritas) {
        this.prioritas = prioritas;
    }

    @Override
    public String toString() {
        return ("Pelanggan" + nama + "Prioritas ( "+prioritas + " )");
    }
}
