package PersiapanUTS.ManajemenAntrianPelanggan;

public class programAntrian {
    public static void main(String[] args) {
        AntrianPelanggan<Pelanggan> antrian = new AntrianPelanggan<>();

        System.out.println();
        System.out.println("======= MENAMPILAN ANTRIAN PEMBELI ======-");
        antrian.tambahAntrian(new Pelanggan("Zahra",PrioritasAntrian.TERAKHIR));
        antrian.tambahAntrian(new Pelanggan("Aisa",PrioritasAntrian.NORMAL));
        antrian.tambahAntrian(new Pelanggan("Azra",PrioritasAntrian.PENDAHULU));
        antrian.tambahAntrian(new Pelanggan("Laila",PrioritasAntrian.PENDAHULU));
        antrian.tambahAntrian(new Pelanggan("Kirana",PrioritasAntrian.NORMAL));
        antrian.tambahAntrian(new Pelanggan("Jane",PrioritasAntrian.TERAKHIR));
        antrian.tambahAntrian(new Pelanggan("Diana",PrioritasAntrian.PENDAHULU));
        antrian.tambahAntrian(new Pelanggan("Lalisa",PrioritasAntrian.TERAKHIR));
        antrian.tambahAntrian(new Pelanggan("Wina",PrioritasAntrian.NORMAL));
        antrian.tambahAntrian(new Pelanggan("Yohana",PrioritasAntrian.NORMAL));

        antrian.tampilkanAntrian();
        System.out.println("==== Terimakasih Telah Berkunjung ====");
    }
}
