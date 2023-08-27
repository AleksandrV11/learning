import java.io.IOException;
import java.util.Objects;
import java.util.Scanner;

public class Aa {


    public static int prCh() {
        Scanner scanner1 = new Scanner(System.in);
        int a;
        if (scanner1.hasNextInt()) {
            a = scanner1.nextInt();
            return a;
        } else {
            System.out.println(" Я ТАКИХ ЦИФР НЕ ЗНАЮ ");
            System.out.println(" НЕ ТУПИ ВВЕДИ ЧИСЛО : ");
            prCh();
        }
        return 0;
    }


    public static String prD() {
        Scanner scannerd = new Scanner(System.in);

        String s = scannerd.nextLine();

        if (s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")) {
            return s;

        } else {
            System.out.println(" НЕ ТУПИ ВВЕДИ ЗНАК ДЕЙСТВИЯ ");
            prD();
        }
        return null;
    }


    public static void main(String[] args) {
        System.out.println(" ПРИВЕТ ЧУВАК , ЭТО КАЛЬКУЛЯТОР :");
        System.out.println(" ГОНИ ЧИСЛО : ");
        int A = prCh();
        System.out.println(" ГОНИ ЕЩЕ ЧИСЛО : ");
        int B = prCh();
        System.out.println(" ВВЕДИ ЗНАК ДЕЙСТВИЯ : ");

        String znak = prD();

        int otv = 0;
        if (Objects.equals(znak, "+")) {
            otv = A + B;
        }
        if (Objects.equals(znak, "-")) {
            otv = A - B;
        }
        if (Objects.equals(znak, "*")) {
            otv = A * B;
        }
        if (Objects.equals(znak, "/")) {
            otv = A / B;
        }

        System.out.println("И ВОТ ЧЕ Я НАСЧИТАЛ : " + otv);
        System.out.println("ПОКА ЧУВАК");

    }


}


