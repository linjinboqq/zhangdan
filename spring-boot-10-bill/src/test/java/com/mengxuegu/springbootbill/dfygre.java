package com.mengxuegu.springbootbill;






import java.util.Scanner;

public class dfygre {
    public static void main(String ag[]) throws  Exception{
        System.out.println("Please input your score");

            Scanner scanner = new Scanner(System.in);
            int a = scanner.nextInt();

                throw new myException();




    }

}

class myException extends Exception {
    int grade;
    public myException() {
    }
}

