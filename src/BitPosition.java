import java.util.Scanner;

public class BitPosition {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();//0101 == 5 in Binary Form

        int pos = sc.nextInt();

        int BitMask = 1<<pos;//0010

        int newNumber = BitMask|n;//0111

        System.out.print(newNumber);

    }
}
