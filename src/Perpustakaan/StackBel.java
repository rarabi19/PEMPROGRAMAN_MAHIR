package Perpustakaan;

import java.time.LocalDate;
import java.util.Stack;

public class StackBel {
    public static void main(String[] args) {

    Buku tmp1 = new Buku("12350123200","Zahra Aja","Belajar Berfikir Seperti Zahra", LocalDate.of(2020,10,1),"Zahra Store");
    Buku tmp2 = new Buku("12350123200","Zahra Lagi ","Jangan Berharap Pada Dunia", LocalDate.of(2019,9,15),"Zahra Store");
    Buku tmp3 = new Buku("12350123200","Always Zahra","Ayah mengapa adikku Berbeda", LocalDate.of(2017,11,26),"Zahra Store");
    Buku tmp4 = new Buku("12350123200","Azzahra lalagi","Nenekku Menikah Lagi", LocalDate.of(2022,3,17),"Zahra Store");

        Stack<Buku> ambildata = new Stack<>();
        ambildata.push(tmp1);
        ambildata.push(tmp2);
        ambildata.push(tmp3);
        ambildata.push(tmp4);
        lihatDataAntrian(ambildata);

        // Mengambil item dari stack ambildata
        ambildata.pop();
        lihatDataAntrian(ambildata);

        ambildata.pop();
        lihatDataAntrian(ambildata);

        ambildata.pop();
        lihatDataAntrian(ambildata);

//        for (Buku a : ambildata) {
//            System.out.println(" \n === Sisa Buku === ");
//            System.out.println(a);
//        }

    }
    public static void lihatDataAntrian(Stack<Buku> stack) {
        System.out.println("\n Isi antrian buku saat ini:");
        for (Buku buku : stack) {
            System.out.println(buku);
        }
    }
}