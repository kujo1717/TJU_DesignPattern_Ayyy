package org.ayyy.singleton;

import org.ayyy.base.museum.Museum;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertSame;

/**
 * @Author: 杨严
 * @Date: 2022/12/04/2:21 PM
 * @Description:
 */
public class SingletonTest {
    @BeforeEach
    void setUp(){
        System.out.println("test up");
    }


    @Test
    void testSingleton() {
        Museum museum1=Museum.getInstance();
        Museum museum2=Museum.getInstance();
        assertSame(museum1, museum2);
        System.out.println("Museum is " + museum1.toString());
    }
}
