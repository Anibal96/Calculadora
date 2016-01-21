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
}
