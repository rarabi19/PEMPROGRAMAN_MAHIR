package Tree.PenelusuranTree.StudyKasus.InventarisToko;

public class ManajemenInventaris {
    public static void main(String[] args) {
        InventarisBST inventaris = new InventarisBST();

        // Menambah produk
        inventaris.tambah(1001, "Laptop", 10);
        inventaris.tambah(1003, "Mouse", 50);
        inventaris.tambah(1002, "Keyboard", 30);

        // Menampilkan inventaris
        System.out.println("Inventaris dalam urutan terurut:");
        inventaris.tampilkanInOrder();

        // Mencari produk
        int idCari = 1002;
        NodeProduk ditemukan = inventaris.cari(idCari);
        if (ditemukan != null) {
            System.out.println("\nProduk ditemukan: " + ditemukan.nama + " dengan stok: " + ditemukan.stok);
        } else {
            System.out.println("\nProduk dengan ID " + idCari + " tidak ditemukan.");
        }

        // Menghapus produk
        inventaris.hapus(1003);
        System.out.println("\nInventaris setelah penghapusan:");
        inventaris.tampilkanInOrder();
    }
}

