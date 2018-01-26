public class ArithmeticOperatorDemo {
    public static void main(String args[]) {
        int num1 = 100;
        int num2 = 20;
        int num3 = 10;
        int num4 = 20;
        int num5 = 100;
        int num6 = 200;

        System.out.println("num1 + num2: " +(num1 + num2));
        System.out.println("num1 - num2: " +(num1 - num2));
        System.out.println("num1 * num2: " +(num1 * num2));
        System.out.println("num1 / num2: " +(num1 / num2));
        System.out.println("num1 % num2: " +(num1 % num2));

        num4 = num3;
        System.out.println("= Output: "+num4);

        num4 += num3;
        System.out.println("+= Output: "+num4);

        num4 -= num3;
        System.out.println("-= Output: "+num4);

        num4 *= num3;
        System.out.println("*= Output: "+num4);

        num4 /= num3;
        System.out.println("/= Output: "+num4);

        num4 %= num3;
        System.out.println("%= Output: "+num4);

        num5++;
        num6--;
        System.out.println("num5++ is: "+num5);
        System.out.println("num6-- is: "+num6);
    }
}
