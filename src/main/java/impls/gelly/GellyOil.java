package impls.gelly;

import interfaces.Oil;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;


public class GellyOil implements Oil {

    private String gellyOil;

    public String getGellyOil() {
        return gellyOil;
    }

    public void setGellyOil(String gellyOil) {
        this.gellyOil = gellyOil;
    }

    @Override
    public void refuel() {
        System.out.println("Жрет, как Джили. Еще соточку проедим");
    }


}
