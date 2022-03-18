package com.facebook.ui;

import com.facebook.model.User;
import com.facebook.service.UserService;

import java.awt.*;
import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class CreateNewAccountUI extends UI {

    public void showCreateNewAccountUI () throws IOException, InterruptedException, AWTException {

        LoadingUI loadingUI = new LoadingUI();
        UI ui = new CreateNewAccountUI();
        UserService userService = new UserService();
        MainUI mainUI = new MainUI();
        Scanner in = new Scanner(System.in);

        //String firstName = "";
        //String lastName = "";
        String emailAddress = "";
        String newPassword = "";

        loadingUI.popProgressBar();

        //System.out.println("Enter first name:");
        //firstName = in.nextLine();

        //System.out.println("Enter last name:");
        //lastName = in.nextLine();

        System.out.println("Enter email address:");
        emailAddress = in.nextLine();

        newPassword = ui.getMaskedPassword("Enter password");

        System.out.println("Press Enter to Sign Up");
        System.in.read();

        loadingUI.popProgressBar();
        userService.createNewAccount(new User(emailAddress, newPassword));

        System.out.println("Account successfully created!");
        TimeUnit.MILLISECONDS.sleep(2000);

        loadingUI.popProgressBar();
//        mainUI.showMainUI();
        /* Radu Code

         */

        MyProfileUI.showMyProfileUI();
    }

    @Override
    public void closeApplication() {

    }
}
