package org.ayyy.composite;

import org.ayyy.base.exhibition.composite.ExhibitionArea;
import org.ayyy.base.exhibition.composite.ExhibitionComponent;
import org.ayyy.base.exhibition.composite.ExhibitionComponentItem;
import org.ayyy.base.recordexhibits.chainofresponsibility.MunicipalDepartment;
import org.ayyy.base.recordexhibits.chainofresponsibility.NationalDepartment;
import org.ayyy.base.recordexhibits.chainofresponsibility.ProvincialDepartment;
import org.ayyy.base.recordexhibits.chainofresponsibility.RecordApplication;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

/**
 * @Author 2051196 刘一飞
 * @Date 2022/12/7
 * @JDKVersion 17.0.4
 */
public class Composite {
    @Test
    void test(){
        // 创建主展区（根节点）
        ExhibitionComponent main_area = new ExhibitionArea("主展区");

        // 创建三个分展区
        ExhibitionComponent area1 = new ExhibitionArea("陶瓷展区");
        ExhibitionComponent area2 = new ExhibitionArea("壁画展区");
        ExhibitionComponent area3 = new ExhibitionArea("书法展区");

        // 陶瓷展区添加子展区
        ExhibitionComponent child_area_1 = new ExhibitionArea("青花瓷展区");
        ExhibitionComponent child_area_2 = new ExhibitionArea("唐三彩展区");

        // 创建展品
        ExhibitionComponent item1 = new ExhibitionComponentItem(" 元青花四爱图梅瓶");
        ExhibitionComponent item2 = new ExhibitionComponentItem(" 景德镇窑青花人物纹玉壶春瓶");
        ExhibitionComponent item3 = new ExhibitionComponentItem(" 唐三彩骆驼");
        ExhibitionComponent item4 = new ExhibitionComponentItem(" 唐三彩女立俑");
        ExhibitionComponent item5 = new ExhibitionComponentItem(" 敦煌飞天");
        ExhibitionComponent item6 = new ExhibitionComponentItem(" 快雪时晴帖");
        ExhibitionComponent item7 = new ExhibitionComponentItem(" 石渠宝笈");

        // 在青花瓷中添加展品
        child_area_1.add(item1);
        child_area_1.add(item2);

        // 在唐三彩展区添加展品
        child_area_2.add(item3);
        child_area_2.add(item4);

        // 在陶瓷展区中添加陶瓷展区和唐三彩展区
        area1.add(child_area_1);
        area1.add(child_area_2);

        // 在壁画展区添加展品
        area2.add(item5);

        // 在书法展去添加展品
        area3.add(item6);
        area3.add(item7);

        // 在主展区添加三个分展区
        main_area.add(area1);
        main_area.add(area2);
        main_area.add(area3);

        // 开始展览
        main_area.exhibit();
    }
}
