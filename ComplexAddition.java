import java.util.Scanner;

class ComplexAddition
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter real part of first complex number: ");
        double r1 = sc.nextDouble();

        System.out.print("Enter imaginary part of first complex number: ");
        double i1 = sc.nextDouble();

        System.out.print("Enter real part of second complex number: ");
        double r2 = sc.nextDouble();

        System.out.print("Enter imaginary part of second complex number: ");
        double i2 = sc.nextDouble();

        double real = r1 + r2;
        double imag = i1 + i2;

        System.out.println("Sum = " + real + " + " + imag + "i");

        sc.close();
    }
}
