package Generic;
// Penulisannya :
// " namakelas<tipedata> inisiasi = new namakelas<tipedata>; "

public class program9 {
    public static void main(String[] args) {
        Data<String, String> a= new Data<>();
        a.setData("Haniva");
        System.out.println(a.getData());

        Data<Integer, String> b= new Data<>();
        b.setData(3);
        System.out.println(b.getData());

        Data<Double, Boolean> c = new Data<>();
        c.setData(5.4);
        c.setData2(true);
        System.out.println(c.getData());
        System.out.println(c.getData2());

        Data<Boolean, String> d = new Data<>();
        d.setData(false);
        d.setData2("Tak Taulah Aku");
        System.out.println(d.getData());
        System.out.println(d.getData2());
    }
}
