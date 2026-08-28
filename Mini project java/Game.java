import java.util.Random;
import java.util.Scanner;

public class Game {

static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int Target, ComputerTarget;
        Random computerGuess = new Random();


        String WhatToDo="";

        System.out.print("1. Rock\n2. Paper\n3. scissor\n");
        System.out.print("Pick one: ");
        Target = sc.nextInt();
        sc.nextLine();
        ComputerTarget = computerGuess.nextInt(1, 4);
        RealGame(Target, ComputerTarget);
        WhatToDo = WantToContinue(WhatToDo);

        while (WhatToDo.equalsIgnoreCase("Yes")) {
            System.out.print("1. Rock\n2. Paper\n3. scissor\n");
            System.out.print("Pick one: ");
            Target = sc.nextInt();
            sc.nextLine();
            ComputerTarget = computerGuess.nextInt(1, 4);
            RealGame(Target, ComputerTarget);
            WhatToDo = WantToContinue(WhatToDo);
        }

        sc.close();

    }

    static String WantToContinue(String WhatToDo) {


        System.out.print("Play again?: ");
        WhatToDo = sc.nextLine();
        return WhatToDo;

    }

    static void RealGame(int Target, int ComputerTarget) {

        switch (Target) {
            case 1 -> {
                if (ComputerTarget == 2 ) {
                    System.out.println("Computer chosen paper.");
                    System.out.println("You loss.");
                }
                else if(ComputerTarget == 3){
                    System.out.println("Computer chosen scissor.");
                    System.out.println("You win.");
                }
                else if (ComputerTarget == Target) {
                    System.out.println("Computer chosen scissor.");
                    System.out.println("Draw");
                }

            }
            case 2 -> {
                if (ComputerTarget == 3) {
                    System.out.println("Computer chosen scissor.");
                    System.out.println("You loss.");
                } else if (ComputerTarget == Target) {
                    System.out.println("Computer chosen scissor.");
                    System.out.println("Draw.");
                } else if (ComputerTarget == 1) {
                    System.out.println("Computer chosen rock.");
                    System.out.println("You win.");
                }

            }
            case 3 -> {
                if (ComputerTarget == 1) {
                    System.out.println("Computer chosen rock.");
                    System.out.println("You loss.");
                } else if (ComputerTarget == Target) {
                    System.out.println("Computer chosen rock.");
                    System.out.println("Draw.");
                } else if (ComputerTarget == 2) {
                    System.out.println("Computer chosen paper.");
                    System.out.println("You win.");
                }

            }
        }

    }
}