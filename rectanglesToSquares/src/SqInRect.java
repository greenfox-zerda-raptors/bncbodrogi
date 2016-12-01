import java.util.ArrayList;


public class SqInRect {

        public static ArrayList<Integer> sqInRect(int lng, int wdth) {
            int width;
            int heigth;
            if(lng > wdth){
                width = lng;
                heigth = wdth;
            }else{
                width= wdth;
                heigth = lng;
            }
            ArrayList<Integer> squares = new ArrayList<>();

            if(width == heigth){
                return null;
            }else{
                while (width > 0 && heigth > 0) {
                    if((width - heigth) > heigth) {
                        squares.add(heigth);
                        width -= heigth;
                    } else if (width - heigth > 0) {
                        squares.add(heigth);
                        int temp = heigth;
                        heigth = width - heigth;
                        width = temp;
                    }else if(width == heigth){
                        squares.add(heigth);
                        heigth=0;
                    }
                }
            }
            return squares;
        }

    public static void main(String[] args) {
        System.out.println(sqInRect(88,68));
    }


}
