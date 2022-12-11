/**
 * Copyright (C), 2022-12-09
 * Author:   刘治华
 * Date:     2022/12/9 20:57
 * Description: 数据访问对象模式
 */

package org.ayyy.base.exhibitmanage;

public class Object {
    private int id;
    private String name;
    private int years;

    Object(int id, String name, int years){
        this.id = id;
        this.name = name;
        this.years = years;
    }

    public int getId(){
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getYears(){
        return years;
    }

    public void setYears(int years){
        this.years = years;
    }
}
