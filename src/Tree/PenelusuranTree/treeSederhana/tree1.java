package Tree.PenelusuranTree.treeSederhana;

public class tree1 {
    class tree{
        int nilai;
        tree kiri, kanan;

        public tree(int item){
            nilai = item;
            kiri = kanan = null;
        }
    }
    class binarytree{
        tree root;
        binarytree(){
            root=null;
        }
    }
}

// Ciri- Ciri binary Tree :
//Setiap node memiliki child kiri dan/atau kanan.
//Tidak ada aturan khusus tentang urutan nilai pada setiap node.
