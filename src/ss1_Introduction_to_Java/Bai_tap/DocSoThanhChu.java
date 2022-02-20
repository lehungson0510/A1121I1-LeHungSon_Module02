package ss1_Introduction_to_Java.Bai_tap;

import java.util.Scanner;

public class DocSoThanhChu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scanner.nextInt();
        if (number <= 10 && number >= 0) {
            switch (number) {
                case 1:
                    System.out.println("one");
                    break;
                case 2:
                    System.out.println("two");
                    break;
                case 3:
                    System.out.println("three");
                    break;
                case 4:
                    System.out.println("four");
                    break;
                case 5:
                    System.out.println("five");
                    break;
                case 6:
                    System.out.println("six");
                    break;
                case 7:
                    System.out.println("seven");
                    break;
                case 8:
                    System.out.println("eight");
                    break;
                case 9:
                    System.out.println("nine");
                    break;
                case 10:
                    System.out.println("ten");
                    break;
            }
        } else if (number <= 20) {
            int ones = number % 10;
            switch (ones) {
                case 1:
                    System.out.println("eleven");
                    break;
                case 2:
                    System.out.println("twelve");
                    break;
                case 3:
                    System.out.println("thirteen");
                    break;
                case 4:
                    System.out.println("fourteen");
                    break;
                case 5:
                    System.out.println("fifteen");
                    break;
                case 6:
                    System.out.println("sixteen");
                    break;
                case 7:
                    System.out.println("seventeen");
                    break;
                case 8:
                    System.out.println("eighteen");
                    break;
                case 9:
                    System.out.println("nineteen");
                    break;
                case 0:
                    System.out.println("twenty");
                    break;
            }

        } else if (number <= 99) {
            int tens1 = number / 10;
            int ones1 = number % 10;
            switch (tens1) {
                case 2:
                    System.out.print("twenty ");
                    break;
                case 3:
                    System.out.print("thirty ");
                    break;
                case 4:
                    System.out.print("forty ");
                    break;
                case 5:
                    System.out.print("fifty ");
                    break;
                case 6:
                    System.out.print("sixty ");
                    break;
                case 7:
                    System.out.print("seventy ");
                    break;
                case 8:
                    System.out.print("eighty ");
                    break;
                case 9:
                    System.out.print("ninety ");
                    break;
            }
            switch (ones1) {
                case 1:
                    System.out.println("one");
                    break;
                case 2:
                    System.out.println("two");
                    break;
                case 3:
                    System.out.println("three");
                    break;
                case 4:
                    System.out.println("four");
                    break;
                case 5:
                    System.out.println("five");
                    break;
                case 6:
                    System.out.println("six");
                    break;
                case 7:
                    System.out.println("seven");
                    break;
                case 8:
                    System.out.println("eight");
                    break;
                case 9:
                    System.out.println("nine");
                    break;
            }
        } else if (number < 1000) {
            int hundreds = number / 100;
            int tens2 = (number/10) % 10;
            int ones2 = number % 10;
            switch (hundreds) {
                case 1:
                    System.out.print("one hundred and ");
                case 2:
                    System.out.print("two hundred and ");
                    break;
                case 3:
                    System.out.print("three hundred and ");
                    break;
                case 4:
                    System.out.print("four hundred and ");
                    break;
                case 5:
                    System.out.println("five hundred and ");
                    break;
                case 6:
                    System.out.print("six hundred and ");
                    break;
                case 7:
                    System.out.print("seven hundred and ");
                    break;
                case 8:
                    System.out.print("eighy hundred and ");
                    break;
                case 9:
                    System.out.print("nine hundred and ");
                    break;
            }

            switch (tens2) {
                case 1: {
                    switch (ones2) {
                        case 2:
                            System.out.print("twenty ");
                            break;
                        case 3:
                            System.out.print("thirty ");
                            break;
                        case 4:
                            System.out.print("forty ");
                            break;
                        case 5:
                            System.out.print("fifty");
                            break;
                        case 6:
                            System.out.print("sixty ");
                            break;
                        case 7:
                            System.out.print("seventy ");
                            break;
                        case 8:
                            System.out.print("eighty ");
                            break;
                        case 9:
                            System.out.print("ninety ");
                            break;
                    }
                    break;
                }

                case 2:
                    System.out.print("twenty ");
                    break;
                case 3:
                    System.out.print("thirty ");
                    break;
                case 4:
                    System.out.print("forty ");
                    break;
                case 5:
                    System.out.println("fifty");
                    break;
                case 6:
                    System.out.print("sixty ");
                    break;
                case 7:
                    System.out.print("seventy ");
                    break;
                case 8:
                    System.out.print("eighty ");
                    break;
                case 9:
                    System.out.print("ninety ");
                    break;
                }

            switch (ones2) {
                case 1:
                    System.out.println("one");
                    break;
                case 2:
                    System.out.println("two");
                    break;
                case 3:
                    System.out.println("three");
                    break;
                case 4:
                    System.out.println("four");
                    break;
                case 5:
                    System.out.println("five");
                    break;
                case 6:
                    System.out.println("six");
                    break;
                case 7:
                    System.out.println("seven");
                    break;
                case 8:
                    System.out.println("eight");
                    break;
                case 9:
                    System.out.println("nine");
                    break;
            }
        }
    }
}
