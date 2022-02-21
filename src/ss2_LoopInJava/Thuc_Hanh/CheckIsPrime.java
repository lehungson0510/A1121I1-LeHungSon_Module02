//Kiểm tra số nguyên tố
package ss2_LoopInJava.Thuc_Hanh;

import java.util.Scanner;

public class CheckIsPrime {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter number: ");
        int num=scanner.nextInt();
        boolean checkSNT=true;
        if(num<2){
            System.out.println(num+" is not Prime");
        }
        else {
            for(int i=2;i<num;i++) {
                if (num % i == 0) {
                    checkSNT = false;
                    break;
                }
            }
                if(checkSNT){
                    System.out.println(num+" is Prime");
                }
                else {
                    System.out.println(num+" is not Prime");
                }
            }
        }
    }
