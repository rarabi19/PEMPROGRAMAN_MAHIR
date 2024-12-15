package Queue.ContohCodeQueue.AntrianBimbingan;

public class Program extends susunanAntrian{
    public static void main(String[] args) {

        Mahasiswa[] Que = new Mahasiswa[]{
                new Mahasiswa("Haniva Azzahra", "12350123200", 100.0),
                new Mahasiswa("Dina Pertiwi", "12350123201", 98.0),
                new Mahasiswa("Arya Anugrah", "12350123202", 95.0),
                new Mahasiswa("Dhinny Annisa", "12350123203", 90.0),
                new Mahasiswa("An-Nisa", "12350123204", 85.0),
                new Mahasiswa("Azka Syafitri", "12350123205", 80.0),
                new Mahasiswa("Rosyidah Asarunnisa", "12350123206", 77.0),
                new Mahasiswa("Zahra Aulia", "12350123207", 95.0),
                new Mahasiswa("Zahra Aulia", "12350123208", 91.0),
                new Mahasiswa("Azka Syafitri", "12350123209", 88.0)
        };
        // Menambahkan data mahasiswa ke dalam ketiga antrian :
       for (Mahasiswa mhs :Que){
           antrian1.add(mhs);
       }
       for (Mahasiswa mhs : Que){
           antrian2.add(mhs);
       }
       for (Mahasiswa mhs : Que){
           antrian3.add(mhs);
       }
       for (Mahasiswa mhs : Que){
           antrian4.offer(mhs);
       }

        antrian1.add(new Mahasiswa("Joko Susanto","12350123400",56.5));
       antrian2.addLast(new Mahasiswa("Zizi Anindi","12340123450",87.6));

        tampilkanAntrian1();
        tampilkanAntrian2();
        tampilkanAntrian3();
        tampilkanAntrian4();
    }
}
