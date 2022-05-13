public class UpdateBit {

    public static void main(String[]args){

        int n = 5;//0101

        int pos = 1;

        int BitMask = 1<<pos;//0010

        int newNumber = BitMask|n;//0111

        System.out.print(newNumber);//0111 == 7
    }
}
