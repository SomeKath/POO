
package interfaz;

import logica.CapturaTeclado;
import logica.EjemploCiclo;
import logica.EjemploCondicional;

public class Principal {
    
    public static void main(String[] args){
        
        CapturaTeclado ct = new CapturaTeclado();
        System.out.println("Ejemplo de captura. ");
        ct.operacion();
        EjemploCondicional ec = new EjemploCondicional();
        System.out.println("Ejemplo if. ");
        ec.operacion();
        System.out.println("Ejemplo Ciclo:");
        EjemploCiclo eci = new EjemploCiclo();
        eci.operacion();
        
    }
    
}
