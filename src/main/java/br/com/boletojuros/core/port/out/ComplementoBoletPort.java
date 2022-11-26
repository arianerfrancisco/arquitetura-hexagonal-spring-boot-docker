package br.com.boletojuros.core.port.out;

import br.com.boletojuros.core.domain.Boleto;

public interface ComplementoBoletPort {
    Boleto executar(String codigo);
}
