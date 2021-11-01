import java.util.ArrayList;
import java.lang.Object.*;
import java.awt.*;


public class MathNature {

    public MathNature() {

    }

    private Integer fibonacci(int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;

        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    private void visualize(int n_curves) {

        while (n_curves > 0) {

            int fibo = fibonacci(n_curves);
            for (int i=0; i<90; i++)
                // leo.turn(1);
                // leo.forward(fibo);

            n_curves--;
        }
    }

    public static void main(String[] args) {

    }


}
