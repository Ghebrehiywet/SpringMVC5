package benq.apps.annotation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/country")
public class ReqParaController {

    /**
     * @param id must be exactly equal to request parameter
     * @return
     */
    @GetMapping("name")
    public String displayMessage(@RequestParam Integer id) {
        return "display";
    }

    /**
     * @param param
     * @return
     * @RequestParam parameter must be equal to request parameter, we don't care about the Integer "param"
     */
    @GetMapping("name2")
    public String display2Message(@RequestParam("id2") Integer param) {
        return "display";
    }

    /**
     * RequestParam is not required by default
     * @param param
     * @return
     */
    @GetMapping("name3")
    public String display3Message(@RequestParam(value = "id2", required = false, defaultValue = "12") Integer param) {
        return "display";
    }

    /**
     * PathVariable is required by default
     * @param param
     * @return
     */
    @GetMapping("name4/{id1}/{id2}")
    public String display4Message(@PathVariable(value = "id1", required = false) Integer param,
                                  @PathVariable(required = false) Integer id2) {
        return "display";
    }


}
