package com.algaworks.service;

import com.algaworks.modelo.Cliente;
import com.algaworks.notificacao.Notificador;

public class AtivacaoClienteService {

    private Notificador notificador;

    public AtivacaoClienteService(Notificador notificador) {
        this.notificador = notificador;
    }

    public void ativar(Cliente c) {
        c.ativar();
        this.notificador.notificar(c, "Seu cadastro no sistema está ativo!");
    }
}
