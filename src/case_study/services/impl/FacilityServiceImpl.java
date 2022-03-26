package case_study.services.impl;

import case_study.models.*;
import case_study.services.FacilityService;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FacilityServiceImpl implements FacilityService {
    private static Map<Facility, Integer> facilityIntegerMap = new LinkedHashMap<>();
    public static Scanner input = new Scanner(System.in);

    public Villa createVilla() {
        System.out.print("Input name service: ");
        String nameService = input.nextLine();

        System.out.print("Input area: ");
        double area = input.nextDouble();

        System.out.print("Input cost: ");
        double cost = input.nextDouble();

        System.out.print("Input max people: ");
        int maxPeople = input.nextInt();
        input.nextLine();

        System.out.print("Input rental type: ");
        String rentalType = input.nextLine();

        System.out.print("Input standard room: ");
        String standardRoom = input.nextLine();

        System.out.print("Input area pool: ");
        double areaPool = input.nextDouble();

        System.out.print("Input number floor: ");
        int numFloor = input.nextInt();
        input.nextLine();

        return new Villa(nameService, area, cost, maxPeople, rentalType, standardRoom, areaPool, numFloor);
    }

    public House createHouse() {
        System.out.print("Input name service: ");
        String nameService = input.nextLine();

        System.out.print("Input area: ");
        double area = input.nextDouble();

        System.out.print("Input cost: ");
        double cost = input.nextDouble();

        System.out.print("Input max people: ");
        int maxPeople = input.nextInt();
        input.nextLine();

        System.out.print("Input rental type: ");
        String rentalType = input.nextLine();

        System.out.print("Input standard room: ");
        String standardRoom = input.nextLine();

        System.out.print("Input number floor: ");
        int numOfFloor = input.nextInt();
        input.nextLine();

        return new House(nameService, area, cost, maxPeople, rentalType, standardRoom, numOfFloor);
    }

    public Room createRoom() {
        System.out.print("Input name service: ");
        String nameService = input.nextLine();

        System.out.print("Input area: ");
        double area = input.nextDouble();

        System.out.print("Input cost: ");
        double cost = input.nextDouble();

        System.out.print("Input max people: ");
        int maxPeople = input.nextInt();
        input.nextLine();

        System.out.print("Input rental type: ");
        String rentalType = input.nextLine();

        System.out.print("Input service free: ");
        String serviceFree = input.nextLine();

        return new Room(nameService, area, cost, maxPeople, rentalType, serviceFree);
    }


    @Override
    public void displayMaintain() {
        for (Map.Entry<Facility, Integer> element : facilityIntegerMap.entrySet()) {
            if (element.getValue() >= 5)
                System.out.println("Service " + element.getKey() + ", Number of rental: " + element.getValue());
        }
    }

    @Override
    public void addNewVilla() {
        facilityIntegerMap.put(createVilla(), 0);
        System.out.println("Added successfully");
    }

    @Override
    public void addNewHouse() {
        facilityIntegerMap.put(createHouse(), 0);
        System.out.println("Added successfully");
    }

    @Override
    public void addNewRoom() {
        facilityIntegerMap.put(createRoom(), 0);
        System.out.println("Added successfully");
    }

    @Override
    public void display() {
        for (Map.Entry<Facility, Integer> element : facilityIntegerMap.entrySet()) {
            System.out.println("Service " + element.getKey() + ", Number of rental: " + element.getValue());
        }

    }

    @Override
    public void addNew() {
    }

    @Override
    public void edit() {

    }

}
