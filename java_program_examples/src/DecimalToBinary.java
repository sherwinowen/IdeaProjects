import java.util.Scanner;

class DecimalToBinary {
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a decimal number: ");
        int num = input.nextInt();

        //calling method to HexString
        String str = Integer.toBinaryString(num);
        System.out.println("Method 1: Decimal to Binary: "+str);
    }
}


