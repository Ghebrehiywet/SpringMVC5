package benq.apps.databinding;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {
    public UserController() {
    }

    @GetMapping("/signup")
    public String createUser(@ModelAttribute("User") UserModel userModel,
                             @ModelAttribute("ModelMethod") UserModel mod2, Model model) {

        //  Both modelMethod1 and modelMethod2 will have the same value
        Object modelMethod1 = model.getAttribute("ModelMethod");
        Object modelMethod2 = userModel;

        System.out.println();
        return "signup";
    }

    @PostMapping("/signup")
    public String createUser(UserModel userModel) {

        System.out.println(userModel);
        return "signup";
    }

    @ModelAttribute("ModelMethod")
    public UserModel ModelMethod() {
        UserModel userModel = new UserModel("1223", "Name");
        System.out.println("Model Method:" + userModel);
        return userModel;
    }

}
