package benq.apps.databinding;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {
    public UserController() {
    }

    @GetMapping("/signup")
    public String createUser(Model model) {
        model.addAttribute("model", new UserModel());
        return "signup";
    }

    @PostMapping("/signup")
    public String createUser(UserModel userModel) {

        System.out.println(userModel);
        return "signup";
    }

}
