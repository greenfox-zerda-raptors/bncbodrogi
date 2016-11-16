package com.greenfox.bx;

import com.greenfox.bx.*;
import java.util.ArrayList;


public class App {


    public static void main(String[] args) {
        ArrayList<Reservation> bookings = new ArrayList<>();
        int ct = 10;

        for (int i = 0; i < ct; i++) {
            bookings.add(new Reservation());
        }

        for (Reservation iBooking : bookings) {
            System.out.println(iBooking.toString());
        }
    }



}
