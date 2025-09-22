package pe.edu.cibertec.waformulariosspring.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String login(Model model) {
        model.addAllAttributes("loginModel", new LoginModel());
        return "login";
    }
}
