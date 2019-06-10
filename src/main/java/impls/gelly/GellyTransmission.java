package impls.gelly;

import interfaces.Transmission;
import org.springframework.stereotype.Component;

@Component
public class GellyTransmission implements Transmission {

    @Override
    public void putGear() {
        System.out.println("Джили, не хватает шестой передачи");
    }
}
