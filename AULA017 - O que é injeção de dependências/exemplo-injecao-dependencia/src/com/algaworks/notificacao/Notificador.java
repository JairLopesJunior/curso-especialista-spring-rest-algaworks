package com.algaworks.notificacao;

import com.algaworks.modelo.Cliente;

public interface Notificador {

    void notificar(Cliente c, String msg);
}
