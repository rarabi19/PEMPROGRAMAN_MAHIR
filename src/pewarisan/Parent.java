package pewarisan;

//Sebuah Kelas dapat menurunkan seluruh atribut, prosedur, dan fungsi kekelas lain melalui sistem pewarisan
//parent  == setiap kelas dapat mewariskan kelebih dari satu kelas
//Child == namun setiap kelas hanya dapat mewarisi satu kelas
//dalam Java Pewarisan ini menggunkan istila --> "Extends"


public class Parent {
    private  String nama;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}
