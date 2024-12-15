package Rekursif;

public class PengulanganPesan {
    public static String ulangKata(String pesan, int n) {
        if (n <= 0) {
            return "";
        }
        System.out.println(pesan);
        return ulangKata(pesan, n - 1);
    }

    public static void main(String[] args) {
        String pesan = "Mengapa Kau Tolak Cintaku Tarjo ";
        int times = 1000;
        System.out.println(ulangKata(pesan, times));
    }
}
