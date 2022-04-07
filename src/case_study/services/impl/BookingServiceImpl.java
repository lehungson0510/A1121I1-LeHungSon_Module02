package case_study.services.impl;

import case_study.models.Booking;
import case_study.models.Customer;
import case_study.models.Facility;
import case_study.models.Villa;
import case_study.services.BookingService;
import case_study.utils.BookingComparator;

import java.util.*;

public class BookingServiceImpl implements BookingService {
    static Scanner input = new Scanner(System.in);

    /* Tạo treeSet sx tăng dần theo ngày */
    static Set<Booking> bookingSet = new TreeSet<>(new BookingComparator());

    static List<Customer> customerList = new ArrayList<>();

    static Map<Facility, Integer> facilityIntegerMap = new LinkedHashMap<>();

    static {
        customerList.add(new Customer(1, "Son", "22", "Male", 13456, 0355,
                "son@gmail.com", "Member", "Hue"));
        customerList.add(new Customer(2, "Mi", "22", "female", 12456, 0356,
                "mi@gmail.com", "Platinum", "Hue"));
        customerList.add(new Customer(3, "Huy", "22", "Male", 12356, 0357,
                "huy@gmail.com", "Diamond", "Hue"));
        facilityIntegerMap.put(new Villa("a", 200, 500, 5, "Day", "a", 20, 3), 0);
        facilityIntegerMap.put(new Villa("b", 300, 600, 6, "Month", "b", 20, 2), 0);
    }

    @Override
    public void display() {
        System.out.println("-----------List Booking------------");
        for (Booking booking : bookingSet) {
            System.out.println(booking.toString());
        }
    }

    @Override
    public void addNew() {
        int idBooking = 1;
        if (!bookingSet.isEmpty()) {
            idBooking = bookingSet.size();
        }
        Customer idCustomer = choiceCustomer();

        Facility nameService = choiceFacility();

        System.out.println("Input rental start date: ");
        String dateStart = input.nextLine();

        System.out.println("Input rental end date: ");
        String dateEnd = input.nextLine();

        System.out.println("Input type service");
        String typeService = input.nextLine();

        Booking booking = new Booking(idBooking, dateStart, dateEnd, idCustomer, nameService, typeService);

        bookingSet.add(booking);
        System.out.println("---Booking success---");
    }

    @Override
    public void edit() {

    }

    public static Customer choiceCustomer() {
        System.out.println("--------List of customers----------");
        customerList.forEach(System.out::println);

        System.out.println("Input id customer: ");
        boolean check = true;
        int id = Integer.parseInt(input.nextLine());
        while (check) {
            for (Customer customer : customerList) {
                if (id == customer.getId()) {
                    check = false;
                    return customer;
                }
            }
            if (check) {
                System.out.println("Inputted wrong customer id, Input id customer again:  ");
                id = Integer.parseInt(input.nextLine());
            }
        }
        return null;
    }

    public static Facility choiceFacility() {
        System.out.println("--------List of facilities----------");
        for (Map.Entry<Facility, Integer> entry : facilityIntegerMap.entrySet()) {
            System.out.println(entry.getKey().toString());
        }

        System.out.println("Input name service: ");
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
                System.out.println("Inputted wrong name service, Input name service again:  ");
                nameService = input.nextLine();
            }
        }
        return null;
    }
}

