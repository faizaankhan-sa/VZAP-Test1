import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        int count = 0;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string: ");
        StringTokenizer st = new StringTokenizer(in.nextLine(), ", /-");

        while (st.hasMoreTokens()) {
            if (st.nextToken().equals("of")) {
                count++;
            }
        }
        System.out.println("The word of appears " + count + " times");
    }
}