/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package used;

import java.util.Scanner;
import src.SimpleCalculator;
import src.UserIO;
import src.UserIOImpl;

/**
 *
 * @author Ayba
 */
public class App {

    public static void main(String[] args) {
        //int sum =SimpleCalculator.addition(5, 4);
        //System.out.println("The sum: " + sum);
        UserIO userIO = new UserIOImpl();
        int oper1, oper2;
        while (true) {
            int choice = choiseMenu();

            switch (choice) {

                case 1:
                    oper1 = userIO.readInt("Enter a number");
                    oper2 = userIO.readInt("Enter a number");
                    System.out.println("result of addition: " + SimpleCalculator.addition(oper1, oper2)+" \n");
                    break;
                case 2:
                    oper1 = userIO.readInt("Enter a number");
                    oper2 = userIO.readInt("Enter a number");

                    System.out.println("result of addition: " + SimpleCalculator.subtraction(oper1, oper2)+" \n");

                    break;
                case 3:
                    oper1 = userIO.readInt("Enter a number");
                    oper2 = userIO.readInt("Enter a number");
                    System.out.println("result of addition: " + SimpleCalculator.multiplication(oper1, oper2)+" \n");
                    break;
                case 4:
                    oper1 = userIO.readInt("Enter a number");
                    oper2 = userIO.readInt("Enter a number");
                    if (oper1 != 0 && oper2 != 0) {
                        System.out.println("result of addition: " + SimpleCalculator.division(oper1, oper2)+" \n");
                    } else {
                        System.out.println("one of the operands cannot be zero");
                    }
                    break;
                case 5:
                    Scanner scan = new Scanner(System.in);
                    System.out.println("Thank you very much for using our calculator and have a good day");
                    //for pause
                    scan.nextLine();;
                    System.exit(0);

            }
        }

    }

    public static int choiseMenu() {
        int choise = 0;
        UserIO userIO = new UserIOImpl();
        while (choise < 1 || choise > 5) {
            System.out.println("--------------------------------");
            System.out.println("welcome to our calculator \n");
            System.out.println("Make your choice from this menu");
            System.out.println("1. For addition");
            System.out.println("2. For subtraction");
            System.out.println("3. For multiplication");
            System.out.println("4. For division");
            System.out.println("5. For exit");

            choise = userIO.readInt("Enter a number between! 1-5 : ", 0, 5);
        }
        return choise;
    }

}
