package model;

public abstract class Celular {
    private String modelo;
    private String fabricante;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public Celular(String modelo, String fabricante) {
        this.modelo = modelo;
        this.fabricante = fabricante;
    }

    protected abstract void ligar(String numeroDestinatario);

    protected abstract void mandarSMS(String mensagem, String numeroDestinatario);

}