package impls.car;

import org.springframework.beans.factory.support.MethodReplacer;
import org.springframework.stereotype.Component;


import java.lang.reflect.Method;
@Component
public class GoReplacer implements MethodReplacer {

    @Override
    public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
        System.out.println("Drive");
        return null;
    }
}
