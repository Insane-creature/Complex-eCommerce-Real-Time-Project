package com.loose.coupling;

public class UserManager {
    
    //user manager is making use of interface
    // so whoever userdataprovider will implement user manager will be called.
    // during runtime whichever object type will use this as ref type that will be called.

    private UserDataProvider userDataProvider;
    
    public UserManager(UserDataProvider userDataProvider){
        this.userDataProvider = userDataProvider; 
    }

    public String getUserInfo(){
        return userDataProvider.getUserDetails();
    }

    
}
