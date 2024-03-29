package com.algaworks.algafoodapi;

import com.algaworks.algafoodapi.di.modelo.Cliente;
import com.algaworks.algafoodapi.di.service.AtivacaoClienteService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MeuPrimeiroController {

    private AtivacaoClienteService service;

    public MeuPrimeiroController(AtivacaoClienteService service) {
        this.service = service;
    }

    @GetMapping("/hello")
    @ResponseBody()
    public String hello() {
        Cliente cliente = new Cliente("João", "joao@gmail.com", "32568455");
        this.service.ativar(cliente);
        return "";
    }
}
