package Shorting.BubleSort;
//Gunakan Looping Bersarang [nest looping]
//Pengurutan Assending

public class BubleSort {
    public static void main(String[] args) {
        int[] nilai = {35, 67, 1, 2, 56, 99, 70, 87, 12, 100};
        AngkaInt(nilai);

        double[] ipk = {3.5, 4.0, 2.5, 3.9, 3.7};
        AngkaDouble(ipk);

        String[] nama = {"Andi", "Budi", "Zahra", "Lana", "Jio", "Roy", "Yana", "Tarjo"};
        kataString(nama);

        char[] karakter = {'a','f','J', 'l','G', 'M', 'A', 'n','m'};
        hurufChar(karakter);
    }

    public static void AngkaInt(int[] bilangan) {
        System.out.println(" === SEBELUM ===");
        for (int a : bilangan) {
            System.out.print(a + " , ");
        }

        for (int i = 0; i < bilangan.length; i++) {
            for (int j = 0; j < bilangan.length - 1; j++) {

                if (bilangan[j] > bilangan[j + 1]) { //nilai saat ini lebih besar dari selanjutnya maka akan disimpan di nilai sementara
                    int tampungan = bilangan[j];
                    bilangan[j] = bilangan[j + 1];
                    bilangan[j + 1] = tampungan;
                }
            }
        }

        System.out.println(" \n === SESUDAH ===");
        for (int a : bilangan) {
            System.out.print(a + " , ");
        }
    }
    public static void AngkaDouble(double[] bil) {
        System.out.println("\n\n === SEBELUM ===");
        for (double b : bil) {
            System.out.print(b + " , ");

        }
        for(int i = 0 ; i < bil.length; i++){
            for (int j = 0; j < bil.length-1; j++){
                if (bil[j] > bil[j+1]){
                    double tampungan = bil[j];
                    bil[j] = bil[j+1];
                    bil[j+1] = tampungan;

                }
            }
        }
        System.out.println(" \n === SESUDAH ===");
        for (double b : bil) {
            System.out.print(b + " , ");
        }
    }

    public static void kataString(String[] kata){
        System.out.println("\n\n === SEBELUM ===");
        for (String c : kata) {
            System.out.print(c + " , ");
        }
        for (int i = 0; i < kata.length; i++) {
            for (int j = 0; j < kata.length - 1; j++) {
                if (kata[j].compareTo(kata[j + 1]) > 0) {
                    String tampungan = kata[j];
                    kata[j] = kata[j + 1];
                    kata[j + 1] = tampungan;
                }
            }
        }

        System.out.println("\n === SESUDAH ===");
        for (String c : kata) {
            System.out.print(c + " , ");
        }
    }
    public static void hurufChar(char[] huruf) {
        System.out.println("\n\n === SEBELUM ===");
        for (char d : huruf) {
            System.out.print(d + " , ");
        }
        for (int i = 0; i < huruf.length; i++) {
            for (int j = 0; j < huruf.length - 1; j++) {

                if (huruf[j] > huruf[j+1]){
                    char tampungan = huruf[j];
                    huruf[j] = huruf[j+1];
                    huruf[j+1] = tampungan;
            }
        }
      }
        System.out.println("\n === SESUDAH ===");
        for (char d : huruf) {
            System.out.print(d + " , ");
        }
    }
}
