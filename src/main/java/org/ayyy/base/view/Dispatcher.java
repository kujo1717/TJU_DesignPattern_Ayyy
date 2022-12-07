package org.ayyy.base.view;

public class Dispatcher {
    private ExhibitionView exhibitionView;
    private HomeView homeView;
    public Dispatcher(){
        exhibitionView=new ExhibitionView();
        homeView=new HomeView();
    }
    public void dispatch(String request){
        if (request.equalsIgnoreCase("HOME")){
            homeView.show();
        }else {
            exhibitionView.show();
        }
    }
}
