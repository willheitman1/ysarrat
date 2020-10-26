package app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        String seniors[] = {"Rogan", "Brandnon"};

        String juniors[] = {"bryan",  "Hamilton", "Kenadi", "Mason"};

        String sophomores[] = {"Luke", "Will", "Alexis", "Taten"};

        System.out.println("enter a student name");
        String enteredName = input.nextLine();

        for (int i = 0; i < sophomores.length; i++){
        if (enteredName.equals(sophomores[i])){
            System.out.println("Grade10");
        }
        }
        for (int i = 0; i < seniors.length; i++){
        if (enteredName.equals(seniors[i])){
            System.out.println("Grade12");
        }
    }
    for (int i = 0; i < juniors.length; i++){
        if (enteredName.equals(juniors[i])){
            System.out.println("Grade11");
        }
    }
    }
}
