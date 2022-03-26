package case_study.services.impl;

import case_study.models.Customer;
import case_study.services.CustomerService;

import java.util.*;

public class CustomerServiceImpl implements CustomerService {
    static Scanner input = new Scanner(System.in);
    static List<Customer> customerList = new ArrayList<>();

    public Customer createCustomer() {
        System.out.print("Input id: ");
        int id = input.nextInt();
        input.nextLine();

        System.out.print("Input full name: ");
        String fullName = input.nextLine();

        System.out.print("Input birthday: ");
        String birthday = input.nextLine();

        System.out.print("Input gender: ");
        String gender = input.nextLine();

        System.out.print("Input id card: ");
        int idCard = input.nextInt();

        System.out.print("Input phone number: ");
        int phoneNumber = input.nextInt();
        input.nextLine();

        System.out.print("Input email: ");
        String email = input.nextLine();

        System.out.print("Input type guest: ");
        String typeGuest = input.nextLine();

        System.out.print("Input address: ");
        String address = input.nextLine();

        return new Customer(id, fullName, birthday, gender, idCard, phoneNumber, email, typeGuest, address);
    }

    @Override
    public void display() {
        for (Customer customer : customerList) {
            System.out.println(customer);
        }
    }


    @Override
    public void addNew() {
        customerList.add(createCustomer());
        System.out.println("Added successfully");
    }

    @Override
    public void edit() {
        System.out.print("Input the id you want to edit: ");
        int id = input.nextInt();
        int size = customerList.size();
        boolean flag = true;
        for (int i = 0; i < size; i++) {
            if (id == customerList.get(i).getId()) {
                System.out.print("\nInformation you want to edit: ");
                System.out.println(customerList.get(i));
                customerList.set(i, createCustomer());
                System.out.println("\nEdited successfully");
                flag = false;

            }
        }
        if (flag) {
            System.out.println("\nId not found");

        }
    }
}

