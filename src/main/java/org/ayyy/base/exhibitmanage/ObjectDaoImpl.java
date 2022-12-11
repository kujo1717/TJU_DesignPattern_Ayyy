/**
 * Copyright (C), 2022-12-09
 * Author:   刘治华
 * Date:     2022/12/9 20:57
 * Description: 原型模式操作实现类
 */
package org.ayyy.base.exhibitmanage;

import org.ayyy.util.CallStackLogInfo;
import org.ayyy.util.CallStackLogger;

import java.util.ArrayList;
import java.util.List;

public class ObjectDaoImpl implements ObjectDao{

    private final List<Object> objects;
    private int nextId;

    public ObjectDaoImpl(){
        objects = new ArrayList<Object>();
        nextId = 0;
    }

    @Override
    public List<Object> getAllObjects() {
        CallStackLogger.log(
                new CallStackLogInfo(
                        "ObjectDaoImpl",
                        "getAllObjects",
                        String.valueOf(System.identityHashCode(this)),
                        "查找所有展品"
                )
        );

        return this.objects;
    }

    @Override
    public Object getObject(int id) {
        CallStackLogger.log(
                new CallStackLogInfo(
                        "ObjectDaoImpl",
                        "getObject",
                        String.valueOf(System.identityHashCode(this)),
                        "查找展品: "+String.valueOf(id)
                )
        );

        for (Object object :this.objects) {
            if (object.getId() == id) {
                return object;
            }
        }
        return null;
    }

    @Override
    public void updateObject(int id, int years) {
        CallStackLogger.log(
                new CallStackLogInfo(
                        "ObjectDaoImpl",
                        "updateObject",
                        String.valueOf(System.identityHashCode(this)),
                        "更新展品信息: "+String.valueOf(id) + " 展品历史: " + String.valueOf(years)+"年"
                )
        );

        for (Object object : this.objects) {
            if (object.getId() == id) {
                object.setYears(years);
                break;
            }
        }
    }

    @Override
    public void deleteObject(int id) {
        CallStackLogger.log(
                new CallStackLogInfo(
                        "ObjectDaoImpl",
                        "deleteObject",
                        String.valueOf(System.identityHashCode(this)),
                        "撤下展品: "+String.valueOf(id)
                )
        );

        for (int i=0;i<this.objects.size();++i) {
            if (this.objects.get(i).getId() == id) {
                this.objects.remove(i);
                break;
            }
        }
    }

    @Override
    public int addObject(String name, int years) {
        CallStackLogger.log(
                new CallStackLogInfo(
                        "ObjectDaoImpl",
                        "addObject",
                        String.valueOf(System.identityHashCode(this)),
                        "新增展品: "+String.valueOf(name) + " 历史为: "+String.valueOf(years)+"年"
                )
        );

        Object newObject = new Object(this.nextId++, name, years);
        this.objects.add(newObject);
        return newObject.getId();
    }
}
