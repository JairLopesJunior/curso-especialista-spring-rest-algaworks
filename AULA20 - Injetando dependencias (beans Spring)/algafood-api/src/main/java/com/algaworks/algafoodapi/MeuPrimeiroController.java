package com.algaworks.algafoodapi;

import com.algaworks.algafoodapi.di.service.AtivacaoClienteService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MeuPrimeiroController {

    private AtivacaoClienteService service;

    public MeuPrimeiroController(AtivacaoClienteService service) {
        this.service = service;
    }

    @GetMapping("/hello")
    public ResponseEntity<String> hello() {
        String message = "Hello!";
        return new ResponseEntity<>(message, HttpStatus.OK);
    }
}
