
package Calculos;

import java.util.Scanner;

public class Operacion {
 
    // ATRIBUTOS
    
    private int num1, num2, suma, resta, mult, div;
    
    // CONSTRUCTORES
    
    public Operacion() {
    }

    public Operacion(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    // GETTERS & SETTERS
    
    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }
    
    // METODOS
    
    public void crearOperacion() {
        
        Scanner leer = new Scanner (System.in).useDelimiter("\n");
        
        System.out.println("Por favor, ingrese 2 numeros enteros para realizar los calculos pertinentes");
        setNum1(leer.nextInt());
        setNum2(leer.nextInt());
        
    }
    
    public void sumar() {
        suma = num1 + num2;
        System.out.println("La suma de los numeros " + num1 + " + " + num2 + " = " + suma);
    }
    
    public void restar() {
        resta = num1 - num2;
        System.out.println("La resta de los numeros " + num1 + " - " + num2 + " = " + resta);
    }
    
    public void multiplicar() {
        if (num1 != 0 && num2 != 0) {
            mult = num1 * num2;
            System.out.println("La multiplicacion de los numeros " + num1 + " * " + num2 + " = " + mult);
        } else {
            mult = 0;
            System.out.println("La multiplicacion es nula: " + num1 + " * " + num2 + " = " + mult);
        }
    }
    
    public void dividir() {
         if (num1 != 0 && num2 != 0) {
            div = num1 / num2;
            System.out.println("La division de los numeros " + num1 + " % " + num2 + " = " + div);
        } else {
            div = 0;
            System.out.println("La division es nula: " + num1 + " % " + num2 + " = " + div);
        }
    }

    
}
