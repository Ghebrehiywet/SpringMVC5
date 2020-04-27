package benq.apps.annotation;

import org.springframework.stereotype.Service;

@Service
public class ServiceImplementation implements ServiceInterface {
    @Override
    public void display() {
        System.out.println("this is from service implementation");
    }
}
