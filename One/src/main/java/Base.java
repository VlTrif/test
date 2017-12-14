import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;


/**
 *@author Trifonov Vladimir
 */

public class Base {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int choise;
        System.out.println("Select option:" + "\n" + "1)Calculator" + "\n" +
                "2)Longest word in massif" + "\n" + "3)Random massif" + "\n" + "4)Christmas gifts");
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

        if (choise == 4){

            String[] goods = {
                    "1. Мандарины",
                    "2. Шампанское",
                    "3. Конфетти",
                    "4. Печенье с топленым молоком",
                    "5. Конфеты шоколадные"};
            int[] id = {1, 2, 3, 4, 5};
            int[] weight = {200, 250, 15, 85, 99};
            int[] cost = {199, 399, 50, 150, 100};

            System.out.println("Select product: ");

            for (int s = 0; s < goods.length; s++) {
                System.out.println(goods[s]);
            }

            int totalCost = 0;
            int totalWeight = 0;

            System.out.println("Enter product number. To finish enter 0");
            ArrayList<Integer> products = new ArrayList<Integer>();
            for (; ;){
                int i = scan.nextInt();
                int p = 0;
                while (p < id.length) {
                    if (i == id[p]){
                        products.add(i);
                        totalCost += cost[p];
                        totalWeight += weight[p];
                    }
                    p++;
                }
                if (i == 0){
                    break;
                }
            }
            scan.close();

            System.out.println("Your basket : ");
            for (int prBasket = 0; prBasket < products.size();prBasket++){
                for (int j =0; j < id.length; j++){
                    if (products.get(prBasket) == id[j]){
                        System.out.println(goods[j]);
                    }
                }
            }

            System.out.println("Total weight: " + totalWeight + " gr.");

            System.out.println("Total cost: " +totalCost + " rub.");
        }

    }
}