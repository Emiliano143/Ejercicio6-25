package org.gerdoc.org.mendez.galindo.emiliano.vista;


import org.gerdoc.model.figura.Figura;

public class Menu
{
    public static void principal( )
    {
        System.out.println( "----Figuras----");
        System.out.println( "Selecciona una opción");
        System.out.println( "1.- Cuadrado");
        System.out.println( "2.- Equilatero");
        System.out.println( "3.- Isoceles");
        System.out.println( "4.- Escaleno");
        System.out.println( "5.- Pentagono");
        System.out.println( "6.- Rectangulo");
        System.out.println( "7.- Rombo");
        System.out.println( "8.- Trapecio");
        System.out.println( "9.- Salir");
    }

    public static void opcionInvalida( )
    {
        System.out.println( "Opción invalida");
    }

    public static void print(Figura figura)
    {
        System.out.println( "El perimetro es:" + figura.perimetro() );
        System.out.println( "El area es:" + figura.area() );
    }

    public static void principal2( )
    {
        System.out.println( "Bienvenido");
        System.out.println( "Selecciona una opción");
        System.out.println( "1.- Consola");
        System.out.println( "2.- Ventana");
        System.out.println( "3.- Salir");
    }

    public static void menuCuadrado( )
    {
        System.out.println( "Ingresa un lado");
    }

    public static void menuBase( )
    {
        System.out.println( "Ingresa una base");
    }

    public static void menuAltura( )
    {
        System.out.println( "Ingresa una altura");
    }

    public static void menuLado1( )
    {
        System.out.println( "Ingresa un lado 1");
    }

    public static void menuLado2( )
    {
        System.out.println( "Ingresa un lado 2");
    }

    public static void menuLado3( )
    {
        System.out.println( "Ingresa un lado 3");
    }

    public static void menuBMayor( )
    {
        System.out.println( "Ingresa la base mayor");
    }

    public static void menuBMenor( )
    {
        System.out.println( "Ingresa la base menor");
    }

    public static void menuApotema( )
    {
        System.out.println( "Ingresa el apotema");
    }

    public static void menuDMayor( )
    {
        System.out.println( "Ingresa la diagonal mayor");
    }

    public static void menuDMenor( )
    {
        System.out.println( "Ingresa la diagonal menor");
    }
}
