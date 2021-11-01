import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.ArrayList;

class Iterators {

    private ArrayList<String> collection;
    private ListIterator<String> position;

    public Iterators(ArrayList<String> collection) {
        this.collection = collection;
        position = collection.listIterator();
    }

    public void scanCollection() {

        Scanner scan = new Scanner(System.in);
        String direction = scan.nextLine();

        try {

            if (direction.equals("left")) {
                System.out.println(position.previous());
            } else if (direction.equals("right")) {
                System.out.println(position.next());
            }
        }

        catch (Exception NoSuchElementException) {
            if (direction.equals("left")) {
                System.out.println("You went too far left");
            }
            else if (direction.equals("right")) {
                System.out.println("You went too far right");
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("red");
        colors.add("yellow");
        colors.add("orange");
        Iterators iterators = new Iterators(colors);
        for (int i=0; i<10; i++) {
            iterators.scanCollection();
        }
    }
}