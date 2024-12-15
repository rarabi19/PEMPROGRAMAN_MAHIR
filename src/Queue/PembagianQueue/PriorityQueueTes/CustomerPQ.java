package Queue.PembagianQueue.PriorityQueueTes;

public class CustomerPQ implements Comparable<CustomerPQ> {
    private Integer idPembeli;
    private double jumlah;
    private String namaPembeli;

    public CustomerPQ(Integer idPembeli, double jumlah, String namaPembeli) {
        this.idPembeli = idPembeli;
        this.jumlah = jumlah;
        this.namaPembeli = namaPembeli;
    }

    public Integer getIdPembeli() {
        return idPembeli;
    }

    public void setIdPembeli(Integer idPembeli) {
        this.idPembeli = idPembeli;
    }

    public double getJumlah() {
        return jumlah;
    }

    public void setJumlah(double jumlah) {
        this.jumlah = jumlah;
    }

    public String getNamaPembeli() {
        return namaPembeli;
    }

    public void setNamaPembeli(String namaPembeli) {
        this.namaPembeli = namaPembeli;
    }

    @Override
    public String toString() {
        return "\n *| Nama Pembeli ='" + namaPembeli + ", ID Pembeli=" + idPembeli +  ", Total Harga =" + jumlah;
    }

    @Override
    public int compareTo(CustomerPQ o) {
        return o.idPembeli > this.idPembeli ? 1 : -1;
    }
}
