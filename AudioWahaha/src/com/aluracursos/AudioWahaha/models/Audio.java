package com.aluracursos.AudioWahaha.models;

public class Audio {
    String nombre;
    double duracion;
    int  toalReproduciones;
    int totalMegustas;

    @Override
    public String toString() {
        return "Audio{" +
                "nombre='" + nombre + '\'' +
                ", duracion=" + duracion +
                ", Total de Reproduciones=" + toalReproduciones +
                ", Me gusta=" + totalMegustas +
                '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public int getToalReproduciones() {
        return toalReproduciones;
    }

    public void setToalReproduciones(int toalReproduciones) {
        this.toalReproduciones = toalReproduciones;
    }

    public int getTotalMegustas() {
        return totalMegustas;
    }

    public void setTotalMegustas(int totalMegustas) {
        this.totalMegustas = totalMegustas;
    }

    public void reproducir(){
        this.toalReproduciones++;
    }
    public void like(){
        this.toalReproduciones++;
    }
}
