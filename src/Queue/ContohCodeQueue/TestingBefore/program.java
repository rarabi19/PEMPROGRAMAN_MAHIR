package Queue.ContohCodeQueue.TestingBefore;

public class program extends UrutanBimbingan {
    public static void main(String[] args) {
        SiswaQue[] que = new SiswaQue[]{

                new SiswaQue("Zahra Aulia", "1234567890", 85.5),
                new SiswaQue("Dina Pratiwi", "1234567891", 90.0),
                new SiswaQue("Lara Indah", "1234567892", 88.0),
                new SiswaQue("Joko Santoso", "1234567893", 92.0),
                new SiswaQue("Budi Setiawan", "1234567894", 65.0),
                new SiswaQue("Arini Fadila", "1234567895", 78.5),
                new SiswaQue("Fajar Alamsyah", "1234567896", 91.0),
                new SiswaQue("Siti Nurjanah", "1234567897", 87.0),
                new SiswaQue("Rudi Hidayat", "1234567898", 82.5),
                new SiswaQue("Clara Rachmawati", "1234567899", 79.0),
        };
        Antrian1.addFirst(new SiswaQue("Haniva Azzahra","12350123200",100.0));
        Antrian1.add(new SiswaQue("Muslihul Kairil","12350123100",90.0));

        for (SiswaQue a : que) {
            Antrian1.add(a);
        }
        for (SiswaQue a : que) {
            Antrian2.add(a);
        }
        TampilkAntrian1();
        TampilkanAntrian2();

        for (int i = 0; i < 5; i++) {
            try {
                Antrian3.put(que[i]);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        TampilkanAntrian3();

        new Thread(() -> {
            for (int i = 5; i < que.length; i++) {
                try {
                    SiswaQue removed = Antrian3.take();
                    System.out.println("\n====== Menghapus Data: " + removed);

                    Antrian3.put(que[i]);
                    System.out.println(" ====== Update Data baru: " + que[i]);

                    TampilkanAntrian3();
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
}

