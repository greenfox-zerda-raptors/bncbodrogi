package ws03;

import java.util.ArrayList;

public class Fibonaccho {

    public Integer calculateFibonaccho(Integer num){
        int x1 = 0;
        int x2 = 1;
        int x3 = 0;
        if (num == 0)

            return 0;

        else if (num == 1)

            return 1;

        else

            for (int i = 0; i < num-1; i++) {
            x3 = x1 + x2;
            x1 = x2;
            x2 = x3;
        }
        return Integer.valueOf(x3);

    }
}
