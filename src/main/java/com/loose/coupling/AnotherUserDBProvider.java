package com.loose.coupling;

public class AnotherUserDBProvider implements UserDataProvider {
    @Override
    public String getUserDetails(){
        return "Data from Another database provider";
    }
}
