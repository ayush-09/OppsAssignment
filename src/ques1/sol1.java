package ques1;
import java.util.Scanner;
public class sol1 {public static void main(String[] args) {
    Scanner n = new Scanner(System.in);
    System.out.println("enter the value of string\n");
    String a = n.nextLine().trim();
    StringBuffer b = new StringBuffer();
    StringBuffer c = new StringBuffer();
    for (int i = 0; i < a.length(); i++) {
        b.append(a.charAt(i) + "\t");
        c.append(i + "\t");
    }
    System.out.println(c);
    System.out.println(b);

}
}

