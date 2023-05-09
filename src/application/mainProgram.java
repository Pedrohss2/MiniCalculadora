package application;

import entities.Calculator;

import java.util.Locale;
import java.util.Scanner;

public class mainProgram {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Calculator calculator = new Calculator();

        System.out.println("[1] - Soma, [2] - Substração, [3] - Multiplicação, [4] - Divisão,[5] - sair");
        int opcao = sc.nextInt();

        double num1, num2;
        while (opcao != 5){
            System.out.println("enter com um numero");
            num1 = sc.nextDouble();
            System.out.println("Enter com outro numero");
            num2 = sc.nextDouble();

            if(opcao == 1){
                calculator.setNumbers(num1, num2);
                System.out.println("Soma = " + calculator.soma());
            }
            else if(opcao == 2){
                calculator.setNumbers(num1,num2);
                System.out.println("Subtração = "+ calculator.subtracao());
            }
            else if(opcao == 3){
                calculator.setNumbers(num1,num2);
                System.out.println("Multiplicação = " + calculator.multiplicacao());
            }
            else if(opcao == 4){
                calculator.setNumbers(num1,num2);
                System.out.println("Multiplicação = " + calculator.divisao());
            }

            System.out.println("[1] - Soma, [2] - Substração, [3] - Multiplicação, [4] - Divisão, [5] sair");
            opcao = sc.nextInt();
        }
        sc.close();
    }
}
