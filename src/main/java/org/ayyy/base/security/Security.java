package org.ayyy.base.security;

import lombok.Data;

@Data
public class Security {
    private String name;
    private String place;

    public Security(String name, String place) {
        this.name=name;
        this.place=place;
    }

    public void sendMessage(String message){
        ChatRoom.showMessage(this,message);
    }
}
