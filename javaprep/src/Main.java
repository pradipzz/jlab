import com.sun.source.tree.BreakTree;

import java.util.Scanner;
import java.math.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    String ret=String_rev("car");
    System.out.println(ret);
    Main obj1=new Main();
    obj1.num_rev(123);
    System.out.println(swap(1,2));
        System.out.println(factorial(4));
        System.out.println(obj1.fibonacci(11));
        if(isprime(10))
        {
            System.out.print(" is a prime.");
        }
        else{
            System.out.println(" is not a prime.");
        }
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the starting prime");
        int start =sc.nextInt();
        System.out.println("Enter the end prime");
        int end=sc.nextInt();
        for (int i=start;i<=end;i++)
        {
            if(isprime(i))
            {
                System.out.println(i+" is a prime.");
            }
            else{
                System.out.println("null");
            }
        }

    }
    public static String String_rev(String S)
    {/* pradeep*/
        String rc="";
        for(int i=0;i<S.length();i++)
        {
            rc=S.charAt(i)+rc;

        }
        return rc;

    }
    public void num_rev(int num)
    {
       int rem;
       int rev=0;
       while(num!=0)
       {
           rem=num%10;
           num=num/10;
           rev=(rev*10)+rem;
       }
        System.out.println(rev);;
    }
//    Swapping a number
    public static int swap(int a,int b)
    {
        Scanner sc=new Scanner(System.in);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("a is "+a);
        System.out.println("b is "+b);
        return 0;
    }
    public static int factorial(int num)
    {
        int fac=1;
        for(int i=1;i<=num;i++)
        {
            fac=fac*i;
        }
        return fac;
    }
    //fibonacci 0 1 1 2 3 5 8 13 21 34 55
    public int fibonacci(int count)
    {
        int num1=0,num2=1,num3=0;
        System.out.print(num1+" "+num2);
        for(int i=2;i<count;i++)
        {
           num3=num1+num2;
           num1=num2;
           num2=num3;
            System.out.print(" "+num3+" ");
        }
        return 0;
    }
    //prime
    public static boolean isprime(int num)
    {
//        System.out.print("The number "+num);
        if(num<=1)
        {
            return false;
        }

        for(int i=2;i<=Math.sqrt(num);i++)
        {
            if (num % i == 0)
                {
                    return false;
                }
        }
        return true;
    }
}

