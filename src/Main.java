//design class to add and subtract  multiply and divide complex number
import java.lang.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        int incho= 0;
        int choice=0;
        Complex c1 = new Complex(0.0, 0.0);
        Complex c2 = new Complex(0.0, 0.0);
        while (5 != choice){
            Scanner in = new Scanner(System.in);
            System.out.println("Enter you 1 complex number");

            c1.real = in.nextDouble();
            c1.imaginary = in.nextDouble();
            System.out.println("Enter you 2 complex number");
            c2.real = in.nextDouble();
            c2.imaginary = in.nextDouble();
            System.out.println("Enter choice of operation 1.Addition , 2.Substation , 3.Multiplication , 4.Division ");
            choice = in.nextInt();
            switch (choice) {
                case 1 -> {
                    System.out.println("Addition");
                    Complex c3 = c1.add(c2);
                    System.out.println("Complex addition of " + c1.real + "+" + c1.imaginary + "i and " + c2.real + "+" + c2.imaginary + "i  is: " + c3.real + "+" + c3.imaginary + "i");
                }
                case 2 -> {
                    System.out.println("Substation");
                    Complex c4 = c1.subtract(c2);
                    System.out.println("Complex subtraction of " + c1.real + "+" + c1.imaginary + "i and " + c2.real + "+" + c2.imaginary + "i  is: " + c4.real + "+" + c4.imaginary + "i");
                }
                case 3 -> {
                    System.out.println("Multiplication");
                    Complex c5 = c1.multiply(c2);
                    System.out.println("Complex multiplication of " + c1.real + "+" + c1.imaginary + "i and " + c2.real + "+" + c2.imaginary + "i  is: " + c5.real + "+" + c5.imaginary + "i");
                }
                case 4 -> {
                    System.out.println("Division");
                    Complex c6 = c1.divide(c2);
                    System.out.println("Complex division of " + c1.real + "+" + c1.imaginary + "i and " + c2.real + "+" + c2.imaginary + "i  is: " + c6.real + "+" + c6.imaginary + "i");
                }
                case 5 -> System.out.println("Programme terminated");
                default -> System.out.println("invalid input");
            }
            System.out.println("Do you wish to continue 1.yes|0.No ");
            incho = in.nextInt();
            if (incho == 0)
            {
                break;
            }


        }
    }
}