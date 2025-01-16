package com.tight.coupling;

// to return data from user database
// will get the user info

public class UserManager {
    private UserDatabase userdatabase = new UserDatabase();
    public String getUserInfo(){
        return userdatabase.getUserDetails();
    }

    
}
