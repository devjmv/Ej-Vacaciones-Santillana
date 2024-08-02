package com.vacaciones.Models;

public class PropiedaMesModel {

    private String nameMes;
    private int day;

    public PropiedaMesModel(String nameMes, int day) {
        this.nameMes = nameMes;
        this.day = day;
    }

    public String getNameMes() {
        return nameMes;
    }

    public void setNameMes(String nameMes) {
        this.nameMes = nameMes;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }
}
