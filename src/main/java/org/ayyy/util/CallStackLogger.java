package org.ayyy.util;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @Author: 杨严
 * @Date: 2022/12/04/2:59 PM
 * @Description: 日志打印类
 */
public class CallStackLogger {
    private final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

    static {
        System.setProperty("java.util.logging.SimpleFormatter.format",
                "[%1$tF %1$tT] [%4$-4s] %5$s %n");
    }

    public static void log(CallStackLogInfo info) {
        String msg = "\nCall Stack:" +
                "\n\tclassName = " + info.className + ";" +
                "\n\tmethodName = " + info.methodName + ";" +
                "\n\tobjectId = " + info.objectId + ";" +
                "\n\tdescription = " + info.description + ";\n";
        LOGGER.log(Level.INFO, msg);
    }
}
