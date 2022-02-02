import java.util.Scanner;

class InsertionSort {

    private int[] A;
    private int key;
    private static int j = 1;
    private static int i = 0;

    InsertionSort(int[] a) {
        if (a.length < 2)
            throw new ArrayStoreException("Needs at least two elements");
//        try {
//
//        }
//
//        except Exception as e {
//
//        }
        A = a;
        key = A[j];
    }

    public void setTest(int a[]) {
        A = a;
        key = A[j];
    }

    public void customA(String choice) {
        if (choice.toLowerCase().contains("add")) {
            Scanner sc = new Scanner(System.in);
            int i = 0;

            while (!sc.nextLine().equals("end") && i<A.length-1) {

                i++;
            }
        }
    }

    public void step() {
        // the condition that breaks the while loop
        if (i < 0 || A[i] < key) {
            A[i + 1] = key;
            j++;
            i = j-1;
            key = A[j];
        }
        else {
            A[i+1] = A[i];
            i--;
        }
    }

    public String toString() {
        for (int el : A) {
            System.out.print(el + ", ");
        }
        return "\nkey: " + key + " i: " + i;
    }

//    public time timeit() {
//
//    }

    public static void main(String[] args) {
        InsertionSort sorter = new InsertionSort(new int[] {7, 2, 3, 4, 5, 4, 9, 11});
        Scanner sc = new Scanner(System.in);
        String command = "";
        while (!command.equals("end")) {
            command = sc.nextLine();
            System.out.println("sort more (step), or stop (end)?");
            sorter.step();
            System.out.println(sorter);
        }
    }

}



public class SortingAlgorithms {




}
