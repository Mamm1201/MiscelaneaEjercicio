package co.edu.sena.oop;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Main
{

    public static void main(String[] args)
    {
            double numero1 = 0;
            double numero2 = 0;
            double numero3 = 0;
            double opcion = 0;
            Scanner sc = new Scanner(System.in);
            Data data = new Data();
            int opcionEjecutar =0;
        do {
            System.out.println("1. Calcular area de triangulo");
            System.out.println("2. Ingresar dos números por teclado y sumarlos.");
            System.out.println("3. Ingresar un número y visualizar el número elevado al cuadrado.");
            System.out.println("4. Escribir un algoritmo que convierta de euros a dólares.");
            System.out.println("5. Calcular area y perimetro del cuadrado");
            System.out.println("6. Escribir un algoritmo que determine el área y el volúmen de un cilindro");
            System.out.println("7. Radio de una circunferencia y escriba la longitud de la misma y el área (pi*r)^2 del círculo inscrito.");
            System.out.println("8.Calcular el promedio de tres (3) números ingresados por teclado.");
            opcion = sc.nextDouble();
            System.out.println("--------------------------------------------------------------------------");


            if (opcion ==1)
            {
                //        Ejercicio operador 1
                System.out.println("Usted a elegido la opcion numero 1");
                System.out.println("Calcular el area de un triangulo.");
                System.out.println("Ingrese la base en cm: ");
                numero1 = sc.nextDouble();
                System.out.println("Ingrese la altura en cm: ");
                numero2 = sc.nextDouble();
                System.out.println("El area del triangulo es: " + data.areaTriangulo(numero1, numero2) + "centimetros");
                //            System.out.println("Ingrese numero 99 para salir");
                //            numero99 = sc.nextDouble();
                System.out.println("Seleccione una nueva opcion");
                System.out.println("--------------------------------------------------------------------");

            }

            if (opcion ==2)
            {
    //        Ejercicio operador 2
                System.out.println("Usted a elegido la opcion numero 2");
                System.out.println("Ingresar dos numeros por teclado y sumarlos");
                System.out.println("Ingrese numero1: ");
                numero1 = sc.nextDouble();
                System.out.println("Ingrese numero2: ");
                numero2 = sc.nextDouble();
                System.out.println("La suma de los dos numeros es: " + data.sumaNumeros(numero1, numero2));
                System.out.println("--------------------------------------------------------------------");
            }

            if (opcion ==3)
            {
    //        Ejercicio operador 3
                System.out.println("Usted a elegido la opcion numero 3");
                System.out.println("Ingresar el numero y visualizar el numero elevado al cuadrado");
                System.out.println("Ingrese numero1: ");
                numero1 = sc.nextDouble();
                System.out.println("La exponenciación es: " + data.elevarala2(numero1, numero2));
                System.out.println("--------------------------------------------------------------------");
            }

            if (opcion ==4)
            {
    //        Ejercicio 4
                System.out.println("Usted a elegido la opcion numero 4");
                System.out.println("Escribir un algoritmo que convierta de euros a dolares");
                System.out.println("Ingrese valor en euros: ");
                numero1 = sc.nextDouble();
                System.out.println("La conversión de euro a dolar es: " + data.multiplicarNumeros(numero1, numero2)+ " dolares");
                System.out.println("--------------------------------------------------------------------");
            }

        if (opcion ==5)
            {
    //        Ejercicio operador 5
                System.out.println("Usted a elegido la opcion numero 5");
                System.out.println("Calcular area y perimetro del cuadrado");
                System.out.println("Ingrese valor lado en cm: ");
                numero1 = sc.nextDouble();
                System.out.println("El área del cuadrado es: " + data.multiplicarNumeros(numero1, numero2)+ "centimetros");
                System.out.println("El perimetro del cuadrado es: " + data.sumaNumeros(numero1, numero2)+ "centimetros");
                System.out.println("--------------------------------------------------------------------");
            }

            if (opcion ==6)
            {
    //        Ejercicio operador 6
                System.out.println("Usted a elegido la opcion numero 6");
                System.out.println("Calcular el area y volumen de un cilindro");
                System.out.println("Ingrese valor diametro en centimetros: ");
                numero1 = sc.nextDouble();
                System.out.println("Ingrese la altura cilindro en cm: ");
                numero2 = sc.nextDouble();
                System.out.println("El area del cilindro es: " + data.areaCilindro(numero1, numero2)+ "centimetros");
                System.out.println("El volumen del cilindro es: " + data.volumenCilindro(numero1, numero2)+ "centimetros");
                System.out.println("--------------------------------------------------------------------");
            }

            if (opcion ==7)
            {
    //          ejercicio operador 7
                System.out.println(". Realizar un algoritmo que lea el radio de una circunferencia y escriba la longitud de la misma y el área (pi*r)^2 del círculo inscrito");
                System.out.println("ingrese radio circunferencia en cm: ");
                numero1 = sc.nextDouble();
                System.out.println("longitud de la circunferencia es: " + data.longitudCircunferencia(numero1, numero2)+ "centimetros");
                System.out.println(" El area del circulo es: " + data.areaCirculo(numero1, numero2)+ "centimetros");
                System.out.println("--------------------------------------------------------------------");
            }



            if (opcion ==8)
            {
    //          ejercicio operador 8
                System.out.println("Usted a elegido la opcion numero 8");
                System.out.println("Calcular el promedio de tres 3 numeros ingresados por teclado.");
                System.out.println("Ingrese numero1: ");
                numero1 = sc.nextDouble();
                System.out.println("Ingrese numero2: ");
                numero2 = sc.nextDouble();
                System.out.println("Ingrese numero3: ");
                numero3 = sc.nextDouble();
                System.out.println("El promedio de los tres numeros es: " + data.promedioNumeros(numero1, numero2, numero3));
                System.out.println("--------------------------------------------------------------------");
            }
            System.out.println("Que desea hacer");
            System.out.println("Ingrese 1 menu, 99 salir");
            opcionEjecutar=sc.nextInt();

        }
        while (opcionEjecutar !=99);
    }
}