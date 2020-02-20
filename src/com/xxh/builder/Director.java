package com.xxh.builder;

public class Director {

    ConcreteCarBuilder builder=new ConcreteCarBuilder();

    public ProductCar leader(String order){
        if(order.equals("造最好的车")){
            //零件全是a的车
            builder.buildWindow("a");
            builder.buildWheel("a");
            builder.buildEngine("a");
            return builder.GetCar();
        }else if(order.equals("杂交的车")){
            //零件有a有b的车
            builder.buildWindow("b");
            builder.buildWheel("a");
            builder.buildEngine("b");
            return builder.GetCar();
        }else {
            //零件全是b的车
            builder.buildWindow("b");
            builder.buildWheel("b");
            builder.buildEngine("b");
            return builder.GetCar();
        }
    }
}
