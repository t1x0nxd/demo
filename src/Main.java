import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Введите пример: ");
        String input = scn.nextLine();
        scn.close();


        System.out.println(calc(input));
    }
    public static String calc(String input) {
        String[] inputSplit = input.split(" ");
        if (inputSplit.length !=3){
            throw new IllegalArgumentException("Операция только с 2 числами");
        }
        int a = Integer.parseInt(inputSplit[0]);
        int b = Integer.parseInt(inputSplit[2]);
        String operation = inputSplit[1];

        if (1 <= a && a <= 10 && 1 <= b && b <= 10) {

            switch (operation) {
                case "+":
                    return String.valueOf((a + b));
                case "-":
                    return String.valueOf((a - b));
                case "*":
                    return String.valueOf((a * b));
                case "/":
                    return String.valueOf((a / b));
                default:
                    throw new IllegalArgumentException("Нет такой опреации ");
            }
        } else {
            throw new IllegalArgumentException("На вход должны поступать числа от 1 до 10");
        }
            }
}
