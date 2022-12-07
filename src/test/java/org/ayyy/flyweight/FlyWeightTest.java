package org.ayyy.flyweight;

import org.ayyy.base.coin.Coin;
import org.ayyy.base.coin.CoinFactory;
import org.junit.jupiter.api.Test;

public class FlyWeightTest {
    private static final String types[] =
            { "人物纪念币", "建筑纪念币", "古钱币", "吉祥物纪念币", "历史事件纪念币" };
    private static final String sizes[]=
            {"大","中","小"};
    private static String getRandomType() {
        return types[(int)(Math.random()*types.length)];
    }
    private static String getRandomSize(){
        return sizes[(int)(Math.random()*sizes.length)];
    }
    @Test
    void FlyWeight() {

        for(int i=0; i < 20; ++i) {
            Coin coin= CoinFactory.getCoin(getRandomType());
            coin.setSize(getRandomSize());
            coin.show();
        }
    }
}
