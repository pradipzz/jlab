//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    String ret=String_rev("car");
    System.out.println(ret);
        System.out.println(num_rev(123));
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
    public static int num_rev(int num)
    {
       int rem;
       int rev=0;
       while(num!=0)
       {
           rem=num%10;
           num=num/10;
           rev=(rev*10)+rem;
       }
    return rev;
    }
}

--> how to call non static method

