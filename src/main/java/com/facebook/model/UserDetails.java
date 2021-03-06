package com.facebook.model;

import com.facebook.dao.GetCurrentUserID;

import java.io.IOException;

public class UserDetails {


    private String id;
    private String emailAddress;
    private String password;
    private static String name;
    public static String newName;
    private String age;
    private String newAge;
    private String sex;
    private String newSex;
    //        String livesIn = "not assigned";
//        String fromTown = "not assigned";
//        String worksAt = "not assigned";
//        String studies = "not assigned";
//        String relationshipStatus = "not assigned";
    private int friendsNo;
    private int newfriendsNo;
    User user = new User();
//    private User user;
    GetCurrentUserID getCurrentUserID = new GetCurrentUserID();


    public UserDetails(String name, String age, String sex) throws IOException {
        this.id = getCurrentUserID.getCurrentUserID();
        this.emailAddress = user.getEmailAddress();
        this.password = user.getPassword();
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.friendsNo = friendsNo;
    }




    public void NewUserDetails(String name, String age, String sex) {
        this.newName = name;
        this.newAge = age;
        this.newSex = sex;
        this.newfriendsNo = friendsNo;
    }


    public String getId() {
        return id;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getPassword() {
        return password;
    }


    public void setId(String id) {
        this.id = id;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static String getName() {        return name;    }
    public static String getNewName() {        return newName;    }

    public String getAge() {        return age;    }


    public String getSex() {        return sex;    }

    public int getFriendsNo() {        return friendsNo;    }

    public void setName(String name) {        this.name = name;    }
//    public  void setNewName(String name) {        this.newName = name;    }

    public void setAge(String age) {        this.age = age;    }

    public void setSex(String sex) {        this.sex = sex;    }

    public void setFriendsNo(int friendsNo) {        this.friendsNo = friendsNo;    }
}
