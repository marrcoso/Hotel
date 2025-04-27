/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author user
 */
public class AlocacaoVaga {
    private Check check;
    private VagaEstacionamento vagaEstacionmento;
    private int id;
    private String obs;
    private char status;

    public AlocacaoVaga(Check check, VagaEstacionamento vagaEstacionmento, int id, String obs, char status) {
        this.check = check;
        this.vagaEstacionmento = vagaEstacionmento;
        this.id = id;
        this.obs = obs;
        this.status = status;
    }    
}
