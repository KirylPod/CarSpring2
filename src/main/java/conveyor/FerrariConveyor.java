package conveyor;

import interfaces.Car;
import interfaces.CarConveyor;
import org.springframework.stereotype.Component;

@Component
public abstract class FerrariConveyor implements CarConveyor {

    @Override
    public abstract Car createCar();
}
