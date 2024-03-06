package com.algaworks.notificacao;

import com.algaworks.modelo.Cliente;

public class NotificadorSMS implements Notificador {

    @Override
    public void notificar(Cliente c, String msg) {
        System.out.printf("Notificando %s por SMS através do telefone %s: %s\n", c.getNome(), c.getTelefone(), msg);
    }
}
