import java.util.Scanner;

class Complex {
    private double real;                                //"this" is used to refer to the current object's instance variables
    private double imag;

    public Complex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }
    public Complex add(Complex other) {
        double real = this.real + other.real;
        double imag = this.imag + other.imag;
        return new Complex(real, imag);
    }
    public Complex subtract(Complex other) {
        double real = this.real - other.real;
        double imag = this.imag - other.imag;
        return new Complex(real, imag);
    }
    public Complex multiply(Complex other) {
        double real = this.real * other.real - this.imag * other.imag;
        double imag = this.real * other.imag + this.imag * other.real;
        return new Complex(real, imag);
    }
 public String toString() {
        return real + " + " + imag + "i";
    }
}
public class ComplexI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter real part of first complex number: ");
        double real1 = scanner.nextDouble();
        System.out.print("Enter imaginary part of first complex number: ");
        double imag1 = scanner.nextDouble();

        System.out.print("Enter real part of second complex number: ");
        double real2 = scanner.nextDouble();
        System.out.print("Enter imaginary part of second complex number: ");
        double imag2 = scanner.nextDouble();

        Complex num1 = new Complex(real1, imag1);
        Complex num2 = new Complex(real2, imag2);

        Complex sum = num1.add(num2);
        Complex difference = num1.subtract(num2);
        Complex product = num1.multiply(num2);

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
System.out.println("23DCS018 Tirth Dalal ");
    }
}
