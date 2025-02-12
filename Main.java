import java.util.Random;
import java.util.Scanner;
import java.util.SortedMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        //1.Write a program that prints the numbers from 1 to 100 such that:
        //If the number is a multiple of 3, you need to print "Fizz" instead of that
        //number.

        for (int i = 0; i <= 100; i++) {
            if (i % 5 == 0 && i % 3 == 0) {
                System.out.println("Fizz and Buzz:" + i);
            } else if (i % 5 == 0) {
                System.out.println("Buzz:" + i);
            }
            if (i % 3 == 0) {
                System.out.println("Fizz:" + i);
            }
        }

        // 2.Write a Java program to reverse a string.
       String Words="The quick brown fox";
       String revres="";
       String chr;
       for(int i=0;i<=Words.length();i++){
         StringBuilder reversedString=new StringBuilder(Words).reverse();
           System.out.println(reversedString);
       }

        //3.Write a program to find the factorial value of any number entered
        //through the keyboard.
        int num = 9;
        int f = 0;
        for (int i = 0; i <= num; i++) {
            f = num * (i + 1);
        }
        System.out.println("The factorial value is:" + f);

        //4.Two numbers are entered through the keyboard. Write a program to find
        // the value of one number raised to the power of another. (Do not use Java
        //built-in method)
        int number = 6;
        int power = 3;
        double p = 1;
        for (int i = 0; i <= number; i++) {
            p = Math.pow(number, power);
        }
        System.out.println(number + " ^ " + power + "= " + p);

        //5-Write a program that reads a set of integers, and then prints the sum of
//the even and odd integers.
        int integers=0;
       int even=0;
       int odd=0;
        int sum=0;
        for(int i=0;i<=integers;i++){
        System.out.println("enter your number:");
        integers = data.nextInt();
        if(integers%2==0){
           sum+=i;
           even++;
        }
        else{
           sum+=i;
           odd++;
        }

        }
        System.out.println("The number is even:"+sum);
        System.out.println("The number is odd:"+sum);

//6.Write a program that prompts the user to input a positive integer. It
//should then output a message indicating whether the number is a prime
//number.

        System.out.println("enter your even number:");
        int evennumber = data.nextInt();
        if(evennumber%2==0){
            System.out.println("the number is a prime");
        }
        //7.Use a for loop to print headings for four weeks (Weeks 1 - 4). Then use
        //another for loop to print the days (Days 1 -7) for each week.
        for(int week= 1;week<=4;week++){
            System.out.println("week is: "+week);

        for(int day=1;day<=7;day++){
            System.out.println("Day"+day);
        }}

            }
        }







