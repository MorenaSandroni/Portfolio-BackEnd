/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.ms.Dto;
import jakarta.validation.constraints.NotBlank;

public class dtoHabilidad {
    @NotBlank
    private String nombreH;
    @NotBlank
    private float porcentaje;
    
    //Constructores

    public dtoHabilidad() {
    }

    public dtoHabilidad(String nombreH, float porcentaje) {
        this.nombreH = nombreH;
        this.porcentaje = porcentaje;
    }
    //Getters & Setters

    public String getNombreH() {
        return nombreH;
    }

    public void setNombreH(String nombreH) {
        this.nombreH = nombreH;
    }

    public float getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(float porcentaje) {
        this.porcentaje = porcentaje;
    }
    
}


