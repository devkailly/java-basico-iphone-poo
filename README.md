# Desafio de Programação Orientada a Objetos - iPhone

Este desafio consiste na modelagem e implementação em Java de um componente do sistema que representa um iPhone. O objetivo é praticar os conceitos de Programação Orientada a Objetos (POO) e aplicar esses conceitos na representação do iPhone como um reprodutor musical, aparelho telefônico e navegador na internet. Embora seja um desafio simples, permitiu a aplicação dos pilares da orientação a objetos e o desenvolvimento das funcionalidades esperadas para o iPhone.

## O projeto está organizado em pacotes da seguinte forma:

- `interfaces`: Contém as interfaces `NavegadorInterface` e `ReprodutorInterface`.
- `model`: Contém a classe abstrata `Celular` e a classe concreta `iPhone`.
- `iphone`: Contém a classe `Main` para testar a funcionalidade do iPhone.

## Funcionalidades

### Reprodutor Musical

- `tocar(String musica)`: Toca uma música.
- `pausar()`: Pausa a música.
- `parar()`: Para a música.
- `selecionarMusica(String novaMusica)`: Seleciona uma nova música.

### Aparelho Telefônico

- `ligar(String numero)`: Faz uma ligação para o número especificado.
- `mandarSMS(String mensagem, String numero)`: Envia uma mensagem SMS para o número especificado.
- `adicionarAosFavoritos(String numero)`: Adiciona um número aos favoritos.

### Navegador de Internet

- `exibirPagina(String URL)`: Exibe a página web especificada.
- `adicionarNovaAba()`: Adiciona uma nova aba ao navegador.
- `atualizarPagina()`: Atualiza a página atual.

## Requisitos do Sistema
Para executar o componente iPhone, certifique-se de que você tenha o seguinte ambiente configurado:

- Java Development Kit (JDK) 8 ou superior instalado.
- Ambiente de desenvolvimento integrado (IDE) de sua preferência para compilar e executar o código.

## Siga as etapas abaixo para executar o projeto:
1. Clone ou faça o download deste repositório para sua máquina local.
2. Abra o projeto em seu ambiente de desenvolvimento.
3. Compile e execute a classe 'Main' para ver os exemplos de uso do componente iPhone.

