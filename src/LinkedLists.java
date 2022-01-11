class Node {

    private Integer head;
    private Node next;

    private Node reversed;

    public Node(Integer head, Node next) {
        this.head = head;
        this.next = next;
    }

    public int peek() {
        return head;
    }

    public void addFirst(int num) {
        // temp is original first
        Node temp = new Node(head, next=next);
        Node first = new Node(num, next=temp);
        System.out.println(first);
    }

    // Deletes all but one
    public void clear() {


        while ( next != null ) {
            head = next.head;
            next = next.next;
        }


    }

    public Node reversedList() {
        reversed = new Node(head, reversed);

        Node n = next;
        while (n != null) {
            reversed = new Node(n.head, reversed);
            n = n.next;
        }

        return reversed;

    }

    public String toString() {
        return head + " " + next;
    }

    public static void main(String[] args) {
        Node node1 = new Node(3, null);
        Node node2 = new Node(1, node1);
        Node node3 = new Node(5, node2);
        Node node4 = new Node(4, node3);

//        while (node4 != null) {
//            System.out.println(node4.head);
//            node4 = node4.next;
//        }


        System.out.println("Original List: " + node4);
        System.out.println("Reversed List: " + node4.reversedList());
//        node4.clear();
//        System.out.println(node4);
        node4.addFirst(2);


    }



}

