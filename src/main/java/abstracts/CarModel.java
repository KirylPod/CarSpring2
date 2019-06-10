package abstracts;

import interfaces.Car;
import interfaces.Engine;
import interfaces.Oil;
import interfaces.Transmission;

public abstract class CarModel implements Car {

    private Oil oil;
    private Engine engine;
    private Transmission transmission;

    public CarModel() {

        System.out.println(this + " - Фераджили constructor()");
    }

    public CarModel(Oil oil, Engine engine, Transmission transmission) {
        this.oil = oil;
        this.engine = engine;
        this.transmission = transmission;
    }

    public Oil getOil() {
        return oil;
    }

    public void setOil(Oil oil) {
        this.oil = oil;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

}
