package comm.example;

import java.util.Scanner;

public class ClassA extends GetPercentage{
    @Override
    public float getPercentage() {
        int mark[] = new int[3];
        int i;
        float sum=0,sum1=0;
        float avg, perc;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 3 subjects marks");
        for(i=0; i<3; i++)
        {
            mark[i] = sc.nextInt();
            sum = sum + mark[i];
        }
        sum1 = sum/3;
        perc = (sum/300) * 100;
        System.out.println("Percentage of A for 3 subjects is:" +perc+ " %");
        return perc;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("A Percentage for 3 subjects");
    }
}
