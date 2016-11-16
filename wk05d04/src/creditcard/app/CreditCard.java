package creditcard.app;

import java.util.Random;

public class CreditCard implements CreditCardy {

    Random rnd = new Random();

    int sumCVV;
    String nameCardHolder;
    String cardNumber;

    public CreditCard(int sumCVV, String cardNumber, String nameCardholder) {
        if (sumCVV == 0){
            this.sumCVV = rnd.nextInt(50);
        }else{
            this.sumCVV=sumCVV;
        }
        this.cardNumber = cardNumber;
        this.nameCardHolder = nameCardholder;
    }


    @Override
    public void setSumCVV(int sumCVV) {

    }

    @Override
    public int getSumCVV() {
        return 0;
    }

    @Override
    public void setNameCardholder(String nameCardholder) {

    }

    @Override
    public String getNameCardholder() {
        return null;
    }

    @Override
    public void setCodeAccount(String codeAccount) {

    }

    @Override
    public String getCodeAccount() {
        return null;
    }

    @Override
    public int cumeSumCVV(String codeAccount) {
        return 0;
    }

    @Override
    public boolean ValidCard(String codeAccount, int sumCVV) {
        return true;
    }

     public String toString(){
         return String.format("Name=" + nameCardHolder + " CC#=" + cardNumber + " CVV= %02d", sumCVV);
     } /*String.format("Name=%s CC#=%s CVV=%d");*/
}
