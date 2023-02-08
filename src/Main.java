import java.util.Scanner;

public class Main {
    public static void main(String[] input) {
        String[] znak = {"+", "-", "/", "*"};
        String[] znak1 = {"\\+", "-", "/", "\\*"};
        Scanner scn = new Scanner(System.in);
        System.out.print("Введите пример: ");
        String exp = scn.nextLine();
        int znakIndex = -1;
        for (int i = 0; i < znak.length; i++) {
            if (exp.contains(znak[i])) {
                znakIndex = i;
                break;
            }

        }
        if (znakIndex == -1) {
            System.out.println("Некорректное выражение");
        }
        int a, b;
        String[] data = exp.split(znak1[znakIndex]);
        a = Integer.parseInt(data[0]);
        b = Integer.parseInt(data[1]);
        if (1 <= a && a <= 10 && 1 <= b && b <= 10) {

            int result;
            switch (znak[znakIndex]) {
                case "+":
                    result = a + b;
                    break;
                case "-":
                    result = a - b;
                    break;
                case "*":
                    result = a * b;
                    break;
                default:
                    result = a / b;
                    break;
            }
            System.out.println(result);
        } else {
            System.out.println("Ошибка");
        }
    }
}