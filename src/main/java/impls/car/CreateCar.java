package impls.car;

import abstracts.CarModel;
import interfaces.Car;
import interfaces.Engine;
import interfaces.Oil;
import interfaces.Transmission;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CreateCar extends CarModel implements Car, InitializingBean, DisposableBean {

    private String color;
    private int year;
    private boolean soundEnabled;

    public CreateCar(){    }

    public CreateCar(Oil oil, Engine engine, Transmission transmission) {    }

    public CreateCar(String color, int year, boolean soundEnabled) {
        this.color = color;
        this.year = year;
        this.soundEnabled = soundEnabled;
    }

    public CreateCar(Oil oil, Engine engine, Transmission transmission, String color, int year, boolean soundEnabled) {
        super(oil, engine, transmission);
        this.color = color;
        this.year = year;
        this.soundEnabled = soundEnabled;
    }

    @Override
    public void go() {
        getOil().refuel();
        getEngine().start();
        getTransmission().putGear();
        System.out.println("Цвет: " + color);
        System.out.println("Год выпуска: " + year);
        System.out.println("Выхлоп: " + soundEnabled);
        System.out.println("----------------------------------");

    }

    @Override
    public void brake() {
        System.out.println("Торомози, стоит радар");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isSoundEnabled() {
        return soundEnabled;
    }

    public void setSoundEnabled(boolean soundEnabled) {
        this.soundEnabled = soundEnabled;
    }

    public void initObject(){
        System.out.println("Init");
    }

    private void destroyObject() {
        System.out.println("Destroy");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println(this + "- method destroy()");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
 //       System.out.println(this + "- method init()");

    }
}
