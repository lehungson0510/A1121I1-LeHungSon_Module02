package case_study.services.impl;

import case_study.models.*;
import case_study.services.FacilityService;
import case_study.utils.ReadAndWriteFile;

import java.util.*;

public class FacilityServiceImpl implements FacilityService {
    static ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
    private static Map<Facility, Integer> facilityIntegerMap = new LinkedHashMap<>();
    static List<House> houseList = new ArrayList<>();
    static List<Room> roomList = new ArrayList<>();
    static List<Villa> villaList = new ArrayList<>();

    public static Scanner input = new Scanner(System.in);

    public Villa createVilla() {
        try {
            System.out.print("Input name service: ");
            String nameService = input.nextLine();

            System.out.print("Input area: ");
            double area = Double.parseDouble(input.nextLine());

            System.out.print("Input cost: ");
            double cost = Double.parseDouble(input.nextLine());

            System.out.print("Input max people: ");
            int maxPeople = Integer.parseInt(input.nextLine());

            System.out.print("Input rental type: ");
            String rentalType = input.nextLine();

            System.out.print("Input standard room: ");
            String standardRoom = input.nextLine();

            System.out.print("Input area pool: ");
            double areaPool = Double.parseDouble(input.nextLine());

            System.out.print("Input number floor: ");
            int numFloor = Integer.parseInt(input.nextLine());

            Villa villa = new Villa(nameService, area, cost, maxPeople, rentalType, standardRoom, areaPool, numFloor);
            villaList.add(villa);
            readAndWriteFile.writeListVilla("D:\\Codegym-bt\\Module02\\src\\case_study\\data\\villa.csv", villaList);
            return villa;
        } catch (NumberFormatException e) {
            System.err.println("INPUT WRONG FORMAT");
        }
        return null;
    }

    public House createHouse() {
        try {
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

            House house = new House(nameService, area, cost, maxPeople, rentalType, standardRoom, numOfFloor);
            houseList.add(house);
            readAndWriteFile.writeListHouse("D:\\Codegym-bt\\Module02\\src\\case_study\\data\\house.csv", houseList);
            return house;
        } catch (NumberFormatException e) {
            System.err.println("INPUT WRONG FORMAT");
        }
        return null;
    }

    public Room createRoom() {
        try {
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

            Room room = new Room(nameService, area, cost, maxPeople, rentalType, serviceFree);
            roomList.add(room);
            readAndWriteFile.writeListRoom("D:\\Codegym-bt\\Module02\\src\\case_study\\data\\room.csv", roomList);
            return room;
        } catch (NumberFormatException e) {
            System.err.println("INPUT WRONG FORMAT");
        }
        return null;
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
