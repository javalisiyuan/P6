package com.study.p6_1.p61_1_1;

import com.study.p6_1.p61_1_1.abstractfactory.IBenzCarFactory;
import com.study.p6_1.p61_1_1.abstractfactory.ICarFactory;
import com.study.p6_1.p61_1_1.car.BMWCar;
import com.study.p6_1.p61_1_1.car.BenzCar;
import com.study.p6_1.p61_1_1.factorymethod.IBMWCar;
import com.study.p6_1.p61_1_1.factorymethod.IBenzCar;
import com.study.p6_1.p61_1_1.factorymethod.ICar;
import com.study.p6_1.p61_1_1.simplefactory.CarBeanFactory;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class P61_1_1Test {

    @Test
    void simpleFactoryTest() throws InstantiationException, IllegalAccessException {
        CarBeanFactory.create(BenzCar.class).drive();
        CarBeanFactory.create(BMWCar.class).drive();
    }

    @Test
    void factoryMethodTest() {
        ICar iCar = new IBenzCar();
        iCar.create().drive();
        ICar iCar1 = new IBMWCar();
        iCar1.create().drive();
    }

    @Test
    void abstractFactoryTest() {
        ICarFactory iCarBenzFactory = new IBenzCarFactory();
        iCarBenzFactory.create().drive();
        iCarBenzFactory.createCare().care();
        ICarFactory iCarBmwFactory = new IBenzCarFactory();
        iCarBmwFactory.create().drive();
        iCarBmwFactory.createCare().care();
    }
}
