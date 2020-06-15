package peralta.george.exemplolombok.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import peralta.george.exemplolombok.model.Client;

@RestController
public class HelloWorldController {

    @GetMapping("/")
    public String index() {
        return "Exemplo lombok";
    }


    @GetMapping("/product")
    public String getProduct() {
        return "Exemplo produto";
    }
}
