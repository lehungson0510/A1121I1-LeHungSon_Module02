//Hiển thị số nguyên tố nhỏ hơn 100
package ss2_loop_in_java.bai_tap;

public class DisplayPrime2 {
    public static void main(String[] args) {
        int number = 2;
        while (number < 100) {
            boolean isPrime=true;
            for(int i=2;i<=Math.sqrt(number);i++){
                if(number%i==0){
                    isPrime=false;
                    break;
                }
            }
            if(isPrime){
                System.out.print( " "+number+" " );

            }
            number++;
        }
    }
}
