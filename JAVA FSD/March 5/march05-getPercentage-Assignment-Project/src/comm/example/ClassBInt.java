package comm.example;

import java.util.Scanner;

public class ClassBInt implements GetPerInterface{
    @Override
    public float getPercentage() {
        int mark[] = new int[4];
        int i;
        float sum=0,sum1=0;
        float avg, perc;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 4 subjects marks");
        for(i=0; i<4; i++)
        {
            mark[i] = sc.nextInt();
            sum = sum + mark[i];
        }
        sum1 = sum/4;
        perc = (sum/400) * 100;
        System.out.println("Percentage of B for 4 subjects is:" +perc+ " %");
        return perc;
    }

    @Override
    public void display() {

    }
}
