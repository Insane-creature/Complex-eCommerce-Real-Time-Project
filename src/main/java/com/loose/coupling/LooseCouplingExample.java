package com.loose.coupling;

public class LooseCouplingExample {
    public static void main(String[] main){
        UserDataProvider databaseProvider = new UserDatabaseProvider();
        UserManager userManagerWithDB = new UserManager(databaseProvider);
        System.out.println(userManagerWithDB.getUserInfo());

        UserDataProvider datafromAnotherDB = new AnotherUserDBProvider();
        UserManager userManagerWithWS = new UserManager(datafromAnotherDB);
        System.out.println(userManagerWithWS.getUserInfo());


    }
}
