package benq.apps.annotation.controller;

import benq.apps.annotation.ServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/service")// default is GET request
public class ServiceController {

    //  Field injection is not recommended to constructor based injection
    @Autowired
    @Qualifier("serviceImplementation")
    ServiceInterface serviceInterface;

    public ServiceController(@Qualifier("serviceImplementation") ServiceInterface serviceInterface) {
        this.serviceInterface = serviceInterface;
    }

    @GetMapping(value = "/display")
    public String displayMessage() {
        serviceInterface.display();

        return "display";
    }

}
