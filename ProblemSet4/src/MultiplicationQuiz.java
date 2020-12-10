/* @file MultiplicationQuiz.java
@brief Using loops to create multiplication quiz.
@author Sara Barker
@date 9/21/2018 */

import java.util.Scanner;
import java.util.Random;

public class MultiplicationQuiz {
    public static void main(String[] args) {

        Random rand = new Random();
        Scanner user = new Scanner(System.in);

        //variable declarations
        int iter;
        int a, b;
        int numProblems;
        int smallestNum;
        int biggestNum;
        int range;

        //asking user
        System.out.println("Welcome to the Multiplication Quiz!");
        System.out.println("How many problems do you want to work on?");
        numProblems = user.nextInt();
        System.out.println("What is the smallest number you want to use?");
        smallestNum = user.nextInt();
        System.out.println("What is the biggest number you want to use?");
        biggestNum = user.nextInt();

        range = (biggestNum - smallestNum);
        double rightAnswer = 0; //initialize

        for (iter = 0; iter < numProblems; iter++) { //condition
            a = rand.nextInt (range + 1) + smallestNum;
            b = rand.nextInt (range + 1) + smallestNum;
            System.out.println("Q"+(iter+1)+": What is " + a + " x " + b);
            int result=user.nextInt();

            if(a*b==result){ //correct
                System.out.println("Correct!");
                rightAnswer++;
            }
            else{ //incorrect
                System.out.println("Incorrect, the right answer is "+ a*b + ".");
            }
        }

        double ratio=rightAnswer/numProblems; //result
        System.out.printf("Your final result is %.2f", ratio * 100);
        System.out.print("%");
    }
}
