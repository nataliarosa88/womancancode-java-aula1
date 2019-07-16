package womencancode.todolistapplication.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @GetMapping("/helloworld")
    public String helloWorld() {
        return "Hello World";
    }

    @GetMapping("/helloworld/{name}")
    public String helloWorld(@PathVariable String name) {
        return new StringBuilder().append("Hello ").append(name).toString();
    }

    @GetMapping("/whichcolor/{color}")
    public String whichColor(@PathVariable String color) {
        return new StringBuilder().append("The color chosen is ").append(color).toString();
    }
}
