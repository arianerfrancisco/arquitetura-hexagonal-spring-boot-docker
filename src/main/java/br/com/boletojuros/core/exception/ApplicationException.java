package br.com.boletojuros.core.exception;

import br.com.boletojuros.core.domain.enums.TipoExcecao;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ApplicationException extends RuntimeException{
    private TipoExcecao tipoExcecao;
}
