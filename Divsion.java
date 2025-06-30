import java.util.Scanner;

class Divsion {
    public void div(int num1, int num2) {
        int sum = num1 / num2;
        System.out.println(sum);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = scan.nextInt();

        System.out.print("Enter second number: ");
        int b = scan.nextInt();

        Divsion demo = new Divsion();
        demo.div(a, b);
    }
}