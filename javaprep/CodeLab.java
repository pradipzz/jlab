public class CodeLab {

//Swapping of two numbers
    public void Swapping()
    {
        System.out.println("->Swapping of a Number");
        int a=5;
        int b=6;
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("    "+a);
        System.out.println("    "+b);

    }
//Factorial of a number
    public void Factorial(int a)
    {
        System.out.println("->Factorial of a number");
        int f=1;
        for (int i=1;i<=a;i++)
        {
            f=f*i;
        }
        System.out.println("    "+f);
    }
//Reverse the String
    public void stringReverse(String S)
    {
        System.out.println("->Reverse the String");
        String r="";
        for(int i=0;i<S.length();i++)
        {
            r=S.charAt(i)+r;
        }
        System.out.println("    "+r);
    }

//Fibonacci Series 0 1 1 2 3 5 8 13 21 34 55

    public void fibanacciSeries(int num)
    {
        System.out.println("-> Fibonacci Series");
        int num1=0;int num2=1;int num3=0;
        System.out.print("    "+num1+" "+num2+" ");
        for(int i=2;i<num;i++)
        {
            num3=num1+num2;
            num1=num2;
            num2=num3;
            System.out.print(num3+" ");

        }
    }

    //To check the given number is a Prime number
    public void primeNumber(int n ) {
        System.out.println(" ");
        System.out.println("->prime Number");
        int flag = 0;
        if (n <= 1) {
            System.out.println(" The Given is not a prime");
        }
        else {
            for (int i = 2; i <=n / 2; i++) {
                if (n % i == 0) {
                    flag = 1;
                }
            }
        }
        if(flag==0)
        {
            System.out.println("    "+n+" is a prime Number");
        }
        else
        {
            System.out.println("    "+n+" is not a prime Number");
        }

    }

//Program to count the Number of Digits in a Number
    public  void countOfNumbers(int n1)
    {
        System.out.println("->count Of a Number");
        int counter=0;
        while(n1!=0)
        {
            n1=n1/10;
            counter++;
        }
        System.out.println("    "+ "count Of a Numbers is "+counter );
    }

    //Program to check the year is Leap year or Not
    public void leapYear(int y)
    {
        System.out.println("->leapYear");
        if((y%400==0)||(y%4==0)&&(y%100!=0))
        {
            System.out.println("   "+y+" is LeapYear");
        }
        else
        {
            System.out.println("    "+y+" Not a Leap Year");
        }
    }

    //program to find Multiplication of number
    public void Multiplication(int m)
    {
        System.out.println("->Multiplication");
        for(int i=1;i<=10;i++)
        {
            int mul=m*i;
            System.out.println("    "+i+"*"+m+"="+mul);
        }
    }

    //program to Reverse a number
    public void reverseAnNumber(int r)
    {
        System.out.println("->Reversing a Number");
        int rem;
        int rev=0;
        int counter=0;
        while(r!=0)
        {
            counter++;
            rem=r%10;
            r=r/10;
            rev=(rev*10)+rem;
        }
        System.out.println("    "+"The reverse of a given number is "+rev);
        System.out.println("    "+"The count of the given number is "+counter);
    }

    //Program to find the sum of n natural numbers
    public void sumOfNaturalNum(int n1)
    {
        System.out.println("->sumOfNaturalNum");
        int sum=0;
        for(int i=1;i<=n1;i++)
        {
            sum=sum+i;
        }
        System.out.println("    The Sum of natural Number "+n1+" is "+sum);
    }

    //Program to Find the number is ArmstrongNumber
    public void armstrongNum(int a)
    {
        System.out.println("->armstrongNum");
        int temp=a;int digits=0;int rem;
        double sum=0;
        while(temp!=0)
        {
            temp=temp/10;
            digits++;
        }
        temp=a;
        while(temp!=0)
        {
            rem=temp%10;
            sum=sum+Math.pow(rem,digits);
            temp=temp/10;
        }
        if (a==sum)
        {
            System.out.println("    The Number "+a+" is ArmstrongNumber");
        }
        else
        {
            System.out.println("    The Number "+a+" is not a ArmstrongNumber");
        }
    }

    //Program to Find the number is perfectNumber
    public void perfectNumber(int n2)
    {
        System.out.println("->perfectNumber");
        int sum=0;
        for(int i=1;i<=n2/2;i++)
        {
            if(n2%i==0)
            {
                sum = sum + i;
            }
        }
        if(sum==n2)
        {
            System.out.println("    "+n2+" is a perfect Number");
        }
        else
        {
            System.out.println("    "+n2+" is not a perfect Number");
        }
    }

    //Program to Find the number is Magic number
    public void magicNumber(int n)
    {
        System.out.println("->magicNumber");
        int temp=n,rem,sum=0;
        while(temp>9) {
            while ((temp > 0)) {
                rem = temp % 10;
                sum += rem;
                temp = temp / 10;
            }
            temp = sum;
            sum = 0;
        }
        if(temp==1)
        {
            System.out.println(n+"  is Magic num");
        }
        else
        {
            System.out.println("Not a magic number");
        }
    }

    public static void main(String[] args)
    {
        CodeLab sobj= new CodeLab();
        //Calling Swapping() Method -- //Swapping of two numbers.
        sobj.Swapping();
        // Calling Factorail() Method -- //Factorial of a number.
        sobj.Factorial(10);
        // Calling stringReverse() Method -- //Reverse the String.
        sobj.stringReverse("pradeep");
        // Calling fibanacciSeries() Method -- //Prints fibanacciSeries for upto the given number.
        sobj.fibanacciSeries(11);
        //Calling primeNumber() Method -- //To check the given number is a Prime number.
        sobj.primeNumber(23);
        //Calling countOfNumbers() Method -- //Program to count the Number of Digits in a Number
        sobj.countOfNumbers(10005);
        //Calling leapYear() Method --//Program to check the year is Leap year or Not
        sobj.leapYear(1900);
        //Calling Multiplication() Method -- //program to find Multiplication of number
        sobj.Multiplication(2);
        //Calling reverseAnNumber() Method -- //program to Reverse a number
        sobj.reverseAnNumber(123456);
        //Calling sumOfNaturalNum() Method //Program to find the sum of n natural numbers
        sobj.sumOfNaturalNum(10);
        //Calling armstrongNum() method   //Program to Find the number is ArmstrongNumber
        sobj.armstrongNum(153);
        //Calling perfectNumber() method   //Program to Find the number is perfectNumber
        sobj.perfectNumber(28);
        //Calling magicNumber() method   //Program to Find the number is magicNumber
        sobj.magicNumber(325);

    }
}
