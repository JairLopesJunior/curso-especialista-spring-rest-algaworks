package com.algaworks.algafoodapi.di.notificacao;

import com.algaworks.algafoodapi.di.modelo.Cliente;

public class NotificadorEmail implements Notificador {

    private boolean caixaAlta;
    private String hostServidorSmtp;

    public NotificadorEmail(String hostServidorSmtp) {
        this.hostServidorSmtp = hostServidorSmtp;
    }

    @Override
    public void notificar(Cliente c, String msg) {
        if (this.caixaAlta) {
            msg = msg.toUpperCase();
        }
        System.out.printf("Notificando %s através do e-mail %s usando SMTP %s: %s\n", c.getNome(), c.getEmail(), this.hostServidorSmtp, msg);
    }

    public void setCaixaAlta(boolean caixaAlta) {
        this.caixaAlta = caixaAlta;
    }
}