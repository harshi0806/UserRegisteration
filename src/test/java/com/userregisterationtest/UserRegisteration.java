package com.userregisterationtest;

import java.util.regex.Pattern;
import java.util.Scanner;

class UserRegistration {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        UserRegistration registration = new UserRegistration();
        if(registration.checkFirstName() == true) {
            System.out.println("Entered name in correct format. ");
        } else{
            System.out.println("Enter valid first name");
        }
        if(registration.checkLastName() == true) {
            System.out.println("Entered name in correct format. ");
        } else {
            System.out.println("Enter valid last name");
        }
        if(registration.checkValidEmail() == true) {
            System.out.println("Entered email in correct format. ");
        } else {
            System.out.println("Enter valid email.");
        }
    }

    public boolean checkFirstName() {
        System.out.println("Enter first name: ");
        String firstName = sc.next();
        if(firstName.matches( "^([A-Z][a-zA-Z]{2,})$" ) == true){
            return true;
        }
        else {
            return false;
        }
    }
    public boolean checkLastName() {
        System.out.println("Enter last name: ");
        String lastName = sc.next();
        if(lastName.matches( "^([A-Z][a-zA-Z]{2,})$" ) == true){
            return true;
        }
        else {
            return false;
        }
    }
    public boolean checkValidEmail() {
        System.out.println("Enter valid email: ");
        String enterEmail = sc.next();
        if(enterEmail.matches( "^[0-9a-zA-Z]+([._+-][0-9a-zA-Z]+)*@[0-9a-zA-Z]+.[a-zA-Z]{2,4}([.][a-zA-Z]{2})*$" ) == true) {
            return true;
        }
        else {
            return false;
        }
    }
}