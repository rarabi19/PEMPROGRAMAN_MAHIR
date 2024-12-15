package enkapsulasiJavaBeans;

public class program3 {
    public static void main(String[] args) {
        Binatang a = new Binatang();
        a.setNama("Anjing");
        a.setJenis("Binatang");
        a.setJumlahKaki(4);
        a.setJumlahTangan(0);
        a.setKawin(false);

        System.out.println(a.getJenis());
        System.out.println(a.getNama());
        System.out.println(a.getJumlahKaki());
        System.out.println(a.getJumlahTangan());
        System.out.println(a.isKawin());
    }
}
