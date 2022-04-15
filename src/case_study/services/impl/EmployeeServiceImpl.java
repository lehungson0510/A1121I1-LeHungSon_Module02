package case_study.services.impl;

import case_study.models.Customer;
import case_study.models.Employee;
import case_study.services.EmployeeService;
import case_study.utils.ReadAndWriteFile;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {
    static ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
    static Scanner input = new Scanner(System.in);
    static List<Employee> employeeList = new ArrayList<>();

    public Employee createEmployee() {
        try {
            System.out.print("Input id: ");
            int id = input.nextInt();
            input.nextLine();

            System.out.print("Input full name: ");
            String fullName = input.nextLine();

            System.out.print("Input birthday: ");
            String birthday = input.nextLine();

            System.out.print("Input id: ");
            String gender = input.nextLine();

            System.out.print("Input identification card: ");
            int idCard = input.nextInt();
            input.nextLine();

            System.out.print("Input phone number: ");
            int phoneNumber = input.nextInt();
            input.nextLine();

            System.out.print("Input email: ");
            String email = input.nextLine();

            System.out.print("Input education level: ");
            String educationLevel = input.nextLine();

            System.out.print("Input position: ");
            String position = input.nextLine();

            System.out.print("Input salary: ");
            double salary = input.nextDouble();


            return new Employee(id, fullName, birthday, gender, idCard, phoneNumber, email, educationLevel, position, salary);
        } catch (NumberFormatException e) {
            System.err.println("INPUT WRONG FORMAT");
        }
        return null;
    }

    @Override
    public void display() {
        employeeList = readAndWriteFile.readFromFileEmployee("D:\\Codegym-bt\\Module02\\src\\case_study\\data\\employee.csv");
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }


    @Override
    public void addNew() {
        employeeList.add(createEmployee());
        System.out.println("Added successfully");
        readAndWriteFile.writeListEmployee("D:\\Codegym-bt\\Module02\\src\\case_study\\data\\employee.csv", employeeList);
    }

    @Override
    public void edit() {
        employeeList = readAndWriteFile.readFromFileEmployee("D:\\Codegym-bt\\Module02\\src\\case_study\\data\\employee.csv");
        System.out.print("Input the id you want to edit: ");
        int id = -1;
        try {
            id = Integer.parseInt(input.nextLine());
        } catch (NumberFormatException e) {
            System.err.println("INPUT WRONG FORMAT");
        }
        int size = employeeList.size();
        boolean flag = true;
        for (int i = 0; i < size; i++) {
            if (id == employeeList.get(i).getId()) {
                System.out.print("\nInformation you want to edit: ");
                System.out.println(employeeList.get(i));
                employeeList.set(i, createEmployee());
                flag = false;
                System.out.println("\nEdited successfully");
                readAndWriteFile.writeListEmployee("D:\\Codegym-bt\\Module02\\src\\case_study\\data\\employee.csv", employeeList);

            }
        }
        if (flag) {
            System.out.println("\nId not found");
        }
    }
}

