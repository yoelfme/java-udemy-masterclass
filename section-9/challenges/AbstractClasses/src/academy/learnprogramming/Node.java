package academy.learnprogramming;

public class Node extends ListItem {
    public Node(Object value) {
        super(value);
    }

    @Override
    ListItem next() {
        return this.rightLink;
    }

    @Override
    ListItem setNext(ListItem item) {
        this.rightLink = item;
        return this.rightLink;
    }

    @Override
    ListItem previous() {
        return this.leftLink;
    }

    @Override
    ListItem setPrevious(ListItem item) {
        this.leftLink = item;
        return this.leftLink;
    }

    @Override
    int compareTo(ListItem item) {
        if (item != null) {
            return ((String) super.getValue()).compareTo((String) item.getValue());
        }

        return -1;
    }
}
//current = 6
//leftmostParent = 5
//
//current = 5
//leftmostParent = 6
//
//current = 3
//leftmostParent = 5
//
//                                5
//                            3       6
//                                       9
//
//
//                                 3
//                            3           null
//                        2               9
//                             2
