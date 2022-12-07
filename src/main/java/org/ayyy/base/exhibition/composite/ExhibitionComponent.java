package org.ayyy.base.exhibition.composite;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @Author 2051196 刘一飞
 * @Date 2022/12/7
 * @JDKVersion 17.0.4
 */
@Data
@AllArgsConstructor
public abstract class ExhibitionComponent {
    private String exhibitionName;

    // 展品展出
    public abstract void exhibit();

    public void add(ExhibitionComponent exhibitionComponent){
        throw new UnsupportedOperationException();
    }

    public void remove(ExhibitionComponent exhibitionComponent){
        throw new UnsupportedOperationException();
    }


}
