package com.company;

public class Perro extends Mascota{
    boolean altura;

//constructor

    public Perro(String nombre, String especie, Boolean sexo, String color, String pelaje, String raza, boolean altura) {
        super(nombre, especie, sexo, color, pelaje, raza);
        this.altura = altura;
    }
//get an set


    public boolean isAltura() {
        return altura;
    }

    public void setAltura(boolean altura) {
        this.altura = altura;
    }

    //-------
    public void ladrar (int ladridos){
        System.out.println("voy a ladrar " + ladridos + "veces");
    }
}
