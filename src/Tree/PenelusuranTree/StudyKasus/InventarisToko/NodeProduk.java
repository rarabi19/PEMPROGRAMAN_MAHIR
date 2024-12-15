package Tree.PenelusuranTree.StudyKasus.InventarisToko;

class NodeProduk {
    int id;
    String nama;
    int stok;
    NodeProduk kiri, kanan;

    public NodeProduk(int id, String nama, int stok) {
        this.id = id;
        this.nama = nama;
        this.stok = stok;
        kiri = kanan = null;
    }
}


