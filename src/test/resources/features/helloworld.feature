#language: pt

Funcionalidade: Consultar Hello world em uma API.

  Cenario: Consultar Hello World
    Dado que eu possua a operacao desejada "hello"
    Quando eu realizar a requisicao no endpoint
    Então a api me retorna "Hello, World!"

  Cenario: Consultar index
    Dado que eu possua a operacao desejada ""
    Quando eu realizar a requisicao no endpoint
    Então a api me retorna "Esta é a pasta raiz, ajuste sua rota!"