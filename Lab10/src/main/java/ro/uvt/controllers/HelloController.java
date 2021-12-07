package ro.uvt.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ro.uvt.difexamples.ClientComponent;

@RestController
public class HelloController {
    @Autowired
    private ClientComponent clientComponent;

    @GetMapping()
    public String sayHello(){
        return "Hello from Spring";
    }

}
