package KelasEnum;


public class program {
    public static void main(String[] args) {
        Orang a = new Orang();
        a.nama = "Zahra";
        a.jenisKelamin = JenisKelamin.wanita;
        a.alamat = "JL. Adam Malik No.115, Sumatra Barat";


        Orang b = new Orang();
        b.nama = "Dion";
        b.jenisKelamin = JenisKelamin.Pria;
        b.alamat = "JL. Adam Malik No.115, Sumatra Barat";

        System.out.println("=====================================================");
        a.tampilkandata();
        System.out.println("=====================================================");
        b.tampilkandata();
        System.out.println("=====================================================");
    }
}
