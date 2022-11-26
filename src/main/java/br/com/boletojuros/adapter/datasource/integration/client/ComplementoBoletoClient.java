package br.com.boletojuros.adapter.datasource.integration.client;

import br.com.boletojuros.adapter.datasource.integration.dto.BoletoDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value="complemento", url="${api.boleto}")
public interface ComplementoBoletoClient {

    @GetMapping("/{codigo}")
    BoletoDTO getBoleto(@PathVariable(value="codigo") String codigo);

}
