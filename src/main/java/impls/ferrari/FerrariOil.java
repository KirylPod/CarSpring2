package impls.ferrari;

import interfaces.Oil;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
public class FerrariOil implements Oil {

    @Override
    public void refuel() {
        System.out.println("Жрет, как Феррари. Надо на заправку");
    }
}
