package Rekursif;

public class JumlahBilangan {
    public static int jumlah(int n) {
        if (n <= 0) {
            return 0;
        }
        return n + jumlah(n - 1);
    }

    public static void main(String[] args) {
        int num = 5;
        System.out.println("Jumlah dari 1 sampai " + num + " adalah " + jumlah(num));
    }
}
