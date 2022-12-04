package org.ayyy.util;

/**
 * @Author: 杨严
 * @Date: 2022/12/04/2:59 PM
 * @Description:日志消息类
 */
public class CallStackLogInfo {
    public String className;
    public String methodName;
    public String objectId;
    public String description;

    public CallStackLogInfo(){}

    public CallStackLogInfo(String className, String methodName, String objectId, String description)
    {
        this.className = className;
        this.methodName = methodName;
        this.objectId = objectId;
        this.description = description;
    }
}
