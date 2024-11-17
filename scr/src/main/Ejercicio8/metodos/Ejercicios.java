package metodos;

import objeto.Datos;
import java.util.InputMismatchException;

import java.util.Scanner;

public class Ejercicios {
    private Datos dg;

    // metodo para ingresar los datos
    public void llenar() {
        Scanner input = new Scanner(System.in);
        Datos d = new Datos();

        // Ingreso de velocidad inicial
        while (true) {
            try {
                System.out.println("Ingrese la velocidad inicial: ");
                d.setV0(input.nextDouble());
                break; // Si la entrada es correcta, salimos del bucle
            } catch (InputMismatchException e) {
                System.out.println("Entrada no válida. Por favor, ingrese un número.");
                input.next(); // Limpiar el buffer del scanner
            }
        }

        // Ingreso del ángulo del primer elemento
        while (true) {
            try {
                System.out.println("Ingrese el ángulo del primer elemento: ");
                d.setAng1(input.nextDouble());
                break; // Si la entrada es correcta, salimos del bucle
            } catch (InputMismatchException e) {
                System.out.println("Entrada no válida. Por favor, ingrese un número.");
                input.next(); // Limpiar el buffer del scanner
            }
        }

        // Ingreso del ángulo del segundo elemento
        while (true) {
            try {
                System.out.println("Ingrese el ángulo del segundo elemento: ");
                d.setAng2(input.nextDouble());
                break; // Si la entrada es correcta, salimos del bucle
            } catch (InputMismatchException e) {
                System.out.println("Entrada no válida. Por favor, ingrese un número.");
                input.next(); // Limpiar el buffer del scanner
            }
        }

        this.dg = d;
    }

    // paso 2 para imprimirlos
    public void imprimirdatos(){
        System.out.println("V0 = "+ dg.getV0()+"m/s");
        System.out.println("Angulo 1 ="+dg.getAng1()+"°");
        System.out.println("Angulo 2 ="+dg.getAng2()+"°");
        System.out.println("Y 0 = 0");
        System.out.println("X 0 = 0");
        System.out.println("ay  = 9.8m/s");
        System.out.println("ax = 0m/s");

    }

    // Paso 3: Calculamos las componentes de la velocidad inicial
    public void calcularComponentes() {
        // Convertimos los ángulos a radianes porque Java usa radianes para las funciones trigonométricas
        double ang1Rad = Math.toRadians(dg.getAng1());
        double ang2Rad = Math.toRadians(dg.getAng2());

        // Componentes del primer proyectil
        double vox1 = dg.getV0() * Math.cos(ang1Rad);
        double voy1 = dg.getV0() * Math.sin(ang1Rad);
        System.out.println("Componentes del primer proyectil:");
        System.out.println("Vox1 = " + vox1 + " m/s");
        System.out.println("Voy1 = " + voy1 + " m/s");

        // Componentes del segundo proyectil
        double vox2 = dg.getV0() * Math.cos(ang2Rad);
        double voy2 = dg.getV0() * Math.sin(ang2Rad);
        System.out.println("Componentes del segundo proyectil:");
        System.out.println("Vox2 = " + vox2 + " m/s");
        System.out.println("Voy2 = " + voy2 + " m/s");
    }

    // Paso 4: Calculamos el tiempo de vuelo para cada proyectil
    public void calcularTiempoDeVuelo() {
        // Aceleración en y
        double ay = -9.8; // m/s² (gravedad)

        // Para el primer proyectil
        double ang1Rad = Math.toRadians(dg.getAng1());
        double voy1 = dg.getV0() * Math.sin(ang1Rad); // componente vertical
        double tiempo1 = (2 * voy1) / -ay; // T = 2 * Voy / |ay|
        System.out.println("Tiempo de vuelo del primer proyectil: " + tiempo1 + " segundos");

        // Para el segundo proyectil
        double ang2Rad = Math.toRadians(dg.getAng2());
        double voy2 = dg.getV0() * Math.sin(ang2Rad); // componente vertical
        double tiempo2 = (2 * voy2) / -ay; // T = 2 * Voy / |ay|
        System.out.println("Tiempo de vuelo del segundo proyectil: " + tiempo2 + " segundos");
    }

    // Metodo para calcular el alcance de cada proyectil
    public void calcularAlcance() {
        double ay = -9.8; // m/s² (gravedad)

        // Para el primer proyectil
        double ang1Rad = Math.toRadians(dg.getAng1());
        double vox1 = dg.getV0() * Math.cos(ang1Rad); // componente horizontal
        double voy1 = dg.getV0() * Math.sin(ang1Rad); // componente vertical
        double tiempo1 = (2 * voy1) / -ay; // Tiempo de vuelo
        double alcance1 = vox1 * tiempo1; // Alcance = velocidad horizontal * tiempo de vuelo
        System.out.println("Alcance del primer proyectil: " + alcance1 + " metros");

        // Para el segundo proyectil
        double ang2Rad = Math.toRadians(dg.getAng2());
        double vox2 = dg.getV0() * Math.cos(ang2Rad); // componente horizontal
        double voy2 = dg.getV0() * Math.sin(ang2Rad); // componente vertical
        double tiempo2 = (2 * voy2) / -ay; // Tiempo de vuelo
        double alcance2 = vox2 * tiempo2; // Alcance = velocidad horizontal * tiempo de vuelo
        System.out.println("Alcance del segundo proyectil: " + alcance2 + " metros");
    }



}
