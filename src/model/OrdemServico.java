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
public class OrdemServico {
    private Check check;
    private int id;
    private Timestamp dataHoraCadastro;
    private Timestamp dataHoraPrevisaoInicio;
    private Timestamp dataHoraPrevisaoTermino;
    private String obs;
    private char status;

    public OrdemServico(Check check, int id, Timestamp dataHoraCadastro, Timestamp dataHoraPrevisaoInicio, Timestamp dataHoraPrevisaoTermino, String obs, char status) {
        this.check = check;
        this.id = id;
        this.dataHoraCadastro = dataHoraCadastro;
        this.dataHoraPrevisaoInicio = dataHoraPrevisaoInicio;
        this.dataHoraPrevisaoTermino = dataHoraPrevisaoTermino;
        this.obs = obs;
        this.status = status;
    }
}
