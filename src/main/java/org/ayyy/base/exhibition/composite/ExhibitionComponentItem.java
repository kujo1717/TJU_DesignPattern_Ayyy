package org.ayyy.base.exhibition.composite;

/**
 * @Author 2051196 刘一飞
 * @Date 2022/12/7
 * @JDKVersion 17.0.4
 */
public class ExhibitionComponentItem extends ExhibitionComponent {
    public ExhibitionComponentItem(String exhibitionName) {
        super(exhibitionName);
    }

    @Override
    public void exhibit() {
        System.out.println(this.getExhibitionName());
    }
}
