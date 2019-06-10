package impls.ferrari;

import interfaces.Transmission;
import org.springframework.stereotype.Component;

@Component
public class FerrariTransmission implements Transmission {

    @Override
    public void putGear() {
        System.out.println("Ангелы не успевают за Феррари. Уже 100 км/ч, а все еще 1-ая передача");
    }
}
