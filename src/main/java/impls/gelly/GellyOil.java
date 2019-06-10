package impls.gelly;

import interfaces.Oil;
import org.springframework.stereotype.Component;

@Component
public class GellyOil implements Oil {

    @Override
    public void refuel() {
        System.out.println("Жрет, как Джили. Еще соточку проедим");
    }
}
