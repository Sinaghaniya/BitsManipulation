public class ClearBit {

    public static void main(String[]args){

        int n =5;

        int pos = 2;

        int BitMask = 1<<pos;//0100

        int newNumber = ~(BitMask);//1011

        newNumber = newNumber&n;//1011 & 0101

        System.out.print(newNumber);//0001 ie 1 in Decimal Number

    }
}
