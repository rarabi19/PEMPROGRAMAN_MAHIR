package Stack;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Mahasiswa> tumpuk = new Stack<>();

        Mahasiswa mhs1 = new Mahasiswa("Haniva","JL. Adam Malik No. 115","082235565349");
        Mahasiswa mhs2 = new Mahasiswa("Azzahra","JL. Jenderal Sudirman No. 15","082235565349");
        Mahasiswa mhs3 = new Mahasiswa("Salsabila","JL. Ahmad Yani No.35","082235565349");
        Mahasiswa mhs4 = new Mahasiswa("Azzahra","JL. Soepomo No.65","082235565349");
        Mahasiswa mhs5 = new Mahasiswa("Haniva","JL. Sukarni No.225","082235565349");

        Stack<Mahasiswa> data = new Stack<>();
        data.push(mhs1);
        data.push(mhs2);
        data.push(mhs3);
        data.push(mhs4);
        data.push(mhs5);
        lihatData(data);

        Mahasiswa pop1 = data.pop();
        lihatData(data);

        data.pop();
        lihatData(data);
    }

    public static void lihatData(Stack<Mahasiswa> tumpuk) {
        for (Mahasiswa a : tumpuk){
            System.out.println(a);
        }
        System.out.println();
    }
}
