package org.ayyy.base.interactiveexperience.abstractfactory.touchscreen;

import lombok.Data;
import org.ayyy.util.CallStackLogInfo;
import org.ayyy.util.CallStackLogger;


/**
 * @Author: 杨严
 * @Date: 2022/12/06/3:14 PM
 * @Description: 历史脉络展览的屏幕
 */
@Data
public class HistoryProcessScreen extends TouchScreen{

    /**
     * constructor
     * */
    public HistoryProcessScreen(Double width, Double length, String content) {
        super(width,length,content,ScreenType.HISTORYPROCESS);
    }

    /**
     * 屏幕开始展示历史脉络图
     * */
    @Override
    public void displayScreen() {
        CallStackLogger.log(
                new CallStackLogInfo(
                        "HistoryProcessScreen",
                        "DisplayScreen",
                        String.valueOf(System.identityHashCode(this)),
                        "历史脉络展览的屏幕开始展示，内容是"+this.getContentText()+
                                "\n\t 屏幕长宽为"+this.getScreenLength()+","+this.getScreenWidth()
                )
        );
    }
}
