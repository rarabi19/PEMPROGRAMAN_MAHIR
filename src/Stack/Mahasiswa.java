package Stack;

public class Mahasiswa {
    private String nama;
    private String alamat;
    private String noTelpn;
    private Integer jumlah;

    public Mahasiswa(String nama, String alamat, String noTelpn){
        this.nama = nama;
        this.alamat = alamat;
        this.noTelpn = noTelpn;

    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNoTelpn() {
        return noTelpn;
    }

    public void setNoTelpn(String noTelpn) {
        this.noTelpn = noTelpn;
    }
    @Override
    public String toString() {
        return "* | Nama : " + nama + " ,Alamat " + alamat + " ,No Telpn : " + noTelpn;
    }
}

