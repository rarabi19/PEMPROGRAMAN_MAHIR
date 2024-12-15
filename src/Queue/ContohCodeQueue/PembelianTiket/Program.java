package Queue.ContohCodeQueue.PembelianTiket;

public class Program extends TiketTransportasi {
    public static void main(String[] args) {
        Penumpang[] tiket = new Penumpang[]{
                new Penumpang("Dino", "Pasar Suka Karya", 35000),
                new Penumpang("Dina", "Rumah sakit Suka Gila", 80000),
                new Penumpang("Tina", "Rumah Makan Suka Jadi", 65000),
                new Penumpang("Lina", "TK Cinta Mama", 97000),
                new Penumpang("Rina", "SMA Suka Suka", 20000),
                new Penumpang("Cika", "Rumah Sakit Ayah Bunda", 45000),
        };

        for (Penumpang a : tiket) {
            terminal1.add(a);
        }
        for (Penumpang a: tiket){
            terminal2.add(a);
        }
        for (Penumpang a: tiket){
            terminal3.offer(a);
        }
        for (Penumpang a: tiket){
            terminal4.offer(a);
        }
        tampilkanterminal1();
        tampilkanterminal2();
        tampilkanterminal3();
        tampilkanterminal4();
    }
}
