package PersiapanUTS.InventarisBuku;

import java.util.*;

public class InventarisBuku <T extends Buku> {
    private List<T> add = new ArrayList<>();

    public void tambahkan (T book){
        add.add(book);
        System.out.println("* | ISBN : " + book.getISBN() + ", Pengarang : " + book.getPengarang() + ", Judul : " + book.getJudul()
        + ", Tahun Terbit : " + book.getTahunTerbit() + ", Penerbit : " + book.getPenerbit() + " , Harga :" + book.getHarga() + " , Kategori : " + book.getKategori());
    }
    public void tampilkanBuku(){
        for (T book : add){
            System.out.println(book);
        }

    }
    public void urutkanBuku() {
        Collections.sort(add, new Comparator<T>() {
            @Override
            public int compare(T o1, T o2) {
                return o1.getPengarang().compareTo(o2.getPengarang());
            }
        });
    }
    public void hapusBuku(String isbn) {
        add.removeIf(book -> book.getISBN().equals(isbn));
    }
    public double totalHarga(int index) {
        if (index == add.size()) return 0;
        return add.get(index).getHarga() + totalHarga(index + 1);
        }
    }
