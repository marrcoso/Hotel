/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author user
 */
public class ProdutoCopa {
    private int id;
    private String descricao;
    private float valor;
    private String obs;
    private char status;

    public ProdutoCopa(int id, String descricao, float valor, String obs, char status) {
        this.id = id;
        this.descricao = descricao;
        this.valor = valor;
        this.obs = obs;
        this.status = status;
    }
}
