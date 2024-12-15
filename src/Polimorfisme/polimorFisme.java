package Polimorfisme;
//Penggunaan Polimorfisme dapat kita gunakan dalam java Generic
// dalam Generic kita menggunakna istilah "<T>" yang menandakan semua tipe data bisa masuk
//Tapi dengan menggunakna Polimorfisme kita bisa membatasi data apa saja yang diperbolehkan untuk masuk
// Jika menggunkan extands parent child kita bisa mengakses method dan fungsi yang ada di parent di class Generic

public class polimorFisme<T extends parent3> {
    private T data;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
