package org.ayyy.base.showcase.bridge;

/**
 * @Author 2051196 刘一飞
 * @Date 2022/12/7
 * @JDKVersion 17.0.4
 */
public class WoodenTexture extends ShowcaseTexture{
    @Override
    public void construct() {
        System.out.println("构建木质的" + showcaseType.getTypeInfo() + "展柜");
    }
}
