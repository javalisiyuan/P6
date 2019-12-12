package com.study.p6_1.p61_3_1to1_3_2;

import com.study.p6_1.p61_1_1.car.BenzCar;
import com.study.p6_1.p61_1_1.car.Car;

public class MyDynamicProxyTest {
    public static void main(String[] args) throws ClassNotFoundException {
        MyDynamicProxyHandler m = new MyDynamicProxyHandler();
        Car car = (Car) m.getInstance(new BenzCar());
        car.drive();
    }
}