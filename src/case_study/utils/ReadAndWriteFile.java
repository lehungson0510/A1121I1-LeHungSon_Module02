package case_study.utils;

import case_study.models.*;

import java.io.*;
import java.util.*;

public class ReadAndWriteFile {
    final String SEPARATION = ",";

    //CUSTOMER
    public void writeListCustomer(String path, List<Customer> customers) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path))) {
            writer.write("ID" + SEPARATION + "NAME" + SEPARATION + "BIRTHDAY" + SEPARATION + "GENDER" + SEPARATION + "ID CARD" + SEPARATION + "PHONE" + SEPARATION + "EMAIL" + SEPARATION + "TYPE GUEST" + SEPARATION + "ADDRESS");
            for (Customer customer : customers) {
                writer.newLine();
                writer.write(customer.getId() + SEPARATION + customer.getFullName() + SEPARATION + customer.getBirthday() + SEPARATION + customer.getGender() + SEPARATION + customer.getIdCard() + SEPARATION + customer.getPhoneNumber() + SEPARATION + customer.getEmail() + SEPARATION + customer.getTypeGuest() + SEPARATION + customer.getAddress());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Customer> readFromFileCustomer(String path) {
        List<Customer> customers = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String line = null; // bỏ qua dòng đầu tiên (cái tiêu đề của excel)
            line = reader.readLine();
            while ((line = reader.readLine()) != null) {
                String[] values = line.split(SEPARATION);
                int id = Integer.parseInt(values[0]);
                String name = values[1];
                String birthDay = values[2];
                String gender = values[3];
                int idCard = Integer.parseInt(values[4]);
                int phone = Integer.parseInt(values[5]);
                String email = values[6];
                String typeGuest = values[7];
                String address = values[8];

                customers.add(new Customer(id, name, birthDay, gender, idCard, phone, email, typeGuest, address));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return customers;
    }


    //EMPLOYEE
    public void writeListEmployee(String path, List<Employee> employees) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path))) {
            writer.write("ID" + SEPARATION + "NAME" + SEPARATION + "BIRTHDAY" + SEPARATION + "GENDER" + SEPARATION + "ID CARD" + SEPARATION + "PHONE" + SEPARATION + "EMAIL" + SEPARATION + "EDUCATION LEVEL" + SEPARATION + "POSITION" + SEPARATION + "SALARY");
            for (Employee employee : employees) {
                writer.newLine();
                writer.write(employee.getId() + SEPARATION + employee.getFullName() + SEPARATION + employee.getBirthday() + SEPARATION + employee.getGender() + SEPARATION + employee.getIdCard() + SEPARATION + employee.getPhoneNumber() + SEPARATION + employee.getEmail() + SEPARATION + employee.getEducationLevel() + SEPARATION + employee.getPosition() + SEPARATION + employee.getSalary());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Employee> readFromFileEmployee(String path) {
        List<Employee> employees = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String line = null; // bỏ qua dòng đầu tiên (cái tiêu đề của excel)
            line = reader.readLine();
            while ((line = reader.readLine()) != null) {
                String[] values = line.split(SEPARATION);
                int id = Integer.parseInt(values[0]);
                String name = values[1];
                String birthDay = values[2];
                String gender = values[3];
                int idCard = Integer.parseInt(values[4]);
                int phone = Integer.parseInt(values[5]);
                String email = values[6];
                String level = values[7];
                String position = values[8];
                double salary = Double.parseDouble(values[9]);

                employees.add(new Employee(id, name, birthDay, gender, idCard, phone, email, level, position, salary));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return employees;
    }

    //    HOUSE
    public void writeListHouse(String path, List<House> houses) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path))) {
            writer.write("NAME SERVICE" + SEPARATION + "AREA" + SEPARATION + "COST" + SEPARATION + "MAX PEOPLE" + SEPARATION + "RENTAL TYPE" + SEPARATION + "STANDARD ROOM" + SEPARATION + "FLOOR");
            for (House house : houses) {
                writer.newLine();
                writer.write(house.getNameService() + SEPARATION + house.getArea() + SEPARATION + house.getCost() + SEPARATION + house.getMaxPeople() + SEPARATION + house.getRentalType() + SEPARATION + house.getStandardRoom() + SEPARATION + house.getNumOfFloor());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<House> readFromFileHouse(String path) {
        List<House> houses = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String line = null; // bỏ qua dòng đầu tiên (cái tiêu đề của excel)
            line = reader.readLine();
            while ((line = reader.readLine()) != null) {
                String[] values = line.split(SEPARATION);
                String nameService = values[0];
                double area = Double.parseDouble(values[1]);
                double cost = Double.parseDouble(values[2]);
                int maxPeople = Integer.parseInt(values[3]);
                String rentalType = values[4];
                String standardRoom = values[5];
                int numOfFloor = Integer.parseInt(values[6]);

                houses.add(new House(nameService, area, cost, maxPeople, rentalType, standardRoom, numOfFloor));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return houses;
    }


    //    VILLA
    public void writeListVilla(String path, List<Villa> villas) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path))) {
            writer.write("NAME SERVICE" + SEPARATION + "AREA" + SEPARATION + "COST" + SEPARATION + "MAX PEOPLE" + SEPARATION + "RENTAL TYPE" + SEPARATION + "STANDARD ROOM" + SEPARATION + "AREA POOL" + SEPARATION + "FLOOR");
            for (Villa villa : villas) {
                writer.newLine();
                writer.write(villa.getNameService() + SEPARATION + villa.getArea() + SEPARATION + villa.getCost() + SEPARATION + villa.getMaxPeople() + SEPARATION + villa.getRentalType() + SEPARATION + villa.getStandardRoom() + SEPARATION + villa.getAreaPool() + SEPARATION + villa.getNumOfFloor());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Villa> readFromFileVilla(String path) {
        List<Villa> villas = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String line = null; // bỏ qua dòng đầu tiên (cái tiêu đề của excel)
            line = reader.readLine();
            while ((line = reader.readLine()) != null) {
                String[] values = line.split(SEPARATION);
                String nameService = values[0];
                double area = Double.parseDouble(values[1]);
                double cost = Double.parseDouble(values[2]);
                int maxPeople = Integer.parseInt(values[3]);
                String rentalType = values[4];
                String standardRoom = values[5];
                double areaPool = Double.parseDouble(values[6]);
                int numOfFloor = Integer.parseInt(values[7]);

                villas.add(new Villa(nameService, area, cost, maxPeople, rentalType, standardRoom, areaPool, numOfFloor));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return villas;
    }


    //    ROOM
    public void writeListRoom(String path, List<Room> rooms) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path))) {
            writer.write("NAME SERVICE" + SEPARATION + "AREA" + SEPARATION + "COST" + SEPARATION + "MAX PEOPLE" + SEPARATION + "RENTAL TYPE" + SEPARATION + "SERVICE FREE");
            for (Room room : rooms) {
                writer.newLine();
                writer.write(room.getNameService() + SEPARATION + room.getArea() + SEPARATION + room.getCost() + SEPARATION + room.getMaxPeople() + SEPARATION + room.getRentalType() + SEPARATION + room.getServiceFree());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Room> readFromFileRoom(String path) {
        List<Room> rooms = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String line = null; // bỏ qua dòng đầu tiên (cái tiêu đề của excel)
            line = reader.readLine();
            while ((line = reader.readLine()) != null) {
                String[] values = line.split(SEPARATION);
                String nameService = values[0];
                double area = Double.parseDouble(values[1]);
                double cost = Double.parseDouble(values[2]);
                int maxPeople = Integer.parseInt(values[3]);
                String rentalType = values[4];
                String serviceFree = values[5];

                rooms.add(new Room(nameService, area, cost, maxPeople, rentalType, serviceFree));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return rooms;
    }


    //    BOOKING
    public void writeListBooking(String path, Set<Booking> bookings) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path))) {
            writer.write("ID BOOKING" + SEPARATION + "DATE START" + SEPARATION + "DATE END" + SEPARATION + "ID CUSTOMER" + SEPARATION + "NAME SERVICE" + SEPARATION + "TYPE SERVICE");
            for (Booking booking : bookings) {
                writer.newLine();
                writer.write(booking.getIdBooking() + SEPARATION + booking.getDateStar() + SEPARATION + booking.getDateEnd() + SEPARATION + booking.getIdCustomer() + SEPARATION + booking.getNameService() + SEPARATION + booking.getTypeService());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

//    public Set<Booking> readFromFileBooking(String path) {
//        Set<Booking> bookings = new HashSet<>();
//        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
//            String line = null; // bỏ qua dòng đầu tiên (cái tiêu đề của excel)
//            line = reader.readLine();
//            while ((line = reader.readLine()) != null) {
//                String[] values = line.split(SEPARATION);
//                int idBooking = Integer.parseInt(values[0]);
//                String dateStart = values[1];
//                String dateEnd = values[2];
//                Customer idCustomer = values[3];
//                Facility nameService = values[4];
//                String typeService = values[5];
//
//                bookings.add(new Booking(idBooking, dateStart, dateEnd, idCustomer, nameService, typeService));
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return bookings;
//    }


    //    CONTRACT
    public void writeListContract(String path, List<Contract> contracts) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path))) {
            writer.write("NUMBER CONTRACT" + SEPARATION + "ID BOOKING" + SEPARATION + "DEPOSIT" + SEPARATION + "TOTAL PAYMENT" + SEPARATION + "ID CUSTOMER");
            for (Contract contract : contracts) {
                writer.newLine();
                writer.write(contract.getNumberContract() + SEPARATION + contract.getIdBooking() + SEPARATION + contract.getDeposit() + SEPARATION + contract.getTotalPayments() + SEPARATION + contract.getIdCustomer());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

//    public List<Contract> readFromFileContract(String path) {
//        List<Contract> contracts = new ArrayList<>();
//        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
//            String line = null; // bỏ qua dòng đầu tiên (cái tiêu đề của excel)
//            line = reader.readLine();
//            while ((line = reader.readLine()) != null) {
//                String[] values = line.split(SEPARATION);
//                int numberContract = Integer.parseInt(values[0]);
//                int idBooking = Integer.parseInt(values[1]);
//                double deposit = Double.parseDouble(values[2]);
//                double totalPayments = Double.parseDouble(values[3]);
//                Customer idCustomer = values[4];
//
//                contracts.add(new Contract(numberContract, idBooking, deposit, totalPayments, idCustomer));
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return contracts;
//    }

}
