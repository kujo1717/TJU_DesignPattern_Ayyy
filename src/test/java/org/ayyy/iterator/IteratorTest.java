package org.ayyy.iterator;

import org.ayyy.base.presentationguide.iterator.ExhibitionItinerary;
import org.ayyy.base.presentationguide.iterator.PresentationGuide;
import org.junit.jupiter.api.Test;

/**
 * @Author: 杨严
 * @Date: 2022/12/06/4:43 PM
 * @Description:
 */
public class IteratorTest {
    @Test
    void test(){
        ExhibitionItinerary exhibitionItinerary=new ExhibitionItinerary();
        for (PresentationGuide guide= exhibitionItinerary.getGuide(); guide.hasNext();){
            String exhibitionPointName=(String) guide.next();
            System.out.println("现在解说的是第" + guide.getIndex() + "个藏品，名字是: " + exhibitionPointName);
        }
    }
}
