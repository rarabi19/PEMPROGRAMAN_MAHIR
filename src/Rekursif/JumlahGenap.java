package Rekursif;

public class JumlahGenap {
    public static int BanyakBilangan(int n) {
        if (n <= 0) {
            return 0;
        }
        return (n % 2 == 0 ? 0 : 1) + BanyakBilangan(n - 1);
    }

    public static void main(String[] args) {
        int num = 10;
        System.out.println("Jumlah bilangan genap dari 1 sampai " + num + " adalah " + BanyakBilangan(num));
    }
}
