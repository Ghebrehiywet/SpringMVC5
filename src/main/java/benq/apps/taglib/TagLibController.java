package benq.apps.taglib;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/taglib")
public class TagLibController {

    @GetMapping("/create")
    public String createAccount(@ModelAttribute("userModel") User user,Model model) {

        //  1.  Using list
        model.addAttribute("genderList", Arrays.asList("Female", "Male"));
        //  2.  Using map
        Map<String, String> mapList = new HashMap<>();
        mapList.put("FM","Female");
        mapList.put("ML","Male");
        model.addAttribute("genderMap", mapList);
        //  3.  Using

        return "tagLib/create";
    }

    @PostMapping("/create")
    public String saveAccount(User user, Model model, @ModelAttribute("user") User userModel) {
        System.out.println("POST");
        System.out.println(user);
        System.out.println(userModel);

        return "redirect:/taglib/create";
    }
}
