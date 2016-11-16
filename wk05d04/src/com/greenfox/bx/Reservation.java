package com.greenfox.bx;


public class Reservation implements Reservationy {

    String dowBooking;
    String codeBooking;

    final static String ls = "01234567890ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    final static String[] lsDow = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};

    static String randomDow() {
        return lsDow[(int) (Math.random() * 6)];
    }

    static String randomZeroToZ(int len) {
        String out = "";
        for (int i = 0; i < len; i++) {
            out += ls.charAt((int) (Math.random() * 36));
        }
        return out;
    }

    public Reservation (){
        codeBooking = randomZeroToZ(8);
        dowBooking = randomDow();
    }

    public String toString (){
        return String.format("Booking# " + codeBooking + " for " + dowBooking);
    }

    @Override
    public String getDowBooking() {
        return dowBooking;
    }

    @Override
    public String getCodeBooking() {
        return codeBooking;
    }

    @Override
    public boolean PlaceReserved(String dowBooking, String codeBooking) {
        return true;
    }

    @Override
    public boolean PlaceCancelled(String dowBooking, String codeBooking) {
        return true;
    }

    @Override
    public void setDowBooking(String dowBooking) {

    }

    @Override
    public void setCodeBooking(String codeBooking) {

    }

}