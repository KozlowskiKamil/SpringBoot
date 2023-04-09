package com.example.Springboot001;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloExample {
    @RequestMapping("/")
    public String hello() {
        return "Hello World!";
    }

    @RequestMapping("/greeting") // http://localhost:8080/greeting?name=Ania
    public String helloAgain(@RequestParam(value = "name", defaultValue = "User") String name) {
        return "Hello " + name;

    }
    @RequestMapping("/hello") // http://localhost:8080/hello?name=cokolwiek
    public String hello (@RequestParam(value = "name", defaultValue = "Kamil") String name){
        return "Witam " + name;
    }

/*    @RequestMapping("/number")
    public Integer number(@RequestParam(value = "number", defaultValue = 12345) Integer number){
        return number;
    }*/
}
