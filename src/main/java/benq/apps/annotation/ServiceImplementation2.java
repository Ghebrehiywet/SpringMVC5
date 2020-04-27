package benq.apps.annotation;

import org.springframework.stereotype.Service;

@Service
public class ServiceImplementation2 implements  ServiceInterface{
    @Override
    public void display() {
        System.out.println("this is from implementation two");
    }
}
