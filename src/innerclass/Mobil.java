package innerclass;
//innerclass == kelas yang berada didalam kelas lain (satu kelas)


public class Mobil {
    private  String nama;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public class Motor {
        private String nama;

        public String getNama() {
            return nama;
        }

        public void setNama(String nama) {
            this.nama = nama;
        }
    }

}
