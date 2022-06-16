import java.util.*;

public class Watermelon{

static Scanner sr = new Scanner(System.in);
public static void main(String[] args) {
    
    System.out.println("Enter Number ");
    int n =sr.nextInt();

    if (n<2 || n%2!=0) {
        
        System.out.println("NO!");
    } else {
        System.out.println("YES");
    }
    
    
    }

}