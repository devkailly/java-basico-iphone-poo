package iphone;

import model.Iphone;

public class Main {
    public static void main(String[] args) {
        Iphone iphone = new Iphone("iPhone", "Apple", 2007, 1.0);

        // Testando os métodos da interface NavegadorInterface
        iphone.exibirPagina("www.google.com.br");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();

        // Testando os métodos da interface ReprodutoInterface
        iphone.tocar("Música A");
        iphone.pausar();
        iphone.parar();
        iphone.selecionarMusica("Música B");

        // Testando os métodos herdados da classe Celular
        iphone.ligar("123456789");
        iphone.mandarSMS("Olá!", "987654321");
        iphone.adicionarAosFavoritos("123456789");
    }

}