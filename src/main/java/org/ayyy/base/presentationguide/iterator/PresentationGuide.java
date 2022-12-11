package org.ayyy.base.presentationguide.iterator;

/**
 * @Author: 杨严
 * @Date: 2022/12/06/4:27 PM
 * @Description: 解说导游
 */
public interface PresentationGuide {

    /**
     * @return 按照当前推荐游览顺序，这个参观点是不是最后一个
     */
    public boolean hasNext();

    /**
     *
     * @return 按照guide的顺序的下一个参观点
     */
    public Object next();


    /**
     * @return 下标
     * */
    public int getIndex();
}
