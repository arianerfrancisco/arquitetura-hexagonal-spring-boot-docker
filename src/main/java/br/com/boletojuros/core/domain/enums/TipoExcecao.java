package br.com.boletojuros.core.domain.enums;

public enum TipoExcecao {
    BOLETO_INVALIDO {
        @Override
        public String getMessagemErro() {
            return "O boleto informado é inválido";
        }
    },
    TIPO_BOLETO_INVALIDO{
        @Override
        public String getMessagemErro() {
            return "Só calculamos o juros do boleto XPTO";
        }
    },
    BOLETO_NAO_VENCIDO{
        @Override
        public String getMessagemErro() {
            return "O boleto informado não está vencido";
        }
    };
    public abstract String getMessagemErro();
}
