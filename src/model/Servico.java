/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author user
 */
public class Servico {
    private int id;
    private String descricao;
    private String obs;
    private char status;

    public Servico(int id, String descricao, String obs, char status) {
        this.id = id;
        this.descricao = descricao;
        this.obs = obs;
        this.status = status;
    }
}
