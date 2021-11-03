import java.awt.desktop.SystemEventListener;
import java.util.ArrayList;
import java.util.Map;
import java.util.Stack;
import java.util.TreeMap;

public class Stacks {

    private Stack<String> myStack;

    public Stacks(Stack<String> stack) {
        this.myStack = stack;
    }

    public void store(String store) {
        for (String val : store.split(" "))
            myStack.push(val);
    }

    public void dispense() {
        System.out.println(myStack.pop());
    }

    public static void main(String[] args) {

        // Driver code:
        Stacks pez = new Stacks(new Stack<>());
        String colors = "blue red red yellow red";
        pez.store(colors);
        System.out.println(pez.myStack);

        while (!pez.myStack.empty())
            pez.dispense();

    }


}
