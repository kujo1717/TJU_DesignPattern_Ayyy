package org.ayyy.base.coin;

import lombok.Data;

@Data
public class Coin {
    private String type;
    private String size;
    public Coin(String type){
        this.type=type;
    }
    public void show(){
        System.out.println("纪念币种类:"+type+",纪念币大小:"+size);
    }
}
