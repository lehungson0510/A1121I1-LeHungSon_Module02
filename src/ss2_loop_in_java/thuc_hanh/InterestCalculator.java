//Tính tiền lãi
package ss2_loop_in_java.thuc_hanh;
import java.util.Scanner;

public class InterestCalculator {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter investment amount ");
        double money=scanner.nextDouble();
        System.out.print("Enter number of months: ");
        int month=scanner.nextInt();
        System.out.print("Enter annual interest rate in percentage: ");
        double interestRate=scanner.nextDouble();
        double totalInterest;
        totalInterest=money*interestRate/12/100*month;
        System.out.println("totalInterest= "+totalInterest);
    }
}
