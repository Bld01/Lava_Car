public class Carro {
    private String tipo;
    private String modelo;

    public Carro(String tipo, String modelo) {
        this.tipo = tipo;
        this.modelo = modelo;
    }

    public String getTipo() {
        return tipo;
    }

    public String getModelo() {
        return modelo;
    }
}