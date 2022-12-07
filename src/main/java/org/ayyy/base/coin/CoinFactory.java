package org.ayyy.base.coin;

import java.util.HashMap;

public class CoinFactory {
    private static final HashMap<String, Coin> coinMap = new HashMap<>();
    public static Coin getCoin(String type){
        Coin coin=coinMap.get(type);
        if(coin==null){
            coin=new Coin(type);
            coinMap.put(type,coin);
            System.out.println("创建"+type+"种类的纪念币");
        }
        return coin;
    }
}
