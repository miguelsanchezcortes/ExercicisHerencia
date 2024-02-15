package org.model;


public class Fecha {
    private int dia;

    private int mes;

    private int any;
    

    public Fecha() {
    }

    public Fecha(int dia, int mes, int any) {
        this.dia = dia;
        this.mes = mes;
        this.any = any;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAny() {
        return any;
    }

    public void setAny(int any) {
        this.any = any;
    }

    @Override
    public String toString() {
        return "Fecha [dia=" + dia + ", mes=" + mes + ", any=" + any + "]";
    }

    

    

}
