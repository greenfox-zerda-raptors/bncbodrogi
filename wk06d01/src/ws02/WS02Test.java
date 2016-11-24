package ws02;

import java.util.ArrayList;

public class WS02Test {

    public Integer sumOfAllThings(ArrayList<Integer> list){
        Integer i = 0;
        for(Integer listElement : list){
            i = listElement + i;
        }
        return i;
    }
}
