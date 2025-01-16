package com.loose.coupling;


// Going to interact with the database server
// To access the db and get userinfo.

public class UserDatabaseProvider implements  UserDataProvider {
    @Override
    public String getUserDetails(){
        return  "Got user data";
    }

    
}
