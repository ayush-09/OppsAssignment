package que3;
import java.util.Scanner;
public class sol3 {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("enter the string\n");
    String a = in.nextLine().trim();
    a = a.replace('a','*');
    a = a.replace('e','*');
    a = a.replace('i','*');
    a = a.replace('o','*');
    a = a.replace('u','*');
    System.out.println(a);
}
}

