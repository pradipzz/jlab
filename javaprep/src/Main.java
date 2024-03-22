//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    String ret=String_rev("car");
    System.out.println(ret);
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
}