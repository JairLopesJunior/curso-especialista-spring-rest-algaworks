package com.algaworks.algafoodapi.di.notificacao;

import com.algaworks.algafoodapi.di.modelo.Cliente;
import org.springframework.stereotype.Component;

@Component
public class NotificadorEmail implements Notificador {

    @Override
    public void notificar(Cliente c, String msg) {
        System.out.printf("Notificando %s através do e-mail %s: %s\n", c.getNome(), c.getEmail(), msg);
    }
}