package com.vacaciones.Models;

public class MesModel {

    private int mes;
    private final PropiedaMesModel[] mesArray = {
        new PropiedaMesModel("Enero", 31),
        new PropiedaMesModel("Febrero", 29),
        new PropiedaMesModel("Marzo", 31),
        new PropiedaMesModel("Abril", 30),
        new PropiedaMesModel("Mayo", 31),
        new PropiedaMesModel("Junio", 30),
        new PropiedaMesModel("Julio", 31),
        new PropiedaMesModel("Agosto", 31),
        new PropiedaMesModel("Septiembre", 30),
        new PropiedaMesModel("Octubre", 31),
        new PropiedaMesModel("Noviembre", 30),
        new PropiedaMesModel("Diciembre", 31),
    };

    public MesModel(int mes) {
        this.mes = mes;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public PropiedaMesModel[] getMesArray() {
        return mesArray;
    }

    public String GetNumberDayOfMonth () {
        return this.mesArray[this.mes - 1].getNameMes();
    }

    public int GetDayOfMonth () {
        return this.mesArray[this.mes - 1].getDay();
    }
}
