package impls.gelly;

import interfaces.Engine;
import org.springframework.stereotype.Component;

@Component
public class GellyEngine implements Engine {

    @Override
    public void start() {
        System.out.println("Что за звук Джили?! Тарахтит, как трактор");
    }
}
