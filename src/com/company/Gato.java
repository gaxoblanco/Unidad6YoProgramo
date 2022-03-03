package com.company;

public class Gato extends Mascota{
    Boolean dormilon;


    public Gato(String nombre, String especie, Boolean sexo, String color, String pelaje, String raza, Boolean dormilon) {
        super(nombre, especie, sexo, color, pelaje, raza);
        this.dormilon = dormilon;
    }

}
