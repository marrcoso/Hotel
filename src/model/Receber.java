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
public class Receber {
    private int id;
    private Timestamp dataHoraCadastro;
    private float valorOriginal;
    private float desconto;
    private float acrescimo;
    private float valorPago;
    private String obs;
    private char status;
    private Check check;

    public Receber(int id, Timestamp dataHoraCadastro, float valorOriginal, float desconto, float acrescimo, float valorPago, String obs, char status, Check check) {
        this.id = id;
        this.dataHoraCadastro = dataHoraCadastro;
        this.valorOriginal = valorOriginal;
        this.desconto = desconto;
        this.acrescimo = acrescimo;
        this.valorPago = valorPago;
        this.obs = obs;
        this.status = status;
        this.check = check;
    }
    
    
}
