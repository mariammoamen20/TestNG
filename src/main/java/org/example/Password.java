package org.example;

public class Password {
    public static String checkPassword(String password){
        if(password.length() < 6 || password.isEmpty() ||password.length() >8 || password.contains(" ")){
            return "Invalid password! Please try again";
        }else {
            return password;
        }
    }
}
