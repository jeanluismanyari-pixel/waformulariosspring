package pe.edu.cibertec.waformulariosspring.model;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginModel {
    @GetMapping("/login")
    public String login(){

        return "login";
    }
}
