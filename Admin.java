@@ -0,0 +1,40 @@
package her_PracticeObjects;

import java.util.Scanner;

//  Jimmy Her | ITDEV-110-004 | Assignment #5
public class Admin{
    public static void main(String[] args){
intro();
goodbye();
    }

    public static void intro(){
        Admin getReady = new Admin();
        Scanner input = new Scanner(System.in);
        double num1, num2;
        System.out.println("Enter a number: ");
        num1=input.nextDouble();

        System.out.println("Enter a ANOTHER number: ");
        num2=input.nextDouble();

        MathFun math = new MathFun(num1, num2);

        math.setNumber1(num1);
        math.setNumber2(num2);

        System.out.println("The product is "+math.multiplyThem());
        System.out.println("The sum is "+math.addThem());
    }
    public static void goodbye(){
        String a;
        Scanner input = new Scanner(System.in);
        System.out.println("Do you want to do another calculation? Continue by typing \"Yes\" or type \"no\" to stop program.");
        a=input.nextLine();
        if (a == "Yes"){
            intro();
        }

    }
}
