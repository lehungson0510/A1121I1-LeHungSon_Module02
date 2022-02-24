package ss3_Array_MethodInJava.Bai_Tap;

import java.util.Scanner;

public class CountCharacter {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Nhap vao 1 chuoi: ");
        String str=input.nextLine();
        int count=0;

        System.out.print("Nhap ki tu muon dem trong chuoi: ");
        char character=input.nextLine().charAt(0);
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==character){
                count+=1;
            }
        }

        System.out.println("So lan xuat hien ki tu \""+character+"\" trong chuoi: "+count);
    }
}
