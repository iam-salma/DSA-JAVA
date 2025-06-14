package functions;

import java.util.Scanner;

public class circle {
    double circ(int rad){
        double c=2*3.14*rad;
        return c;
    }

    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int r;
            System.out.println("Enter radius: ");
            r=s.nextInt();
            circle obj=new circle();
            System.out.println("the circumference of the circle is: "+obj.circ(r));
        }
    }
}
