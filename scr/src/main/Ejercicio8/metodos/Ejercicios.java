package metodos;

import objeto.Datos;

import java.util.Scanner;

public class Ejercicios {
    private Datos dg;

    // metodo para ingresar los datos
    public void  llenar(){
        Scanner input = new Scanner(System.in);
        Datos d = new Datos();
        System.out.println("Ingrese la velocidad inicial: ");
        d.setV0(input.nextDouble());
        System.out.println("Ingrese el angulo del primer elemento: ");
        d.setAng1(input.nextDouble());
        System.out.println("Ingrese la angulo del segundo elemto: ");
        d.setAng2(input.nextDouble());
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


}
