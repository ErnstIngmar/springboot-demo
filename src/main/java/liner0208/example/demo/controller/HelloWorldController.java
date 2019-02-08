package liner0208.example.demo.controller;

import liner0208.example.demo.services.ServerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloWorldController {

    @Autowired
    private ServerService serverService;

    @RequestMapping(value = "/world", method = RequestMethod.GET)
    public String helloHa(){
        return "email: " + serverService.getMail();
    }
}
