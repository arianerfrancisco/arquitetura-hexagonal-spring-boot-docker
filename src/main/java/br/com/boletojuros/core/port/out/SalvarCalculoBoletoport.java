package br.com.boletojuros.core.port.out;
import br.com.boletojuros.core.domain.BoletoCalculado;

public interface SalvarCalculoBoletoport {
    void executar(BoletoCalculado boletoCalculado);
}
