package Shorting.MergeSort;

public class mergeSort {
    public static void main(String[] args) {
        int[] bil = {5, 1, 8, 10, 56, 7, 25};
        urutkan(bil);
    }

    public static void urutkan(int[] bilangan) {
        System.out.println(" === SEBELUM ===");
        for (int a : bilangan) {
            System.out.print(a + " , ");
        }
        bilangan = pisahInt(bilangan);

        System.out.println(" \n === SESUDAH ===");
        for (int a : bilangan) {
            System.out.print(a + " , ");
        }
    }

    public static int[] pisahInt(int[] bilangan) {
        if (bilangan.length <= 1) {
            return bilangan;
        }
        int median = bilangan.length / 2;
        int[] kiri = new int[median];
        int[] kanan;

        // Memecah array menjadi kiri dan kanan
        if (bilangan.length % 2 == 0) {
            kanan = new int[median];
        } else {
            kanan = new int[median + 1];
        }

        // Mengisi array kiri
        for (int i = 0; i < kiri.length; i++) {
            kiri[i] = bilangan[i];
        }

        // Mengisi array kanan, perbaikan ada di sini
        for (int i = 0; i < kanan.length; i++) {
            kanan[i] = bilangan[median + i];
        }

        // Pisahkan array secara rekursif
        kiri = pisahInt(kiri);
        kanan = pisahInt(kanan);

        // Gabungkan kembali array yang sudah diurutkan
        return gabungInt(kiri, kanan);
    }

    public static int[] gabungInt(int[] kiri, int[] kanan) {
        int[] hasilGabung = new int[kiri.length + kanan.length];

        int indexkiri = 0, indexkanan = 0, indexHasilGabung = 0;

        // Proses penggabungan dan pengurutan
        while (indexkiri < kiri.length || indexkanan < kanan.length) {
            if (indexkiri < kiri.length && indexkanan < kanan.length) {
                // Bandingkan elemen kiri dan kanan
                if (kiri[indexkiri] < kanan[indexkanan]) {
                    hasilGabung[indexHasilGabung] = kiri[indexkiri];
                    indexkiri++;
                } else {
                    hasilGabung[indexHasilGabung] = kanan[indexkanan];
                    indexkanan++;
                }
                indexHasilGabung++;
            } else if (indexkiri < kiri.length) {
                hasilGabung[indexHasilGabung] = kiri[indexkiri];
                indexkiri++;
                indexHasilGabung++;
            } else if (indexkanan < kanan.length) {
                hasilGabung[indexHasilGabung] = kanan[indexkanan];
                indexkanan++;
                indexHasilGabung++;
            }
        }
        return hasilGabung;
    }
}
