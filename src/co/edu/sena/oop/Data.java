package co.edu.sena.oop;

public class Data
{
//    "1. Calcular area de triangulo"
    public Double areaTriangulo(double num1, double num2)
    {
        return (num1 * num2/2 ) ;
    }

//    2. Ingresar dos números por teclado y sumarlos
    public Double sumaNumeros(double num1, double num2)
    {
        return (num1 + num2 );
    }

//    3. Ingresar un número y visualizar el número elevado al cuadrado.
    public Double elevarala2(double num1, double num2)
    {
        return (num1 * num1);
    }

//   4. Escribir un algoritmo que convierta de euros a dólares.
    public Double multiplicarNumeros(double num1, double num2)
    {
        return (num1 * 1.09);
    }

//    5. Calcular area y perimetro del cuadrado"
    public Double multiplicarNumeros(double num1)
    {
        return (num1 * num1);
    }
    public Double sumaNumeros(double num1)
    {
        return (num1+num1+num1+num1 );
    }

//    6. Escribir un algoritmo que determine el área y el volúmen de un cilindro.
    public Double areaCilindro(double num1, double num2)
    {
        return (2* 3.1416*num1/2 ) * (num1/2+num2);
    }
    public Double volumenCilindro(double num1, double num2)
    {
        return (num1/2*num1/2)*(3.1416);
    }
//    7. Realizar un algoritmo que lea el radio de una circunferencia y escriba la longitud de la misma y
//    el área (pi*r)^2 del círculo inscrito.
    public Double longitudCircunferencia(double num1, double num2)
    {
    return (num1+num1)*(3.1416);
    }
    public Double areaCirculo(double num1, double num2)
    {
        return (num1*num1)*(3.1416);
    }



//    8. Calcular el promedio de tres (3) números ingresados por teclado.

    public Double promedioNumeros(double num1, double num2, double num3)
    {
        return (num1+num2+num3)/3;
    }
}

