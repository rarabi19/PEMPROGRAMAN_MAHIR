package UTS_PEMROGRAMANMAHIR;


import java.util.Comparator;

public class Database {
    public static void main(String[] args) {
        RumahSakit<Data> add = new RumahSakit<>();

        add.tambahData(new Data("DR. Andi Suryanto", "ID1234567890","Dokter Umum","RS Cinta Sehat Jakarta", jenisKelamin.Pria));
        add.tambahData(new Data("DR. Maria Widodo", "ID9876543210","Spesialis Anak","Klinik Tumbuh Kembang", jenisKelamin.Wanita));
        add.tambahData(new Data("DR. Budi Santoso", "ID1122334455","Spesialis Jantung","RS Jantung Sehat Jakarta", jenisKelamin.Pria));
        add.tambahData(new Data("DR. Clara Tan", "ID22334445566","Spesialis Mata","RS Klinik Optik Indah", jenisKelamin.Wanita));
        add.tambahData(new Data("DR. Fadil Anwar", "ID3344556677","Spesialis Bedah","RS Sakit Hati Surabaya", jenisKelamin.Pria));
        add.tambahData(new Data("DR. Rina Harahap", "ID4455667788","Spesialis Gigi","RS Klinik Gigi Sehat", jenisKelamin.Wanita));
        add.tambahData(new Data("DR. Iwan Setiawan", "ID5566778899","Spesialis THT","RS Telinga Sehat Bandung", jenisKelamin.Pria));
        add.tambahData(new Data("DR. Linda Sari", "ID7788990011","Spesialis Kulit","Klinik Kulit Cerah", jenisKelamin.Wanita));
        add.tambahData(new Data("DR. Hendra Nugroho", "ID8899001122","Spesialis Saraf","RS Saraf Sehat Makasar", jenisKelamin.Pria));
        add.tambahData(new Data("DR. Dewi Ariani", "ID8899001122","Spesialis Kandungan","Klinik Ibu dan Anak Surabaya", jenisKelamin.Wanita));
        add.tambahData(new Data("DR. Agus Pramudito", "ID9900112233","Spesialis Orthopedi","RS Otophedi Medika Bali", jenisKelamin.Pria));
        add.tambahData(new Data("DR. Nia Saraswati", "ID1011122334","Spesialis Rehabilitasi Medik","Klinik Rehap Sehat Jakarta", jenisKelamin.Wanita));

        System.out.println("======================================================================");
        System.out.println();
        add.urutkanDokter();
    }
}
