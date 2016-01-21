/**
 * Write a description of class Test here.
 * 
 * @author (Anibal96) 
 * @version (a version number or a date)
 */
public class Test
{
    /**
     * Método que prueba si el funcionamiento de isPrime es correcto.
     */
    public void testIsPrime()
    {
        Calculadora calculadora = new Calculadora();
        boolean metodoCorrecto = true;
        if (calculadora.isPrime(2)){
            System.out.println("Comprobando isPrime(2)... resultado correcto true / resultado metodo " + calculadora.isPrime(2) + " ... OK");
        }
        else{
            System.out.println("Comprobando isPrime(2)... resultado correcto true / resultado metodo " + calculadora.isPrime(2) + " ... ERROR");
            metodoCorrecto = false;
        }
        if (calculadora.isPrime(4)){
            System.out.println("Comprobando isPrime(4)... resultado correcto true / resultado metodo " + calculadora.isPrime(2) + " ... ERROR");
            metodoCorrecto = false;
        }
        else{
             System.out.println("Comprobando isPrime(4)... resultado correcto false / resultado metodo " + calculadora.isPrime(2) + " ... OK");
        }
        if (calculadora.isPrime(5)){
            System.out.println("Comprobando isPrime(5)... resultado correcto true / resultado metodo " + calculadora.isPrime(2) + " ... OK");
        }
        else{
            System.out.println("Comprobando isPrime(5)... resultado correcto true / resultado metodo " + calculadora.isPrime(2) + " ... ERROR");
            metodoCorrecto = false;
        }
        if (calculadora.isPrime(10)){
            System.out.println("Comprobando isPrime(10)... resultado correcto true / resultado metodo " + calculadora.isPrime(2) + " ... ERROR");
            metodoCorrecto = false;
        }
        else{
             System.out.println("Comprobando isPrime(10)... resultado correcto false / resultado metodo " + calculadora.isPrime(2) + " ... OK");
        }
        if (calculadora.isPrime(13)){
            System.out.println("Comprobando isPrime(13)... resultado correcto true / resultado metodo " + calculadora.isPrime(2) + " ... OK");
        }
        else{
            System.out.println("Comprobando isPrime(13)... resultado correcto true / resultado metodo " + calculadora.isPrime(2) + " ... ERROR");
            metodoCorrecto = false;
        }
        if (calculadora.isPrime(101)){
            System.out.println("Comprobando isPrime(101)... resultado correcto true / resultado metodo " + calculadora.isPrime(2) + " ... OK");
        }
        else{
            System.out.println("Comprobando isPrime(101)... resultado correcto true / resultado metodo " + calculadora.isPrime(2) + " ... ERROR");
            metodoCorrecto = false;
        }
        if (metodoCorrecto){
            System.out.println("El método SI funciona correctamente");
        }
        else{
            System.out.println("El método NO funciona correctamente");
        }
    }
    
    /**
     * Método que prueba si el funcionamiento de sumValuesInterval es correcto.
     */
    public void testSumValuesInterval()
    {
        Calculadora calculadora = new Calculadora();
        boolean metodoCorrecto = true;
        if (calculadora.sumValuesInterval(-1,8) == -1){
            System.out.println("Comprobando sumValuesInterval(-1,8)...resultado correcto -1 / resultado metodo " + calculadora.sumValuesInterval(-1,8) + " ... OK");
        }
        else{
            System.out.println("Comprobando sumValuesInterval(-1,8)...resultado correcto -1 / resultado metodo " + calculadora.sumValuesInterval(-1,8) + " ... ERROR");
            metodoCorrecto = false;
        }
        if (calculadora.sumValuesInterval(1,8) == 36){
            System.out.println("Comprobando sumValuesInterval(1,8)...resultado correcto 36 / resultado metodo " + calculadora.sumValuesInterval(1,8) + " ... OK");
        }
        else{
            System.out.println("Comprobando sumValuesInterval(1,8)...resultado correcto 36 / resultado metodo " + calculadora.sumValuesInterval(1,8) + " ... ERROR");
            metodoCorrecto = false;
        }
        if (calculadora.sumValuesInterval(1,-8) == -1){
            System.out.println("Comprobando sumValuesInterval(1,-8)...resultado correcto -1 / resultado metodo " + calculadora.sumValuesInterval(1,-8) + " ... OK");
        }
        else{
            System.out.println("Comprobando sumValuesInterval(1,-8)...resultado correcto -1 / resultado metodo " + calculadora.sumValuesInterval(1,-8) + " ... ERROR");
            metodoCorrecto = false;
        }
        if (calculadora.sumValuesInterval(8,1) == 36){
            System.out.println("Comprobando sumValuesInterval(8,1)...resultado correcto 36 / resultado metodo " + calculadora.sumValuesInterval(8,1) + " ... OK");
        }
        else{
            System.out.println("Comprobando sumValuesInterval(8,1)...resultado correcto 36 / resultado metodo " + calculadora.sumValuesInterval(8,1) + " ... ERROR");
            metodoCorrecto = false;
        }
        if (calculadora.sumValuesInterval(-1,-8) == -1){
            System.out.println("Comprobando sumValuesInterval(-1,-8)...resultado correcto -1 / resultado metodo " + calculadora.sumValuesInterval(-1,-8) +  " ... OK");
        }
        else{
            System.out.println("Comprobando sumValuesInterval(-1,-8)...resultado correcto -1 / resultado metodo " + calculadora.sumValuesInterval(-1,-8) +  " ... ERROR");
            metodoCorrecto = false;
        }
        if (calculadora.sumValuesInterval(1,100) == 5050){
            System.out.println("Comprobando sumValuesInterval(1,100)...resultado correcto 5050 / resultado metodo " + calculadora.sumValuesInterval(1,100) + " ... OK");
        }
        else{
            System.out.println("Comprobando sumValuesInterval(1,100)...resultado correcto 5050 / resultado metodo " + calculadora.sumValuesInterval(1,100) + " ... ERROR");
            metodoCorrecto = false;
        }
        if (metodoCorrecto){
            System.out.println("El método SI funciona correctamente");
        }
        else{
            System.out.println("El método NO funciona correctamente");
        }
    }
}
