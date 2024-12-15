package Shorting.SelectionSort;
//Pengurutan Secara Desending


public class selectionSort {
    public static void main(String[] args) {
        int[] nilai = {90, 45, 23, 78, 80 , 100,40};
        bilanganInt(nilai);
    }
    public static void bilanganInt(int[] bilangan){
        System.out.println(" === SEBELUM ===");
        for (int b : bilangan){
            System.out.print(b + " , ");
        }

        for(int i = 0; i < bilangan.length; i++){
            int indexArray = i;
            for (int j = 1; j < bilangan.length; j++){
                if (bilangan[indexArray] < bilangan[j]){
                    indexArray = j;
                }
            }
            int tampungan = bilangan[i];
            bilangan[i] = bilangan[indexArray];
            bilangan[indexArray] = tampungan;
        }

        System.out.println("\n === SESUDAH ===");
        for (int b : bilangan) {
            System.out.print(b + " , ");
        }
    }
}
