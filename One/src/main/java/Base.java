import java.util.Arrays;
import java.util.Scanner;


/**
 *@author Trifonov Vladimir
 */

public class Base {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int choise;
        System.out.println("Select option: 1)Calculator , 2)Longest word in massif");
        choise = scan.nextInt(); // Считывание варианта

        if (choise == 1 ) {
            System.out.print("Input first number : ");
            float a = scan.nextFloat(); // Ввод первого числа

            System.out.print("Input second number : ");
            float b = scan.nextFloat(); // Ввод второго числа

            String operator;
            System.out.print("Enter the operation: ");
            operator = scan.next(); // Считывание оператора

            if (operator.equals("*")) {
                System.out.print("Multiplication = ");
                System.out.printf("%.4f", (a * b));
            }
            if (operator.equals("/")) {
                System.out.print("Division = ");
                System.out.printf("%.4f", (a / b));
            }
            if (operator.equals("+")) {
                System.out.print("Addition = ");
                System.out.printf("%.4f", (a + b));
            }
            if (operator.equals("-")) {
                System.out.print("Subtraction = ");
                System.out.printf("%.4f", (a - b));
            }
        }

        if (choise == 2) {
            System.out.println("Enter length of massif: ");
            int lengthOfArray = scan.nextInt();    // Ввод длины массива
            System.out.println("Enter " +lengthOfArray+ " words: ");

            String massif[];
            massif = new String[lengthOfArray];
            String j = null;
            for (int i=0; i < lengthOfArray; i++) {
                massif[i] = scan.next();
                j = massif[i];
                int l1 = massif[i].length();
                int l2 = j.length();
                if ( l1 > l2 ) {
                    j = massif[i];
                }
//                if ((massif[i].compareTo(j)) > 0) {
//                    j = massif[i];
//                }
                //System.out.println(l);
               // if list.get(massif[i] > j)

            }
            System.out.println(j);



        }
//        scan.close();
    }
}