package org.ayyy.MVC;

import org.ayyy.base.exhibit.Exhibit;
import org.ayyy.base.exhibit.ExhibitController;
import org.ayyy.base.exhibit.ExhibitView;
import org.junit.jupiter.api.Test;

public class MVCTest {
    @Test
    void test(){
        Exhibit model=retrieveExhibitFromDatabase();
        ExhibitView view=new ExhibitView();
        ExhibitController controller=new ExhibitController(model,view);
        controller.updateView();
        System.out.println("更新展品信息");
        controller.setExhibitPlace("展馆2");
        controller.updateView();
    }

    private static Exhibit retrieveExhibitFromDatabase() {
        Exhibit exhibit=new Exhibit();
        exhibit.setExhibitNum("1");
        exhibit.setName("陶瓷片");
        exhibit.setPlace("展馆1");
        return exhibit;
    }
}
