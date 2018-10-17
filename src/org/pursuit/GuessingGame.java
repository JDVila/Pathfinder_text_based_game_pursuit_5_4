package org.pursuit;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame implements Game {
    @Override
    public void startGame() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int randomNum = random.nextInt(10) + 1;
        int guess;
        System.out.println("  GGGG                             iii                 \n" +
                " GG  GG uu   uu   eee   sss   sss      nn nnn   gggggg \n" +
                "GG      uu   uu ee   e s     s     iii nnn  nn gg   gg \n" +
                "GG   GG uu   uu eeeee   sss   sss  iii nn   nn ggggggg \n" +
                " GGGGGG  uuuu u  eeeee     s     s iii nn   nn      gg \n" +
                "                        sss   sss               ggggg  \n" +
                "  GGGG                             \n" +
                " GG  GG   aa aa mm mm mmmm    eee  \n" +
                "GG       aa aaa mmm  mm  mm ee   e \n" +
                "GG   GG aa  aaa mmm  mm  mm eeeee  \n" +
                " GGGGGG  aaa aa mmm  mm  mm  eeeee \n" +
                "                                   ");

        do {
            System.out.print("Guess a number between 1 and 10: ");
            guess = scanner.nextInt();
        } while (guess != randomNum);
        System.out.println("You've guess the right number: " + randomNum + "!");
    }
}
