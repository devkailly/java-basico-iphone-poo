package model;

import interfaces.NavegadorInterface;
import interfaces.ReprodutorInterface;


public class Iphone extends Celular
        implements NavegadorInterface, ReprodutorInterface {

    private int dataLancamento;
    private double versao;

    public Iphone(String model, String fabricante, int dataLancamento, double versao) {
        super(model, fabricante);
        this.dataLancamento = dataLancamento;
        this.versao = versao;
    }

    private void verificaConexao(){
        System.out.println("Verificando Conexão com a internet");
    }

    @Override
    public void exibirPagina(String URL) {
        verificaConexao();
        System.out.println("Acessando a pagina: " + URL);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Abrindo uma nova aba");
    }

    @Override
    public void atualizarPagina() {
        verificaConexao();
        System.out.println("Atualizando Pagina");
    }


    @Override
    public void tocar(String musica) {
        System.out.println("Tocando a musica " + musica);
    }

    @Override
    public void pausar() {
        System.out.println("Musica pausada");
    }

    @Override
    public void parar() {
        System.out.println("Musica interrompida");
    }

    @Override
    public void selecionarMusica(String novaMusica) {
        System.out.println("Selecionado outra musica" + novaMusica);
    }

    @Override
    public void ligar(String numeroDestinatario) {
        System.out.println("Ligando para " + numeroDestinatario + " no iPhone");
    }

    @Override
    public void mandarSMS(String mensagem, String numeroDestinatario) {
        System.out.println("Enviando mensagem: '" + mensagem + "'");
        System.out.println("Para: " + numeroDestinatario + " pelo iPhone");

    }

    public void adicionarAosFavoritos(String numero) {
        System.out.println("Adicionando o número " + numero + " aos favoritos");
    }

    public int getdataLancamento() {
        return dataLancamento;
    }

    public void setdataLancamento(int dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    public double getversao() {
        return versao;
    }

    public void setversao(double versao) {
        this.versao = versao;
    }
}