package com.xxh.builder;

import com.xxh.factory.AbstractWindow;
import com.xxh.factory.ConcretePartFactory1;
import com.xxh.factory.ConcretePartFactory2;
import com.xxh.factory.ConcretePartFactory3;

import java.awt.*;

public class ConcreteCarBuilder extends AbstractCarBuilder {
    ProductCar car;
    ConcreteCarBuilder(){
        car=new ProductCar();
    }

    @Override
    public ProductCar GetCar() {
        return car;
    }

    @Override
    public void buildEngine(String type) {
        ConcretePartFactory2 engineFactory=new ConcretePartFactory2();
        car.setEngine(engineFactory.CreateEngine(type));
    }

    @Override
    public void buildWheel(String type) {
        ConcretePartFactory3 wheelFactory = new ConcretePartFactory3();
        car.setWheel(wheelFactory.CreateWheel(type));

    }

    @Override
    public void buildWindow(String type) {
        ConcretePartFactory1 windowFactory=new ConcretePartFactory1();
        AbstractWindow window = windowFactory.CreateWindow(type);
        car.setWindow(window);
    }
}
