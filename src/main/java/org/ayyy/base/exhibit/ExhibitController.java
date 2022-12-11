package org.ayyy.base.exhibit;

public class ExhibitController {
    private Exhibit model;
    private ExhibitView view;
    public ExhibitController(Exhibit model,ExhibitView view){
        this.model=model;
        this.view=view;
    }
    public void setExhibitName(String name){
        model.setName(name);
    }
    public void setExhibitPlace(String place){
        model.setPlace(place);
    }
    public void setExhibitNum(String num){
        model.setExhibitNum(num);
    }
    public String getExhibitName(){
        return model.getName();
    }
    public String getExhibitPlace(){
        return model.getPlace();
    }
    public String getExhibitNum(){
        return model.getExhibitNum();
    }
    public void updateView(){
        view.printExhibitInfo(model.getExhibitNum(), model.getExhibitNum(), model.getPlace());
    }
}
