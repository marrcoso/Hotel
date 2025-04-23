package model;

public class Veiculo {
    private int id;
    private String placa;
    private String cor;
    private char status;
    private Modelo modelo;

    public Veiculo(int id, String placa, String cor, char status, Modelo modelo) {
        this.id = id;
        this.placa = placa;
        this.cor = cor;
        this.status = status;
        this.modelo = modelo;
    }
}
