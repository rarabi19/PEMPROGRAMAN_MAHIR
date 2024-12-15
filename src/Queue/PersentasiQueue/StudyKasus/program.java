package Queue.PersentasiQueue.StudyKasus;

public class program extends SususnanAtrian {
    public static void main(String[] args) {
        Mahasiswa[] msw = new Mahasiswa[]{
                new Mahasiswa("Zahra Aulia","1234567890",85.5),
                new Mahasiswa("Dina Pratiwi","1234567891",90.0),
                new Mahasiswa("Lara Indah","1234567892",88.0),
                new Mahasiswa("Joko Antoso","1234567893",92.0),
                new Mahasiswa("Budi Setiwan","1234567894",65.0),
                new Mahasiswa("Arini Fadila","1234567895",78.5),
                new Mahasiswa("Fajar Alamsyah","1234567896",91.0),
                new Mahasiswa("Siti Nujanah","1234567897",87.0),
                new Mahasiswa("Rudi Hidayat ","1234567898" ,82.5),
                new Mahasiswa("Clara Rachmawati", "1234567899",79.0)
        };
        for (Mahasiswa a : msw){
            antrian1.add(a);
        }
        for (Mahasiswa a : msw){
            antrian2.add(a);
        }
        for (Mahasiswa a : msw){
            antrian3.offer(a);
        }

        antrian1.add(new Mahasiswa("Muslihul Khairil","1234567890", 80.0));
        antrian1.addFirst(new Mahasiswa("Haniva Azzahra Salsanila","12350123200",100.0));
        System.out.println("\nData Dihapus  :" + antrian1.pollLast());


        TampilkanAntrian1();
        TampilkanAntrian2();
        TampilkanAntrian3();

        Thread t = new Thread(() ->{
            for (int i = 5 ; i < msw.length; i++){
                try {

                    Mahasiswa hapus = antrian3.take();
                    System.out.println("\nData Dihapus      : " + hapus);

                    antrian3.put(msw[i]);
                    System.out.println("Data Ditambahkan  : "+ msw[i]);

                    Thread.sleep(2000);
                    TampilkanAntrian3();


                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

        });
        t.start();
    }
}
