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
public class Reserva {
    private int id;
    private Timestamp dataHoraReserva;
    private Timestamp dataPrevistaEntrada;
    private Timestamp dataPrevistaSaida;
    private String obs;
    private char status;

    public Reserva(int id, Timestamp dataHoraReserva, Timestamp dataPrevistaEntrada, Timestamp dataPrevistaSaida, String obs, char status) {
        this.id = id;
        this.dataHoraReserva = dataHoraReserva;
        this.dataPrevistaEntrada = dataPrevistaEntrada;
        this.dataPrevistaSaida = dataPrevistaSaida;
        this.obs = obs;
        this.status = status;
    }
}
