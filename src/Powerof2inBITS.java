import java.util.Scanner;

public class Powerof2inBITS {

    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int Bitmask = 1<<1;

        int newNumber = Bitmask;

        if (n%newNumber==0){
        System.out.println("Divisble of 2");
        }else{
            System.out.println("Not Divisible of 2");
        }
    }
}
