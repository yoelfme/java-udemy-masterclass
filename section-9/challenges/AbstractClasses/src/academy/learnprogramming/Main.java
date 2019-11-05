package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
//        MyLinkedList list = new MyLinkedList(null);
        SearchTree tree = new SearchTree(null);
        tree.traverse(tree.getRoot());

        // Create a string data array to avoid typing loads of addItem instructions
//        String data = "Darwin Brisbane Perth Melbourne Canberra Adelaide Sydney Canberra";
//        String data = "5 7 3 9 8 2 1 0 4 6";
        String data = "5 3 4 9 1 6";

        String[] cities = data.split(" ");

        for (String city: cities) {
            tree.addItem(new Node(city));
        }

        tree.traverse(tree.getRoot());

//        tree.removeItem(new Node("3"));
//        tree.traverse(tree.getRoot());
//
//        tree.removeItem(new Node("5"));
//        tree.traverse(tree.getRoot());
//
//        tree.removeItem(new Node("0"));
//        tree.removeItem(new Node("4"));
//        tree.removeItem(new Node("2"));
//        tree.traverse(tree.getRoot());
//
//        tree.removeItem(new Node("9"));
//        tree.traverse(tree.getRoot());
//
//        tree.removeItem(new Node("8"));
//        tree.traverse(tree.getRoot());
//
//        tree.removeItem(new Node("6"));
//        tree.traverse(tree.getRoot());
//
//        tree.removeItem(tree.getRoot());
//        tree.traverse(tree.getRoot());

        tree.removeItem(tree.getRoot());
        tree.traverse(tree.getRoot());

    }
}
