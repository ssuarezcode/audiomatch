package com.aluracursos.audiomatch.modelos;

public class Audio {

    //Atributos:
    private String titulo;
    private int duracion;
    private int totalReproducciones;
    private int totalLikes;
    private int clasificacion;

    //Métodos:
    public void meGusta(){

        this.totalLikes++;

    }

    public void reproduce(){

        this.totalReproducciones++;

    }

    //Getters y Setters:
    public int getTotalReproducciones() {
        return totalReproducciones;
    }

    public void setTotalReproducciones(int totalReproducciones) {
        this.totalReproducciones = totalReproducciones;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getTotalLikes() {
        return totalLikes;
    }

    public void setTotalLikes(int totalLikes) {
        this.totalLikes = totalLikes;
    }

    public int getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(int clasificacion) {
        this.clasificacion = clasificacion;
    }

}
