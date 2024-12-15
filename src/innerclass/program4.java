package innerclass;

public class program4 {
    public static void main(String[] args) {
        Mobil a = new Mobil();
        a.setNama("Toyota");

        Mobil.Motor b = a.new Motor(); // mengapa (a) agar , kita tidak perlu menulis terlalu panjang (static)
        b.setNama("Honda");

        System.out.println(a.getNama());
        System.out.println(b.getNama());
    }
}
