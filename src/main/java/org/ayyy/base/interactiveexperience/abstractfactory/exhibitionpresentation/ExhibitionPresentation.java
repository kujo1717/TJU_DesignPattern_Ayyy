package org.ayyy.base.interactiveexperience.abstractfactory.exhibitionpresentation;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.ayyy.base.interactiveexperience.abstractfactory.InteractiveExperience;

/**
 * @Author: 杨严
 * @Date: 2022/12/06/3:07 PM
 * @Description:展览讲解，抽象基类
 */
@Data
@NoArgsConstructor
public abstract class ExhibitionPresentation extends InteractiveExperience {

    //解说对象的名字
    private String targetName;
    //解说对象的类型
    private ExhibitionPresentationType targetType;
    //静态ID
    private static Long countID=0l;

    //constructor
    public ExhibitionPresentation(String targetName, ExhibitionPresentationType targetType){
        this.targetName=targetName;
        this.targetType=targetType;
        this.name=this.targetName;
        this.id=countID++;
    }

    /**
     * 解说开始
     * */
    public abstract void presentation();
}
