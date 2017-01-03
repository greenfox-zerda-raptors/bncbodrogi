package com.greenfox.w08project.domain;


public class LoggedIn {
    private static long id;
    private static String name;

    public static long getId() {
        return id;
    }

    public static void setId(long id) {
        LoggedIn.id = id;
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        LoggedIn.name = name;
    }
}
