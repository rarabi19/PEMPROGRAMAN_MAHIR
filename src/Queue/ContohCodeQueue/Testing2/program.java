package Queue.ContohCodeQueue.Testing2;

public class program extends AntrianBimbingan {
    public static void main(String[] args) {
        murid[] mrd = new murid[] {
                new murid("Zahra Aulia","1234567890",85.5),
                new murid( "Dina Pratiwi","1234567891",90.0),
                new murid("Lara Indah","1234567892",88.0),
                new murid( "Joko Antoso","1234567893",92.0),
                new murid("Budi Setiwan","1234567894",65.0),
                new murid("Arini Fadila","1234567895",78.5),
                new murid("Fajar Alamsyah","1234567896",91.0),
                new murid("Siti Nujanah","1234567897",87.0),
                new murid( "Rudi Hidayat","1234567898",82.5),
                new murid("Clara Rachmawati", "1234567899",79.0)

        };

        for (murid a : mrd){
            antrian1.add(a);
        }
        for (murid a : mrd){
            antrian2.offer(a);
        }
        for (murid a : mrd){
            antrian3.offer(a);
        }

        antrian1.addFirst(new murid("Haniva Azzahra Salsabila","12350123200",100.0));
        antrian1.add(new murid("Muslihul Khairil","12350123150",89.0));
        System.out.println("\n Data Dihapus : " + antrian1.pollLast());

        TampilkanAntrian1();
        TampilkanAntrian2();

        Thread t = new  Thread(() -> {
            for (int i = 5; i < mrd.length; i++){
                try {

                    murid hapus = antrian3.take();
                    System.out.println("\n Data Dihapus     :" + hapus);

                    antrian3.put(mrd[i]);
                    System.out.println(" Data Ditambahkan :" + mrd[i]);

                    Thread.sleep(3000); //3 detik
                    TampilkanAntrian3();

                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        t.start();
    }
}
