//Hiển thị 20 số nguyên tố đầu tiên
package ss2_loop_in_java.bai_tap;



public class DisplayPrime {
    public static void main(String[] args) {
        int count = 0;
        int number = 2;
        while (count < 20) {
            boolean isPrime=true;
            for(int i=2;i<=Math.sqrt(number);i++){
                if(number%i==0){
                    isPrime=false;
                    break;
                }
            }
            if(isPrime){
                System.out.print( " "+number+" " );
                count++;
            }
            number++;
        }
    }
}
