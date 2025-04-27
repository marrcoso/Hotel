/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import jdk.jfr.Timestamp;

/**
 *
 * @author user
 */
public class CopaQuarto {
    private CheckQuarto checkQuarto;
    private ProdutoCopa produtoCopa;
    private int id;
    private float quantidade;
    private Timestamp dataHoraPedido;
    private String obs;
    private char status;

    public CopaQuarto(CheckQuarto checkQuarto, ProdutoCopa produtoCopa, int id, float quantidade, Timestamp dataHoraPedido, String obs, char status) {
        this.checkQuarto = checkQuarto;
        this.produtoCopa = produtoCopa;
        this.id = id;
        this.quantidade = quantidade;
        this.dataHoraPedido = dataHoraPedido;
        this.obs = obs;
        this.status = status;
    }
    
    
}
