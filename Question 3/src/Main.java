import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        char rc, x;
        double areaOfCircle;
        int lengthTriangle, widthTriangle, radiusCircle, areaOfRectangle;

        Scanner in = new Scanner(System.in);

        do {
            System.out.println("Would you like to calculate the area of a r or c");
            rc = in.next().charAt(0);

            switch (rc) {
                case 'r' -> {
                    System.out.println("Enter your length: ");
                    lengthTriangle = in.nextInt();
                    System.out.println("Enter your width: ");
                    widthTriangle = in.nextInt();
                    areaOfRectangle = widthTriangle * lengthTriangle;
                    System.out.println("The area of the rectangle is: " + areaOfRectangle);
                }
                case 'c' -> {
                    System.out.println("Enter your radius: ");
                    radiusCircle = in.nextInt();
                    areaOfCircle = Math.PI * radiusCircle*radiusCircle;
                    System.out.println("The area of the triangle is: " + areaOfCircle);
                }
            }
            System.out.println("Would you like to do another calculation y or n? ");
            x = in.next().charAt(0);

        } while (x == 'y');
    }
}


