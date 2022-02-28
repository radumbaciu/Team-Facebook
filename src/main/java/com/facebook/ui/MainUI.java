package com.facebook.ui;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class MainUI {

    public void showMainUI () {

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy");
        String yearDate = dateFormat.format(new Date());

        Scanner in = new Scanner(System.in);
        String option = "start";

        System.out.println("---------------------------------------------------" +
                "\n" + "facebook" +
                "\n" +
                "\n" + "\t\t\t\t" + "1 - Log In" +
                "\n" + "\t\t\t\t" + "2 - Forgot password?" +
                "\n" + "\t\t\t\t" + "3 - Create new account" +
                "\n" + "\t\t\t\t" + "4 - Exit" +
                "\n" +
                "\n" + "Meta \u00a9 " + yearDate +
                "\n" + "---------------------------------------------------"
        );

        System.out.println("Select an option (1, 2, 3, 4):");

        while (option != "4") {

            option = in.next();

            switch (option) {

                case "1":
                    System.out.println("Log in"); //LoginUI TBD here
                    break;
                case "2":
                    System.out.println("Forgot password?"); //ForgotPasswordUI TBD here
                    break;
                case "3":
                    System.out.println("Create new account"); //CreateNewAccountUI TBD here
                    break;
                case "4":
                    System.exit(0);
                default:
                    System.err.println("Invalid option");
            }

        }



    }

}