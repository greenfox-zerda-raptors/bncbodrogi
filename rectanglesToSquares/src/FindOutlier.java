
public class FindOutlier {
    static int find(int[] integers) {
        int n = 0;
        if(integers[0] % 2 == integers[1] % 2){
            for (int element : integers){
                if(element % 2 != integers[0] % 2){
                    n = element;
                }
            }
        }else if(integers[0] % 2 == integers[2] % 2){
            n = integers[1];
        }else{
            n = integers[0];
        }
        return n;
    }
}
