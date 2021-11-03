/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution, Exercise 35
 *  Copyright 2021 Mayank Goyal
 */

package ex35;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String inputName;
        ArrayList<String> contestants = new ArrayList<String>();

        do
        {
            System.out.print("Enter a name : ");
            inputName = scanner.nextLine();
            contestants.add(inputName);
        }
        while(!inputName.isEmpty());
        {
            String winner = getWinner(contestants);
            System.out.println("The winner is... " + winner + ".");
        }
    }

    static String getWinner(ArrayList<String> contestants) {
        Random random = new Random();

        contestants.remove(contestants.size() - 1);
        String winner = contestants.get(random.nextInt(contestants.size()));
        return winner;
    }
}
