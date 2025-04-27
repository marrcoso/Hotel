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
public class ReservaQuarto {
    private Quarto quarto;
    private Reserva reserva;
    private int id;
    private Timestamp dataHoraInicio;
    private Timestamp dataHoraFim;
    private String obs;
    private char status;

    public ReservaQuarto(Quarto quarto, Reserva reserva, int id, Timestamp dataHoraInicio, Timestamp dataHoraFim, String obs, char status) {
        this.quarto = quarto;
        this.reserva = reserva;
        this.id = id;
        this.dataHoraInicio = dataHoraInicio;
        this.dataHoraFim = dataHoraFim;
        this.obs = obs;
        this.status = status;
    }
    
}
