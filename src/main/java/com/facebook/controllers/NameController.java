package com.facebook.controllers;

public class NameController {
    public  static boolean isName (String name){

        if (name.matches("[A-Za-z]+\\s[A-Za-z]+") == false) {
            return false;
        } else return true;
    }
}
