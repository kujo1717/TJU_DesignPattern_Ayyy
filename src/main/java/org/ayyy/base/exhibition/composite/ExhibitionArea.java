package org.ayyy.base.exhibition.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author 2051196 刘一飞
 * @Date 2022/12/7
 * @JDKVersion 17.0.4
 */
public class ExhibitionArea extends ExhibitionComponent {
    private List<ExhibitionComponent> exhibitionComponents = new ArrayList<>();

    public ExhibitionArea(String exhibitionName) {
        super(exhibitionName);
    }

    @Override
    public void exhibit() {
        System.out.println("----" + this.getExhibitionName() + "展区----");
        // 调用所有子节点的操作
        for (ExhibitionComponent ec:exhibitionComponents) {
            ec.exhibit();
        }
    }

    @Override
    public void add(ExhibitionComponent exhibitionComponent) {
        exhibitionComponents.add(exhibitionComponent);
    }

    @Override
    public void remove(ExhibitionComponent exhibitionComponent) {
        exhibitionComponents.remove(exhibitionComponent);
    }
}
