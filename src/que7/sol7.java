package que7;
import java.util.Scanner;
public class sol7 {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("enter the string");
    String a = in.nextLine().trim();
    int x = 0;
    for (int i = 0; i < a.length(); i++) {
        char c = a.charAt(i);
        int b = c;
        x = x + b;
        System.out.println(b);
    }
    System.out.println("total weight of this string is " + x);
}
}

