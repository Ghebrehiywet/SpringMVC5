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
    public String createUser(Model mod, UserModel userModel) {

        System.out.println(userModel);
        System.out.println(mod);
        return "userDetail";
    }

    @GetMapping("/signup2")
    public String createUser2() {
        return "signup2";
    }

    /**
     * Data binding is done by framework for primitive and string data types
     * but data formatter is done for phone reference object
     *
     * @param userModel
     * @return
     */
    @PostMapping("/signup2")
    public String createUser2(UserModel userModel) {

        System.out.println(userModel);
        return "userDetail2";
    }

    @ModelAttribute("ModelMethod")
    public UserModel ModelMethod() {
        UserModel userModel = new UserModel();
        System.out.println("Model Method:" + userModel);
        return userModel;
    }

}
