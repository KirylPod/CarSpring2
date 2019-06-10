package impls.ferrari;

import interfaces.Engine;
import org.springframework.stereotype.Component;
@Component
public class FerrariEngine implements Engine {

    @Override
    public void start() {

        System.out.println("Рычит, как Ферарри");

    }
}
