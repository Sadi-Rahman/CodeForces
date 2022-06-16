import java.util.*;

public class Theatre_Square{

static Scanner sr = new Scanner(System.in);

public static void main(String[] args) {
  
    
    System.out.println("Enter n: ");
    double n=sr.nextDouble();
    System.out.println("Enter m: ");
    double m=sr.nextDouble();
    System.out.println("Enter a: ");
    double a=sr.nextDouble();

    double o=(Math.ceil(n/a)*Math.ceil(m/a));
    System.out.println(o);
}
    
}