package com.company;

import java.util.Vector;

public class Main {

    public static void main(String[] args) {

        Mascota Cocki = new Mascota("Cocki", "perro", true, "naraja", "Largo", "Cocker");
        Mascota Asesino = new Mascota("Asesino", "gato",true, "gris", "brilloso", "Callejero");
        Mascota Pompon = new Mascota("Pompon", "perro", false, "marron y blanco", "corto", "perro");
        Mascota Pipo = new Mascota("Pipo", "perro", true, "Blanco", "Tupido, largo", "Mezcla caniche");
        Mascota Sim = new Mascota( "Sim", "gato", false, "mezcla colores", "corto", "Siames");
        Mascota Tizi = new Mascota("Tizi", "perro", true, "Negro", "tupido y duro", "cruza");
        Mascota Pancho = new Mascota("Pancho", "perro", true, "negro con manchas ", "corto", "salchicha");

     /*   System.out.println(Cocki.toString());
        System.out.println(Asesino.toString());
        System.out.println(Pompon.toString());
        System.out.println(Pipo.toString());
        System.out.println(Sim.toString());*/



        Mascota vector[] = new Mascota[10];
        vector[0] = Cocki;
        vector[1] = Asesino;
        vector[2] = Pompon;
        vector[3] = Pipo;
        vector[4] = Sim;


        for (int i=0; i<10; i++){
            System.out.println( vector[i].nombre + " Es un " + vector[i].especie + ". Tiene un pelaje " + vector[i].pelaje);
        };

        System.out.println(" -------------------------- ");


        Pipo.setNombre("Gordo");
        Cocki.setNombre("Rompecokito");


        for (int i=0; i<10; i++){
            System.out.println("El apodo es: " + vector[i].nombre);
        };
        System.out.println(" -------------------------- ");

        vector[5] = Tizi;
        vector[6] = Pancho;

        for (int i=0; i<10; i++){
            System.out.println( vector[i].nombre + " Es un " + vector[i].especie + ". Tiene un pelaje " + vector[i].pelaje);
        };
    }
}
