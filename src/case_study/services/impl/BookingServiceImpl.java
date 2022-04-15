package case_study.services.impl;

import case_study.models.Booking;
import case_study.models.Customer;
import case_study.models.Facility;
import case_study.models.Villa;
import case_study.services.BookingService;
import case_study.utils.BookingComparator;
import case_study.utils.ReadAndWriteFile;

import java.util.*;

public class BookingServiceImpl implements BookingService {
    static ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
    static Scanner input = new Scanner(System.in);

    /* Tạo treeSet sx tăng dần theo ngày */
    static Set<Booking> bookingSet = new TreeSet<>(new BookingComparator());

    static Set<Booking> getBookingSet = new TreeSet<>(new BookingComparator());

    static List<Customer> customerList = new ArrayList<>();

    static Map<Facility, Integer> facilityIntegerMap = new LinkedHashMap<>();

    static {
        customerList.add(new Customer(1, "Son", "22", "Male", 13456, 1234, "son@gmail.com",
                "Member", "Hue"));
        customerList.add(new Customer(2, "Mi", "22", "female", 12456, 4321, "mi@gmail.com",
                "Platinum", "Hue"));
        customerList.add(new Customer(3, "Huy", "22", "Male", 12356, 5432, "huy@gmail.com",
                "Diamond", "Hue"));

        facilityIntegerMap.put(new Villa("a", 200, 500, 5, "Day", "a", 20, 3), 0);
        facilityIntegerMap.put(new Villa("b", 300, 600, 6, "Month", "b", 20, 2), 0);
    }

    public Set<Booking> getBookingSet() {
        return getBookingSet;
    }

    public Set<Booking> sendBooking(){
        return bookingSet;
    }

    @Override
    public void display() {
        System.out.println("\n-----------List Booking------------\n");
        for (Booking booking : bookingSet) {
            System.out.println(booking);
        }
    }

    @Override
    public void addNew() {

        try {
            int idBooking = 1;
            if (!bookingSet.isEmpty()) {
                idBooking = bookingSet.size() + 1;
            }

            Customer idCustomer = choiceCustomer();

            Facility nameService = choiceFacility();

            System.out.print("Input rental start date: ");
            String dateStart = input.nextLine();

            System.out.print("Input rental end date: ");
            String dateEnd = input.nextLine();

            System.out.print("Input type service: ");
            String typeService = input.nextLine();

            Booking booking = new Booking(idBooking, dateStart, dateEnd, idCustomer, nameService, typeService);

            bookingSet.add(booking);
            getBookingSet().add(booking);
            readAndWriteFile.writeListBooking("D:\\Codegym-bt\\Module02\\src\\case_study\\data\\booking.csv",bookingSet);
            System.out.println("\n---Add Booking success---");
        } catch (Exception e) {
            System.err.println("Input Wrong Format");
        }
    }

    @Override
    public void edit() {
    }

    public static Customer choiceCustomer() {
        System.out.println("\n-----------------List of customers------------------\n");
        customerList.forEach(System.out::println);

        System.out.print("\nInput id customer: ");
        boolean check = true;
        int id = -1;
        try {
            id = Integer.parseInt(input.nextLine());
            while (check) {
                for (Customer customer : customerList) {
                    if (id == customer.getId()) {
                        check = false;
                        return customer;
                    }
                }
                if (check) {
                    System.out.println("\nInputted wrong customer id, Input id customer again:  ");
                    id = Integer.parseInt(input.nextLine());
                }
            }
        } catch (NumberFormatException e) {
            System.err.println("INPUT WRONG FORMAT");
        }
        return null;
    }

    public static Facility choiceFacility() {
        System.out.println("\n--------------------List of facilities------------------\n");
        for (Map.Entry<Facility, Integer> entry : facilityIntegerMap.entrySet()) {
            System.out.println(entry.getKey().toString());
        }

        System.out.print("\nInput name service: ");
        boolean check = true;
        String nameService = input.nextLine();
        while (check) {
            for (Map.Entry<Facility, Integer> entry : facilityIntegerMap.entrySet()) {
                if (nameService.equals(entry.getKey().getNameService())) {
                    check = false;
                    return entry.getKey();
                }
            }
            if (check) {
                System.out.println("\nInputted wrong name service, Input name service again:  ");
                nameService = input.nextLine();
            }
        }
        return null;
    }
}

