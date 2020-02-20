package com.xxh.builder;

import com.xxh.factory.AbstractEngine;
import com.xxh.factory.AbstractWheel;
import com.xxh.factory.AbstractWindow;

//车车建造者
public abstract class AbstractCarBuilder {
    public abstract ProductCar GetCar();
    public abstract void buildEngine(String type);
    public abstract void buildWheel(String type);
    public abstract void buildWindow(String type);
}
