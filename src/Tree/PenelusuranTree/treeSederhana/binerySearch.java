package Tree.PenelusuranTree.treeSederhana;

class node {
    int key;
    node left, right;

    public node(int item) {
        key = item;
        left = right = null;
    }
}

class BinarySearchTree {
    node root;

    BinarySearchTree() {
        root = null;
    }

    // Method untuk menambahkan node ke BST
    void insert(int key) {
        root = insertRec(root, key);
    }

    // Fungsi rekursif untuk menambahkan node baru ke dalam tree
    node insertRec(node root, int key) {
        if (root == null) {
            root = new node(key);
            return root;
        }

        if (key < root.key)
            root.left = insertRec(root.left, key);
        else if (key > root.key)
            root.right = insertRec(root.right, key);

        return root;
    }
}
