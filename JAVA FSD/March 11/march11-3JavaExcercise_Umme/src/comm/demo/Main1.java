package comm.demo;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input string");
        String sentence = sc.nextLine();
        LetterSequence lc = new LetterSequence();
        System.out.println(lc.computeFrequency(sentence));
    }
}