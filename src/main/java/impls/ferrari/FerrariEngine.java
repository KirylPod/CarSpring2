package impls.ferrari;

import interfaces.Engine;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
@Configuration
public class FerrariEngine implements Engine {

    @Override
    public void start() {

        System.out.println("Рычит, как Ферарри");

    }
}
