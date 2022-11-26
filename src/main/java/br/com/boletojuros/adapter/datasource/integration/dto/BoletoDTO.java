package br.com.boletojuros.adapter.datasource.integration.dto;

import br.com.boletojuros.core.domain.enums.TipoBoleto;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
@Getter
@Setter
public class BoletoDTO {
    private String codigo;

    @JsonProperty("data_vencimento") // response da api
    private LocalDate dataVencimento;

    private BigDecimal valor;

    private TipoBoleto tipo; // Adaptadores podem depender das classes do domminio, mas não vale o inverso.
}
