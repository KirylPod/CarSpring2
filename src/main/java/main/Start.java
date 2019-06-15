package main;

import impls.car.CreateCar;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Start {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("car_context.xml");

        CreateCar createCar1 = (CreateCar)context.getBean("createCar1");
        CreateCar createCar2 = (CreateCar)context.getBean("createCar2");
        createCar1.go();
        createCar2.go();


        //       CreateCar createCar=(CreateCar)context.getBean("createCarOld");
        //      CreateCar createCar=(CreateCar)context.getBean("createCar");
//        CreateCar createCar = (CreateCar) context.getBean("createCar");
//        createCar.go();
//        createCar.brake();

    }


}
