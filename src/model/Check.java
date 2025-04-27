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
public class Check {
    private int id;
    private Timestamp dataHoraCadastro;
    private Timestamp dataHoraEntrada;
    private Timestamp dataHoraSaida;
    private String obs;
    private char status;

    public Check(int id, Timestamp dataHoraCadastro, Timestamp dataHoraEntrada, Timestamp dataHoraSaida, String obs, char status) {
        this.id = id;
        this.dataHoraCadastro = dataHoraCadastro;
        this.dataHoraEntrada = dataHoraEntrada;
        this.dataHoraSaida = dataHoraSaida;
        this.obs = obs;
        this.status = status;
    }
}
