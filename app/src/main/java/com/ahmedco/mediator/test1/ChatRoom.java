package com.ahmedco.mediator.test1;


import java.util.Date;

public class ChatRoom {

    public static void showMessage(User user, String message) {

        System.out.println(new Date().toString() + " [" + user.getName() + "] : " + message);
    }
}
