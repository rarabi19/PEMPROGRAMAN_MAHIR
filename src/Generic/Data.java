package Generic;
// Simbol Generic "<T>" dimana huruf didalam tanda kurang lebih dari itu bebas
// Dimana "T" itu berarti tipe data dinamis, atau bisa String bisa juga Dinamis

public class Data<T , E> {
    private T data;

    private E data2;

    public E getData2() {
        return data2;
    }

    public void setData2(E data2) {
        this.data2 = data2;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
