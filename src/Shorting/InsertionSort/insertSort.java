package Shorting.InsertionSort;

public class insertSort {
    public static void main(String[] args) {
      int[] nilai = {80,45,95,35,89,30,100,20};
      pengurutan(nilai);
    }
    public static void pengurutan (int[] bil){
        System.out.println(" === SEBELUM ===");
        for (int a : bil){
            System.out.print(a + " , ");
        }
        for (int i = 1; i < bil.length; i++ ){
            for (int j = i; j > 0 ; j--){
                if (bil[j] < bil[j-1] ) {

                    int tampungan = bil[j];
                    bil[j] = bil[j-1];
                    bil[j-1] = tampungan;
                }
            }
        }
        System.out.println(" \n === SESUDAH ===");
        for (int a : bil) {
            System.out.print(a + " , ");
        }
    }
}
