package case_study.controllers;

import case_study.services.CustomerService;
import case_study.services.EmployeeService;
import case_study.services.FacilityService;
import case_study.services.impl.CustomerServiceImpl;
import case_study.services.impl.EmployeeServiceImpl;
import case_study.services.impl.FacilityServiceImpl;

import java.util.Scanner;

public class FuramaController {
    public static void main(String[] args) {
        displayMainMenu();
    }

    public static void displayMainMenu() {
        boolean check = true;
        while (check) {
            System.out.println("\n1. Employee Management\n" +
                    "2. Customer Management\n" +
                    "3. Facility Management \n" +
                    "4. Booking Management\n" +
                    "5. Promotion Management\n" +
                    "6. Exit\n");
            System.out.print("Input your choice: ");
            Scanner input = new Scanner(System.in);

            switch (input.nextInt()) {
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
        EmployeeService employeeService = new EmployeeServiceImpl();
        boolean check = true;
        while (check) {
            System.out.println("\n1. Display list employees\n" +
                    "2. Add new employee\n" +
                    "3. Edit employee\n" +
                    "4. Return main menu\n");
            Scanner input = new Scanner(System.in);
            System.out.print("Input your choice: ");
            switch (Integer.parseInt(input.nextLine())) {
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
        boolean check = true;
        while (check) {
            System.out.println("\n1. Display list customers\n" +
                    "2. Add new customer\n" +
                    "3. Edit customer\n" +
                    "4. Return main menu\n");
            Scanner input = new Scanner(System.in);
            System.out.print("Input your choice: ");
            switch (Integer.parseInt(input.nextLine())) {
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
        boolean check = true;
        while (check) {
            System.out.println("\n1. Display list facility\n" +
                    "2. Add new facility\n" +
                    "3. Display list facility maintenance\n" +
                    "4. Return main menu\n");
            Scanner input = new Scanner(System.in);
            System.out.print("Input your choice: ");
            switch (Integer.parseInt(input.nextLine())) {
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
        boolean check = true;
        while (check) {
            System.out.println("\n1. Add new Villa\n" +
                    "2. Add new House\n" +
                    "3. Add new Room\n" +
                    "4. Return facility menu\n");
            Scanner input = new Scanner(System.in);
            System.out.print("Input your choice: ");
            switch (Integer.parseInt(input.nextLine())) {
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
            switch (Integer.parseInt(input.nextLine())) {
                case 1:
            }
        }
    }

    public static void displayPromotionMenu() {
        boolean check = true;
        while (check) {
            System.out.println("\n1. Display list customers use service\n" +
                    "2. Display list customers get voucher\n" +
                    "3. Return main menu\n");
            Scanner input = new Scanner(System.in);
            System.out.print("Input your choice: ");
            switch (Integer.parseInt(input.nextLine())) {
                case 1:
            }
        }
    }
}

