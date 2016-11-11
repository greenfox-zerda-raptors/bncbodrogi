
public class d03ws21 {
    public static void main(String[] args) {
        long needFaktor = 5;

        System.out.println(faktor_r(needFaktor));

    }

        public static long faktor_r (long needFaktor) {

            if(needFaktor == 1){
                return 1;
            }
            return needFaktor * (faktor_r(needFaktor-1));
            }
}

