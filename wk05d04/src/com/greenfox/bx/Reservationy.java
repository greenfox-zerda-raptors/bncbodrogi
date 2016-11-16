package com.greenfox.bx;

public interface Reservationy {

    String getDowBooking();
    String getCodeBooking();
    boolean PlaceReserved (String dowBooking, String codeBooking); //must return true if successful
    boolean PlaceCancelled (String dowBooking,String codeBooking); //must return true if successful


    void setDowBooking(String dowBooking);

    void setCodeBooking(String codeBooking);


    String toString (); //format("Booking# %s for %s");
}
