
public class ws30 {
    public static void main(String[] args) {
        int ac = 8;
        int time = 120;
        String out = "";
        // if ac is dividable by 4
        // and time is not more than 200
        // set out to 'check'
        // if time is more than 200
        // set out to 'Time out'
        // otherwise set out to 'Run Forest Run!'

        if (time > 200){
            System.out.println(out.replace("", "Time out"));
        }else if (ac % 4 == 0) {
            System.out.println(out.replace("", "check"));
        }else{
            System.out.println(out.replace("", "Run Forest Run!"));
        }

    }
}
