package lab;

import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class ApiController {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/HelloWorld")
    public String HelloWorld() {
        return "Hello World";
    }
}
