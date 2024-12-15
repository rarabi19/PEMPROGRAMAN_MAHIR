package Queue.ContohCodeQueue.PembelianTiket;
public class Penumpang implements Comparable<Penumpang> {
    private final String namaPenumpang;
    private final String Tujuan;
    private final int Biaya;

    public Penumpang(String namaPenumpang, String tujuan, int biaya) {
        this.namaPenumpang = namaPenumpang;
        this.Tujuan = tujuan;
        this.Biaya = biaya;
    }

    @Override
    public String toString() {
        return "* | namaPenumpang  : " + namaPenumpang + ", Tujuan='" + Tujuan + ", Biaya=" + Biaya ;
    }

    @Override
    public int compareTo(Penumpang o) {
        return Integer.compare(o.Biaya, this.Biaya) ;
    }
}
