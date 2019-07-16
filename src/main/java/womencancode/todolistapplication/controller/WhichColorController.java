package womencancode.todolistapplication.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WhichColorController {
    @GetMapping("/whichcolor/{color}")
    public String whichColor(@PathVariable String color) {
        return new StringBuilder().append("The color chosen is ").append(color).toString();
    }
}
