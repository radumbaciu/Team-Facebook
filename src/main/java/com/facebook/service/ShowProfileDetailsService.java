package com.facebook.service;

import com.facebook.controllers.FindUser;
import com.facebook.dao.GetCurrentUserID;
import com.facebook.model.User;

import java.io.IOException;
import java.util.Scanner;

public class ShowProfileDetailsService {
    public void showProfileDetails() throws IOException {
        Scanner in = new Scanner(System.in);
        GetCurrentUserID getCurrentUserID = new GetCurrentUserID();
        FindUser findUser = new FindUser();

        String name = "not assigned";
        int age = 0;
        String sex = "not assigned";
        /*String livesIn = "not assigned";
//        String fromTown = "not assigned";
//        String worksAt = "not assigned";
//        String studies = "not assigned";
//        String relationshipStatus = "not assigned";

         */
        int friendsNo = 0;
        //add date of join

// Read profile from file
        String id = getCurrentUserID.getCurrentUserID();
        System.out.println("---------------------------------------------------" +
                "\n" + "facebook - My Profile" + "\n" +
                "---------------------------------------------------");
        findUser.findPrintUser(id);
      /*  boolean idCheck = false;
        Path profileDetailsTable = Paths.get("src\\main\\resources", "ProfileDetailsTable.txt");
        List<String> lines = Files.readAllLines(profileDetailsTable);
        String [] userDetails;
        for (String line : lines) {
            userDetails = line.split(";");
            if (userDetails[0].equals(Integer.toString(id))) {
                System.out.println("---------------------------------------------------" +
                        "\n" + "facebook - My Profile"+ "\n"+
                        "---------------------------------------------------");
                System.out.println("Name = "+ userDetails[3] + "\nAge = " + userDetails[4] + "\nSex = " + userDetails[5]);

            }
        }
*/


//        System.out.println("\n Name= " + name); // still to create regex
//        System.out.println("\n Age= " + age + " years");  //still create regex - age at account creation must be 18 or higher
//        System.out.println("\n Name= " +email);
//        System.out.println("\n Sex= " + sex);  // still to Create enum
//        System.out.println("\n Name= " + livesIn);
//        System.out.println("\n Name= " + fromTown);
//        System.out.println("\n Name= " + worksAt);
//        System.out.println("\n Name= " + studies);
//        System.out.println("\n Name= " + relationshipStatus);
//        System.out.println("\n Follow By= " + friendsNo + " people");// still to create counter


    }
}
