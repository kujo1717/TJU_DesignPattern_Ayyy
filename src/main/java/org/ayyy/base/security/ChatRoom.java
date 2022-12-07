package org.ayyy.base.security;


public class ChatRoom {
    public static void showMessage(Security security,String message){
        System.out.println(" [" + security.getName() +" at "+security.getPlace()+"] : " + message);
    }
}
