package Tree.JenisTree;
//InOrder = ???
//PreOrder = ???
//PostOrder = ???

public class program {
    public static void main(String[] args) {
        bineryTree tree = new bineryTree();


                tree.insert(new Node(5));
                tree.insert(new Node(1));
                tree.insert(new Node(9));
                tree.insert(new Node(7));
                tree.insert(new Node(2));
                tree.insert(new Node(6));
                tree.insert(new Node(3));
                tree.insert(new Node(4));
                tree.insert(new Node(8));

                tree.remove(0);
                tree.display();

                System.out.println(tree.search(8));
            }
        }