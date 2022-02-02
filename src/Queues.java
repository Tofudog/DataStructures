import java.util.EmptyStackException;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Queues {

    private final Queue<String> queue = new LinkedList<>();
    private static int num_operation = 0;

    public Queues() {

    }

    public void setData() {

    }

    public void enqueue(String val) {
        queue.add(val);
        num_operation++;
    }

    public void dequeue() {
        if (queue.size() == 0) {
            throw new NoSuchElementException();
        }
        queue.remove();
        num_operation++;
    }

    public String peek() {

        num_operation++;
        return queue.peek();
    }

    public String toString() {
        return "size: " + queue.size();
    }

    // <li><h5 class="section">
    public static void main(String[] args) {
        Queues myQueue = new Queues();

        String search_data = "<li><h5 class=\"section\">";

//        try {
//            File myObj = new File("bible_books.txt");
//            Scanner myReader = new Scanner(myObj);
//            while (myReader.hasNextLine()) {
//                String data = myReader.nextLine();
//                System.out.println(data.indexOf(search_data));
//            }
//            myReader.close();
//        }
//
//        catch (FileNotFoundException e) {
//            System.out.println("An error occurred.");
//            e.printStackTrace();
//        }

        File file = new File("bible_books.txt");
        //Scanner myReader = new Scanner(file);


    }





}