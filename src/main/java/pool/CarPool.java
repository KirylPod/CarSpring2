package pool;

import enums.ColorStyle;
import interfaces.Car;
import org.springframework.beans.factory.annotation.Autowired;
import qualifiers.CarType;

public class CarPool {
    public CarPool() {
        System.out.println("Car pool constructor()");
    }

    @Autowired
    @CarType(sound = false, color = ColorStyle.BLACK)
    public Car blackCar;

    @Autowired
    @CarType(sound = true, color = ColorStyle.BLACK)
    public Car blackSoundableCar;

    public Car getBlackCar() {
        return blackCar;
    }

    public Car getBlackSoundableCar() {
        return blackSoundableCar;
    }
}



