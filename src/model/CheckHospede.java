package model;

public class CheckHospede {
    private int id;
    private String tipoHospede;
    private String obs;
    private char status;
    Hospede hospede;

    public CheckHospede(int id, String tipoHospede, String obs, char status, Hospede hospede) {
        this.id = id;
        this.tipoHospede = tipoHospede;
        this.obs = obs;
        this.status = status;
        this.hospede = hospede;
    }
}
