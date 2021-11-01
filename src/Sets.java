import java.lang.reflect.Array;
import java.util.*;


// Task: create a new array list, add some colors (string) and print out the collection

public class Sets {

    private ArrayList<String> colors;

    public Sets(String colors) {
        setTest(colors);
    }

    public void setTest(String colors) {
        this.colors = new ArrayList<String> (Arrays.asList(colors.split(" ")));
    }

    public void convertToSet(String setName) {

    }



    public static void main(String[] args) {

    }

}
