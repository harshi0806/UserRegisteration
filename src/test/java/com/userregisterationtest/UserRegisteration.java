package com.userregisterationtest;

import java.util.regex.Pattern;
import java.util.Scanner;

class UserRegistration {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        UserRegistration registration = new UserRegistration();
        if(registration.checkFirstName() == true) {
            System.out.println("Entered name in correct format. ");
        } else {
            System.out.println("Enter valid name.");
        }
    }

    public boolean checkFirstName() {
        System.out.println("Enter name: ");
        String firstName = sc.next();
        if(firstName.matches( "^([A-Z][a-zA-Z]{2,})$" ) == true){
            return true;
        }
        else {
            return false;
        }
    }
    public boolean checkLastName() {
        System.out.println("Enter name: ");
        String lastName = sc.next();
        if(lastName.matches( "^([A-Z][a-zA-Z]{2,})$" ) == true){
            return true;
        }
        else {
            return false;
        }
    }
}