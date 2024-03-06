package com.algaworks.service;

import com.algaworks.modelo.Produto;
import com.algaworks.modelo.Cliente;
import com.algaworks.notificacao.Notificador;

public class EmissaoNotaFiscalService {

    private Notificador notificador;

    public EmissaoNotaFiscalService(Notificador notificador) {
        this.notificador = notificador;
    }

    public void emitir(Cliente c, Produto p) {
        // TODO emite a nota fiscal aqui...

        this.notificador.notificar(c, "Seu cadastro no sistema está ativo!");
    }
}
