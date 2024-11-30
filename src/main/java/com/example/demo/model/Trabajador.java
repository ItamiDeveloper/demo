package com.example.demo.model;

public class Trabajador {
    private double sueldoBase;
    private int horasExtra;
    private double sueldoTotal;

    // Getters y Setters
    public double getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public int getHorasExtra() {
        return horasExtra;
    }

    public void setHorasExtra(int horasExtra) {
        this.horasExtra = horasExtra;
    }

    public double getSueldoTotal() {
        return sueldoTotal;
    }

    public void calcularSueldoTotal() {
        double tarifaPorHora = sueldoBase / 160; // Suponiendo 160 horas laborales
        this.sueldoTotal = sueldoBase + (horasExtra * tarifaPorHora);
    }
}