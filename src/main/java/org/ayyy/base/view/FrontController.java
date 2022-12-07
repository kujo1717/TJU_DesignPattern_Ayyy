package org.ayyy.base.view;

public class FrontController {
    private Dispatcher dispatcher;
    public FrontController(){
        dispatcher=new Dispatcher();
    }
    private boolean isAuthenticUser(){
        System.out.println("用户已验证");
        return true;
    }
    private void trackRequest(String request){
        System.out.println("请求页面: " + request);
    }

    public void dispatchRequest(String request){
        //记录每一个请求
        trackRequest(request);
        //对用户进行身份验证
        if(isAuthenticUser()){
            dispatcher.dispatch(request);
        }
    }
}
