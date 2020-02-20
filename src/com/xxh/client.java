package com.xxh;

import com.xxh.builder.Director;
import com.xxh.builder.ProductCar;

public class client {
    public static void main(String[] args) {

        Director director = new Director();
        //造辆a车
        ProductCar car = director.leader("造最好的车");
        car.ShowCar();
        System.out.println("===================");
        //造辆杂交车
        ProductCar car1 = director.leader("杂交的车");
        car1.ShowCar();
        System.out.println("=====================");
        ProductCar car2 = director.leader("B级车");
        car2.ShowCar();

    }
}
