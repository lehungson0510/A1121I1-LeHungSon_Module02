package case_study.services.impl;

import case_study.models.Customer;
import case_study.services.CustomerService;
import case_study.utils.ReadAndWriteFile;

import java.util.*;

public class CustomerServiceImpl implements CustomerService {
    static ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
    static Scanner input = new Scanner(System.in);
    static List<Customer> customerList = new ArrayList<>();

    public Customer createCustomer() {
        try {
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
        } catch (NumberFormatException e) {
            System.err.println("INPUT WRONG FORMAT");
        }
        return null;
    }

    @Override
    public void display() {
        try {
            customerList = readAndWriteFile.readFromFileCustomer("D:\\Codegym-bt\\Module02\\src\\case_study\\data\\customer.csv");
            for (Customer customer : customerList) {
                System.out.println(customer);
            }
        } catch (Exception e) {
            System.err.println("Not data");
        }
    }

    @Override
    public void addNew() {
        customerList.add(createCustomer());
        System.out.println("Added successfully");
        readAndWriteFile.writeListCustomer("D:\\Codegym-bt\\Module02\\src\\case_study\\data\\customer.csv", customerList);
    }

    @Override
    public void edit() {
        customerList = readAndWriteFile.readFromFileCustomer("D:\\Codegym-bt\\Module02\\src\\case_study\\data\\customer.csv");
        System.out.print("Input the id you want to edit: ");
        int id = -1;
        try {
            id = Integer.parseInt(input.nextLine());
        } catch (NumberFormatException e) {
            System.err.println("INPUT WRONG FORMAT");
        }
        int size = customerList.size();
        boolean flag = true;
        for (int i = 0; i < size; i++) {
            if (id == customerList.get(i).getId()) {
                System.out.print("\nInformation you want to edit: ");
                System.out.println(customerList.get(i));
                customerList.set(i, createCustomer());
                System.out.println("\nEdited successfully");
                readAndWriteFile.writeListCustomer("D:\\Codegym-bt\\Module02\\src\\case_study\\data\\customer.csv",customerList);
                flag = false;

            }
        }
        if (flag) {
            System.out.println("\nId not found");

        }
    }
}

