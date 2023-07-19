import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int suma = 0, i = 0;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string: ");
        StringBuilder str = new StringBuilder(in.nextLine());

        while (i < str.length()){
            if (str.charAt(i) == 'a' | str.charAt(i) == 'e' | str.charAt(i) == 'i' | str.charAt(i) == 'o' | str.charAt(i) == 'u'){
                suma++;
            }
            i++;
        }
        System.out.println("Your string " + str + " has " + suma + " vowels");
    }
}




