package com.careerdevs.HelloInternet2.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class RootController {

    /*
     *Method : GET
     * Path: /
     * Host : localhost 8081
     * URL: http://localhost:8081/
     **/

    @GetMapping("/")
    private String routeRoute(){
        return " You requested the root route ";
    }

    /*
     *Method : GET
     * Path: /hello
     * Host : localhost 8081
     * URL: http://localhost:8081/hello
     **/

    @GetMapping("/hello")
    private String helloRoute(){
        return " Hello CareerDevs!!!!";
    }

    /*
     *Method : GET
     * Path: /random
     * Host : localhost 8081
     * URL: http://localhost:8081/random
     **/

    @GetMapping("/random")
    private int randomRoute(){
        return (int) (Math.random()*100)+1 ;
    }
    /*
     *Method : GET
     * Path: /joke
     * Host : localhost 8081
     * URL: http://localhost:8081/hello
     **/

    @GetMapping("/joke")
    private String  jokeRoute(){
        String [] jokes = {
               "Hear about the new restaurant called Karma?",
                "There’s no menu: You get what you deserve.",
                "A bear walks into a bar and says, “Give me a whiskey and … cola.”\n" +
                        "“Why the big pause?” asks the bartender. The bear shrugged. “I’m not sure; I was born with them.”",
                "How does Moses make tea?\n" +
                        "He brews."
        };
        int jokeIndex = (int) (Math.random()* jokes.length);
        return jokes[jokeIndex];
    }

}
