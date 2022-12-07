package org.ayyy.base.exhibit;

public class ExhibitView {
    public void printExhibitInfo(String exhibitNum,String exhibitName,String exhibitPlace){
        System.out.println("展品: ");
        System.out.println("名字: " + exhibitName);
        System.out.println("编号: " + exhibitNum);
        System.out.println("展馆: " + exhibitPlace);
    }
}
