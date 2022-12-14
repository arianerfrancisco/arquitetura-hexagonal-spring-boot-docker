# API CALCULA JUROS BOLETO

## PROBLEMA:
**ENQUANTO** usuário da API

**QUERO** digitar um código de boleto vencido

**E** quero receber o valor do juros.


## Requisitos Funcionais
- Desenvolver um API
- Incluir um código de boleto válido
- O Boleto deve estar vencido
- Apenas boletos do tipo XPTO podem ser calculados
- Para receber as informações do boleto, consumir a API de Boletos
- Em caso de erro, devolver o motivo do erro
- A definição dos juros de boleto bancário ocorre considerando os dias de atraso, de maneira proporcional.
    - Taxa de juros de 1% ao mes ou 1 / 30 = 0,033% ao dia
- O valor final do boleto deve ser:
    - Valor do boleto +  valor dos juros em atraso
- Salvar em um **banco de dados** todos os cálculos realizados

Request →
```json
{
  "codigo": "string",
  "data_pagamento": "YYY-MM-DD HH:MM:SS"
}
```

Response →
```json
{
  "codigo": "string",
  "data_vencimento": "YYYY-MM-DD",
  "valor": 00.0,
  "tipo": "XPTO|NORMAL"
}
```

<br>

# Ferramentas

- Intellij
- Spring boot
- Docker
- Docker-compose
- Swagger
- Spring JPA
- Mysql
- Feign Client
- Map Struct

## Repositório criado para fins de estudo. 
### Curso
- Formação Júnior AWS Cloud e Spring Boot REST com Angular 13 - JDEV Treinamento

![45](https://user-images.githubusercontent.com/72419533/204140906-94d6a875-e2c2-4ca7-af24-3f8ac2580ed3.PNG)
