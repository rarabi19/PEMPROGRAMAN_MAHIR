package Shorting.QuickSort;

public class QuickShort {
    public static void main(String[] args) {
        int[] nilai = {25,89,46,76,2,5,88,1,95,66};
        quickShort(nilai);
    }
    public static void quickShort(int [] angka){
        System.out.println("=== SEBELUM ===");
        for (int a : angka) {
            System.out.print(a + " ");
        }

        quickShortAlgoritm(angka, 0, angka.length - 1);

        System.out.println("\n === SESUDAH ===");
        for (int a : angka){
            System.out.print(a + " ");
        }
    }
    public static void quickShortAlgoritm(int [] angka , int indexAwal , int indexAkhir) {
    int i = indexAwal , j = indexAkhir, pivot = angka[indexAwal];

        while (i <= j) {
            while (angka[i] < pivot) {
                i++;
            }while (angka[j] > pivot){
                j--;
            }
            if (i <= j) {
                int tampungan = angka[i];
                angka[i] = angka[j];
                angka[j] = tampungan;
                i++;
                j--;
            }
         }
        if (indexAwal < j){
            quickShortAlgoritm(angka, indexAwal, j);
        }if (i < indexAkhir){
            quickShortAlgoritm(angka, i, indexAkhir);
        }
    }
}

