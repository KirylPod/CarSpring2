package pool;

import enums.ColorStyle;
import interfaces.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import qualifiers.CarType;

@Component
public class CarPool  {
    public CarPool(){
        System.out.println("CarPool constructor");
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



