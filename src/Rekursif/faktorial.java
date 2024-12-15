package Rekursif;

public class faktorial {
    public static void main(String[] args) {
        int faktorial = 6;
        int hasil = getFactorial(faktorial);
        System.out.println(" Hasil Faktorial " + faktorial + " adalah = " + hasil);
    }
    public static int getFactorial(int f){
        if (f <= 1){
            return 1;
        }
        else {
            return f * getFactorial(f-1);
        }
    }
}