package impls.car;

import abstracts.CarModel;
import enums.ColorStyle;
import interfaces.Engine;
import interfaces.Oil;
import interfaces.Transmission;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Configuration
public class CreateCar extends CarModel implements InitializingBean, DisposableBean {

    private ColorStyle color;
    private int year;
    private boolean soundEnabled;

    public CreateCar() {
    }

//    public CreateCar(Oil oil, Engine engine, Transmission transmission) {
//        super(oil, engine, transmission);
//    }

    @Bean
    @Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public CreateCar createCar1() {
        return new CreateCar();
    }

    @Bean
    @Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public CreateCar createCar2() {
        return new CreateCar(ColorStyle.BLACK, 2010, true);
    }


    public CreateCar(ColorStyle color, int year, boolean soundEnabled) {
        this.color = color;
        this.year = year;
        this.soundEnabled = soundEnabled;
    }

    public CreateCar(Oil oil, Engine engine, Transmission transmission, ColorStyle color, int year, boolean soundEnabled) {
        //  super(oil, engine, transmission);
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

    public ColorStyle getColor() {
        return color;
    }

    public void setColor(ColorStyle color) {
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

    public void initObject() {
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
        System.out.println(this + "- method init()");

    }
}
