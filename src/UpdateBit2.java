public class UpdateBit2 {

    public static void main(String[]args){

        int n = 5;//0101

        int pos = 2;

        int BitMask = 1<<pos;//0100

        int newNumber = ~(BitMask);//1011

        newNumber = newNumber&n;//0001

        System.out.println(newNumber);//0001

    }
}