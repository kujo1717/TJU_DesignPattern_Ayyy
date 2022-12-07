package org.ayyy.base.showcase.bridge;

/**
 * @Author 2051196 刘一飞
 * @Date 2022/12/7
 * @JDKVersion 17.0.4
 */
// 抽象类，展柜的材质
public abstract class ShowcaseTexture {
    // 展柜类型对象，用于获取展柜信息
    protected ShowcaseType showcaseType;

    public void setShowcaseType(ShowcaseType showcaseType){
        this.showcaseType = showcaseType;
    }

    public abstract void construct();
}
