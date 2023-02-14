/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.afp.Dto;

import jakarta.validation.constraints.NotBlank;

/**
 *
 * @author sergio
 */
public class dtoProyectos {
    
    @NotBlank
    private String nombreP;

    @NotBlank
    private String descripcionP;
    
    private String urlP;
    
    private String img;

    public dtoProyectos() {
    }

    public String getNombreP() {
        return nombreP;
    }

    public void setNombreP(String nombreP) {
        this.nombreP = nombreP;
    }

    public String getDescripcionP() {
        return descripcionP;
    }

    public void setDescripcionP(String descripcionP) {
        this.descripcionP = descripcionP;
    }

    public String getUrlP() {
        return urlP;
    }

    public void setUrlP(String urlP) {
        this.urlP = urlP;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public dtoProyectos(String nombreP, String descripcionP, String urlP, String img) {
        this.nombreP = nombreP;
        this.descripcionP = descripcionP;
        this.urlP = urlP;
        this.img = img;
    }

    
}
