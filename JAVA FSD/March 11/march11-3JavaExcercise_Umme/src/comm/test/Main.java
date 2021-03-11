package comm.test;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        UserMainCode pwd = new UserMainCode();
        System.out.println("Enter the password to check if it is valid or invalid");
        Scanner sc = new Scanner(System.in);
        String password = sc.nextLine();
        boolean n = UserMainCode.checkPassword(password);
        if(n==true){
            System.out.println("Valid password");
        }else{
            System.out.println("Invalid password");
        }
    }
}
