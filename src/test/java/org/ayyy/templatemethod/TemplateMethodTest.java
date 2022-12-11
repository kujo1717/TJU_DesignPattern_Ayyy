package org.ayyy.templatemethod;

import org.ayyy.facilities.lecturehall.template.LectureTemplate;
import org.ayyy.facilities.lecturehall.template.lectures.ChineseHistoryLecture;
import org.ayyy.facilities.lecturehall.template.lectures.HongkongCultureLecture;
import org.junit.jupiter.api.Test;

/**
 * @Author: 杨严
 * @Date: 2022/12/06/7:08 PM
 * @Description:
 */
public class TemplateMethodTest {
    @Test
    void test(){
        LectureTemplate chineseHistoryLecture=new ChineseHistoryLecture();
        LectureTemplate hongkongCultureLecture=new HongkongCultureLecture();
        chineseHistoryLecture.addressLecture();
        hongkongCultureLecture.addressLecture();
    }
}
