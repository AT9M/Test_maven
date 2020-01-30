import java.awt.*;

public class test {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int[] arrayX = new int[]{56, 198, 1236,  546,  12,  15489,  1723,  96};
        int[] arrayY = new int[]{ 20,  256,  12,  23,  105,  156,  5,  76};

        for(int i = 0 ; i< arrayX.length; i++) {
            System.out.println("Number = "+arrayX[i]+" and "+arrayY[i]);
            System.out.println("GCD = "+calculator.PGCD(arrayX[i], arrayY[i]));
            System.out.println("ADD = "+calculator.add(arrayX[i], arrayY[i]));
            System.out.println("SUBSTRACT = "+calculator.substract(arrayX[i], arrayY[i]));
            System.out.println("MULTIPLY = "+calculator.Multiply(arrayX[i], arrayY[i]));
            System.out.println("DIVIDE = "+calculator.Divide(arrayX[i], arrayY[i])+" times");
            System.out.println("Binary of "+arrayX[i]+" and "+arrayY[i]+" is  "+calculator.ToBinairy(arrayX[i])+" and "+calculator.ToBinairy(arrayY[i]));
            System.out.println("\n\n");
        }
    }
}
