import java.util.Scanner;

/**
 *@author Trifonov Vladimir
 */

public class Base {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Input first number : ");
        float a = scan.nextFloat(); // Ввод первого числа

        System.out.print("Input second number : ");
        float b = scan.nextFloat(); // Ввод второго числа

        scan.close();

        System.out.print(" Sum = ");
        System.out.printf("%.4f", a + b); // Так как 4 знака после точки
    }
}