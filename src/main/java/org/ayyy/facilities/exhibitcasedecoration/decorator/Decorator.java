package org.ayyy.facilities.exhibitcasedecoration.decorator;

/**
 * @Author: 龙卓涵
 * @Date: 2022/12/7 20:43
 * @Description: TODO
 * @Version: 1.0
 **/
public class Decorator extends ExhibitCase{

    /**
     *
     */
    private ExhibitCase exhibitcase;

    /**
     * @param exhibitcase
     */
    public Decorator(ExhibitCase  exhibitcase) {
        this.exhibitcase = exhibitcase;
    }

    /**
     * @return
     */
    public void display() {
        exhibitcase.display();
    }
}
