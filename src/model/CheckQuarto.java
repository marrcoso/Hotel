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
public class CheckQuarto {
    private Check check;
    private Quarto quarto;
    private int id;
    private Timestamp dataHoraInicio;
    private Timestamp dataHoraFim;
    private String obs;
    private char status;

    public CheckQuarto(Check check, Quarto quarto, int id, Timestamp dataHoraInicio, Timestamp dataHoraFim, String obs, char status) {
        this.check = check;
        this.quarto = quarto;
        this.id = id;
        this.dataHoraInicio = dataHoraInicio;
        this.dataHoraFim = dataHoraFim;
        this.obs = obs;
        this.status = status;
    }
    
    
}
