package com.algaworks;

import com.algaworks.modelo.Cliente;
import com.algaworks.notificacao.Notificador;
import com.algaworks.notificacao.NotificadorEmail;
import com.algaworks.service.AtivacaoClienteService;

public class Main {
    public static void main(String[] args) {
        Cliente joao = new Cliente("João", "joao@xyz.com", "34989655");
        Cliente maria = new Cliente("Maria", "maria@xyz.com", "34989655");

        Notificador n = new NotificadorEmail();

        AtivacaoClienteService ativar = new AtivacaoClienteService(n);
        ativar.ativar(joao);
        ativar.ativar(maria);
    }
}
