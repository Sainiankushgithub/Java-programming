package Java_Course;

import java.util.*;

public class DemoException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int a, b, result;
            System.out.println("Enter the values of a and b ");
            a = sc.nextInt();
            b = sc.nextInt();
            result = a / b;
            System.out.println(result);
        } catch (ArithmeticException e) {
            // System.out.println(e.toString());   // This will going to print Exception name and description 

            // System.out.println(e.getMessage());  // This will going to print the description

            e.printStackTrace();  // This will going to print Exception name , description  and StackTrace
        }
        sc.close();
    }
}
