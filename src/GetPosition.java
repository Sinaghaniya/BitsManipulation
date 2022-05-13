public class GetPosition {

    public static void main(String[]args){

        int n = 5;//5 in binary form 0101

        int pos = 2;

        int Bitmask = 1<<pos;//0100

        if(((Bitmask & n) == 0)){

            System.out.println("Bit was Zero");
        }else{

            System.out.println("Bit was One");
        }

    }
}
