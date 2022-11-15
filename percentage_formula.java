import java.util.*;

public class percentage_formula {
public static void main(String[] args) {
    Scanner x=new Scanner(System.in);
    System.out.print("Enter total marks obtained: ");
    double a=x.nextDouble();
    System.out.print("Enter total marks: ");
    double b=x.nextDouble();

    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    System.out.println("~~~~~~~~~~Solution~~~~~~~~~~~~~");
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

    double c=a*100;

    System.out.println(a+"*100  ="+c);
    double d=c/b;
    System.out.println(c+"/"+b+"  ="+d);
    int e=(int) d;
    System.out.println("YOUR ANSWER IS  = "+e+"%");


}
    
}