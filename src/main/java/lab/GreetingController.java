package lab;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class GreetingController {

    @GetMapping("/index")
    public String greeting() {
        return "index";
    }

    @GetMapping("/greeting")
    public String greetingForm(Model model) {
        model.addAttribute("buddyInfo", new BuddyInfo());
        return "greeting";
    }

    @PostMapping("/greeting")
    public String greetingSubmit(@ModelAttribute BuddyInfo buddyInfo, Model model) {
        model.addAttribute("buddyInfo", buddyInfo);
        return "result";
    }

}