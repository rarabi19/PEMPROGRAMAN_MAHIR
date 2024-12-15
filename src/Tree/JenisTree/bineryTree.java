package Tree.JenisTree;

public class bineryTree {
           Node root;

        public void insert(Node node) {

            root = insertHelper(root, node);
        }
        private Node insertHelper(Node root, Node node) {

            int data = node.data;

            if(root == null){
                root = node;
                return root;
            }
            else if(data < root.data) {
                root.left = insertHelper(root.left, node);
            } else {
                root.right = insertHelper(root.right, node);

            }

            return root;
        }

        public void display() {
            displayHelper(root);
        }
        private void displayHelper(Node root) {

            if(root != null) {
                displayHelper(root.right);
                System.out.println(root.data);
                displayHelper(root.left);

            }
        }

        public boolean search(int data) {
            return searchHelper(root, data);
        }
        private boolean searchHelper(Node root, int data) {
            if(root == null) {
                return false;
            }
            else if(root.data == data) {
                return true;
            }
            else if(root.data > data) {
                return searchHelper(root.left, data);
            }
            else {
                return searchHelper(root.right, data);
            }
        }

        public void remove(int data) {

            if(search(data)) {
                removeHelper(root, data);
            }
            else {
                System.out.println(data + " tidak ditemukan");
            }
        }
        private Node removeHelper(Node root, int data) {
            if(root == null) {
                return root;// jika tree kosong akan kembali ke null
            }
            else if(data < root.data) {
                // jika data yang ingin dihapus lebih kecil, maka akan   encari ke subtree kiri
                root.left = removeHelper(root.left, data);
            }
            else if(data > root.data) {
                //jika data yang ingin dihapus lebih besar, maka akan   encari ke subtree kanan
                root.right = removeHelper(root.right, data);
            }
            else { //node ditemukan
                if(root.left == null && root.right == null) {
                    root = null;
                }
                else if(root.right != null) { //mencari successor untuk mengganti node
                    root.data = successor(root);
                    root.right = removeHelper(root.right, root.data);
                }
                else { //mencari predecessor utk menggantikan node
                    root.data = predecessor(root); // untuk mengganti node dengan nilai successor
                    root.left = removeHelper(root.left, root.data);// menghapus successor dari sub tree kanan
                }
            }
            return root; // di sisni akan di kembalikan ke node yang sudah diperbarui
        }

        private int successor(Node root) { //mencari nilai terkecil dibawah child kanan dari root
            root = root.right;
            while(root.left != null){
                root = root.left;
            }
            return root.data;
        }

        private int predecessor(Node root) { //mencari nilai terbesar dibawah child kiri dari root
            root = root.left;
            while(root.right != null){
                root = root.right;
            }
            return root.data;
        }
    }

