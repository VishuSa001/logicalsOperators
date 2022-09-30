
// public class LogicalOperater {
//     public static void main(String[] args) {

//     }
// }

import java.util.Scanner;

public class LogicalOperater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        System.out.println("this is the first number");
        int num2 = sc.nextInt();
        System.out.println("this is the Second  number");
        int num3 = sc.nextInt();
        System.out.println("this is the third number");

        // use && AND,||OR  OPERATOR,  condition and compare number together
        if ((num1 < num2) || (num2 == num3)) {
            int sum = num1 + num2 + num3;
            System.out.println("the sum is : " + sum);

        } else {
            System.out.println("false condition");
        }

    }
}
