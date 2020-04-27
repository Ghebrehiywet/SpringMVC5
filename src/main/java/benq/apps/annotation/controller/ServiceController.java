package benq.apps.annotation.controller;

import benq.apps.annotation.ServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.lang.reflect.Field;

@Controller
@RequestMapping(value = "/service")// default is GET request
public class ServiceController {

    /**
     * Field injection is not recommended to constructor based injection
     * if more than one classes implements an interface it's mandatory to explicitly tell which class to
     * instantiate using the qualifier annotation
     */

//    @Autowired
//    @Qualifier("serviceImplementation")
    ServiceInterface serviceInterface;

    public ServiceController(@Qualifier("serviceImplementation") ServiceInterface serviceInterface) {
        this.serviceInterface = serviceInterface;
    }

    @GetMapping(value = {"/display", "display2"})
    public String displayMessage() {
        serviceInterface.display();

        return "display";
    }

}
