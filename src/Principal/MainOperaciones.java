
package Principal;

import Calculos.Operacion;

public class MainOperaciones {

    public static void main(String[] args) {
        
        Operacion calculo1 = new Operacion ();
        
        calculo1.crearOperacion();
        calculo1.sumar();
        calculo1.restar();
        calculo1.multiplicar();
        calculo1.dividir();
        
    }
    
}
