package que2;
import java.util.Scanner;
public class sol2 {
    public static void main(String[] args) {
    Scanner n = new Scanner(System.in);
    System.out.println("enter the string");
    String a = n.nextLine().trim();
    System.out.println("enter the index");
    int b = n.nextInt();
    System.out.println(a.substring(b));
}
}
