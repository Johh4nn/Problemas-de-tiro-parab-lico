package main;

import metodos.Ejercicios;

public class Main {
    public static void main(String[] args) {

        Ejercicios ej1 = new Ejercicios();

        ej1.llenar();
        ej1.imprimirdatos();
        ej1.calcularComponentes(); // Paso 3: Calcular las componentes de la velocidad
        ej1.calcularTiempoDeVuelo(); // Paso 4: Calcular el tiempo de vuelo
        ej1.calcularAlcance(); // Calcular el alcance de cada proyectil
    }
}