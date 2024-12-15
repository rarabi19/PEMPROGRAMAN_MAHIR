package enkapsulalasi;
// Enkapsulasi Berguna untuk Validasi Atribut/ Pengecekan Sebelum Atribut tersebut diambil
//Hal ini sering digunakan pada Java Beans
//Java Beans sendiri merupakan implementasi dari inkapsulasi
//Fungsi Atribut menggunakan "Get" dan "Set"
//Get == untuk mengambil  ---> getNamaAtribut
//Set == untuk mengubah ---> setNamaAtribut
//Pengecualian Boolean  ---> isNamaAtribut

public class Manusia {
    private String nama;
    public void ubahNama( String nama){
        if(nama == null){
            System.out.println("Null itu bukan nama Woi! ");
        } else if (nama.isEmpty()) {
            System.out.println("Nama Tidak Boleh Kosong Woi! ");
        } else {
            this.nama = nama;
        }
    }
    public String tanyaNama(){
        if (this.nama == null){
            return "Isilah Nama Anda dengan Benar Anak Muda";
        }else {
            return this.nama;
        }
    }
}
