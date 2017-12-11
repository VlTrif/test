import java.util.Arrays;
import java.util.Scanner;


/**
 *@author Trifonov Vladimir
 */

public class Base {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int choise;
        System.out.println("Select option:" + "\n" + "1)Calculator" + "\n" +  "2)Longest word in massif" + "\n" + "3)Random massif");
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
            String j = ("");
            for (int i=0; i < lengthOfArray; i++) {
                massif[i] = scan.next(); // Ввод элементов массива
                int l1 = massif[i].length();
                int l2 = j.length();
                if ( l1 > l2 ) {
                    j = massif[i];
                }

            }
            System.out.println(j);



        }
        scan.close();

        if (choise == 3) {
            System.out.println("Random massif: ");
            int[] randomMassif = new int[20];
            for (int i = 0; i < 20; i++){
                randomMassif[i] = (int)(Math.random()*21 - 10);  //Генерация рандомного массива
            }
            String randomMassifStr = Arrays.toString(randomMassif);
            System.out.println(randomMassifStr);

            int rM_min = 0;
            int rM_max = 0;
            for (int j = 1; j < 20; j++){ // Поиск индексов максимального и минимального элементов
                if (randomMassif[j] > randomMassif[rM_max]){
                    rM_max = j;
                } else if (randomMassif[j] < randomMassif[rM_min]){
                    rM_min = j;
                }
            }

            int min = randomMassif[rM_min];
            int max = randomMassif[rM_max];
            for (int k = 0; k < randomMassif.length; k++) {  // Замена местами min и max элементов
                if (randomMassif[k] == max) {
                    randomMassif[k] = min;
                } else if (randomMassif[k] == min) {
                    randomMassif[k] = max;
                }
            }

            System.out.println("Swapped random massif: ");
            String randomMassifStrNew = Arrays.toString(randomMassif);
            System.out.println (randomMassifStrNew);
        }

    }
}