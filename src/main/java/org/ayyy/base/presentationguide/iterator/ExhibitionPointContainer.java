package org.ayyy.base.presentationguide.iterator;

/**
 * @Author: 杨严
 * @Date: 2022/12/06/4:27 PM
 * @Description:藏品参观点的顺序容器
 */
public interface ExhibitionPointContainer {

    /**
     * @return 解说导游，知道这个参观点游览完下一个该去哪里
     * */
    public PresentationGuide getGuide();
}
