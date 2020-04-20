package com.antigoto;

public class Main {

    public static void main(String[] args) {

        Perro perro = new Perro("Lucky","pienso",10,"Aguas");
        Gato gato = new Gato("Garfield","lasaña",8,"callejero");
        Caballo caballo = new Caballo("Jhonny","hierva",21,"Andaluz");

        //-->Nos muestra los detalles del objeto
        perro.mostrar();
        System.out.println("--------------------------------------------------");
        gato.mostrar();
        System.out.println("--------------------------------------------------");
        caballo.mostrar();

    }
}
