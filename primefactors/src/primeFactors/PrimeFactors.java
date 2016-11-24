package primeFactors;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {

    public static List<Integer> generate(int n) {
        List<Integer> result = new ArrayList<>();
        for (int candidate = 2;n > 1; candidate++) {
            for(;n % candidate == 0; n /= candidate){
                result.add(candidate);
            }
        }
        return result;
    }

}
