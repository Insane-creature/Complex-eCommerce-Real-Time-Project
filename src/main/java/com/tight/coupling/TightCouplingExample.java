package com.tight.coupling;

public class TightCouplingExample {
    public static void main(String[] main){
        UserManager usermanager = new UserManager();
        System.out.println(usermanager.getUserInfo());
    }
}
