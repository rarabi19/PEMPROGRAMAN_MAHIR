package Queue.PembagianQueue.AntrianQueue;
//jenis antrian yang mendukung operasi blocking untuk mengambil dan menambahkan elemen.
//ketika antrean kosong, thread yang mencoba mengambil elemen akan diblokir hingga elemen tersedia.
// Methode utama : put(), take(), offer(), poll()
//data yang diambil selalu data awal


public class QueueExample {
    private static String[] buah = new String[3]; // Array untuk menampung elemen Queue
    private static int front = -1;  // Menunjukkan indeks pertama (front)
    private static int rear = -1;   // Menunjukkan indeks terakhir (rear)

    // Metode untuk menambahkan elemen ke dalam queue
    public static void enqueue(String item) {
        if (rear == buah.length - 1) {
            System.out.println("Queue penuh, tidak bisa menambahkan elemen.");
        } else {
            if (front == -1) {
                front = 0; // Inisialisasi front saat elemen pertama dimasukkan
            }
            buah[++rear] = item; // Tambahkan item di posisi rear
        }
    }

    // Metode untuk mengeluarkan elemen dari queue (FIFO)
    public static String dequeue() {
        if (front == -1 || front > rear) {
            System.out.println("Queue kosong.");
            return null;
        } else {
            String item = buah[front];
            front++; // Menggeser front untuk mengeluarkan elemen
            return item;
        }
    }

    // Menampilkan elemen-elemen yang ada di dalam queue
    public static void tampilkanQueue() {
        if (front == -1 || front > rear) {
            System.out.println("Queue kosong.");
        } else {
            for (int i = front; i <= rear; i++) {
                System.out.println(buah[i]);
            }
        }
    }

    public static void main(String[] args) {
        // Menambahkan elemen ke dalam queue
        enqueue("Apel");
        enqueue("Mangga");
        enqueue("Melon");

        // Menampilkan elemen yang ada dalam queue
        System.out.println("Isi Queue:");
        tampilkanQueue();

        // Mengeluarkan elemen dari queue
        System.out.println("Elemen yang dikeluarkan: " + dequeue());
        System.out.println("Elemen yang dikeluarkan: " + dequeue());

        // Menampilkan elemen sisa dalam queue
        System.out.println("Isi Queue setelah dequeue:");
        tampilkanQueue();
    }
}
