package UTS_PEMROGRAMANMAHIR;

public class Data {
    private String Nama;
    private  String NomorID;
    private String Spesialisasi;
    private  String Tempat;
    private jenisKelamin jenis;

    public Data(String Nama, String NomorID, String Spesialisasi, String Tempat, jenisKelamin jenis){
        this.Nama = Nama;
        this.NomorID = NomorID;
        this.Spesialisasi = Spesialisasi;
        this.Tempat = Tempat;
        this.jenis = jenis;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String nama) {
        Nama = nama;
    }

    public String getNomorID() {
        return NomorID;
    }

    public void setNomorID(String nomorID) {
        NomorID = nomorID;
    }

    public String getSpesialisasi() {
        return Spesialisasi;
    }

    public void setSpesialisasi(String spesialisasi) {
        Spesialisasi = spesialisasi;
    }

    public String getTempat() {
        return Tempat;
    }

    public void setTempat(String tempat) {
        Tempat = tempat;
    }

    public jenisKelamin getJenis() {
        return jenis;
    }

    public void setJenis(jenisKelamin jenis) {
        this.jenis = jenis;
    }

    @Override
    public String toString() {
        return ("*| Nama Dokter : " + Nama + ", Nomor ID : " + NomorID + " , Spesialisasi :" + Spesialisasi + "Tempat Paktik : " + Tempat + ", Jenis Kelamin :" + jenis);
    }
}
