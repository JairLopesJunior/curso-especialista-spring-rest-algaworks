package com.algaworks.notificacao;

import com.algaworks.modelo.Cliente;

public class NotificadorEmail implements Notificador {

    @Override
    public void notificar(Cliente c, String msg) {
        System.out.printf("Notificando %s através do e-mail %s: %s\n", c.getNome(), c.getEmail(), msg);
    }
}
