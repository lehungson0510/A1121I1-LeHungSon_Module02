package case_study.services.impl;

import case_study.models.Employee;
import case_study.services.EmployeeService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {
    static Scanner input = new Scanner(System.in);
    static List<Employee> employeeList = new ArrayList<>();


    @Override
    public void display() {
        for (Employee employee : employeeList){
            System.out.println(employee);
        }
    }

    @Override
    public void addNew() {
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

        Employee employee = new Employee(id, fullName, birthday, gender, idCard, phoneNumber, email, educationLevel, position, salary);
        employeeList.add(employee);
    }

    @Override
    public void edit() {

    }
}
