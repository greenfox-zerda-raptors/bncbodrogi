package com.greenfox.w08project.domain;


public class LoggedIn {
    private static long id;
    private static String name;
    private static String loginName;

    public static String getLoginName() {

        char[] loginNameNoSpaces = LoggedIn.name.toCharArray();
        loginName = "";

        for (char letter : loginNameNoSpaces) {
            if (letter != (char) 32) {
                loginName += letter;
            }
        }
        return loginName.toLowerCase();
    }

    public static void setLoginName(String loginName) {
        LoggedIn.loginName = loginName;
    }

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
