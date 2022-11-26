package br.com.boletojuros.adapter.datasource.database;

import br.com.boletojuros.core.domain.BoletoCalculado;
import br.com.boletojuros.core.port.out.SalvarCalculoBoletoPort;
import org.springframework.stereotype.Component;

@Component
public class SalvarBoletoCalculado implements SalvarCalculoBoletoPort {
    @Override
    public void executar(BoletoCalculado boletoCalculado) {

    }
}
