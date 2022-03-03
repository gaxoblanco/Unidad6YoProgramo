package com.company;

public class Mascota {
     String nombre;
     String especie;
     Boolean sexo;
     String color;
     String pelaje;
     String raza;

     //constructores

    public Mascota(String nombre, String especie, Boolean sexo, String color, String pelaje, String raza) {
        this.nombre = nombre;
        this.especie = especie;
        this.sexo = sexo;
        this.color = color;
        this.pelaje = pelaje;
        this.raza = raza;
    }


    //get and set


    public String getNombre(String gordo) {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getEspecie(){
        return especie;
    }
    public void setEspecie(){
        this.especie = especie;
    }

    public Boolean getSexo() {
        return sexo;
    }

    public void setSexo(Boolean sexo) {
        this.sexo = sexo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPelaje() {
        return pelaje;
    }

    public void setPelaje(String pelaje) {
        this.pelaje = pelaje;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    //ToString


    @Override
    public String toString() {
        return "Mascota{" +
                "nombre='" + nombre + '\'' +
                "especie" + especie + '\'' +
                ", sexo=" + sexo +
                ", color='" + color + '\'' +
                ", pelaje='" + pelaje + '\'' +
                ", raza='" + raza + '\'' +
                '}';
    }

    //metodos
     public void comer(){
         System.out.println("comiendo");
     }
     public void dormir(int horas){
         System.out.println("Estoy duermiendo " + horas + "Hs");
     }
}
