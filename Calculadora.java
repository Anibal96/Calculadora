/**
 * Write a description of class Calculadora here.
 * 
 * @author (Aníbal96) 
 * @version (a version number or a date)
 */
public class Calculadora
{
    //Atributo que almacena el multipo de 5 a imprimir
    private int multiplo5;

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
        multiplo5 = 10;
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
        if (a > b){
            int c = a;
            a = b;
            b = c;
        }
        int suma = a;
        while (a < b){
            a++;
            suma = suma + a;
            }
        return suma;
    }
}
