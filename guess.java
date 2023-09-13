import java.util.Random;
import java.util.Scanner;

public class guess
{
    Random r = new Random();
    Scanner sc = new Scanner(System.in);
    void guessNumber()
    {
        int chances;
        System.out.print("Enter player name : ");
        String player = sc.nextLine();
        int lower = (r.nextInt(15-1+1)+1);
        int higher = (r.nextInt(100-25+1)+25);
        System.out.println("Lower limit is : "+lower);
        System.out.println("Higher limit is : "+higher);
        int number = (r.nextInt(higher-lower+1)+lower);
        int diff = higher - lower;
        if(diff < 15)
        {
            chances = (r.nextInt(3-2+1)+2);
        }
        if(diff < 30 && diff >= 15)
        {
            chances = (r.nextInt(4-3+1)+3);
        }
        else{
            chances = (r.nextInt(6-5+1)+5);
        }
        System.out.println("You have "+chances+" chances to guess the number!!!!");
        for(int i=0;i<chances;i++)
        {
            System.out.print(player+" Enter the guessed number : ");
            int guess = sc.nextInt();
            if(guess == number)
            {
                System.out.println("You have Guessed the correct number "+guess+" :] ");
                return;
            }
            if(guess < number)
            {
                System.out.println("The guessed number is less :[");
                if(i==chances-1)
                {
                    System.out.println("Better luck next time :[");
                }
            }

            if(guess > number)
            {
                System.out.println("The guessed number is high :[");
                if(i==chances-1)
                {
                    System.out.println("Better luck next time");
                }
            }

        }

    }
    public static void main(String[] args)
    {
        guess g = new guess();
        g.guessNumber();
    }

}