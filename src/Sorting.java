public class Sorting {

    private Integer[] nums;


    public Sorting() {

    }

    // Given [1, 2, 3, 4, 5]; search=2; prerequisite: ordered list
    private int binarySearch(Integer[] numbers, int search) {
        int found = -1;
        int first = 0;
        int last = numbers.length - 1;

        while (true) {

            if ( numbers[(first+last)/2] == search ) {
                found = (first+last) / 2;
                break;
            }

            else if ( numbers[(first+last)/2] < search ) {
                first++;
            }

            else if ( numbers[(first+last)/2] > search ) {
                last--;
            }

        }

        return found;

    }

    private int binarySearch() {
        return 0;
    }



    public static void main(String[] args) {
        Sorting sorter = new Sorting();
        Integer[] grades = new Integer[5];
        grades[0] = 1;
        grades[1] = 2;
        grades[2] = 3;
        grades[4] = 4;
        grades[4] = 5;
        System.out.println(sorter.binarySearch(grades, 4));
    }

}
