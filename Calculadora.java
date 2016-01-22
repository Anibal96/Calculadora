/**
 * Write a description of class Calculadora here.
 * 
 * @author (Aníbal96) 
 * @version (a version number or a date)
 */
public class Calculadora
{
    
    /**
     * Constructor for objects of class Calculadora
     */
    public Calculadora()
    {
    }

    /**
     * Metodo que muestra los multiplo de 5 entre 10 y 95 ambos no incluidos.
     */
    public void multiplesOfFive()
    {
        int multiplo5 = 10;
        while (multiplo5 < 90){
            multiplo5 = multiplo5 + 5;
            System.out.println(multiplo5);
        }
    }
    
    /**
     * Método que saca por pantalla la suma de los números entre 0 y 10 ambos incluidos.
     */
    public void sumValues()
    {
        int suma = 0;
        int contador = 0;
        while (contador < 10){
            contador++;
            suma = suma + contador;
        }
        System.out.println(suma);
    }
    
    /**
     * Método que muestra la suma de los valores entre los dados en la cabecera.
     */
    public int sumValuesInterval (int a, int b)
    {
        int suma;
        if (a<0 || b<0){
            System.out.println("Error añadido valor negativo (Tienen que ser mayor o igual a 0)");
            suma = -1;
        }
        else{
            if (a > b){
                int c = a;
                a = b;
                b = c;
            }
            suma = a;
            while (a < b){
                a++;
                suma = suma + a;
            }
        }
        return suma;
    }
    
    /**
     * Método que pide un número y devuelve verdadero si el parámetro n es primo o falso en caso contrario
     * 
     */
    public boolean isPrime(int n)
    {
         boolean esPrimo = true;
         if(n>1){
             int num = n;
             while (2 <= (num - 1)){
                 num = num - 1;
                 int mod = (n % num);
                 if (mod == 0){
                     esPrimo = false;
                    }
                }
        }
        else{
            esPrimo = false;
            System.out.println("Error el número tiene que ser mayor de 1");
        }
        return esPrimo;
    }
    
    /**
     * Método que multiplica 2 números dados.
     */
    public int multiplicacion (int a, int b)
    {
        int mult = -1;
        if (a < 0 || b < 0){
            System.out.println("Error el número tiene que ser mayor de 0");
        }
        else{
            int cont = 1;
            mult = 0;
            while (cont <= b){
                mult = mult + a ;
                cont++;
            }
        }
        return mult;
    }
 }