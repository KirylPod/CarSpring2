package impls;

import org.springframework.stereotype.Component;

@Component
public class Database {

    private Database(){
        testConnection();
    }

    private void testConnection(){
        System.out.println("Есть контакт");
    }

}
