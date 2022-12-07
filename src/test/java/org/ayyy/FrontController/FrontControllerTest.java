package org.ayyy.FrontController;

import org.ayyy.base.view.FrontController;
import org.junit.jupiter.api.Test;

public class FrontControllerTest {
    @Test
    void test(){
        FrontController frontController = new FrontController();
        frontController.dispatchRequest("HOME");
        frontController.dispatchRequest("EXHIBITION");
    }
}
