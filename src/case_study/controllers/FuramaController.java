package case_study.controllers;

import case_study.services.*;
import case_study.services.impl.*;

import java.util.Scanner;

public class FuramaController {
    public static void main(String[] args) {
        displayMainMenu();
    }

    public static void displayMainMenu() {
        boolean check = true;
        int choice = 0;
        while (check) {
            System.out.println("------------------MAIN MENU------------------\n" +
                    "1. Employee Management\n" +
                    "2. Customer Management\n" +
                    "3. Facility Management \n" +
                    "4. Booking Management\n" +
                    "5. Promotion Management\n" +
                    "6. Exit\n");
            System.out.print("Input your choice: ");
            Scanner input = new Scanner(System.in);
            try {
                choice = Integer.parseInt(input.nextLine());
            }catch (NumberFormatException e){
                System.err.println("INPUT WRONG FORMAT");
            }
            switch (choice) {
                case 1:
                    displayEmployeeMenu();
                    break;
                case 2:
                    displayCustomerMenu();
                    break;
                case 3:
                    displayFacilityMenu();
                    break;
                case 4:
                    displayBookingMenu();
                    break;
                case 5:
                    displayPromotionMenu();
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.out.println("\nChoice again");
            }
        }
    }

    public static void displayEmployeeMenu() {
        int choice = 0;
        EmployeeService employeeService = new EmployeeServiceImpl();
        boolean check = true;
        while (check) {
            System.out.println("\n1. Display list employees\n" +
                    "2. Add new employee\n" +
                    "3. Edit employee\n" +
                    "4. Return main menu\n");
            Scanner input = new Scanner(System.in);
            System.out.print("Input your choice: ");
            try {
                choice = Integer.parseInt(input.nextLine());
            }catch (NumberFormatException e){
                System.err.println("INPUT WRONG FORMAT");
            }
            switch (choice) {
                case 1: {
                    employeeService.display();
                    break;
                }
                case 2: {
                    employeeService.addNew();
                    break;
                }
                case 3: {
                    employeeService.edit();
                    break;
                }
                case 4:
                    displayMainMenu();
                    break;
                default:
                    System.out.println("\nChoice again");
            }
        }
    }

    public static void displayCustomerMenu() {
        CustomerService customerService = new CustomerServiceImpl();
        int choice = 0;
        boolean check = true;
        while (check) {
            System.out.println("\n1. Display list customers\n" +
                    "2. Add new customer\n" +
                    "3. Edit customer\n" +
                    "4. Return main menu\n");
            Scanner input = new Scanner(System.in);
            System.out.print("Input your choice: ");
            try {
                choice = Integer.parseInt(input.nextLine());
            }catch (NumberFormatException e){
                System.err.println("INPUT WRONG FORMAT");
            }
            switch (choice) {
                case 1:
                    customerService.display();
                    break;
                case 2:
                    customerService.addNew();
                    break;
                case 3:
                    customerService.edit();
                    break;
                case 4:
                    displayMainMenu();
                    break;
                default:
                    System.out.println("\nChoice again");
            }
        }
    }

    public static void displayFacilityMenu() {
        FacilityService facilityService = new FacilityServiceImpl();
        int choice = 0;
        boolean check = true;
        while (check) {
            System.out.println("\n1. Display list facility\n" +
                    "2. Add new facility\n" +
                    "3. Display list facility maintenance\n" +
                    "4. Return main menu\n");
            Scanner input = new Scanner(System.in);
            System.out.print("Input your choice: ");
            try {
                choice = Integer.parseInt(input.nextLine());
            }catch (NumberFormatException e){
                System.err.println("INPUT WRONG FORMAT");
            }
            switch (choice) {
                case 1:
                    facilityService.display();
                    break;
                case 2:
                    addNewFacilityMenu();
                    break;
                case 3:
                    facilityService.displayMaintain();
                    break;
                case 4:
                    displayMainMenu();
                    break;
                default:
                    System.out.println("\nChoice again");
            }
        }
    }

    public static void addNewFacilityMenu() {
        FacilityService facilityService = new FacilityServiceImpl();
        int choice = 0;
        boolean check = true;
        while (check) {
            System.out.println("\n1. Add new Villa\n" +
                    "2. Add new House\n" +
                    "3. Add new Room\n" +
                    "4. Return facility menu\n");
            Scanner input = new Scanner(System.in);
            System.out.print("Input your choice: ");
            try {
                choice = Integer.parseInt(input.nextLine());
            }catch (NumberFormatException e){
                System.err.println("INPUT WRONG FORMAT");
            }
            switch (choice) {
                case 1:
                    facilityService.addNewVilla();
                    displayFacilityMenu();
                    break;
                case 2:
                    facilityService.addNewHouse();
                    displayFacilityMenu();
                    break;
                case 3:
                    facilityService.addNewRoom();
                    displayFacilityMenu();
                    break;
                case 4:
                    displayFacilityMenu();
                    break;
                default:
                    System.out.println("\nChoice again");
            }
        }
    }

    public static void displayBookingMenu() {
        BookingService booking = new BookingServiceImpl();
        ContractService contract = new ContractServiceImpl();
        int choice = 0;
        boolean check = true;
        while (check) {
            System.out.println("\n1. Add new booking\n" +
                    "2. Display list booking\n" +
                    "3. Create new contracts\n" +
                    "4. Display list contracts\n" +
                    "5. Edit contracts\n" +
                    "6. Return main menu\n");
            Scanner input = new Scanner(System.in);
            System.out.print("Input your choice: ");
            try {
                choice = Integer.parseInt(input.nextLine());
            }catch (NumberFormatException e){
                System.err.println("INPUT WRONG FORMAT");
            }
            switch (choice) {
                case 1:
                    booking.addNew();
                    break;
                case 2:
                    booking.display();
                    break;
                case 3:
                    contract.addNew();
                    break;
                case 4:
                    contract.display();
                    break;
                case 5:
                    contract.edit();
                    break;
                case 6:
                    displayMainMenu();
                    break;
                default:
                    System.out.println("\nChoice again");
            }
        }
    }

    public static void displayPromotionMenu() {
        PromotionServiceImpl promotion = new PromotionServiceImpl();
        boolean check = true;
        int choice =0;
        while (check) {
            System.out.println("\n1. Display list customers use service\n" +
                    "2. Display list customers get voucher\n" +
                    "3. Return main menu\n");
            Scanner input = new Scanner(System.in);
            System.out.print("Input your choice: ");
            try {
                choice = Integer.parseInt(input.nextLine());
            }catch (NumberFormatException e){
                System.err.println("INPUT WRONG FORMAT");
            }
            switch (choice) {
                case 1:
                    promotion.displayUseService();
                    break;
                case 2:
                    break;
            }
        }
    }
}

