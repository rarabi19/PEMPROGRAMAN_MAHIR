package Tree.PenelusuranTree.StudyKasus.InventarisToko;

// Kelas Binary Search Tree untuk mengelola inventaris
class InventarisBST {
    NodeProduk akar;

    // Menambah produk baru ke dalam pohon
    public void tambah(int id, String nama, int stok) {
        akar = tambahRekursif(akar, id, nama, stok);
    }

    // Metode rekursif untuk menambah produk
    private NodeProduk tambahRekursif(NodeProduk akar, int id, String nama, int stok) {
        if (akar == null) {
            akar = new NodeProduk(id, nama, stok);
            return akar;
        }

        if (id < akar.id) {
            akar.kiri = tambahRekursif(akar.kiri, id, nama, stok);
        } else if (id > akar.id) {
            akar.kanan = tambahRekursif(akar.kanan, id, nama, stok);
        }
        return akar;
    }

    // Mencari produk berdasarkan ID
    public NodeProduk cari(int id) {
        return cariRekursif(akar, id);
    }

    private NodeProduk cariRekursif(NodeProduk akar, int id) {
        if (akar == null || akar.id == id) {
            return akar;
        }
        if (id < akar.id) {
            return cariRekursif(akar.kiri, id);
        }
        return cariRekursif(akar.kanan, id);
    }

    // Menghapus produk berdasarkan ID
    public void hapus(int id) {
        akar = hapusRekursif(akar, id);
    }

    private NodeProduk hapusRekursif(NodeProduk akar, int id) {
        if (akar == null) {
            return akar;
        }

        // Menelusuri pohon untuk menemukan node yang akan dihapus
        if (id < akar.id) {
            akar.kiri = hapusRekursif(akar.kiri, id);
        } else if (id > akar.id) {
            akar.kanan = hapusRekursif(akar.kanan, id);
        } else {
            // Node dengan satu anak atau tanpa anak
            if (akar.kiri == null) {
                return akar.kanan;
            } else if (akar.kanan == null) {
                return akar.kiri;
            }

            // Node dengan dua anak: Dapatkan penerus inorder (terkecil di subtree kanan)
            akar.id = nilaiMinimum(akar.kanan);
            akar.kanan = hapusRekursif(akar.kanan, akar.id);
        }
        return akar;
    }

    private int nilaiMinimum(NodeProduk akar) {
        int nilaiMin = akar.id;
        while (akar.kiri != null) {
            nilaiMin = akar.kiri.id;
            akar = akar.kiri;
        }
        return nilaiMin;
    }

    // Penelusuran inorder untuk menampilkan produk dalam urutan terurut
    public void tampilkanInOrder() {
        tampilkanInOrderRekursif(akar);
    }

    private void tampilkanInOrderRekursif(NodeProduk akar) {
        if (akar != null) {
            tampilkanInOrderRekursif(akar.kiri);
            System.out.println("ID: " + akar.id + ", Nama: " + akar.nama + ", Stok: " + akar.stok);
            tampilkanInOrderRekursif(akar.kanan);
        }
    }
}