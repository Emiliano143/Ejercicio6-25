package org.gerdoc.org.mendez.galindo.emiliano.inicio;


import org.gerdoc.org.mendez.galindo.emiliano.util.ReadUtil;
import org.gerdoc.org.mendez.galindo.emiliano.vista.Consola;
import org.gerdoc.org.mendez.galindo.emiliano.vista.Menu;
import org.gerdoc.org.mendez.galindo.emiliano.vista.Ventana;
import org.gerdoc.vista.Ejecutable;

/**
 *
 */
public class Inicio
{

    /**
     * Default constructor
     */
    public Inicio()
    {
    }

    /**
     * @param args
     */
    public static void main(String[] args)
    {
        boolean flag = true;
        int opcion = 0;
        Ejecutable ejecutable = null;
        while( flag )
        {
            ejecutable = null;
            Menu.principal2( );
            opcion = ReadUtil.getInstance( ).leerInt( );
            switch( opcion )
            {
                case 1:
                    ejecutable = Consola.getInstance( );
                    break;
                case 2:
                    ejecutable = Ventana.getInstance( );
                    break;
                case 3:
                    flag = false;
                    break;
                default:
                    Menu.opcionInvalida( );
            }
            if( ejecutable != null )
            {
                ejecutable.run( );
            }
        }



    }

}