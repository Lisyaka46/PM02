/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplicationcalc;

/**
 *
 * @author killm
 */
import java.util.Scanner;
public class JavaApplicationCalc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(
                "Введире опирацию:" + '\n'
                + "1. Сложение" + '\n'
                + "2. Вычитание" + '\n'
                + "3. Умножение" + '\n'
                + "4. Деление");
        // Гуторов Даниил Сергеевич
        Scanner scan = new Scanner(System.in);
        int Operation = scan.nextInt();
        
        System.out.println("Введите первое число: ");
        int x = scan.nextInt();
        System.out.println("Введите второе число: ");
        int y = scan.nextInt();
        int result = 0;
        if (Operation == 1) result = x + y;
        else if (Operation == 2) result = x - y;
        else if (Operation == 3) result = x * y;
        else if (Operation == 4) result = x / y;
        System.out.println("Результат: " + result);
    }
    
}
