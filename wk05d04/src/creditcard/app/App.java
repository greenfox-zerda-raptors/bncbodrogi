package creditcard.app;

import java.util.ArrayList;


public class App {

    public static void main(String[] args) {


        ArrayList<CreditCard> cards = new ArrayList<>();
        int ct = 10;

        for (int i = 0; i<ct; i++) {
            cards.add(new CreditCard(0,"ABC" + i, random16())); //parameters are CVV, name, cardnumber; when CVV is 0, then the Constructor computes the CVV, otherwise it uses the value sent
        }

        for (CreditCard iCard: cards) {
            System.out.println(iCard.toString() + (iCard.ValidCard(iCard.getCodeAccount(), iCard.getSumCVV())? " (validated) " :
                    " (invalid) "));
        }

    }

    static String random16() {
        String out ="";
        for(int i = 0; i<16; i++) {
            out += Integer.toString( (int) ( Math.random() * 9));
        }

        return out;
    }
}
