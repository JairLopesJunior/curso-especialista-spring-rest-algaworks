package com.algaworks.algafoodapi;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MeuPrimeiroController {

    @GetMapping("/hello")
    public ResponseEntity<String> hello() {
        String message = "Hello!";
        return new ResponseEntity<>(message, HttpStatus.OK);
    }
}
