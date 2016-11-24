package ws02;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {

        WS02Test test = new WS02Test();

        ArrayList<Integer> arrayToBeSummedForTheSakeOfTestingHopeThisWillSatisfyTheEvoEdgeGuyIfStillNoPrettyPleaseWithCherryOnTopLetMeKnow = new ArrayList<Integer>();

        for (int i = 0; i < 10; i++){
            arrayToBeSummedForTheSakeOfTestingHopeThisWillSatisfyTheEvoEdgeGuyIfStillNoPrettyPleaseWithCherryOnTopLetMeKnow.add(i);
        }

        System.out.println(test.sumOfAllThings(arrayToBeSummedForTheSakeOfTestingHopeThisWillSatisfyTheEvoEdgeGuyIfStillNoPrettyPleaseWithCherryOnTopLetMeKnow));
    }

}
